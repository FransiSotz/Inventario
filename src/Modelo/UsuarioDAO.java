package Modelo;

import Conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UsuarioDAO extends Conexion
{
    PreparedStatement ps;
    ResultSet rs;
    Usuario modelo = new Usuario();
    String query;
    String respuesta;
    
    public Usuario ValidarUsuario(String usuario, String pass)
    {
        try {
            this.conectar();
            String instruccionSql = "select * from Usuario where usuario = ? and passwordUsuario = ?";
            ps = getMiConexion().prepareStatement(instruccionSql);
            ps.setString(1, usuario);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                modelo.setIdUsuario(rs.getInt("idUsuario"));
                modelo.setUsuario(rs.getString("usuario"));
                modelo.setNombreUsuario(rs.getString("nombreUsuario"));
                modelo.setPasswordUsuario(rs.getString("passwordUsuario"));
                modelo.setIDRol(rs.getInt("idRol"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + " Error Usuario");
        }
        finally
        {
            this.desconectar();
        }
    return modelo;
    }
    
    public String registrarUsuario(Usuario usuario) {
        try {
            this.conectar();
            query = "insert into Usuario (idRol, Usuario, nombreUsuario, passwordUsuario, idUsuarioAlter) values (?,?,?,?,?)";
            ps = getMiConexion().prepareStatement(query);
            ps.setInt(1, usuario.getIdRol());
            ps.setString(2, usuario.getUsuario());
            ps.setString(3, usuario.getNombreUsuario());
            ps.setString(4, usuario.getPasswordUsuario());
            ps.setInt(5, usuario.getIdUsuario());
             ps.executeUpdate();                   
            respuesta = "Registro almacenado correctamente!!"; 
        } catch (Exception e) {
            System.out.println(e.getMessage());
            respuesta = "No se puede almacenar el registro!!";
        } 
        finally
        {
            this.desconectar();
        }
        return respuesta;
    }
    
    public String modificarUsuario(Usuario usuario)
    {
        try {
            this.conectar();
            query = "update Usuario set idRol = ?, Usuario = ?, nombreUsuario = ?, passwordUsuario = ? where idUsuario = ?";
            ps = getMiConexion().prepareStatement(query);
            ps.setInt(1, usuario.getIdRol());
            ps.setString(2, usuario.getUsuario());
            ps.setString(3, usuario.getNombreUsuario());
            ps.setString(4, usuario.getPasswordUsuario());
            ps.setInt(5, usuario.getIdUsuario());
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
        
    public String eliminarUsuario(int id)
    {
        try {
            this.conectar();
            query = "delete from Usuario where idUsuario = ?";
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
    
    public ArrayList<Usuario> mostrarDatos()
    {
        ArrayList<Usuario> datos = null;
        try 
        {
            this.conectar();
            query = "select * from Usuario";
            ps = this.getMiConexion().prepareStatement(query);
            rs = ps.executeQuery();
            datos = new ArrayList();
            while (rs.next())
            {
                Usuario u = new Usuario();
                u.setIdUsuario(rs.getInt("idUsuario"));
                u.setIDRol(rs.getInt("idRol"));
                u.setUsuario(rs.getString("Usuario"));
                u.setNombreUsuario(rs.getString("nombreUsuario"));
                u.setPasswordUsuario(rs.getString("passwordUsuario"));
                datos.add(u);
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
    
    
    public ArrayList<Usuario> buscaUsuario(String nombre)
    {
        ArrayList listaUsuario = new ArrayList();
        Usuario usuario;
        try 
        {
            this.conectar();
            CallableStatement cs = getMiConexion().prepareCall("{call buscarUsuario(?)}");
            cs.setString(1, nombre);
            ResultSet rs = cs.executeQuery();
            while(rs.next())
            {
                usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt(1));
                usuario.setIDRol(rs.getInt(2));
                usuario.setUsuario(rs.getString(3));
                usuario.setNombreUsuario(rs.getString(4));
                usuario.setPasswordUsuario(rs.getString(5));
                listaUsuario.add(usuario);
            }
        } catch (Exception e) 
        {
        }
        finally
        {
            this.desconectar();
        }
        return listaUsuario;
    }
}
