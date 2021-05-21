package Controlador;

import Modelo.Rol;
import Modelo.RolDAO;
import Modelo.Usuario;
import Modelo.UsuarioDAO;
import Security.Md5;
import Vista.Login;
import Vista.PrincipalFormulario;
import Vista.frmRol;
import Vista.frmUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControladorUsuario implements ActionListener, MouseListener, KeyListener
{
Login vista = new Login();
UsuarioDAO dao = new UsuarioDAO();
Usuario modelo = new Usuario();
RolDAO daoRol = new RolDAO();
PrincipalFormulario principal = new PrincipalFormulario();
frmRol rol = new frmRol();
frmUsuario vistaUsuario = new frmUsuario();
Md5 md5 = new Md5();
Rol codigoRol;
int rolUsuario;
public static int idUsuario;
public static String nombreUsuario;
int filaSeleccion;
String codigoSeleccion;
int codSeleccionComboRol;
String secretKey = "sourceCode";

    public ControladorUsuario() 
    {
    }


    public ControladorUsuario(frmUsuario vistaUsuario) 
    {
        this.vistaUsuario = vistaUsuario;
        this.vistaUsuario.btnInsertar.addActionListener(this);
        this.vistaUsuario.btnConsultar.addActionListener(this);
        this.vistaUsuario.btnActualizar.addActionListener(this);
        this.vistaUsuario.btnEliminar.addActionListener(this);
        this.vistaUsuario.cmbRol.addActionListener(this);
        this.vistaUsuario.tblUsuario.addMouseListener(this);
        this.vistaUsuario.txtBuscar.addKeyListener(this);
        this.vistaUsuario.txtNombreUsuario.addKeyListener(this);
        this.vistaUsuario.txtPassword.addKeyListener(this);
        llenaComboRol();
    }

    public ControladorUsuario(Login login) 
    {
        this.vista = login;
        this.vista.btnIngresar.addActionListener(this);
        this.vista.pssPassword.addActionListener(this);
        this.vista.txtUser.addActionListener(this);
        this.vista.jChkBxMostrar.addMouseListener(this);
    }
    
    

    
    public void validar()
    {
    String usuario = vista.txtUser.getText();
    String pass = md5.encode(secretKey, vista.pssPassword.getText());                   //Captura el contenido del campo Pass y lo Encripta
        if (vista.txtUser.getText().equals("")||vista.pssPassword.getText().equals("")) 
        {
            JOptionPane.showMessageDialog(null, "Usuario o Password Vacio");
            limpiarControles();
        }
        else
        {
             modelo = dao.ValidarUsuario(usuario, pass);
             if ((modelo.getUsuario()!=null)&& (modelo.getPasswordUsuario()!=null)) 
             {
                //menu.setVisible(true);
                principal.setVisible(true);
                limpiarControles();
                vista.setVisible(false);
                nombreUsuario = modelo.getNombreUsuario();
                principal.lblUser.setText(nombreUsuario);
                idUsuario = modelo.getIdUsuario();
                rolUsuario = modelo.getIdRol();
                 if (rolUsuario == 2) 
                 {
                     principal.btnVenta.setVisible(true);
                     principal.btnCategoria.setVisible(false);
                     principal.btnProducto.setVisible(false);
                     principal.btnCliente.setVisible(false);
                     principal.btnAnulacion.setVisible(false);
                     principal.btnRol.setVisible(false);
                     principal.btnUser.setVisible(false);
                     vistaUsuario.btnEliminar.setVisible(false);
                     principal.lblMantenimiento.setVisible(false);
                     principal.lblAdmin.setVisible(false);
                 }
             }else
             {
                 JOptionPane.showMessageDialog(null, "Usuario o Password Invalido");
                 vista.txtUser.requestFocus();
                 limpiarControles();
             }
        }
    
    }
    
    
    public void limpiarControles()
    {
        vista.txtUser.setText(null);
        vista.pssPassword.setText(null);
    }
    
     public void cargaDatos(java.awt.event.MouseEvent evt) 
    {                                          
        filaSeleccion = vistaUsuario.tblUsuario.getSelectedRow();
        codigoSeleccion = vistaUsuario.tblUsuario.getValueAt(filaSeleccion, 0).toString();
        vistaUsuario.cmbRol.setSelectedIndex(0);
        vistaUsuario.txtUsuario.setText(vistaUsuario.tblUsuario.getValueAt(filaSeleccion, 2).toString());
        vistaUsuario.txtNombreUsuario.setText(vistaUsuario.tblUsuario.getValueAt(filaSeleccion, 3).toString());
        vistaUsuario.txtPassword.setText(vistaUsuario.tblUsuario.getValueAt(filaSeleccion, 4).toString());
    } 
    
    public void cmbRolItemStateChanged(ActionEvent evt) {                                              
        codigoRol = (Rol)vistaUsuario.cmbRol.getSelectedItem();
        //System.out.println(codigoCategoria.getIdCategoria()+ " Codigo Combo Categoria");
    } 
    
    public void insertUsuario()
    {
    codSeleccionComboRol = vistaUsuario.cmbRol.getSelectedIndex();
    String cadenaEncriptada = md5.encode(secretKey, vistaUsuario.txtPassword.getText());
        if (codSeleccionComboRol == 0) 
        {
            JOptionPane.showMessageDialog(null, "Seleccione un Rol");
        }
        else
        {
        modelo.setIDRol(codigoRol.getIdRol());
        modelo.setUsuario(vistaUsuario.txtUsuario.getText());
        modelo.setNombreUsuario(vistaUsuario.txtNombreUsuario.getText());
        //modelo.setPasswordUsuario(vistaUsuario.txtPassword.getText());
        modelo.setPasswordUsuario(cadenaEncriptada);
        modelo.setIdUsuario(idUsuario);
        String  respuestaInsert = dao.registrarUsuario(modelo);
        if (respuestaInsert != null) 
            {
               JOptionPane.showMessageDialog(null, respuestaInsert);
               limpiarControles();
               llenarTabla(vistaUsuario.tblUsuario); 
            }   
        }
    }
    
    public void llenarTabla(JTable tabla)
    {
        DefaultTableModel tablaModelo = new DefaultTableModel();
        tabla.setModel(tablaModelo);
        tablaModelo.addColumn("Codigo");
        tablaModelo.addColumn("Rol");
        tablaModelo.addColumn("Usuario");
        tablaModelo.addColumn("Nombre");
        tablaModelo.addColumn("Password");
        
        Object [] columna = new Object[5];
        int cantFilas = dao.mostrarDatos().size();
        for (int i = 0; i < cantFilas; i++) 
        {
            columna[0] = dao.mostrarDatos().get(i).getIdUsuario();
            columna[1] = dao.mostrarDatos().get(i).getIdRol();
            columna[2] = dao.mostrarDatos().get(i).getUsuario();
            columna[3] = dao.mostrarDatos().get(i).getNombreUsuario();
            columna[4] = dao.mostrarDatos().get(i).getPasswordUsuario();
            
            tablaModelo.addRow(columna);
        }
        limpiarControles();
    }
    
    public void llenaComboRol()
    {
        DefaultComboBoxModel comboModelo = new DefaultComboBoxModel(daoRol.llenaComboRol());
        vistaUsuario.cmbRol.setModel(comboModelo);
    }
    
    public void modificarUsuario()
    {
    modelo.setIdUsuario(Integer.parseInt(codigoSeleccion));
    modelo.setIDRol(codigoRol.getIdRol());
    modelo.setUsuario(vistaUsuario.txtUsuario.getText());
    modelo.setNombreUsuario(vistaUsuario.txtNombreUsuario.getText());
    modelo.setPasswordUsuario(md5.encode(secretKey,vistaUsuario.txtPassword.getText()));
    
    String respuestaActualizar = this.dao.modificarUsuario(modelo);
    codSeleccionComboRol = codigoRol.getIdRol();
        
        if (codSeleccionComboRol == 0) 
        {
            JOptionPane.showMessageDialog(null, "Seleccione un Rol");
        }
        else if(respuestaActualizar != null) 
        {
            JOptionPane.showMessageDialog(null, respuestaActualizar);
            limpiarControles();
            llenarTabla(vistaUsuario.tblUsuario); 
        }
    }
    
    public void eliminarProducto()
    {
        modelo.setIdUsuario(Integer.parseInt(codigoSeleccion));
        int rpta = JOptionPane.showConfirmDialog(null, "Desea eliminar : " + dao.mostrarDatos().get(filaSeleccion).getNombreUsuario()+ "? ");
            if(rpta==0)
            {
                String respuestaEliminar = this.dao.eliminarUsuario(modelo.getIdUsuario());
                JOptionPane.showMessageDialog(null, respuestaEliminar);
                limpiarControles();
                llenarTabla(vistaUsuario.tblUsuario);
            }
            else
            limpiarControles();
    }
    
    public void buscarProducto()
    {
            String nombre = vistaUsuario.txtBuscar.getText();
            
            DefaultTableModel  modeloT = new DefaultTableModel();
            vistaUsuario.tblUsuario.setModel(modeloT);

            modeloT.addColumn("ID");
            modeloT.addColumn("ROL");
            modeloT.addColumn("USUARIO");
            modeloT.addColumn("NOMBRE");
            modeloT.addColumn("PASSWORD ");
                       
            Object[] columna = new Object[5];

            int numRegistros = dao.buscaUsuario(nombre).size();

            for (int i = 0; i < numRegistros; i++) 
            {
                columna[0] = dao.buscaUsuario(nombre).get(i).getIdUsuario();
                columna[1] = dao.buscaUsuario(nombre).get(i).getIdRol();
                columna[2] = dao.buscaUsuario(nombre).get(i).getUsuario();
                columna[3] = dao.buscaUsuario(nombre).get(i).getNombreUsuario();
                columna[4] = dao.buscaUsuario(nombre).get(i).getPasswordUsuario();
                modeloT.addRow(columna);
            }
    }


    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == vista.btnIngresar) 
        {
            validar();
//            principal.setVisible(true);
        }
        if (e.getSource() == vista.pssPassword) 
        {
            validar();
        }
        if (e.getSource() == vista.txtUser) 
        {
            vista.pssPassword.requestFocus();
        }
        if (e.getSource() == vistaUsuario.btnInsertar) 
        {
            if ((vistaUsuario.txtUsuario.getText().equals("")) || (vistaUsuario.txtNombreUsuario.getText().equals("")) || (vistaUsuario.txtPassword.getText().equals(""))) 
            {
                JOptionPane.showMessageDialog(null, "Ingrese campos Faltantes");
            }
            else
            {
            insertUsuario();  
            }
        }
        if (e.getSource() == vistaUsuario.btnConsultar) 
        {
            llenarTabla(vistaUsuario.tblUsuario);
        }
        if (e.getSource() == vistaUsuario.btnActualizar) 
        {
            modificarUsuario();
        }
        if (e.getSource() == vistaUsuario.btnEliminar) 
        {
            eliminarProducto();
        }
        if (e.getSource() == vistaUsuario.cmbRol) 
        {
            cmbRolItemStateChanged(e);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
        if (e.getSource() == vistaUsuario.tblUsuario) 
        {
            cargaDatos(e);
        }
        if (e.getSource() == vista.jChkBxMostrar) 
        {
            if (vista.jChkBxMostrar.isSelected()) 
             {
                vista.pssPassword.setEchoChar((char)0);
             }
             else 
             {
                 vista.pssPassword.setEchoChar('*');
             }
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

    @Override
    public void keyTyped(KeyEvent e) 
    {
//        if(e.getSource() == vistaUsuario.txtUsuario)
//        {
//            char c = e.getKeyChar();
//            if(c<'0' || c>'9')
//            {
//                e.consume();
//            }
//        }
//        if(e.getSource() == vistaUsuario.txtNombreUsuario)
//        {
//            char c = e.getKeyChar();
//            if((c<'0' || c>'9') && (c != '.'))
//            {
//                e.consume();
//            }
//        }
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {
        
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
        if(e.getSource()== vistaUsuario.txtBuscar)
        {
            buscarProducto();
        }
    }
    
}
