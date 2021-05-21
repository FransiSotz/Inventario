package Modelo;

import Conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

public class ClienteDAO extends Conexion
{
    private PreparedStatement ps;
    private ResultSet rs;
    private String mensaje;
    Conexion conectar = new Conexion();
    private String query;
    Cliente cliente = new Cliente();
    
    public Vector<Cliente> llenaComboCliente()
    {
        Vector<Cliente> datos = new Vector<Cliente>();
        Cliente cli = null; 
        try 
        {
            this.conectar();
            query = "select idCliente, nombreCliente from Cliente";
            ps = this.getMiConexion().prepareStatement(query);
            rs = ps.executeQuery();
            cli = new Cliente();
            cli.setIdCliente(0);
            cli.setNombreCliente("Seleccione Cliente");
            datos.add(cli);
            while (rs.next()) 
            {
               cli = new Cliente();
               cli.setIdCliente(rs.getInt("idCliente"));
               cli.setNombreCliente(rs.getString("nombreCliente"));
               datos.add(cli);
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
    
    public String registrarCliente(Cliente cliente) {
        try {
            this.conectar();
            query = "insert into Cliente (nombreCliente, apellidoCliente, direccionCliente, nitCliente, fechaNacimiento, correoCliente, telefonoCliente, idUsuario) values (?,?,?,?,?,?,?,?)";
            ps = getMiConexion().prepareStatement(query);
            ps.setString(1, cliente.getNombreCliente());
            ps.setString(2, cliente.getApellidoCliente());
            ps.setString(3, cliente.getDireccionCliente());
            ps.setString(4, cliente.getNitCliente());
            ps.setString(5, cliente.getFechaNacimiento());
            ps.setString(6, cliente.getCorreoCliente());
            ps.setString(7, cliente.getTelefonoCliente());
            ps.setInt(8, cliente.getIdUsuario());
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
    
    public String modificarCliente(Cliente cliente)
    {
        try {
            this.conectar();
            query = "update Cliente set nombreCliente = ?, apellidoCliente = ?, direccionCliente = ?, nitCliente = ?, fechaNacimiento = ?, correoCliente = ?, telefonoCliente = ? where idCliente = ?";
            ps = getMiConexion().prepareStatement(query);
            ps.setString(1, cliente.getNombreCliente());
            ps.setString(2, cliente.getApellidoCliente());
            ps.setString(3, cliente.getDireccionCliente());
            ps.setString(4, cliente.getNitCliente());
            ps.setString(5, cliente.getFechaNacimiento());
            ps.setString(6, cliente.getCorreoCliente());
            ps.setString(7, cliente.getTelefonoCliente());
            ps.setInt(8, cliente.getIdCliente());
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
        
    public String eliminarCliente(int id)
    {
        try {
            this.conectar();
            query = "delete from Cliente where idCliente = ?";
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
      
    public ArrayList<Cliente> mostrarDatos()
    {
        ArrayList<Cliente> datos = null;
        try 
        {
            this.conectar();
            query = "select * from Cliente";
            ps = this.getMiConexion().prepareStatement(query);
            rs = ps.executeQuery();
            datos = new ArrayList();
            while (rs.next())
            {
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("idCliente"));
                c.setNombreCliente(rs.getString("nombreCliente"));
                c.setApellidoCliente(rs.getString("apellidoCliente"));
                c.setDireccionCliente(rs.getString("direccionCliente"));
                c.setNitCliente(rs.getString("nitCliente"));
                c.setFechaNacimiento(rs.getString("fechaNacimiento"));
                c.setCorreoCliente(rs.getString("correoCliente"));
                c.setTelefonoCliente(rs.getString("telefonoCliente"));
                datos.add(c);
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
    
    public ArrayList<Cliente> buscaCliente(String nombre)
    {
        ArrayList listaCliente = new ArrayList();
        Cliente cliente;
        try 
        {
            this.conectar();
            CallableStatement cs = getMiConexion().prepareCall("{call buscarCliente(?)}");
            cs.setString(1, nombre);
            ResultSet rs = cs.executeQuery();
            while(rs.next())
            {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt(1));
                cliente.setNombreCliente(rs.getString(2));
                cliente.setApellidoCliente(rs.getString(3));
                cliente.setDireccionCliente(rs.getString(4));
                cliente.setNitCliente(rs.getString(5));
                cliente.setFechaNacimiento(rs.getString(6));
                cliente.setCorreoCliente(rs.getString(7));
                cliente.setTelefonoCliente(rs.getString(8));
                listaCliente.add(cliente);
            }
        } catch (Exception e) 
        {
            System.out.println(e + "Error buscar Cliente");
        }
        finally
        {
            this.desconectar();
        }
        return listaCliente;
    }
    
}
