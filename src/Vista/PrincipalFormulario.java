package Vista;

import Controlador.ControladorAnulacion;
import Controlador.ControladorCategoria;
import Controlador.ControladorCliente;
import Controlador.ControladorCodigoBarra;
import Controlador.ControladorVenta;
import Controlador.ControladorProducto;
import Controlador.ControladorReporte;
import Controlador.ControladorRol;
import Controlador.ControladorUsuario;
import Controlador.ControladorVendedor;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

/**
 *
 * @author fransi
 */
public class PrincipalFormulario extends javax.swing.JFrame {
    


    public PrincipalFormulario() 
    {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
//        BufferedImage image = null;
//        try 
//        {
//        image = ImageIO.read(new File("src/img/Ventas.png"));
//        } catch (IOException ex) 
//        {
//        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        setIconImage(image);
        setIconImage(new ImageIcon(getClass().getResource("/img/Ventas.png")).getImage());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        plMenu = new javax.swing.JPanel();
        lblReportes = new javax.swing.JLabel();
        btnReporte = new javax.swing.JButton();
        lblMantenimiento = new javax.swing.JLabel();
        btnVenta = new javax.swing.JButton();
        lblVentas = new javax.swing.JLabel();
        btnCategoria = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        lblAdmin = new javax.swing.JLabel();
        btnUser = new javax.swing.JButton();
        Admin = new javax.swing.JSeparator();
        btnRol = new javax.swing.JButton();
        Ventas = new javax.swing.JSeparator();
        Mantenimiento = new javax.swing.JSeparator();
        btnCliente = new javax.swing.JButton();
        btnCodigoBarras = new javax.swing.JButton();
        Mantenimiento1 = new javax.swing.JSeparator();
        btnAnulacion = new javax.swing.JButton();
        plControl = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        plTitulo = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        lblLogueado = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 850));

        plMenu.setBackground(new java.awt.Color(153, 153, 153));
        plMenu.setPreferredSize(new java.awt.Dimension(225, 1080));

        lblReportes.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        lblReportes.setForeground(new java.awt.Color(255, 255, 255));
        lblReportes.setText("Reportes");

        btnReporte.setBackground(new java.awt.Color(131, 129, 129));
        btnReporte.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        btnReporte.setForeground(new java.awt.Color(51, 51, 51));
        btnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Adobe.png"))); // NOI18N
        btnReporte.setText("     Movimiento");
        btnReporte.setFocusable(false);
        btnReporte.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnReporte.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reportes.png"))); // NOI18N
        btnReporte.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reportes.png"))); // NOI18N
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        lblMantenimiento.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        lblMantenimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblMantenimiento.setText("Mantenimiento");

        btnVenta.setBackground(new java.awt.Color(131, 129, 129));
        btnVenta.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        btnVenta.setForeground(new java.awt.Color(51, 51, 51));
        btnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoventas.png"))); // NOI18N
        btnVenta.setText("        Ventas");
        btnVenta.setFocusable(false);
        btnVenta.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnVenta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ventas48.png"))); // NOI18N
        btnVenta.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ventas48.png"))); // NOI18N
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });

        lblVentas.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        lblVentas.setForeground(new java.awt.Color(255, 255, 255));
        lblVentas.setText("Ventas");

        btnCategoria.setBackground(new java.awt.Color(131, 129, 129));
        btnCategoria.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        btnCategoria.setForeground(new java.awt.Color(51, 51, 51));
        btnCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Producto.png"))); // NOI18N
        btnCategoria.setText("       Categorias");
        btnCategoria.setFocusable(false);
        btnCategoria.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCategoria.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logomantenimiento.png"))); // NOI18N
        btnCategoria.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logomantenimiento.png"))); // NOI18N
        btnCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaActionPerformed(evt);
            }
        });

        btnProducto.setBackground(new java.awt.Color(131, 129, 129));
        btnProducto.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        btnProducto.setForeground(new java.awt.Color(51, 51, 51));
        btnProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Product.png"))); // NOI18N
        btnProducto.setText("       Productos");
        btnProducto.setFocusable(false);
        btnProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Factura.png"))); // NOI18N
        btnProducto.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Factura.png"))); // NOI18N
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });

        lblAdmin.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        lblAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin.setText("Administracion");

        btnUser.setBackground(new java.awt.Color(131, 129, 129));
        btnUser.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        btnUser.setForeground(new java.awt.Color(51, 51, 51));
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User-Red.png"))); // NOI18N
        btnUser.setText("       Usuarios");
        btnUser.setFocusable(false);
        btnUser.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnUser.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AddUserWhite.png"))); // NOI18N
        btnUser.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AddUserWhite.png"))); // NOI18N
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        Admin.setAlignmentY(0.0F);
        Admin.setMinimumSize(new java.awt.Dimension(50, 5));
        Admin.setPreferredSize(new java.awt.Dimension(50, 5));

        btnRol.setBackground(new java.awt.Color(131, 129, 129));
        btnRol.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        btnRol.setForeground(new java.awt.Color(51, 51, 51));
        btnRol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        btnRol.setText("       Roles");
        btnRol.setAlignmentY(0.0F);
        btnRol.setFocusable(false);
        btnRol.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnRol.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Key.png"))); // NOI18N
        btnRol.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Key.png"))); // NOI18N
        btnRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRolActionPerformed(evt);
            }
        });

        Ventas.setAlignmentY(0.0F);
        Ventas.setMinimumSize(new java.awt.Dimension(50, 5));
        Ventas.setPreferredSize(new java.awt.Dimension(50, 5));

        Mantenimiento.setAlignmentY(0.0F);
        Mantenimiento.setMinimumSize(new java.awt.Dimension(50, 5));
        Mantenimiento.setPreferredSize(new java.awt.Dimension(50, 5));

        btnCliente.setBackground(new java.awt.Color(131, 129, 129));
        btnCliente.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(51, 51, 51));
        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Empleado.png"))); // NOI18N
        btnCliente.setText("       Clientes");
        btnCliente.setFocusable(false);
        btnCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logomantenimiento.png"))); // NOI18N
        btnCliente.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logomantenimiento.png"))); // NOI18N
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnCodigoBarras.setBackground(new java.awt.Color(131, 129, 129));
        btnCodigoBarras.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        btnCodigoBarras.setForeground(new java.awt.Color(51, 51, 51));
        btnCodigoBarras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BarCodeLogo.png"))); // NOI18N
        btnCodigoBarras.setText("     Cod. Barras");
        btnCodigoBarras.setFocusable(false);
        btnCodigoBarras.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCodigoBarras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BarCodeOrange.png"))); // NOI18N
        btnCodigoBarras.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BarCodeOrange.png"))); // NOI18N
        btnCodigoBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCodigoBarrasActionPerformed(evt);
            }
        });

        Mantenimiento1.setAlignmentY(0.0F);
        Mantenimiento1.setMinimumSize(new java.awt.Dimension(50, 5));
        Mantenimiento1.setPreferredSize(new java.awt.Dimension(50, 5));

        btnAnulacion.setBackground(new java.awt.Color(131, 129, 129));
        btnAnulacion.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        btnAnulacion.setForeground(new java.awt.Color(51, 51, 51));
        btnAnulacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EliminarColor48.png"))); // NOI18N
        btnAnulacion.setText("        Anular");
        btnAnulacion.setFocusable(false);
        btnAnulacion.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnAnulacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Eliminar48.png"))); // NOI18N
        btnAnulacion.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Eliminar48.png"))); // NOI18N
        btnAnulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnulacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plMenuLayout = new javax.swing.GroupLayout(plMenu);
        plMenu.setLayout(plMenuLayout);
        plMenuLayout.setHorizontalGroup(
            plMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plMenuLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(plMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAdmin)
                    .addComponent(Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRol, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVentas)
                    .addComponent(Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMantenimiento)
                    .addComponent(Mantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReportes)
                    .addComponent(Mantenimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        plMenuLayout.setVerticalGroup(
            plMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plMenuLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblAdmin)
                .addGap(5, 5, 5)
                .addComponent(Admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnRol, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lblVentas)
                .addGap(6, 6, 6)
                .addComponent(Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnAnulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMantenimiento)
                .addGap(6, 6, 6)
                .addComponent(Mantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lblReportes)
                .addGap(3, 3, 3)
                .addComponent(Mantenimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        desktopPane.add(plMenu);
        plMenu.setBounds(0, 40, 225, 1080);

        plControl.setBackground(new java.awt.Color(0, 58, 107));
        plControl.setPreferredSize(new java.awt.Dimension(225, 40));
        plControl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MenuWhite.png"))); // NOI18N
        btnMenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMenu.setFocusPainted(false);
        btnMenu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MenuOrange.png"))); // NOI18N
        btnMenu.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MenuOrange.png"))); // NOI18N
        btnMenu.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        plControl.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 66, 40));

        desktopPane.add(plControl);
        plControl.setBounds(0, 0, 225, 40);

        plTitulo.setBackground(new java.awt.Color(55, 120, 186));
        plTitulo.setMinimumSize(new java.awt.Dimension(1920, 40));
        plTitulo.setPreferredSize(new java.awt.Dimension(1920, 40));
        plTitulo.setRequestFocusEnabled(false);

        lblUser.setBackground(new java.awt.Color(55, 120, 186));
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setToolTipText("");

        lblLogueado.setBackground(new java.awt.Color(55, 120, 186));
        lblLogueado.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        lblLogueado.setForeground(new java.awt.Color(255, 255, 255));
        lblLogueado.setText("Bienvenido : ");

        btnCerrarSesion.setBackground(new java.awt.Color(58, 97, 151));
        btnCerrarSesion.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CerrarSesion.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.setContentAreaFilled(false);
        btnCerrarSesion.setFocusPainted(false);
        btnCerrarSesion.setFocusable(false);
        btnCerrarSesion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SesionRed.png"))); // NOI18N
        btnCerrarSesion.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SesionRed.png"))); // NOI18N
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plTituloLayout = new javax.swing.GroupLayout(plTitulo);
        plTitulo.setLayout(plTituloLayout);
        plTituloLayout.setHorizontalGroup(
            plTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plTituloLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(lblLogueado)
                .addGap(18, 18, 18)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1184, Short.MAX_VALUE))
        );
        plTituloLayout.setVerticalGroup(
            plTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLogueado, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(plTituloLayout.createSequentialGroup()
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        desktopPane.add(plTitulo);
        plTitulo.setBounds(0, 0, 1920, 40);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1063, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        int posicion = plMenu.getX();
        if(posicion > -1){
            Animacion.Animacion.mover_izquierda(0, -264, 2, 2, plMenu);
        }else{
            Animacion.Animacion.mover_derecha(-264, 0, 2, 2, plMenu);
        }
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        dispose();
        Login login = new Login();
        ControladorUsuario controladorUsuario = new ControladorUsuario(login);
        login.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnCodigoBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCodigoBarrasActionPerformed
        frmCodigoBarra frmBarra = new frmCodigoBarra();
        ControladorCodigoBarra barra = new ControladorCodigoBarra(frmBarra);
        centrarVentana(frmBarra);
        //    ProductoDAO producto = new ProductoDAO();
        //    producto.generarCodigoBarra();
    }//GEN-LAST:event_btnCodigoBarrasActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        frmCliente frmCliente = new frmCliente();
        ControladorCliente cliente = new ControladorCliente(frmCliente);
        centrarVentana(frmCliente);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRolActionPerformed
        frmRol frmrol = new frmRol();
        ControladorRol rol = new ControladorRol(frmrol);
        centrarVentana(frmrol);
    }//GEN-LAST:event_btnRolActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        frmUsuario frmUser = new frmUsuario();
        ControladorUsuario usuario = new ControladorUsuario(frmUser);
        centrarVentana(frmUser);
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        frmProducto frmProducto = new frmProducto();
        ControladorProducto producto = new ControladorProducto(frmProducto);
        centrarVentana(frmProducto);
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed
        frmCategoria frmCategoria = new frmCategoria();
        ControladorCategoria categoria = new ControladorCategoria(frmCategoria);
        centrarVentana(frmCategoria);
    }//GEN-LAST:event_btnCategoriaActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        frmVenta frmVenta = new frmVenta();
        ControladorVenta factura = new ControladorVenta(frmVenta);
        centrarVentana(frmVenta);
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        frmReporte frmReporte = new frmReporte();
        ControladorReporte reporte = new ControladorReporte(frmReporte);
        centrarVentana(frmReporte);
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnAnulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnulacionActionPerformed
        frmAnulacion frmanulacion = new frmAnulacion();
        ControladorAnulacion anulacion = new ControladorAnulacion(frmanulacion);
        centrarVentana(frmanulacion);
    }//GEN-LAST:event_btnAnulacionActionPerformed

    public void centrarVentana(JInternalFrame ventana)
    {
        desktopPane.add(ventana);
        Dimension dimensionPrincipal = desktopPane.getSize();
        Dimension dimensionVentana = ventana.getSize();
        ventana.setLocation((dimensionPrincipal.width - dimensionVentana.width)/2, (dimensionPrincipal.height - dimensionVentana.height)/2);
        ventana.show();
    }

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFormulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Admin;
    private javax.swing.JSeparator Mantenimiento;
    private javax.swing.JSeparator Mantenimiento1;
    private javax.swing.JSeparator Ventas;
    public javax.swing.JButton btnAnulacion;
    public javax.swing.JButton btnCategoria;
    private javax.swing.JButton btnCerrarSesion;
    public javax.swing.JButton btnCliente;
    public javax.swing.JButton btnCodigoBarras;
    private javax.swing.JButton btnMenu;
    public javax.swing.JButton btnProducto;
    public javax.swing.JButton btnReporte;
    public javax.swing.JButton btnRol;
    public javax.swing.JButton btnUser;
    public javax.swing.JButton btnVenta;
    private javax.swing.JDesktopPane desktopPane;
    public javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblLogueado;
    public javax.swing.JLabel lblMantenimiento;
    private javax.swing.JLabel lblReportes;
    public javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblVentas;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel plControl;
    private javax.swing.JPanel plMenu;
    private javax.swing.JPanel plTitulo;
    // End of variables declaration//GEN-END:variables

}
