package Controlador;

import Modelo.Categoria;
import Modelo.CategoriaDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Vista.PrincipalFormulario;
import Vista.frmProducto;
import Modelo.Producto;
import Modelo.ProductoDAO;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.DefaultComboBoxModel;

public class ControladorProducto implements ActionListener, MouseListener, KeyListener
{
    ProductoDAO dao = new ProductoDAO();
    Producto modelo = new Producto();
    PrincipalFormulario principal = new PrincipalFormulario();
    frmProducto vistaProducto = new frmProducto();
    CategoriaDAO daoCategoria = new CategoriaDAO();
    Categoria categoria = new Categoria();
    ControladorUsuario usuario = new ControladorUsuario();
    Categoria codigoCategoria;
    int filaSeleccion;
    String codigoSeleccion;
    static int idUsuario;
    int codSeleccionComboCategoria;
   

    public ControladorProducto(frmProducto vistaProducto)
    {
        this.vistaProducto = vistaProducto;
        this.vistaProducto.btnInsertar.addActionListener(this);
        this.vistaProducto.btnConsultar.addActionListener(this);
        this.vistaProducto.btnActualizar.addActionListener(this);
        this.vistaProducto.btnEliminar.addActionListener(this);
        this.vistaProducto.cmbCategoria.addActionListener(this);
        this.vistaProducto.tblProducto.addMouseListener(this);
        this.vistaProducto.txtBuscar.addKeyListener(this);
        this.vistaProducto.txtPrecio.addKeyListener(this);
        this.vistaProducto.txtStock.addKeyListener(this);
        idUsuario = usuario.idUsuario;
        llenaComboCategoria();
    }
    
    public void cargaDatos(java.awt.event.MouseEvent evt) 
    {                                          
        filaSeleccion = vistaProducto.tblProducto.getSelectedRow();
        codigoSeleccion = vistaProducto.tblProducto.getValueAt(filaSeleccion, 0).toString();
        vistaProducto.cmbCategoria.setSelectedIndex(0);
        vistaProducto.txtNombre.setText(vistaProducto.tblProducto.getValueAt(filaSeleccion, 2).toString());
        vistaProducto.txtPrecio.setText(vistaProducto.tblProducto.getValueAt(filaSeleccion, 3).toString());
        vistaProducto.txtStock.setText(vistaProducto.tblProducto.getValueAt(filaSeleccion, 4).toString());
    } 
    
    public void cmbCategoriaItemStateChanged(ActionEvent evt) 
    {                                              
        codigoCategoria = (Categoria)vistaProducto.cmbCategoria.getSelectedItem();
        System.out.println(codigoCategoria.getIdCategoria()+ " Codigo Combo Categoria");
    } 
    
    public void insertProducto()
    {
    codSeleccionComboCategoria = vistaProducto.cmbCategoria.getSelectedIndex();
        if (codSeleccionComboCategoria == 0) 
        {
            JOptionPane.showMessageDialog(null, "Seleccione una Categoria");
        }
        else
        {
        modelo.setNombreProducto(vistaProducto.txtNombre.getText());
        modelo.setIdCategoria(codigoCategoria.getIdCategoria());
        modelo.setNombreProducto(vistaProducto.txtNombre.getText());
        modelo.setPrecioProducto(Double.parseDouble(vistaProducto.txtPrecio.getText()));
        modelo.setStockProducto(Integer.parseInt(vistaProducto.txtStock.getText()));
        modelo.setIdUsuario(idUsuario);
        int  respuestaInsert = dao.registrarProducto(modelo);
        if (respuestaInsert > 0)
            {
               JOptionPane.showMessageDialog(null, "Producto almacenado correctamente!!");
               limpiarProducto();
               llenarTabla(vistaProducto.tblProducto); 
            }   
        else
        {
            JOptionPane.showMessageDialog(null, vistaProducto.txtNombre.getText() + " Ya Existe");
        }
        }
    }
    
    public void limpiarProducto()
    {
        vistaProducto.txtNombre.setText("");
        vistaProducto.txtPrecio.setText("");
        vistaProducto.txtStock.setText("");
        vistaProducto.cmbCategoria.setSelectedIndex(0);
        vistaProducto.txtBuscar.setText("");
    }
    
    public void llenarTabla(JTable tabla)
    {
        DefaultTableModel tablaModelo = new DefaultTableModel();
        tabla.setModel(tablaModelo);
        tablaModelo.addColumn("Codigo");
        tablaModelo.addColumn("Categoria");
        tablaModelo.addColumn("Nombre");
        tablaModelo.addColumn("Precio");
        tablaModelo.addColumn("Stock");
        
        Object [] columna = new Object[5];
        int cantFilas = dao.mostrarDatos().size();
        for (int i = 0; i < cantFilas; i++) 
        {
            columna[0] = dao.mostrarDatos().get(i).getIdProducto();
            columna[1] = dao.mostrarDatos().get(i).getIdCategoria();
            columna[2] = dao.mostrarDatos().get(i).getNombreProducto();
            columna[3] = dao.mostrarDatos().get(i).getPrecioProducto();
            columna[4] = dao.mostrarDatos().get(i).getStockProducto();
            
            tablaModelo.addRow(columna);
        }
        limpiarProducto();
    }
    
    public void llenaComboCategoria()
    {
        DefaultComboBoxModel comboModelo = new DefaultComboBoxModel(daoCategoria.llenaComboCategoria());
        vistaProducto.cmbCategoria.setModel(comboModelo);
    }    
            
    public void modificarProducto()
    {
    modelo.setIdProducto(Integer.parseInt(codigoSeleccion));
    modelo.setIdCategoria(codigoCategoria.getIdCategoria());
    modelo.setNombreProducto(vistaProducto.txtNombre.getText());
    modelo.setPrecioProducto(Double.parseDouble(vistaProducto.txtPrecio.getText()));
    modelo.setStockProducto(Integer.parseInt(vistaProducto.txtStock.getText()));
    
    String respuestaActualizar = this.dao.modificarProducto(modelo);
    codSeleccionComboCategoria = codigoCategoria.getIdCategoria();
        
        if (codSeleccionComboCategoria == 0) 
        {
            JOptionPane.showMessageDialog(null, "Seleccione una Categoria");
        }
        else if(respuestaActualizar != null) 
        {
            JOptionPane.showMessageDialog(null, respuestaActualizar);
            limpiarProducto();
            llenarTabla(vistaProducto.tblProducto); 
        }
    }
    
    public void eliminarProducto()
    {
        modelo.setIdProducto(Integer.parseInt(codigoSeleccion));
        int rpta = JOptionPane.showConfirmDialog(null, "Desea eliminar : " + dao.mostrarDatos().get(filaSeleccion).getNombreProducto() + "? ");
            if(rpta==0)
            {
                String respuestaEliminar = this.dao.eliminarProducto(modelo.getIdProducto());
                JOptionPane.showMessageDialog(null, respuestaEliminar);
                limpiarProducto();
                llenarTabla(vistaProducto.tblProducto);
            }
            else
            limpiarProducto();
    }
    
    public void buscarProducto()
    {
            String nombre = vistaProducto.txtBuscar.getText();
            
            DefaultTableModel  modeloT = new DefaultTableModel();
            vistaProducto.tblProducto.setModel(modeloT);

            modeloT.addColumn("ID");
            modeloT.addColumn("CATEGORIA");
            modeloT.addColumn("NOMBRE");
            modeloT.addColumn("PRECIO");
            modeloT.addColumn("STOCK");
                       
            Object[] columna = new Object[5];

            int numRegistros = dao.buscaProducto(nombre).size();

            for (int i = 0; i < numRegistros; i++) 
            {
                columna[0] = dao.buscaProducto(nombre).get(i).getIdProducto();
                columna[1] = dao.buscaProducto(nombre).get(i).getIdCategoria();
                columna[2] = dao.buscaProducto(nombre).get(i).getNombreProducto();
                columna[3] = dao.buscaProducto(nombre).get(i).getPrecioProducto();
                columna[4] = dao.buscaProducto(nombre).get(i).getStockProducto();
                modeloT.addRow(columna);
            }
    }
    

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == vistaProducto.btnInsertar) 
        {
            if ((vistaProducto.txtNombre.getText().equals("")) || (vistaProducto.txtPrecio.getText().equals("")) || (vistaProducto.txtStock.getText().equals(""))) 
            {
                JOptionPane.showMessageDialog(null, "Ingrese campos Faltantes");
            }
            else
            {
            insertProducto();  
            }
        }
        if (e.getSource() == vistaProducto.btnConsultar) 
        {
            llenarTabla(vistaProducto.tblProducto);
        }
        if (e.getSource() == vistaProducto.btnActualizar) 
        {
            modificarProducto();
        }
        if (e.getSource() == vistaProducto.btnEliminar) 
        {
            eliminarProducto();
        }
        if (e.getSource() == vistaProducto.cmbCategoria) 
        {
            cmbCategoriaItemStateChanged(e);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
        if (e.getSource() == vistaProducto.tblProducto) 
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

    @Override
    public void keyTyped(KeyEvent e) 
    {
        if(e.getSource() == vistaProducto.txtStock)
        {
            char c = e.getKeyChar();
            if(c<'0' || c>'9')
            {
                e.consume();
            }
        }
        if(e.getSource() == vistaProducto.txtPrecio)
        {
            char c = e.getKeyChar();
            if((c<'0' || c>'9') && (c != '.'))
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
        if(e.getSource()== vistaProducto.txtBuscar)
        {
            buscarProducto();
        }
    }
    
}
