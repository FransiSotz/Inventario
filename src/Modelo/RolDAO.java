package Modelo;

import Conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

public class RolDAO extends Conexion
{
    private PreparedStatement ps;
    private ResultSet rs;
    private String mensaje;
    private String query;
    Rol rol = new Rol();
    
    public ArrayList<Rol> mostrarDatos()
    {
        ArrayList<Rol> datos = null;
        try 
        {
            this.conectar();
            query = "select * from Rol";
            ps = this.getMiConexion().prepareStatement(query);
            rs = ps.executeQuery();
            datos = new ArrayList();
            while (rs.next())
            {
                Rol rol = new Rol();
                rol.setIdRol(rs.getInt("idRol"));
                rol.setNombreRol(rs.getString("nombreRol"));
                datos.add(rol);
            }   
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage()+ "Error en Rol de Usuario");
        }
        finally
        {
            this.desconectar();
        }
        return datos;
    }
    
    public Vector<Rol> llenaComboRol()
    {
        Vector<Rol> datos = new Vector<Rol>();
        Rol rol = null; 
        try 
        {
            this.conectar();
            query = "select idRol, nombreRol from Rol";
            ps = this.getMiConexion().prepareStatement(query);
            rs = ps.executeQuery();
            rol = new Rol();
            rol.setIdRol(0);
            rol.setNombreRol("Seleccione Rol");
            datos.add(rol);
            while (rs.next()) 
            {
               rol = new Rol();
               rol.setIdRol(rs.getInt("idRol"));
               rol.setNombreRol(rs.getString("nombreRol"));
               datos.add(rol);
            }
        } 
        catch (SQLException ex) 
        {
            System.out.println(ex.getMessage() + "Error al llenar Tabla Rol");
        }
        finally
        {
            this.desconectar();
        }
    return datos;    
    }
    
   
    public String insertRol(Rol rol) {
        try {
            this.conectar();
            query = "insert into Rol (nombreRol, idUsuario) values (?,?)";
            ps = getMiConexion().prepareStatement(query);
            ps.setString(1, rol.getNombreRol());
            ps.setInt(2, rol.getIdUsuario());
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
    
    public String updateRol(Rol rol)
    {
        try {
            this.conectar();
            query = "update Rol set nombreRol = ?  where idRol = ?";
            ps = getMiConexion().prepareStatement(query);
            ps.setString(1, rol.getNombreRol());
            ps.setInt(2, rol.getIdRol());
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
    
    public String deleteRol(int id)
    {
        try 
        {
            this.conectar();
            query = "delete from Rol where idRol = ?";
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
    
    
    public ArrayList<Rol> buscaRol(String nombre)
    {
        ArrayList listaRol = new ArrayList();
        Rol rol;
        try 
        {
            this.conectar();
            CallableStatement cs = getMiConexion().prepareCall("{call BuscarRol(?)}");
            cs.setString(1, nombre);
            ResultSet rs = cs.executeQuery();
            while(rs.next())
            {
                rol = new Rol();
                rol.setIdRol(rs.getInt(1));
                rol.setNombreRol(rs.getString(2));
                listaRol.add(rol);
            }
        } catch (Exception e) 
        {
            System.out.println(e + "Error buscar Cateroria");
        }
        finally
        {
            this.desconectar();
        }
        return listaRol;
    }
}
