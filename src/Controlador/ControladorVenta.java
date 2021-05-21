package Controlador;

import Modelo.Cliente;
import Modelo.ClienteDAO;
import Modelo.DetalleVenta;
import Modelo.Producto;
import Modelo.ProductoDAO;
import Modelo.Usuario;
import Modelo.VendedorDAO;
import Modelo.Venta;
import Modelo.VentaDAO;
import Vista.frmVenta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorVenta implements ActionListener, KeyListener, MouseListener
{
    DefaultTableModel modeloTabla;
    Cliente cliente = new Cliente();
    Producto producto = new Producto();
    ControladorUsuario usuario = new ControladorUsuario();
    Venta venta = new Venta();
    VendedorDAO daoVendedor = new VendedorDAO();
//    Vendedor codigoVendedor;
    DetalleVenta detalleVenta = new DetalleVenta();
    VentaDAO ventasDao = new VentaDAO();
    ClienteDAO clienteDao = new ClienteDAO();
    frmVenta vistaVenta = new frmVenta();
    ProductoDAO productoDao = new ProductoDAO();
    Usuario modelo = new Usuario();
    int idProducto;
    int cantidad;
    int stock;
    double precio;
    String nombreProducto;
    double subTotal;
    double total;
    int item = 1;
    int filaSeleccionCliente;
    String codigoSeleccionCliente;
    static int idUsuario;
    static String nombreUsuario;
    java.util.Date fecha;
    SimpleDateFormat fechaFormateado;

    public ControladorVenta(frmVenta facturaVista) 
    {
        this.vistaVenta = facturaVista;
        this.vistaVenta.txtCliente.addKeyListener(this);
        this.vistaVenta.btnAgregarProducto.addActionListener(this);
        this.vistaVenta.btnCancelarVenta.addActionListener(this);
//        this.vistaVenta.cmbVendedor.addActionListener(this);
//        this.vistaVenta.dtChFechaVenta.addMouseListener(this);
        this.vistaVenta.btnGenerarVenta.addActionListener(this);
        this.vistaVenta.txtCliente.requestFocus();
        this.vistaVenta.tblCliente.addMouseListener(this);
//        this.vistaVenta.txtProducto.addActionListener(this);
        this.vistaVenta.txtProducto.addKeyListener(this);
        idUsuario = usuario.idUsuario;
        nombreUsuario = usuario.nombreUsuario;
        fecha();
        noFactura();
//        llenaComboVendedor();
        vistaVenta.lblNombreVendedor.setText(nombreUsuario);
//        codigoVendedor = (Vendedor) vistaVenta.cmbVendedor.getSelectedItem();
//        System.out.println("Codigo Vendedor " + codigoVendedor);
        System.out.println("Fecha" + fecha);
    }
    
//    public void llenaComboVendedor()
//    {
//        DefaultComboBoxModel comboModelo = new DefaultComboBoxModel(daoVendedor.llenaComboVendedor());
//        vistaVenta.cmbVendedor.setModel(comboModelo);
//    } 
    
//    public void cmbVendedorItemStateChanged(ActionEvent evt) 
//    {                                              
//        codigoVendedor = (Vendedor)vistaVenta.cmbVendedor.getSelectedItem();
//        System.out.println(codigoVendedor.getIdVendedor()+ " Codigo Combo Vendedor");
//    }
    
//    public void dtChFechaVentaMouseClicked(java.awt.event.MouseEvent evt) 
//    {                                            
//        fecha = vistaVenta.dtChFechaVenta.getDate();
//        System.out.println("Fecha" + fecha);
//    }                                           

    
    public void noFactura()
    {
        String serie = ventasDao.maxId();
        vistaVenta.txtNumeroFactura.setText(String.valueOf(serie));
    }
    
    public void cargaDatosCliente(java.awt.event.MouseEvent evt) 
    {                                          
        filaSeleccionCliente = vistaVenta.tblCliente.getSelectedRow();
        codigoSeleccionCliente = vistaVenta.tblCliente.getValueAt(filaSeleccionCliente, 0).toString();
        vistaVenta.txtCliente.setText(vistaVenta.tblCliente.getValueAt(filaSeleccionCliente, 0).toString());
        vistaVenta.txtNombreCliente.setText(vistaVenta.tblCliente.getValueAt(filaSeleccionCliente, 1).toString());
        vistaVenta.txtApellidoCliente.setText(vistaVenta.tblCliente.getValueAt(filaSeleccionCliente, 2).toString());
        vistaVenta.txtDireccionCliente.setText(vistaVenta.tblCliente.getValueAt(filaSeleccionCliente, 3).toString());
        vistaVenta.txtNitCliente.setText(vistaVenta.tblCliente.getValueAt(filaSeleccionCliente, 4).toString());
        System.out.println("Cod Cliente" + vistaVenta.txtCliente.getText());
    }
    
    public void guardarFactura()
    {
        fecha = vistaVenta.dtChFechaVenta.getDate();
        SimpleDateFormat fechaFormateado = new SimpleDateFormat("yyyy/MM/dd", new Locale("es_ES"));
        double totalPago = total;
        venta.setIdCliente(Integer.parseInt(codigoSeleccionCliente));
//        venta.setIdVendedor(codigoVendedor.getIdVendedor());
        venta.setIdVendedor(idUsuario);
        venta.setFechaVenta(fechaFormateado.format(fecha));
        venta.setTotalVenta(totalPago);
        venta.setIdUsuario(idUsuario);
        ventasDao.guardarVenta(venta);
    }
        
    public void guardarDetalleFactura()
    {
        int IdVenta = Integer.parseInt(vistaVenta.txtNumeroFactura.getText());
        for (int i = 0; i < vistaVenta.tblDetalleFactura.getRowCount(); i++) 
        {
            item = Integer.parseInt(vistaVenta.tblDetalleFactura.getValueAt(i, 0).toString());
            idProducto = Integer.parseInt(vistaVenta.tblDetalleFactura.getValueAt(i, 1).toString());
            cantidad = Integer.parseInt(vistaVenta.tblDetalleFactura.getValueAt(i, 3).toString());
            precio = Double.parseDouble(vistaVenta.tblDetalleFactura.getValueAt(i, 4).toString());
            detalleVenta.setIdVenta(IdVenta);
            detalleVenta.setIdDetalleVenta(item);
            detalleVenta.setIdProducto(idProducto);
            detalleVenta.setCantidad(cantidad);
            detalleVenta.setPrecioVenta(precio);
            ventasDao.guardarDetalleVenta(detalleVenta);
        }
    }
    
    public void fecha()
    {
        Calendar calendar = new GregorianCalendar();
//        vistaVenta.txtFechaFactura.setText("" + calendar.get(Calendar.YEAR) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.DAY_OF_MONTH));
    }
    
    public void buscarProducto()
    {
        int codigo = Integer.parseInt(vistaVenta.txtProducto.getText());
        if (vistaVenta.txtProducto.getText().equals("")) //Valida si esta vacio
        {
            //JOptionPane.showMessageDialog(null, "Ingrese Codigo de Prducto");
            JOptionPane.showMessageDialog(null, "Ingrese Codigo de Prducto", "Informacion", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            producto = productoDao.usarProducto(codigo);
            if (producto.getIdProducto()!= 0) 
            {
               vistaVenta.txtNombreProducto.setText(producto.getNombreProducto());
               vistaVenta.txtPrecioProducto.setText(String.valueOf(producto.getPrecioProducto()));
               vistaVenta.txtStock.setText(String.valueOf(producto.getStockProducto()));
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Producto No Registrado");
            }
        }
    }
    
    public void agregarProducto()
    {
        modeloTabla = (DefaultTableModel)vistaVenta.tblDetalleFactura.getModel();//Asignar el modelo a la Tabla
        idProducto = producto.getIdProducto();
        nombreProducto = vistaVenta.txtNombreProducto.getText();
        precio = Double.parseDouble(vistaVenta.txtPrecioVenta.getText());
        stock = Integer.parseInt(vistaVenta.txtStock.getText());
        cantidad = Integer.parseInt(vistaVenta.txtCantidad.getText());
        subTotal = cantidad * precio;
        ArrayList lista = new ArrayList();
        if ((stock > 0) && (stock > cantidad)) 
        {
            lista.add(item);
            lista.add(idProducto);
            lista.add(nombreProducto);
            lista.add(cantidad);
            lista.add(precio);
            lista.add(subTotal);
            Object[] objeto = new Object[6];
            objeto[0] = lista.get(0);
            objeto[1] = lista.get(1);
            objeto[2] = lista.get(2);
            objeto[3] = lista.get(3);
            objeto[4] = lista.get(4);
            objeto[5] = lista.get(5);
            modeloTabla.addRow(objeto);
            vistaVenta.tblDetalleFactura.setModel(modeloTabla);
            calcularTotal();
            limpiarProducto();
            item = item + 1;
            vistaVenta.txtProducto.requestFocus();
        }
        else
        {
            //JOptionPane.showMessageDialog(null, "Stock no Disponible");
            JOptionPane.showMessageDialog(null, "Stock no Disponible", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }  
    
    public void calcularTotal()
    {
        total = 0;
        for (int i = 0; i < vistaVenta.tblDetalleFactura.getRowCount(); i++)//hacer tantas veces como filas hallan en la tabla 
        {
            cantidad = Integer.parseInt(vistaVenta.tblDetalleFactura.getValueAt(i, 3).toString()); //este ya capturado de la tabla
            precio = Double.parseDouble(vistaVenta.tblDetalleFactura.getValueAt(i, 4).toString()); //este ya capturado de la tabla
            total = total + (cantidad * precio);
        }
    vistaVenta.lblTotal.setText(String.valueOf(total));
    }
    
    public void limpiarCliente()
    {
        vistaVenta.txtCliente.setText("");
        vistaVenta.txtNombreCliente.setText("");
        vistaVenta.txtApellidoCliente.setText("");
        vistaVenta.txtDireccionCliente.setText("");
        vistaVenta.txtNitCliente.setText("");
        vistaVenta.txtCliente.enable(true);
    }
    
    public void limpiarProducto()
    {
        vistaVenta.txtProducto.setText("");
        vistaVenta.txtPrecioProducto.setText("");
        vistaVenta.txtPrecioVenta.setText("");
        vistaVenta.txtStock.setText("");
        vistaVenta.txtCantidad.setText("");
        vistaVenta.txtNombreProducto.setText("");
    }
    
    public void limpiarTabla()
    {
        modeloTabla.setRowCount(0);
        //vistaVenta.tblCliente.removeAll();
    }
    
    public void actualizarStock()
    {
        int cant;
        for (int i = 0; i < vistaVenta.tblDetalleFactura.getRowCount(); i++) 
        {
            idProducto = Integer.parseInt(vistaVenta.tblDetalleFactura.getValueAt(i, 1).toString());
            cant = Integer.parseInt(vistaVenta.tblDetalleFactura.getValueAt(i, 3).toString());
            producto = productoDao.usarProducto(idProducto);
            int saldo = producto.getStockProducto()- cant;
            productoDao.actualizarStock(saldo, idProducto);
        }
    }
    
    public void buscarCliente()
    {
            String nombre = vistaVenta.txtCliente.getText();
            
            DefaultTableModel  modeloT = new DefaultTableModel();
            vistaVenta.tblCliente.setModel(modeloT);

            modeloT.addColumn("Codigo");
            modeloT.addColumn("NOMBRE");
            modeloT.addColumn("APELLIDO");
            modeloT.addColumn("DIRECCION");
            modeloT.addColumn("NIT");
            
            Object[] columna = new Object[5];

            int numRegistros = clienteDao.buscaCliente(nombre).size();

            for (int i = 0; i < numRegistros; i++) 
            {
                columna[0] = clienteDao.buscaCliente(nombre).get(i).getIdCliente();
                columna[1] = clienteDao.buscaCliente(nombre).get(i).getNombreCliente();
                columna[2] = clienteDao.buscaCliente(nombre).get(i).getApellidoCliente();
                columna[3] = clienteDao.buscaCliente(nombre).get(i).getDireccionCliente();
                columna[4] = clienteDao.buscaCliente(nombre).get(i).getNitCliente();
                modeloT.addRow(columna);
            }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
//        if (e.getSource() == vistaVenta.txtProducto) 
//        {
//            buscarProducto();
//        }
        if (e.getSource() == vistaVenta.btnAgregarProducto) 
        {
            if ((vistaVenta.txtCantidad.getText().equals("")) || (vistaVenta.txtPrecioVenta.getText().equals(""))) 
            {
                JOptionPane.showMessageDialog(null, "Ingrese campos Faltantes");
            }
            else
            {
            agregarProducto();  
            }
        }
//        if (e.getSource() == vistaVenta.cmbVendedor) 
//        {
//            cmbVendedorItemStateChanged(e);
//        }
        if (e.getSource() == vistaVenta.btnGenerarVenta) 
        {
//            if ((codigoVendedor.getIdVendedor() == 0) ||(String.valueOf(codigoVendedor) == "Seleccione Vendedor") ||(vistaVenta.lblTotal.getText().equals("")) || (vistaVenta.dtChFechaVenta.getDate() == null)) 
            if ((vistaVenta.lblTotal.getText().equals("")) || (vistaVenta.dtChFechaVenta.getDate() == null)) 
            {
                JOptionPane.showMessageDialog(null, "Seleccione Campos Faltantes");
            }
            else
            {
            guardarFactura();  
            guardarDetalleFactura();
            actualizarStock();
            JOptionPane.showMessageDialog(null, "Factura Generada");
            vistaVenta.txtNumeroFactura.setText("");
            vistaVenta.lblTotal.setText("");
            vistaVenta.dtChFechaVenta.setCalendar(null);
            limpiarTabla();
            limpiarProducto();
            limpiarCliente();
            noFactura();
            }
        }
        if (e.getSource() == vistaVenta.btnCancelarVenta) 
        {
            limpiarCliente();
            limpiarProducto();
            limpiarTabla();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) 
    {
        if(e.getSource() == vistaVenta.txtProducto)
        {
            char c = e.getKeyChar();
            if(c<'0' || c>'9') 
            {
                e.consume();
            }
        }
        if (vistaVenta.txtProducto.getText().length()== 5) 
        {
         e.consume(); 
        } 
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {
        
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
        if(e.getSource()== vistaVenta.txtCliente)
        {
            buscarCliente();
        }
        if(e.getSource()== vistaVenta.txtProducto)
        {
            if (vistaVenta.txtProducto.getText().length() == 5) 
            {
                buscarProducto();
            }
            else if (vistaVenta.txtProducto.getText().length() == 0) 
            {
                limpiarProducto();
                producto.setIdProducto(0);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
        if (e.getSource() == vistaVenta.tblCliente) 
        {
            cargaDatosCliente(e);
            vistaVenta.txtCliente.enable(false);
        }
//        if (e.getSource() == vistaVenta.dtChFechaVenta) 
//        {
//            dtChFechaVentaMouseClicked(e);
//        }
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
