package Controlador;

import Modelo.Rol;
import Modelo.RolDAO;
import Vista.PrincipalFormulario;
import Vista.frmRol;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControladorRol implements ActionListener, KeyListener, MouseListener
{
    frmRol vistaRol = new frmRol();
    RolDAO dao = new RolDAO();
    Rol modelo = new Rol();
    PrincipalFormulario principal = new PrincipalFormulario();
    ControladorUsuario usuario = new ControladorUsuario();
    int filaSeleccion;
    String codigoSeleccion;
    static int idUsuario;


    public ControladorRol() 
    {
    }

    public ControladorRol(frmRol vistaRol) 
    {
        this.vistaRol = vistaRol;
        this.vistaRol.btnConsultar.addActionListener(this);
        this.vistaRol.btnInsertar.addActionListener(this);
        this.vistaRol.btnActualizar.addActionListener(this);
        this.vistaRol.btnEliminar.addActionListener(this);
        this.vistaRol.txtBuscar.addKeyListener(this);
        this.vistaRol.tblRol.addMouseListener(this);
        idUsuario = usuario.idUsuario;
    }
    
    public void cargaDatos(java.awt.event.MouseEvent evt) 
    {                                          
        filaSeleccion = vistaRol.tblRol.getSelectedRow();
        codigoSeleccion = vistaRol.tblRol.getValueAt(filaSeleccion, 0).toString();
        vistaRol.txtNombreRol.setText(vistaRol.tblRol.getValueAt(filaSeleccion, 1).toString());
    }  
    
    public void llenarTabla(JTable tabla)
    {
        DefaultTableModel tablaModelo = new DefaultTableModel();
        tabla.setModel(tablaModelo);
        tablaModelo.addColumn("Codigo");
        tablaModelo.addColumn("Descripcion");

        Object [] columna = new Object[2];
        int cantFilas = dao.mostrarDatos().size();
        for (int i = 0; i < cantFilas; i++) 
        {
            columna[0] = dao.mostrarDatos().get(i).getIdRol();
            columna[1] = dao.mostrarDatos().get(i).getNombreRol();
            tablaModelo.addRow(columna);
        }
        limpiarRol();
    }
      
    public void insertRol()
    {
    String nombreRol = vistaRol.txtNombreRol.getText();    
    modelo.setNombreRol(vistaRol.txtNombreRol.getText());
    modelo.setIdUsuario(idUsuario);
        if (nombreRol.equals("")) 
        {
            JOptionPane.showMessageDialog(null, "Ingrese Nombre de Rol");
        }
        else
        {
            String  respuestaInsert = dao.insertRol(modelo);
            if (respuestaInsert != null) 
            {
               JOptionPane.showMessageDialog(null, respuestaInsert);
               limpiarRol();
               llenarTabla(vistaRol.tblRol); 
            }  
        } 
    }
    
    
    public void limpiarRol()
    {
        vistaRol.txtNombreRol.setText("");
    }

    
    public void updateRol()
    {
        modelo.setIdRol(Integer.parseInt(codigoSeleccion));
        modelo.setNombreRol(vistaRol.txtNombreRol.getText());
        String respuestaActualizar = this.dao.updateRol(modelo);
        if (respuestaActualizar != null) 
        {
            JOptionPane.showMessageDialog(null, respuestaActualizar);
            limpiarRol();
            llenarTabla(vistaRol.tblRol); 
        }
    }
    
    public void deleteRol()
    {
        int a = modelo.getIdRol();
        if (a != 0)                                                 //Evalua si la consulta mostrar es igual a 0
        {
            modelo.setIdRol(Integer.parseInt(codigoSeleccion));
            String respuestaEliminar = this.dao.deleteRol(modelo.getIdRol());
            JOptionPane.showMessageDialog(null, respuestaEliminar);
            limpiarRol(); 
            llenarTabla(vistaRol.tblRol);
        }else
            JOptionPane.showMessageDialog(null, "Codigo Inexistente");
            limpiarRol();
    }
    
    
    public void buscarRol()
    {
            String nombre = vistaRol.txtBuscar.getText();
            
            DefaultTableModel  modeloT = new DefaultTableModel();
            vistaRol.tblRol.setModel(modeloT);

            modeloT.addColumn("ID");
            modeloT.addColumn("NOMBRE");
            
            Object[] columna = new Object[2];

            int numRegistros = dao.buscaRol(nombre).size();

            for (int i = 0; i < numRegistros; i++) 
            {
                columna[0] = dao.buscaRol(nombre).get(i).getIdRol();
                columna[1] = dao.buscaRol(nombre).get(i).getNombreRol();
                modeloT.addRow(columna);
            }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == vistaRol.btnInsertar) 
        {
           insertRol(); 
        }
        if (e.getSource() == vistaRol.btnConsultar) 
        {
            llenarTabla(vistaRol.tblRol);
        }
        if (e.getSource() == vistaRol.btnActualizar) 
        {
            updateRol();
        }
        if (e.getSource() == vistaRol.btnEliminar) 
        {
            deleteRol();
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
    if(e.getSource()== vistaRol.txtBuscar)
        {
            buscarRol();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
        if (e.getSource() == vistaRol.tblRol) 
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
