package Controlador;

import Modelo.ReporteDAO;
import Vista.frmReporte;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorReporte implements ActionListener, KeyListener, MouseListener
{
    frmReporte vistaReporte = new frmReporte();
    ReporteDAO reporte = new ReporteDAO();
    ControladorUsuario usuario = new ControladorUsuario();
    int filaSeleccion;
    String codigoSeleccion;
    static int idUsuario;
    int codigoVenta;

    public ControladorReporte() 
    {
    }

    public ControladorReporte(frmReporte frmReporte) 
    {
        this.vistaReporte = frmReporte;
        this.vistaReporte.btnGenerar.addActionListener(this);
        idUsuario = usuario.idUsuario;
    }
    
    public void reportePorVenta(int codigo) 
    {                                           
        reporte.reportexFactura(codigo);
    }   
    
    public void reportePorCliente()
    {
        int codigo = Integer.parseInt(vistaReporte.txtCodigoCliente.getText());
        reporte.reportexCliente(codigo);
    }
    
    public void limpiarReporte()
    {
        vistaReporte.txtCodigoVenta.setText("");
        vistaReporte.txtCodigoCliente.setText("");
        vistaReporte.txtCantidadStock.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == vistaReporte.btnGenerar) 
        {
            if (vistaReporte.rbtnNumVenta.isSelected()) 
            {
                codigoVenta = Integer.parseInt(vistaReporte.txtCodigoVenta.getText());
                reportePorVenta(codigoVenta); 
                limpiarReporte();
            }
            if (vistaReporte.rbtnStock.isSelected()) 
            {
                int cantidad = Integer.parseInt(vistaReporte.txtCantidadStock.getText());
                if (vistaReporte.rbtnMenor.isSelected()) 
                {
                    reporte.reporteStockMinimo(cantidad);
                    limpiarReporte();
                }
                else if (vistaReporte.rbtnMayor.isSelected()) 
                {
                    reporte.reporteStockMaximo(cantidad);
                    limpiarReporte();
                }
            }
            if (vistaReporte.rbtnPorCliente.isSelected()) 
            {
                reportePorCliente(); 
                limpiarReporte();
            }
            if (vistaReporte.rbtnPorProducto.isSelected()) 
            {
                //reporte.reportexProductoMasVendido();
                reporte.ProductoMasVendido();
                limpiarReporte();
            }
        }
    }    

    @Override
    public void keyTyped(KeyEvent e) 
    {
        
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {
        
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {

    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {

    }

    @Override
    public void mousePressed(MouseEvent e) 
    {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) 
    {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) 
    {
        
    }

    @Override
    public void mouseExited(MouseEvent e) 
    {
        
    }
}
