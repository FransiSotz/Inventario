package Controlador;

import Modelo.ProductoDAO;
import Modelo.ReporteDAO;
import Vista.frmCodigoBarra;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControladorCodigoBarra implements ActionListener, KeyListener, MouseListener
{
    frmCodigoBarra vistaCodigoBarra = new frmCodigoBarra();
    ProductoDAO dao = new ProductoDAO();
    ReporteDAO reporte = new ReporteDAO();
    ControladorUsuario usuario = new ControladorUsuario();
    int filaSeleccion;
    int filas;
    String codigoSeleccion;
    String nombreProductoSeleccion;
    static int idUsuario;
    DefaultTableModel modeloTabla;
    ArrayList lista = new ArrayList();
    Guardar guardar = new Guardar();


    public ControladorCodigoBarra(frmCodigoBarra vistaCodigoBarra) 
    {
        this.vistaCodigoBarra = vistaCodigoBarra;
        this.vistaCodigoBarra.btnConsultar.addActionListener(this);
        this.vistaCodigoBarra.btnGenerar.addActionListener(this);
        this.vistaCodigoBarra.txtNombre.addKeyListener(this);
        this.vistaCodigoBarra.ChkBTodos.addMouseListener(this);
        this.vistaCodigoBarra.tblProductos.addMouseListener(this);
        idUsuario = usuario.idUsuario;
    }
    
    public void llenarTabla(JTable tabla)
    {
        DefaultTableModel tablaModelo = new DefaultTableModel();
        tabla.setModel(tablaModelo);
        tablaModelo.addColumn("Codigo");
        tablaModelo.addColumn("Nombre");

        Object [] columna = new Object[2];
        int cantFilas = dao.mostrarDatos().size();
        for (int i = 0; i < cantFilas; i++) 
        {
            columna[0] = dao.mostrarDatos().get(i).getIdProducto();
            columna[1] = dao.mostrarDatos().get(i).getNombreProducto();
            
            tablaModelo.addRow(columna);
        }
     vistaCodigoBarra.txtNombre.setText("");;
    }

    public void buscarProducto()
    {
            String nombre = vistaCodigoBarra.txtNombre.getText();
            
            DefaultTableModel  modeloT = new DefaultTableModel();
            vistaCodigoBarra.tblProductos.setModel(modeloT);

            modeloT.addColumn("CODIGO");
            modeloT.addColumn("NOMBRE");
                       
            Object[] columna = new Object[2];

            int numRegistros = dao.buscaProducto(nombre).size();

            for (int i = 0; i < numRegistros; i++) 
            {
                columna[0] = dao.buscaProducto(nombre).get(i).getIdProducto();
                columna[1] = dao.buscaProducto(nombre).get(i).getNombreProducto();
                modeloT.addRow(columna);
            }
    }
    
    public void cargarProducto()//java.awt.event.MouseEvent evt) 
    {                                          
        filaSeleccion = vistaCodigoBarra.tblProductos.getSelectedRow();
        codigoSeleccion = vistaCodigoBarra.tblProductos.getValueAt(filaSeleccion, 0).toString();
        nombreProductoSeleccion = vistaCodigoBarra.tblProductos.getValueAt(filaSeleccion, 1).toString();

    }
    
    public void agregarProducto(java.awt.event.MouseEvent evt)
    {
        modeloTabla = (DefaultTableModel)vistaCodigoBarra.tblProductoBuscar.getModel();//Asignar el modelo a la Tabla
        cargarProducto();
        //lista = new ArrayList();
            lista.add(codigoSeleccion);
            //lista.add(nombreProductoSeleccion);

            Object[] objeto = new Object[1];
//            objeto[0] = lista.get(0);
            objeto[0] = codigoSeleccion;
            //objeto[1] = lista.get(1);

            modeloTabla.addRow(objeto);
            vistaCodigoBarra.tblProductoBuscar.setModel(modeloTabla);
            filas = vistaCodigoBarra.tblProductoBuscar.getRowCount();
            if (filas > 0) 
            {
                vistaCodigoBarra.ChkBTodos.setSelected(false);
            }
//            for (int i = 0; i < lista.size(); i++) 
//            {
//            System.out.println(lista.get(i).toString());
//            }
    }  
    
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == vistaCodigoBarra.btnConsultar) 
        {
            llenarTabla(vistaCodigoBarra.tblProductos);
        }
        if (e.getSource() == vistaCodigoBarra.btnGenerar) 
        {
            if (vistaCodigoBarra.ChkBTodos.isSelected()) 
            {
                filas = 0;
                dao.generarCodigoBarra(filas,lista);
                lista.clear();
            }
            else
            {
            filas = lista.size();
            dao.generarCodigoBarra(filas,lista); 
            modeloTabla.setRowCount(0);
            lista.clear();
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
        if(e.getSource()== vistaCodigoBarra.txtNombre)
        {
            buscarProducto();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
        if (e.getSource() == vistaCodigoBarra.tblProductos) 
        {
            agregarProducto(e);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) 
    {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) 
    {
        if (vistaCodigoBarra.ChkBTodos.isSelected()) 
        {
            if (lista.size() > 0) 
            {
                modeloTabla.setRowCount(0);
            }
        }
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
