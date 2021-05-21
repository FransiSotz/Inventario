package Controlador;

import Modelo.Categoria;
import Modelo.CategoriaDAO;
import Vista.PrincipalFormulario;
import Vista.frmCategoria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControladorCategoria implements ActionListener, KeyListener, MouseListener
{
    frmCategoria vistaCategoria = new frmCategoria();
    CategoriaDAO dao = new CategoriaDAO();
    Categoria modelo = new Categoria();
    PrincipalFormulario principal = new PrincipalFormulario();
    ControladorUsuario usuario = new ControladorUsuario();
    int filaSeleccion;
    String codigoSeleccion;
    static int idUsuario;


    public ControladorCategoria() 
    {
    }

    public ControladorCategoria(frmCategoria vistaCategoria) 
    {
        this.vistaCategoria = vistaCategoria;
        this.vistaCategoria.btnConsultar.addActionListener(this);
        this.vistaCategoria.btnInsertar.addActionListener(this);
        this.vistaCategoria.btnActualizar.addActionListener(this);
        this.vistaCategoria.btnEliminar.addActionListener(this);
        this.vistaCategoria.txtBuscar.addKeyListener(this);
        this.vistaCategoria.tblCategoria.addMouseListener(this);
        idUsuario = usuario.idUsuario;
    }
    
    public void cargaDatos(java.awt.event.MouseEvent evt) 
    {                                          
        filaSeleccion = vistaCategoria.tblCategoria.getSelectedRow();
        codigoSeleccion = vistaCategoria.tblCategoria.getValueAt(filaSeleccion, 0).toString();
        vistaCategoria.txtNombreCategoria.setText(vistaCategoria.tblCategoria.getValueAt(filaSeleccion, 1).toString());
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
            columna[0] = dao.mostrarDatos().get(i).getIdCategoria();
            columna[1] = dao.mostrarDatos().get(i).getNombreCategoria();
            tablaModelo.addRow(columna);
        }
        limpiarCategoria();
    }
      
    public void insertCliente()
    {
    String nombreCategoria = vistaCategoria.txtNombreCategoria.getText();    
    modelo.setNombreCategoria(vistaCategoria.txtNombreCategoria.getText());
    modelo.setIdUsuario(idUsuario);
        if (nombreCategoria.equals("")) 
        {
            JOptionPane.showMessageDialog(null, "Ingrese Nombre de Categoria");
        }
        else
        {
            String  respuestaInsert = dao.insertCategoria(modelo);
            if (respuestaInsert != null) 
            {
               JOptionPane.showMessageDialog(null, respuestaInsert);
               limpiarCategoria();
               llenarTabla(vistaCategoria.tblCategoria); 
            }  
        } 
    }
    
    
    public void limpiarCategoria()
    {
        vistaCategoria.txtNombreCategoria.setText("");
    }

    
    public void updateCategoria()
    {
        modelo.setIdCategoria(Integer.parseInt(codigoSeleccion));
        modelo.setNombreCategoria(vistaCategoria.txtNombreCategoria.getText());
        String respuestaActualizar = this.dao.updateCategoria(modelo);
        if (respuestaActualizar != null) 
        {
            JOptionPane.showMessageDialog(null, respuestaActualizar);
            limpiarCategoria();
            llenarTabla(vistaCategoria.tblCategoria); 
        }
    }
    
    public void deleteCategoria()
    {
//        int a = modelo.getIdCategoria();
//        if (a != 0)                                                 //Evalua si la consulta mostrar es igual a 0
//        {
            modelo.setIdCategoria(Integer.parseInt(codigoSeleccion));
            String respuestaEliminar = this.dao.deleteCategoria(modelo.getIdCategoria());
            JOptionPane.showMessageDialog(null, respuestaEliminar);
            limpiarCategoria(); 
            llenarTabla(vistaCategoria.tblCategoria);
//        }else
//            JOptionPane.showMessageDialog(null, "Codigo Inexistente");
//            limpiarCategoria();
    }
    
    
    public void buscarCategoria()
    {
            String nombre = vistaCategoria.txtBuscar.getText();
            
            DefaultTableModel  modeloT = new DefaultTableModel();
            vistaCategoria.tblCategoria.setModel(modeloT);

            modeloT.addColumn("ID");
            modeloT.addColumn("NOMBRE");
            
            Object[] columna = new Object[2];

            int numRegistros = dao.buscaCategoria(nombre).size();

            for (int i = 0; i < numRegistros; i++) 
            {
                columna[0] = dao.buscaCategoria(nombre).get(i).getIdCategoria();
                columna[1] = dao.buscaCategoria(nombre).get(i).getNombreCategoria();
                modeloT.addRow(columna);
            }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == vistaCategoria.btnInsertar) 
        {
           insertCliente(); 
        }
        if (e.getSource() == vistaCategoria.btnConsultar) 
        {
            llenarTabla(vistaCategoria.tblCategoria);
        }
        if (e.getSource() == vistaCategoria.btnActualizar) 
        {
            updateCategoria();
        }
        if (e.getSource() == vistaCategoria.btnEliminar) 
        {
            deleteCategoria();
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
    if(e.getSource()== vistaCategoria.txtBuscar)
        {
            buscarCategoria();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
        if (e.getSource() == vistaCategoria.tblCategoria) 
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
