package Controlador;

import Modelo.DetalleVenta;
import Modelo.Producto;
import Modelo.ProductoDAO;
import Modelo.Venta;
import Modelo.VentaDAO;
import Vista.frmAnulacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControladorAnulacion implements ActionListener, KeyListener
{
    ControladorReporte reporte = new ControladorReporte();
    frmAnulacion vistaAnulacion = new frmAnulacion();
    VentaDAO ventaDAO =  new VentaDAO();
    Producto producto;
    ProductoDAO productoDao = new ProductoDAO();
    static int idUsuario;
    static String nombreUsuario;


    public ControladorAnulacion(frmAnulacion vistaAnulacion) 
    {
        this.vistaAnulacion = vistaAnulacion;
        this.vistaAnulacion.btnAnular.addActionListener(this);
        this.vistaAnulacion.txtNumeroVenta.addKeyListener(this);
        this.vistaAnulacion.btnConsultar.addActionListener(this);
        idUsuario= ControladorUsuario.idUsuario;
        nombreUsuario = ControladorUsuario.nombreUsuario;
    }
  
//    public void guardarFactura()
//    {
//        fecha = vistaVenta.dtChFechaVenta.getDate();
//        SimpleDateFormat fechaFormateado = new SimpleDateFormat("yyyy/MM/dd", new Locale("es_ES"));
//        double totalPago = total;
//        venta.setIdCliente(Integer.parseInt(codigoSeleccionCliente));
////        venta.setIdVendedor(codigoVendedor.getIdVendedor());
//        venta.setIdVendedor(idUsuario);
//        venta.setFechaVenta(fechaFormateado.format(fecha));
//        venta.setTotalVenta(totalPago);
//        venta.setIdUsuario(idUsuario);
//        ventasDao.guardarVenta(venta);
//    }
//    

    public void limpiar()
    {
        vistaAnulacion.txtNumeroVenta.setText("");
    }
    
    public void anularFactura()
    {
        int IdVenta = Integer.parseInt(vistaAnulacion.txtNumeroVenta.getText());
        ArrayList<DetalleVenta>  productos = new ArrayList<DetalleVenta>();
        productos = ventaDAO.productoFactura(IdVenta);
        Venta anulado = ventaDAO.validaAnulacion(IdVenta);
        if (anulado.getEstadoVenta().equals("ACTIVO")) 
        {
            for (int i = 0; i < productos.size(); i++) 
            {
                producto = new Producto();
                producto = productoDao.usarProducto(productos.get(i).getIdProducto());
                System.out.println(" " + producto.getStockProducto());
                int saldo = producto.getStockProducto() + productos.get(i).getCantidad();
                productoDao.actualizarStock(saldo, productos.get(i).getIdProducto());
            }
            int  respuestaUpdate = ventaDAO.anularVenta(IdVenta);
            if (respuestaUpdate > 0) 
                {
                   JOptionPane.showMessageDialog(null, "Factura " +IdVenta + " Anulada");
                }
            else
            {
                JOptionPane.showMessageDialog(null, "No se pudo Anular Factura");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Factura " +IdVenta + " Ya esta Anulada", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
            if (e.getSource() == vistaAnulacion.btnConsultar) 
            {
                if (vistaAnulacion.txtNumeroVenta.getText().equals("")) 
                {
                    JOptionPane.showMessageDialog(null, "Ingrese Numero de Factura", "Alerta", JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                int codigo = Integer.parseInt(vistaAnulacion.txtNumeroVenta.getText());
                limpiar();
                reporte.reportePorVenta(codigo); 
                }
            }
            if (e.getSource() == vistaAnulacion.btnAnular) 
            {
                if (vistaAnulacion.txtNumeroVenta.getText().equals("")) 
                {
                    JOptionPane.showMessageDialog(null, "Ingrese Numero de Factura", "Alerta", JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                anularFactura();
                limpiar();
                }
            }
    }

    @Override
    public void keyTyped(KeyEvent e) 
    {
        if(e.getSource() == vistaAnulacion.txtNumeroVenta)
        {
            char c = e.getKeyChar();
            if(c<'0' || c>'9')
            {
                e.consume();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {
     
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {

    }

}
