package Controlador;

import Modelo.Vendedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Modelo.VendedorDAO;
import Vista.Login;
import Vista.PrincipalFormulario;
import Vista.frmVendedor;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorVendedor implements ActionListener, KeyListener, MouseListener
{
Login vista = new Login();
Vendedor modelo = new Vendedor();
VendedorDAO dao = new VendedorDAO();
PrincipalFormulario principal = new PrincipalFormulario();
ControladorUsuario usuario = new ControladorUsuario();
frmVendedor vistaVendedor = new frmVendedor();
int filaSeleccion;
String codigoSeleccion;
static int idUsuario;
  
    
    public ControladorVendedor(frmVendedor vistaVendedor)
    {
        this.vistaVendedor = vistaVendedor;
        this.vistaVendedor.btnInsertar.addActionListener(this);
        this.vistaVendedor.btnConsultar.addActionListener(this);
        this.vistaVendedor.btnActualizar.addActionListener(this);
        this.vistaVendedor.btnEliminar.addActionListener(this);
        this.vistaVendedor.txtBuscar.addKeyListener(this);
        this.vistaVendedor.tblVendedor.addMouseListener(this);
        idUsuario = usuario.idUsuario;
    }
    
    public void limpiarVendedor()
    {
        vistaVendedor.txtNombreVendedor.setText("");
        vistaVendedor.txtApellidoVendedor.setText("");
        vistaVendedor.txtDireccionVendedor.setText("");
        vistaVendedor.txtDpiVendedor.setText("");
        vistaVendedor.ftxtFechaNacimiento.setText("");
        vistaVendedor.txtCorreoVendedor.setText("");
        vistaVendedor.txtTelefonoVendedor.setText("");
    }
    
    public void cargaDatos(java.awt.event.MouseEvent evt) 
    {                                          
        filaSeleccion = vistaVendedor.tblVendedor.getSelectedRow();
        codigoSeleccion = vistaVendedor.tblVendedor.getValueAt(filaSeleccion, 0).toString();
        vistaVendedor.txtNombreVendedor.setText(vistaVendedor.tblVendedor.getValueAt(filaSeleccion, 1).toString());
        vistaVendedor.txtApellidoVendedor.setText(vistaVendedor.tblVendedor.getValueAt(filaSeleccion, 2).toString());
        vistaVendedor.txtDireccionVendedor.setText(vistaVendedor.tblVendedor.getValueAt(filaSeleccion, 3).toString());
        vistaVendedor.txtDpiVendedor.setText(vistaVendedor.tblVendedor.getValueAt(filaSeleccion, 4).toString());
        vistaVendedor.ftxtFechaNacimiento.setText(vistaVendedor.tblVendedor.getValueAt(filaSeleccion, 5).toString());
        vistaVendedor.txtCorreoVendedor.setText(vistaVendedor.tblVendedor.getValueAt(filaSeleccion, 6).toString());
        vistaVendedor.txtTelefonoVendedor.setText(vistaVendedor.tblVendedor.getValueAt(filaSeleccion, 7).toString());
    }
    
    public void insertVendedor()
    {
    String nombreCliente = vistaVendedor.txtNombreVendedor.getText();    
    modelo.setNombreVendedor(vistaVendedor.txtNombreVendedor.getText());
    modelo.setApellidoVendedor(vistaVendedor.txtApellidoVendedor.getText());
    modelo.setDireccionVendedor(vistaVendedor.txtDireccionVendedor.getText());
    modelo.setDpiVendedor(vistaVendedor.txtDpiVendedor.getText());
    modelo.setFechaNacimiento(vistaVendedor.ftxtFechaNacimiento.getText());
    modelo.setCorreoVendedor(vistaVendedor.txtCorreoVendedor.getText());
    modelo.setTelefonoVendedor(vistaVendedor.txtTelefonoVendedor.getText());
    modelo.setIdUsuario(idUsuario);
        if (nombreCliente.equals("")) 
        {
            JOptionPane.showMessageDialog(null, "Ingrese Nombre de Vendedor");
        }
        else
        {
            String  respuestaInsert = dao.registrarVendedor(modelo);
            if (respuestaInsert != null) 
            {
               JOptionPane.showMessageDialog(null, respuestaInsert);
               limpiarVendedor();
               llenarTabla(vistaVendedor.tblVendedor); 
            }  
        } 
    }
    
    public void llenarTabla(JTable tabla)
    {
        DefaultTableModel tablaModelo = new DefaultTableModel();
        tabla.setModel(tablaModelo);
        tablaModelo.addColumn("Codigo");
        tablaModelo.addColumn("Nombre");
        tablaModelo.addColumn("Apellido");
        tablaModelo.addColumn("Direccion");
        tablaModelo.addColumn("Dpi");
        tablaModelo.addColumn("Fecha Nacimiento");
        tablaModelo.addColumn("Correo");
        tablaModelo.addColumn("Telefono");
        Object [] columna = new Object[8];
        int cantFilas = dao.mostrarDatos().size();
        for (int i = 0; i < cantFilas; i++) 
        {
            columna[0] = dao.mostrarDatos().get(i).getIdVendedor();
            columna[1] = dao.mostrarDatos().get(i).getNombreVendedor();
            columna[2] = dao.mostrarDatos().get(i).getApellidoVendedor();
            columna[3] = dao.mostrarDatos().get(i).getDireccionVendedor();
            columna[4] = dao.mostrarDatos().get(i).getDpiVendedor();
            columna[5] = dao.mostrarDatos().get(i).getFechaNacimiento();
            columna[6] = dao.mostrarDatos().get(i).getCorreoVendedor();
            columna[7] = dao.mostrarDatos().get(i).getTelefonoVendedor();
            tablaModelo.addRow(columna);
        }
    }
    
    public void updateVendedor()
    {
        modelo.setIdVendedor(Integer.parseInt(codigoSeleccion));
        modelo.setNombreVendedor(vistaVendedor.txtNombreVendedor.getText());
        modelo.setApellidoVendedor(vistaVendedor.txtApellidoVendedor.getText());
        modelo.setDireccionVendedor(vistaVendedor.txtDireccionVendedor.getText());
        modelo.setDpiVendedor(vistaVendedor.txtDpiVendedor.getText());
        modelo.setFechaNacimiento(vistaVendedor.ftxtFechaNacimiento.getText());
        modelo.setCorreoVendedor(vistaVendedor.txtCorreoVendedor.getText());
        modelo.setTelefonoVendedor(vistaVendedor.txtTelefonoVendedor.getText());
        String respuestaActualizar = this.dao.modificarVendedor(modelo);
        if (respuestaActualizar != null) 
        {
            JOptionPane.showMessageDialog(null, respuestaActualizar);
            limpiarVendedor();
            llenarTabla(vistaVendedor.tblVendedor); 
        }
    }
    
    public void deleteVendedor()
    {
        modelo.setIdVendedor(Integer.parseInt(codigoSeleccion));
        int rpta = JOptionPane.showConfirmDialog(null, "Desea eliminar : " + dao.mostrarDatos().get(filaSeleccion).getNombreVendedor()+ "? ");
            if(rpta==0)
            {
                String respuestaEliminar = this.dao.eliminarVendedor(modelo.getIdVendedor());
                JOptionPane.showMessageDialog(null, respuestaEliminar);
                limpiarVendedor();
                llenarTabla(vistaVendedor.tblVendedor);
            }
            else
            limpiarVendedor();
    }
    
    public void buscarVendedor()
    {
            String nombre = vistaVendedor.txtBuscar.getText();
            
            DefaultTableModel  modeloT = new DefaultTableModel();
            vistaVendedor.tblVendedor.setModel(modeloT);

            modeloT.addColumn("ID");
            modeloT.addColumn("NOMBRE");
            modeloT.addColumn("APELLIDO");
            modeloT.addColumn("DIRECCION");
            modeloT.addColumn("DPI");
            modeloT.addColumn("NACIMIENTO");
            modeloT.addColumn("CORREO");
            modeloT.addColumn("TELEFONO");
            
            Object[] columna = new Object[8];

            int numRegistros = dao.buscaVendedor(nombre).size();

            for (int i = 0; i < numRegistros; i++) 
            {
                columna[0] = dao.buscaVendedor(nombre).get(i).getIdVendedor();
                columna[1] = dao.buscaVendedor(nombre).get(i).getNombreVendedor();
                columna[2] = dao.buscaVendedor(nombre).get(i).getApellidoVendedor();
                columna[3] = dao.buscaVendedor(nombre).get(i).getDireccionVendedor();
                columna[4] = dao.buscaVendedor(nombre).get(i).getDpiVendedor();
                columna[5] = dao.buscaVendedor(nombre).get(i).getFechaNacimiento();
                columna[6] = dao.buscaVendedor(nombre).get(i).getCorreoVendedor();
                columna[7] = dao.buscaVendedor(nombre).get(i).getTelefonoVendedor();
                modeloT.addRow(columna);
            }
    }


    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == vistaVendedor.btnInsertar) 
        {
            insertVendedor();   
        }
        if (e.getSource() == vistaVendedor.btnConsultar) 
        {
            llenarTabla(vistaVendedor.tblVendedor);
        }
        if (e.getSource() == vistaVendedor.btnActualizar) 
        {
            updateVendedor();
        }
        if (e.getSource() == vistaVendedor.btnEliminar) 
        {
            deleteVendedor();
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
        if(e.getSource()== vistaVendedor.txtBuscar)
        {
            buscarVendedor();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
        if (e.getSource() == vistaVendedor.tblVendedor) 
        {
            cargaDatos(e);
        }
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
