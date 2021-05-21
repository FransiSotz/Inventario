package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Modelo.Cliente;
import Modelo.ClienteDAO;
import Security.ValidarCorreo;
import Vista.frmCliente;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

public class ControladorCliente implements ActionListener, KeyListener, MouseListener
{
    frmCliente vistaCliente = new frmCliente();
    Cliente modelo = new Cliente();
    ClienteDAO dao = new ClienteDAO();
    ControladorUsuario usuario = new ControladorUsuario();
    ValidarCorreo validaCorreo = new ValidarCorreo();
    int filaSeleccion;
    String codigoSeleccion;
    static int idUsuario;
    java.util.Date fecha;
    SimpleDateFormat fechaFormateado;
    String fechaTabla;
    
    public ControladorCliente(frmCliente vistacliente)
    {
        this.vistaCliente = vistacliente;
        this.vistaCliente.btnConsultar.addActionListener(this);
        this.vistaCliente.btnInsertar.addActionListener(this);
        this.vistaCliente.btnActualizar.addActionListener(this);
        this.vistaCliente.btnEliminar.addActionListener(this);
        this.vistaCliente.txtBuscar.addKeyListener(this);
        this.vistaCliente.tblCliente.addMouseListener(this);
        idUsuario = usuario.idUsuario;
    }

    public void limpiarCliente()
    {
        vistaCliente.txtNombreCliente.setText("");
        vistaCliente.txtApellidoCliente.setText("");
        vistaCliente.txtDireccionCliente.setText("");
        vistaCliente.txtNitCliente.setText("");
        vistaCliente.dtChFechaNacimiento.setCalendar(null);
        vistaCliente.txtCorreoCliente.setText("");
        vistaCliente.txtTelefonoCliente.setText("");
    }
    
    public void cargaDatos(java.awt.event.MouseEvent evt) 
    {                                          
        filaSeleccion = vistaCliente.tblCliente.getSelectedRow();
        codigoSeleccion = vistaCliente.tblCliente.getValueAt(filaSeleccion, 0).toString();
        vistaCliente.txtNombreCliente.setText(vistaCliente.tblCliente.getValueAt(filaSeleccion, 1).toString());
        vistaCliente.txtApellidoCliente.setText(vistaCliente.tblCliente.getValueAt(filaSeleccion, 2).toString());
        vistaCliente.txtDireccionCliente.setText(vistaCliente.tblCliente.getValueAt(filaSeleccion, 3).toString());
        vistaCliente.txtNitCliente.setText(vistaCliente.tblCliente.getValueAt(filaSeleccion, 4).toString());
        fechaTabla = vistaCliente.tblCliente.getValueAt(filaSeleccion, 5).toString();
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy/mm/dd");
        Date fechaN = null;
        try {
            //parseamos de String a Date usando el formato
            fechaN = formatoDelTexto.parse(fechaTabla);
            //seteamos o mostramos la fecha en el JDateChooser
            vistaCliente.dtChFechaNacimiento.setDate(fechaN);
        } catch (ParseException ex) 
        {
            ex.printStackTrace();
        }
        vistaCliente.txtCorreoCliente.setText(vistaCliente.tblCliente.getValueAt(filaSeleccion, 6).toString());
        vistaCliente.txtTelefonoCliente.setText(vistaCliente.tblCliente.getValueAt(filaSeleccion, 7).toString());
    }

    public void insertCliente()
    {
    String nombreCliente = vistaCliente.txtNombreCliente.getText();    
    modelo.setNombreCliente(vistaCliente.txtNombreCliente.getText());
    modelo.setApellidoCliente(vistaCliente.txtApellidoCliente.getText());
    modelo.setDireccionCliente(vistaCliente.txtDireccionCliente.getText());
    modelo.setNitCliente(vistaCliente.txtNitCliente.getText());
    fecha = vistaCliente.dtChFechaNacimiento.getDate();
    fechaFormateado = new SimpleDateFormat("dd/MM/yyyy", new Locale("es_ES"));
    modelo.setFechaNacimiento(fechaFormateado.format(fecha));
    modelo.setCorreoCliente(vistaCliente.txtCorreoCliente.getText());
    modelo.setTelefonoCliente(vistaCliente.txtTelefonoCliente.getText());
    modelo.setIdUsuario(idUsuario);
        if (nombreCliente.equals("")) 
        {
            JOptionPane.showMessageDialog(null, "Ingrese Nombre de Cliente");
        }
        if (validaCorreo.ValidarEmail(vistaCliente.txtCorreoCliente.getText())== false) 
        {
            JOptionPane.showMessageDialog(null, "Formato de Correo Invalido");
        }
        else
        {
            String  respuestaInsert = dao.registrarCliente(modelo);
            if (respuestaInsert != null) 
            {
               JOptionPane.showMessageDialog(null, respuestaInsert);
               limpiarCliente();
               llenarTabla(vistaCliente.tblCliente); 
            }  
        } 
    }
    
    public void updateCliente()
    {
        modelo.setIdCliente(Integer.parseInt(codigoSeleccion));
        modelo.setNombreCliente(vistaCliente.txtNombreCliente.getText());
        modelo.setApellidoCliente(vistaCliente.txtApellidoCliente.getText());
        modelo.setDireccionCliente(vistaCliente.txtDireccionCliente.getText());
        modelo.setNitCliente(vistaCliente.txtNitCliente.getText());
        fecha = vistaCliente.dtChFechaNacimiento.getDate();
        fechaFormateado = new SimpleDateFormat("dd/MM/yyyy", new Locale("es_ES"));
        modelo.setFechaNacimiento(fechaFormateado.format(fecha));
        modelo.setCorreoCliente(vistaCliente.txtCorreoCliente.getText());
        modelo.setTelefonoCliente(vistaCliente.txtTelefonoCliente.getText());
        String respuestaActualizar = this.dao.modificarCliente(modelo);
        if (respuestaActualizar != null) 
        {
            JOptionPane.showMessageDialog(null, respuestaActualizar);
            limpiarCliente();
            llenarTabla(vistaCliente.tblCliente); 
        }
    }
    
    public void deleteCliente()
    {
        modelo.setIdCliente(Integer.parseInt(codigoSeleccion));
        int rpta = JOptionPane.showConfirmDialog(null, "Desea eliminar : " + dao.mostrarDatos().get(filaSeleccion).getNombreCliente()+ "? ");
            if(rpta==0)
            {
                String respuestaEliminar = this.dao.eliminarCliente(modelo.getIdCliente());
                JOptionPane.showMessageDialog(null, respuestaEliminar);
                limpiarCliente();
                llenarTabla(vistaCliente.tblCliente);
            }
            else
            limpiarCliente();
    }
    
    public void llenarTabla(JTable tabla)
    {
        DefaultTableModel tablaModelo = new DefaultTableModel();
        tabla.setModel(tablaModelo);
        tablaModelo.addColumn("Codigo");
        tablaModelo.addColumn("Nombre");
        tablaModelo.addColumn("Apellido");
        tablaModelo.addColumn("Direccion");
        tablaModelo.addColumn("Nit");
        tablaModelo.addColumn("Fecha Nacimiento");
        tablaModelo.addColumn("Correo");
        tablaModelo.addColumn("Telefono");
        Object [] columna = new Object[8];
        int cantFilas = dao.mostrarDatos().size();
        for (int i = 0; i < cantFilas; i++) 
        {
            columna[0] = dao.mostrarDatos().get(i).getIdCliente();
            columna[1] = dao.mostrarDatos().get(i).getNombreCliente();
            columna[2] = dao.mostrarDatos().get(i).getApellidoCliente();
            columna[3] = dao.mostrarDatos().get(i).getDireccionCliente();
            columna[4] = dao.mostrarDatos().get(i).getNitCliente();
            columna[5] = dao.mostrarDatos().get(i).getFechaNacimiento();
            columna[6] = dao.mostrarDatos().get(i).getCorreoCliente();
            columna[7] = dao.mostrarDatos().get(i).getTelefonoCliente();
            tablaModelo.addRow(columna);
        }
    }
    
    public void buscarCliente()
    {
            String nombre = vistaCliente.txtBuscar.getText();
            
            DefaultTableModel  modeloT = new DefaultTableModel();
            vistaCliente.tblCliente.setModel(modeloT);

            modeloT.addColumn("ID");
            modeloT.addColumn("NOMBRE");
            modeloT.addColumn("APELLIDO");
            modeloT.addColumn("DIRECCION");
            modeloT.addColumn("NIT");
            modeloT.addColumn("NACIMIENTO");
            modeloT.addColumn("CORREO");
            modeloT.addColumn("TELEFONO");
            
            Object[] columna = new Object[8];

            int numRegistros = dao.buscaCliente(nombre).size();

            for (int i = 0; i < numRegistros; i++) 
            {
                columna[0] = dao.buscaCliente(nombre).get(i).getIdCliente();
                columna[1] = dao.buscaCliente(nombre).get(i).getNombreCliente();
                columna[2] = dao.buscaCliente(nombre).get(i).getApellidoCliente();
                columna[3] = dao.buscaCliente(nombre).get(i).getDireccionCliente();
                columna[4] = dao.buscaCliente(nombre).get(i).getNitCliente();
                columna[5] = dao.buscaCliente(nombre).get(i).getFechaNacimiento();
                columna[6] = dao.buscaCliente(nombre).get(i).getCorreoCliente();
                columna[7] = dao.buscaCliente(nombre).get(i).getTelefonoCliente();
                modeloT.addRow(columna);
            }
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == vistaCliente.btnInsertar) 
        {
            insertCliente();   
        }
        if (e.getSource() == vistaCliente.btnConsultar) 
        {
            llenarTabla(vistaCliente.tblCliente);
        }
        if (e.getSource() == vistaCliente.btnActualizar) 
        {
            updateCliente();
        }
        if (e.getSource() == vistaCliente.btnEliminar) 
        {
            deleteCliente();
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
    if(e.getSource()== vistaCliente.txtBuscar)
        {
            buscarCliente();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
        if (e.getSource() == vistaCliente.tblCliente) 
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
