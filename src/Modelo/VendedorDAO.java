
package Modelo;

import Conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;


public class VendedorDAO extends Conexion
{
    PreparedStatement ps;
    ResultSet rs;
    Conexion conectar = new Conexion();
    String query;
    String respuesta;
    private String mensaje;
    
public Vector<Vendedor> llenaComboVendedor()
    {
        Vector<Vendedor> datos = new Vector<Vendedor>();
        Vendedor ven = null; 
        try 
        {
            this.conectar();
            query = "select idVendedor, nombreVendedor from Vendedor";
            ps = this.getMiConexion().prepareStatement(query);
            rs = ps.executeQuery();
            ven = new Vendedor();
            ven.setIdVendedor(0);
            ven.setNombreVendedor("Seleccione Vendedor");
            datos.add(ven);
            while (rs.next()) 
            {
               ven = new Vendedor();
               ven.setIdVendedor(rs.getInt("idVendedor"));
               ven.setNombreVendedor(rs.getString("nombreVendedor"));
               datos.add(ven);
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

public String registrarVendedor(Vendedor vendedor) {
        try {
            this.conectar();
            query = "insert into Vendedor (nombreVendedor, apellidoVendedor, direccionVendedor, dpiVendedor, fechaNacimiento, correoVendedor, telefonoVendedor, idUsuario) values (?,?,?,?,?,?,?,?)";
            ps = getMiConexion().prepareStatement(query);
            ps.setString(1, vendedor.getNombreVendedor());
            ps.setString(2, vendedor.getApellidoVendedor());
            ps.setString(3, vendedor.getDireccionVendedor());
            ps.setString(4, vendedor.getDpiVendedor());
            ps.setString(5, vendedor.getFechaNacimiento());
            ps.setString(6, vendedor.getCorreoVendedor());
            ps.setString(7, vendedor.getTelefonoVendedor());
            ps.setInt(8, vendedor.getIdUsuario());
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

public String modificarVendedor(Vendedor vendedor)
    {
        try {
            this.conectar();
            query = "update Vendedor set nombreVendedor = ?, apellidoVendedor = ?, direccionVendedor = ?, dpiVendedor = ?, fechaNacimiento = ?, correoVendedor = ?, telefonoVendedor = ? where idVendedor = ?";
            ps = getMiConexion().prepareStatement(query);
            ps.setString(1, vendedor.getNombreVendedor());
            ps.setString(2, vendedor.getApellidoVendedor());
            ps.setString(3, vendedor.getDireccionVendedor());
            ps.setString(4, vendedor.getDpiVendedor());
            ps.setString(5, vendedor.getFechaNacimiento());
            ps.setString(6, vendedor.getCorreoVendedor());
            ps.setString(7, vendedor.getTelefonoVendedor());
            ps.setInt(8, vendedor.getIdVendedor());
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

public String eliminarVendedor(int id)
    {
        try {
            this.conectar();
            query = "delete from Vendedor where idVendedor = ?";
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

public ArrayList<Vendedor> mostrarDatos()
    {
        ArrayList<Vendedor> datos = null;
        try 
        {
            this.conectar();
            query = "select * from Vendedor";
            ps = this.getMiConexion().prepareStatement(query);
            rs = ps.executeQuery();
            datos = new ArrayList();
            while (rs.next())
            {
                Vendedor v = new Vendedor();
                v.setIdVendedor(rs.getInt("idVendedor"));
                v.setNombreVendedor(rs.getString("nombreVendedor"));
                v.setApellidoVendedor(rs.getString("apellidoVendedor"));
                v.setDireccionVendedor(rs.getString("direccionVendedor"));
                v.setDpiVendedor(rs.getString("dpiVendedor"));
                v.setFechaNacimiento(rs.getString("fechaNacimiento"));
                v.setCorreoVendedor(rs.getString("correoVendedor"));
                v.setTelefonoVendedor(rs.getString("telefonoVendedor"));
                datos.add(v);
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

public ArrayList<Vendedor> buscaVendedor(String nombre)
    {
        ArrayList listaVendedor = new ArrayList();
        Vendedor vendedor;
        try 
        {
            this.conectar();
            CallableStatement cs = getMiConexion().prepareCall("{call buscarVendedor(?)}");
            cs.setString(1, nombre);
            ResultSet rs = cs.executeQuery();
            while(rs.next())
            {
                vendedor = new Vendedor();
                vendedor.setIdVendedor(rs.getInt(1));
                vendedor.setNombreVendedor(rs.getString(2));
                vendedor.setApellidoVendedor(rs.getString(3));
                vendedor.setDireccionVendedor(rs.getString(4));
                vendedor.setDpiVendedor(rs.getString(5));
                vendedor.setFechaNacimiento(rs.getString(6));
                vendedor.setCorreoVendedor(rs.getString(7));
                vendedor.setTelefonoVendedor(rs.getString(8));
                listaVendedor.add(vendedor);
            }
        } catch (Exception e) 
        {
            System.out.println(e + "Error buscar Vendedor");
        }
        finally
        {
            this.desconectar();
        }
        return listaVendedor;
    }
}
