package Modelo;

import Conexion.Conexion;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class ReporteDAO extends Conexion
{

    public void reporteStockMinimo(int cantidad)
    {
        try 
        {
            this.conectar();
            Map stockProducto = new HashMap();
            stockProducto.put("stockProducto", cantidad);
            InputStream reporteInputStream = ReporteDAO.class.getResourceAsStream("/Reporte/StockMinimo.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(reporteInputStream, stockProducto, getMiConexion());
            JasperViewer jView = new JasperViewer(jasperPrint, false);
            jView.setVisible(true);
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage() + "Error En Reporte Stock Minimo");
        }
        finally
        {
            this.desconectar();
        } 
    }
    
    public void reporteStockMaximo(int cantidad)
    {
        try 
        {
            this.conectar();
            Map stockProducto = new HashMap();
            stockProducto.put("stockProducto", cantidad);
            InputStream reporteInputStream = ReporteDAO.class.getResourceAsStream("/Reporte/StockMaximo.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(reporteInputStream, stockProducto, getMiConexion());
            JasperViewer jView = new JasperViewer(jasperPrint, false);
            jView.setVisible(true);
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage() + "Error En Reporte Stock Maximo");
        }
        finally
        {
            this.desconectar();
        } 
    }
    
    public void reportexCliente(int codigo) 
    {
        try 
        {
            this.conectar();
            Map idCliente = new HashMap();
            idCliente.put("idCliente", codigo);
            InputStream reporteInputStream = ReporteDAO.class.getResourceAsStream("/Reporte/reporteCliente.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(reporteInputStream, idCliente, getMiConexion());
            JasperViewer jView = new JasperViewer(jasperPrint, false);
            jView.setVisible(true);
        } 
        catch(Exception e) 
        {
            System.out.println(e.getMessage() + "Error En Reporte Cliente");
        }
    }
    
public void reportexFactura(int codigo) 
{
    try 
    {
        this.conectar();
        Map idVenta = new HashMap();
        idVenta.put("idVenta", codigo);
        InputStream reporteInputStream = ReporteDAO.class.getResourceAsStream("/Reporte/Ventas.jasper");
        JasperPrint jasperPrint = JasperFillManager.fillReport(reporteInputStream, idVenta, getMiConexion());
        JasperViewer jView = new JasperViewer(jasperPrint, false);
        jView.setVisible(true);
    } 
    catch(Exception e) 
    {
        System.out.println(e.getMessage() + "Error En Reporte ClassPath");
    }
}

public void ProductoMasVendido() 
{
try {
            this.conectar();
            InputStream reporteInputStream = ReporteDAO.class.getResourceAsStream("/Reporte/reportexProductoMasVendido.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(reporteInputStream, null, getMiConexion());
            JasperViewer jView = new JasperViewer(jasperPrint, false);
            jView.setVisible(true);
        } catch (Exception e) {
            System.out.printf(e.getMessage() + "Error En Reporte Producto");
        }
}

public void CodigoBarra() 
{
try {
            this.conectar();
            InputStream reporteInputStream = ReporteDAO.class.getResourceAsStream("/Reporte/CodigoBarras.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(reporteInputStream, null, getMiConexion());
            JasperViewer jView = new JasperViewer(jasperPrint, false);
            jView.setVisible(true);
        } catch (Exception e) {
            System.out.printf(e.getMessage() + "Error En Codigo de Barras");
        }
}

public void reporteConParametro(String archivo) 
{
    try 
    {
        this.conectar();
        // asumiendo que archivo es algo como reporte.jasper
        // MiClase es la clase donde se encuentra este método
        InputStream reporteInputStream = ReporteDAO.class.getResourceAsStream("/reportes/" + archivo);
        JasperPrint jasperPrint = JasperFillManager.fillReport(reporteInputStream, null, getMiConexion());
        JasperViewer jView = new JasperViewer(jasperPrint, false);
        jView.setVisible(true);
    } 
    catch(Exception e) 
    {
        System.out.println(e.getMessage() + "Error En Reporte Con Paremetro");
    }
}
}
