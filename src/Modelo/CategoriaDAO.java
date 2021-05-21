package Modelo;

import Conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

public class CategoriaDAO extends Conexion
{
    private PreparedStatement ps;
    private ResultSet rs;
    private String mensaje;
    private String query;
    Categoria categoria = new Categoria();
    
    public ArrayList<Categoria> mostrarDatos()
    {
        ArrayList<Categoria> datos = null;
        try 
        {
            this.conectar();
            query = "select * from Categoria";
            ps = this.getMiConexion().prepareStatement(query);
            rs = ps.executeQuery();
            datos = new ArrayList();
            while (rs.next())
            {
                Categoria cat = new Categoria();
                cat.setIdCategoria(rs.getInt("idCategoria"));
                cat.setNombreCategoria(rs.getString("nombreCategoria"));
                datos.add(cat);
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
    
    public Vector<Categoria> llenaComboCategoria()
    {
        Vector<Categoria> datos = new Vector<Categoria>();
        Categoria cat = null; 
        try 
        {
            this.conectar();
            query = "select idCategoria, nombreCategoria from Categoria";
            ps = this.getMiConexion().prepareStatement(query);
            rs = ps.executeQuery();
            cat = new Categoria();
            cat.setIdCategoria(0);
            cat.setNombreCategoria("Seleccione Categoria");
            datos.add(cat);
            while (rs.next()) 
            {
               cat = new Categoria();
               cat.setIdCategoria(rs.getInt("idCategoria"));
               cat.setNombreCategoria(rs.getString("nombreCategoria"));
               datos.add(cat);
            }
        } 
        catch (SQLException ex) 
        {
            System.out.println(ex.getMessage());
        }
        finally
        {
            this.desconectar();
        }
    return datos;    
    }
    
   
    public String insertCategoria(Categoria categoria) {
        try {
            this.conectar();
            query = "insert into Categoria (nombreCategoria, idUsuario) values (?,?)";
            ps = getMiConexion().prepareStatement(query);
            ps.setString(1, categoria.getNombreCategoria());
            ps.setInt(2, categoria.getIdUsuario());
            ps.executeUpdate();                   
            mensaje = "Registro almacenado correctamente!!"; 
        } catch (Exception e) {
            System.out.println(e.getMessage());
            mensaje = "No se puede almacenar el registro!!";
        } 
        finally
        {
            this.desconectar();
        }
        return mensaje;
    }
    
    public String updateCategoria(Categoria categoria)
    {
        try {
            this.conectar();
            query = "update Categoria set nombreCategoria = ?  where idCategoria = ?";
            ps = getMiConexion().prepareStatement(query);
            ps.setString(1, categoria.getNombreCategoria());
            ps.setInt(2, categoria.getIdCategoria());
            ps.executeUpdate();
            mensaje = "Registro modificado correctamente !!!";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            mensaje = "No se puede modificar el registro !!!";
        }
        finally
        {
            this.desconectar();
        }
        return mensaje;
    }
    
    public String deleteCategoria(int id)
    {
        try {
            this.conectar();
            query = "delete from Categoria where idCategoria = ?";
            ps = getMiConexion().prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            mensaje = "Registro eliminado correctamente !!!";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            mensaje = "No se puede eliminar el registro !!!";
        }
        finally
        {
            this.desconectar();
        }
        return mensaje;
    }
    
    
    public ArrayList<Categoria> buscaCategoria(String nombre)
    {
        ArrayList listaPersona = new ArrayList();
        Categoria categoria;
        try 
        {
            this.conectar();
            CallableStatement cs = getMiConexion().prepareCall("{call Buscar(?)}");
            cs.setString(1, nombre);
            ResultSet rs = cs.executeQuery();
            while(rs.next())
            {
                categoria = new Categoria();
                categoria.setIdCategoria(rs.getInt(1));
                categoria.setNombreCategoria(rs.getString(2));
                listaPersona.add(categoria);
            }
        } catch (Exception e) 
        {
            System.out.println(e + "Error buscar Cateroria");
        }
        finally
        {
            this.desconectar();
        }
        return listaPersona;
    }
}
