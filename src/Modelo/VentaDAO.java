package Modelo;

import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class VentaDAO extends Conexion
{
    private PreparedStatement ps;
    private ResultSet rs;
    private int mensaje;
    Conexion conectar = new Conexion();
    private String query;
    private int max;
    Venta venta = new Venta();
    DetalleVenta detalleVenta = new DetalleVenta();
    String respuesta;
    
    public String maxId()
    {
        String serie = "";
        try 
        {
            this.conectar();
            query = "select coalesce(max(idVenta),0)+ 1 from Venta";
            ps = getMiConexion().prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) 
            {
                serie = rs.getString(1);
            }
            
        } catch (Exception e) 
        {
            System.out.println(e.getMessage() + "Error MaxiID");
        }
        finally
        {
            this.desconectar();
        }
        return serie;
    }
    
    public int guardarVenta(Venta venta)
    {
        try 
        {
            this.conectar();
            query = "insert into venta (idVendedor, idCliente, fechaVenta, totalVenta, idUsuario) values (?,?,?,?,?)";
            ps = getMiConexion().prepareStatement(query);
            ps.setInt(1, venta.getIdVendedor());
            ps.setInt(2, venta.getIdCliente());
            ps.setString(3, venta.getFechaVenta());
            ps.setDouble(4, venta.getTotalVenta());
            ps.setInt(5, venta.getIdUsuario());
            mensaje = ps.executeUpdate(); 
        } catch (Exception e) 
        {
            System.out.println(e.getMessage() + "Error en Venta");
        }
        finally
        {
            this.desconectar();
        }
        return mensaje;
    }
    
    
    public int guardarDetalleVenta(DetalleVenta detalleVenta)
    {
        try 
        {
            this.conectar();
            query = "insert into detalleVenta (iddetalleVenta, idVenta, idProducto, cantidad,precioVenta) values (?,?,?,?,?)";
            ps = getMiConexion().prepareStatement(query);
            ps.setInt(1, detalleVenta.getIdDetalleVenta());
            ps.setInt(2, detalleVenta.getIdVenta());
            ps.setInt(3, detalleVenta.getIdProducto());
            ps.setInt(4, detalleVenta.getCantidad());
            ps.setDouble(5, detalleVenta.getPrecioVenta());
            mensaje = ps.executeUpdate(); 
        } catch (Exception e) 
        {
            System.out.println(e.getMessage() + "Error en Detalle Venta");
        }
        finally
        {
            this.desconectar();
        }
        return mensaje;
    }
    
    public int anularVenta(int codigoVenta)
    {
        try 
        {
            this.conectar();
            query = "update venta set estadoVenta = 'ANULADO' where idVenta = ?";
            ps = this.getMiConexion().prepareStatement(query);
            ps.setInt(1, codigoVenta);
            mensaje = ps.executeUpdate();
        } 
        catch (Exception e) 
        {
        respuesta = "No se puede modificar la Factura";
        }
        finally
        {
            this.desconectar();
        }
        return mensaje;
    }
    
    public ArrayList<DetalleVenta> productoFactura(int codigoVenta)
    {
        ArrayList<DetalleVenta> datos = new ArrayList<DetalleVenta>();
        DetalleVenta detalle = null; 
        try 
        {
            this.conectar();
            query = "select idProducto, cantidad from detalleVenta where idVenta = ?";
            ps = this.getMiConexion().prepareStatement(query);
            ps.setInt(1, codigoVenta);
            rs = ps.executeQuery();
            while (rs.next()) 
            {
               detalle = new DetalleVenta();
               detalle.setIdProducto(rs.getInt("idProducto"));
               detalle.setCantidad(rs.getInt("cantidad"));
               datos.add(detalle);
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
    
    public Venta validaAnulacion(int idVenta)
    {
        try 
        {
           this.conectar();
           query = "select estadoVenta from venta where idVenta = ?";
           ps = getMiConexion().prepareStatement(query);
           ps.setInt(1, idVenta);
           rs = ps.executeQuery();
            while (rs.next()) 
            {
               venta.setEstadoVenta(rs.getString("estadoVenta"));
            }
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        return venta;
    }
    
    
}
