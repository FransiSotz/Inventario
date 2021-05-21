
package Modelo;

import Conexion.Conexion;
import Controlador.Guardar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProductoDAO extends Conexion
{
    PreparedStatement ps;
    ResultSet rs;
    Producto producto = new Producto();
    Conexion conectar = new Conexion();
    String query;
    String respuesta;
    Guardar guardar = new Guardar();
    int mensaje;
     
    public int registrarProducto(Producto producto) {
        try {
            this.conectar();
            query = "if not exists (select 1 from Producto where nombreProducto = ?)"
                    + "begin"
                    + " insert into Producto (idCategoria, nombreProducto, precioProducto, stockProducto, idUsuario) values (?,?,?,?,?)"
                    + "end";
            ps = getMiConexion().prepareStatement(query);
            ps.setString(1, producto.getNombreProducto());
            ps.setInt(2, producto.getIdCategoria());
            ps.setString(3, producto.getNombreProducto());
            ps.setDouble(4, producto.getPrecioProducto());
            ps.setInt(5, producto.getStockProducto());
            ps.setInt(6, producto.getIdUsuario());
            mensaje = ps.executeUpdate();                   
            //respuesta = "Registro almacenado correctamente!!"; 
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //respuesta = "No se puede almacenar el registro!!";
        } 
        finally
        {
            this.desconectar();
        }
        return mensaje;
    }
    
    public String modificarProducto(Producto producto)
    {
        try {
            this.conectar();
            query = "update Producto set idCategoria = ?, nombreProducto = ?, precioProducto = ?, stockProducto = ? where idProducto = ?";
            ps = getMiConexion().prepareStatement(query);
            ps.setInt(1, producto.getIdCategoria());
            ps.setString(2, producto.getNombreProducto());
            ps.setDouble(3, producto.getPrecioProducto());
            ps.setInt(4, producto.getStockProducto());
            ps.setInt(5, producto.getIdProducto());
            ps.executeUpdate();
            respuesta = "Registro modificado correctamente !!!";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            respuesta = "No se puede modificar el registro !!!";
        }
        finally
        {
            this.desconectar();
        }
        return respuesta;
    }
        
    public String eliminarProducto(int id)
    {
        try {
            this.conectar();
            query = "delete from Producto where idProducto = ?";
            ps = getMiConexion().prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            respuesta = "Registro eliminado correctamente !!!";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            respuesta = "No se puede eliminar el registro !!!";
        }
        finally
        {
            this.desconectar();
        }
        return respuesta;
    }    
    
    public ArrayList<Producto> mostrarDatos()
    {
        ArrayList<Producto> datos = null;
        try 
        {
            this.conectar();
            query = "select * from Producto";
            ps = this.getMiConexion().prepareStatement(query);
            rs = ps.executeQuery();
            datos = new ArrayList();
            while (rs.next())
            {
                Producto p = new Producto();
                p.setIdProducto(rs.getInt("idProducto"));
                p.setIdCategoria(rs.getInt("idCategoria"));
                p.setNombreProducto(rs.getString("nombreProducto"));
                p.setPrecioProducto(rs.getDouble("precioProducto"));
                p.setStockProducto(rs.getInt("stockProducto"));
                datos.add(p);
            }   
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            this.desconectar();
        }
        return datos;
    }
    
    
    public ArrayList<Producto> buscaProducto(String nombre)
    {
        ArrayList listaProducto = new ArrayList();
        Producto producto;
        try 
        {
            this.conectar();
            CallableStatement cs = getMiConexion().prepareCall("{call buscarProducto(?)}");
            cs.setString(1, nombre);
            ResultSet rs = cs.executeQuery();
            while(rs.next())
            {
                producto = new Producto();
                producto.setIdProducto(rs.getInt(1));
                producto.setIdCategoria(rs.getInt(2));
                producto.setNombreProducto(rs.getString(3));
                producto.setPrecioProducto(rs.getDouble(4));
                producto.setStockProducto(rs.getInt(5));
                listaProducto.add(producto);
            }
        } catch (Exception e) 
        {
        }
        finally
        {
            this.desconectar();
        }
        return listaProducto;
    }
    
    public Image generarCodigoBarra(int fila,ArrayList lista)
    {
    Image img = null;
    Font fuente = new Font(); 
    Paragraph parrafo = new Paragraph();
    String codigo = "";
    File archivo;
    System.out.println("Filas En lista" + lista.size());

    if (fila > 0) 
        {
        for (int i = 0; i < lista.size() - 1; i++) 
        {
        codigo = codigo + lista.get(i) + ",";
        //lista.set(i,lista.get(i) + ","); //Para concatenar coma al final
        }
        codigo = codigo + lista.get(lista.size() - 1);
//    for (int i = 0; i < lista.size(); i++) 
//    {
//        System.out.println(lista.get(i).toString());
//    }
//    System.out.println("codigo Completo " + codigo);
        try {
            this.conectar();
            query = "select idProducto as idProducto,nombreProducto from Producto where idProducto in (" + codigo + ")";
            ps = this.getMiConexion().prepareStatement(query);
            rs = ps.executeQuery();
            } catch (SQLException ex) 
            {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (fila == 0) 
        {
        try {
            this.conectar();
            query = "select idProducto as idProducto,nombreProducto from Producto ";
            ps = this.getMiConexion().prepareStatement(query);
            rs = ps.executeQuery();
            } catch (SQLException ex) 
            {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try 
        {
            Document doc = new Document();
            archivo = guardar.guardarPdf();
            PdfWriter pdf = PdfWriter.getInstance(doc, new FileOutputStream(archivo));
            //ReporteDAO.class.getResourceAsStream("/Reporte/StockMinimo.jasper");
            doc.open();
            Barcode128 code = new Barcode128();
            fuente.setSize(9);
            fuente.setColor(BaseColor.GRAY);
            parrafo.setAlignment(Element.ALIGN_CENTER);
            while (rs.next())
            {
            code.setCode(rs.getString("idProducto"));
            String nombre;
            nombre = rs.getString("nombreProducto");
            img = code.createImageWithBarcode(pdf.getDirectContent(), BaseColor.BLACK, BaseColor.BLACK);
            
            doc.add(new Paragraph(nombre,fuente));
            
//            doc.add(new Paragraph(" ")); //Para agreagar una linea en blanco
            doc.add(img);
            }  
        doc.close();
            System.out.println("Numero de Filas " + fila);
            JOptionPane.showMessageDialog(null, "Archivo Generado");
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage() + "Error codigo Barras");
        }
        finally
        {
            this.desconectar();
        }  
        return img;
    }
      
    public Producto usarProducto(int id)
    {
        try 
        {
           this.conectar();
           query = "select idProducto, nombreProducto, precioProducto, stockProducto from producto where idProducto = ?";
           ps = getMiConexion().prepareStatement(query);
           ps.setInt(1, id);
           rs = ps.executeQuery();
            while (rs.next()) 
            {
               producto.setIdProducto(rs.getInt("idProducto"));
               producto.setNombreProducto(rs.getString("nombreProducto"));
               producto.setPrecioProducto(rs.getDouble("precioProducto"));
               producto.setStockProducto(rs.getInt("stockProducto"));
            }
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        return producto;
    }
    
    public String actualizarStock(int cantidad, int idProducto)
    {
        try 
        {
            this.conectar();
            query = "update producto set stockProducto = ? where idProducto = ?";
            ps = getMiConexion().prepareStatement(query);
            ps.setInt(1, cantidad);
            ps.setInt(2, idProducto);
            ps.executeUpdate();
            respuesta = "Registro modificado correctamente !!!";
        } catch (Exception e) 
        {
            System.out.println(e.getMessage() + "Error Al actualizar Stock");
            respuesta = "No se pudo actualizr el Stock !!!";
        }
        finally
        {
            this.desconectar();
        }        
        return respuesta;
    }
}
