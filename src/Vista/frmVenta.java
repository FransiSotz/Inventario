package Vista;

public class frmVenta extends javax.swing.JInternalFrame {

    public frmVenta() 
    {
        initComponents();
        this.setSize(900, 720);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plEncabezado = new javax.swing.JPanel();
        lblNombreEmpresa = new javax.swing.JLabel();
        lblDireccionEmpresa = new javax.swing.JLabel();
        lblCiudadEmpresa = new javax.swing.JLabel();
        lblTelefonoEmpresa = new javax.swing.JLabel();
        lblNitEmpresa = new javax.swing.JLabel();
        lblNoFactura = new javax.swing.JLabel();
        txtNumeroFactura = new javax.swing.JLabel();
        lblFechaFactura = new javax.swing.JLabel();
        dtChFechaVenta = new com.toedter.calendar.JDateChooser();
        plLateral = new javax.swing.JPanel();
        lblLogoFactura = new javax.swing.JLabel();
        plDetalle = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalleFactura = new javax.swing.JTable();
        btnCancelarVenta = new javax.swing.JButton();
        btnGenerarVenta = new javax.swing.JButton();
        lblNombreTotal = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        plCliente = new javax.swing.JPanel();
        lbCodigoCliente = new javax.swing.JLabel();
        lblNombreCliente = new javax.swing.JLabel();
        lblDireccionCliente = new javax.swing.JLabel();
        lblDniCliente = new javax.swing.JLabel();
        lblVendedor = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtNitCliente = new javax.swing.JTextField();
        txtDireccionCliente = new javax.swing.JTextField();
        lblApellidoCliente = new javax.swing.JLabel();
        txtApellidoCliente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        lblNombreVendedor = new javax.swing.JLabel();
        plProducto = new javax.swing.JPanel();
        lblCodigoProducto = new javax.swing.JLabel();
        lblNombreProducto = new javax.swing.JLabel();
        lblPrecioVenta = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecioProducto = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        btnAgregarProducto = new javax.swing.JButton();
        lblPrecioVenta1 = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));
        setClosable(true);
        setTitle("Venta");
        setPreferredSize(new java.awt.Dimension(900, 795));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        plEncabezado.setBackground(new java.awt.Color(58, 97, 151));
        plEncabezado.setMinimumSize(new java.awt.Dimension(800, 50));
        plEncabezado.setPreferredSize(new java.awt.Dimension(700, 150));

        lblNombreEmpresa.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblNombreEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreEmpresa.setText("Sistema De Ventas");

        lblDireccionEmpresa.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblDireccionEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccionEmpresa.setText("3 Calle A 10-25 Zona 1");

        lblCiudadEmpresa.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblCiudadEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lblCiudadEmpresa.setText("Ciudad de Guatemala");

        lblTelefonoEmpresa.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblTelefonoEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefonoEmpresa.setText("Telefono: 24201212");

        lblNitEmpresa.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblNitEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lblNitEmpresa.setText("Nit: 1846521-7");

        lblNoFactura.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblNoFactura.setForeground(new java.awt.Color(255, 255, 255));
        lblNoFactura.setText("Factura No: ");

        txtNumeroFactura.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        txtNumeroFactura.setForeground(new java.awt.Color(255, 255, 255));

        lblFechaFactura.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaFactura.setText("Fecha :");

        dtChFechaVenta.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout plEncabezadoLayout = new javax.swing.GroupLayout(plEncabezado);
        plEncabezado.setLayout(plEncabezadoLayout);
        plEncabezadoLayout.setHorizontalGroup(
            plEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plEncabezadoLayout.createSequentialGroup()
                .addGroup(plEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plEncabezadoLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(lblNombreEmpresa))
                    .addGroup(plEncabezadoLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(lblDireccionEmpresa))
                    .addGroup(plEncabezadoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNoFactura)
                        .addGap(11, 11, 11)
                        .addComponent(txtNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(plEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(plEncabezadoLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(lblNitEmpresa))
                            .addGroup(plEncabezadoLayout.createSequentialGroup()
                                .addGroup(plEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(plEncabezadoLayout.createSequentialGroup()
                                        .addGap(207, 207, 207)
                                        .addComponent(lblFechaFactura))
                                    .addGroup(plEncabezadoLayout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addGroup(plEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblTelefonoEmpresa)
                                            .addComponent(lblCiudadEmpresa))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dtChFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        plEncabezadoLayout.setVerticalGroup(
            plEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plEncabezadoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblNombreEmpresa)
                .addGap(2, 2, 2)
                .addComponent(lblDireccionEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCiudadEmpresa)
                .addGap(10, 10, 10)
                .addComponent(lblTelefonoEmpresa)
                .addGroup(plEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plEncabezadoLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblNoFactura))
                    .addGroup(plEncabezadoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(plEncabezadoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNitEmpresa))
                    .addGroup(plEncabezadoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(plEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dtChFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaFactura)))))
        );

        getContentPane().add(plEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 690, -1));

        plLateral.setBackground(new java.awt.Color(50, 57, 60));
        plLateral.setPreferredSize(new java.awt.Dimension(200, 900));

        lblLogoFactura.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblLogoFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Factura200.png"))); // NOI18N

        javax.swing.GroupLayout plLateralLayout = new javax.swing.GroupLayout(plLateral);
        plLateral.setLayout(plLateralLayout);
        plLateralLayout.setHorizontalGroup(
            plLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plLateralLayout.createSequentialGroup()
                .addComponent(lblLogoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );
        plLateralLayout.setVerticalGroup(
            plLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogoFactura)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(plLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 150));

        plDetalle.setBackground(new java.awt.Color(240, 244, 245));
        plDetalle.setPreferredSize(new java.awt.Dimension(700, 450));

        tblDetalleFactura.setBackground(new java.awt.Color(255, 255, 255));
        tblDetalleFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Orden", "Codigo", "Nombre", "Cantidad", "Cantidad", "SubTotal"
            }
        ));
        tblDetalleFactura.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblDetalleFactura);

        btnCancelarVenta.setBackground(new java.awt.Color(0, 102, 153));
        btnCancelarVenta.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        btnCancelarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DeleteFactura.png"))); // NOI18N
        btnCancelarVenta.setText("       Cancelar Venta");
        btnCancelarVenta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCancelarVenta.setPreferredSize(new java.awt.Dimension(226, 52));
        btnCancelarVenta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EliminarFactura.png"))); // NOI18N
        btnCancelarVenta.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EliminarFactura.png"))); // NOI18N

        btnGenerarVenta.setBackground(new java.awt.Color(0, 102, 153));
        btnGenerarVenta.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        btnGenerarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Factura.png"))); // NOI18N
        btnGenerarVenta.setText("     Generar Venta");
        btnGenerarVenta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGenerarVenta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GenerarFactura.png"))); // NOI18N
        btnGenerarVenta.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GenerarFactura.png"))); // NOI18N

        lblNombreTotal.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        lblNombreTotal.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreTotal.setText("Total :");

        lblTotal.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(51, 0, 0));

        javax.swing.GroupLayout plDetalleLayout = new javax.swing.GroupLayout(plDetalle);
        plDetalle.setLayout(plDetalleLayout);
        plDetalleLayout.setHorizontalGroup(
            plDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plDetalleLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(plDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(plDetalleLayout.createSequentialGroup()
                        .addComponent(btnCancelarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGenerarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177)
                        .addComponent(lblNombreTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        plDetalleLayout.setVerticalGroup(
            plDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plDetalleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(plDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGenerarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreTotal))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plDetalleLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGap(92, 92, 92))
        );

        getContentPane().add(plDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 438, 890, 250));

        plCliente.setBackground(new java.awt.Color(240, 244, 245));
        plCliente.setPreferredSize(new java.awt.Dimension(690, 140));
        plCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCodigoCliente.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lbCodigoCliente.setForeground(new java.awt.Color(0, 0, 0));
        lbCodigoCliente.setText("Cliente ");
        plCliente.add(lbCodigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, -1, -1));

        lblNombreCliente.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblNombreCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreCliente.setText("Nombre ");
        plCliente.add(lblNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 10, -1, -1));

        lblDireccionCliente.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblDireccionCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblDireccionCliente.setText("Direccion ");
        plCliente.add(lblDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 47, -1, -1));

        lblDniCliente.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblDniCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblDniCliente.setText("Nit");
        plCliente.add(lblDniCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 44, -1, -1));

        lblVendedor.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblVendedor.setForeground(new java.awt.Color(0, 0, 0));
        lblVendedor.setText("Vendedor ");
        plCliente.add(lblVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 47, -1, -1));

        txtCliente.setBackground(new java.awt.Color(204, 204, 204));
        txtCliente.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        txtCliente.setForeground(new java.awt.Color(0, 0, 51));
        txtCliente.setMinimumSize(new java.awt.Dimension(64, 25));
        txtCliente.setPreferredSize(new java.awt.Dimension(64, 25));
        plCliente.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 10, 215, 22));

        txtNombreCliente.setEditable(false);
        txtNombreCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreCliente.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        txtNombreCliente.setForeground(new java.awt.Color(0, 0, 0));
        plCliente.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 215, -1));

        txtNitCliente.setEditable(false);
        txtNitCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtNitCliente.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        txtNitCliente.setForeground(new java.awt.Color(0, 0, 0));
        plCliente.add(txtNitCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 44, 215, -1));

        txtDireccionCliente.setEditable(false);
        txtDireccionCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccionCliente.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        txtDireccionCliente.setForeground(new java.awt.Color(0, 0, 0));
        plCliente.add(txtDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 44, 215, -1));

        lblApellidoCliente.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblApellidoCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblApellidoCliente.setText("Apellido");
        plCliente.add(lblApellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 13, -1, -1));

        txtApellidoCliente.setEditable(false);
        txtApellidoCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidoCliente.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        txtApellidoCliente.setForeground(new java.awt.Color(0, 0, 0));
        plCliente.add(txtApellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 10, 215, -1));

        tblCliente.setBackground(new java.awt.Color(255, 255, 255));
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblCliente = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false;
            }
        };
        tblCliente.setFocusable(false);
        tblCliente.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblCliente);

        plCliente.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 72, 858, 62));

        lblNombreVendedor.setForeground(new java.awt.Color(51, 0, 0));
        lblNombreVendedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        plCliente.add(lblNombreVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 45, 215, 22));

        getContentPane().add(plCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 156, 890, -1));

        plProducto.setBackground(new java.awt.Color(240, 244, 245));
        plProducto.setPreferredSize(new java.awt.Dimension(690, 140));
        plProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigoProducto.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblCodigoProducto.setForeground(new java.awt.Color(0, 0, 0));
        lblCodigoProducto.setText("Producto");
        plProducto.add(lblCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, -1, -1));

        lblNombreProducto.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblNombreProducto.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreProducto.setText("Nombre");
        plProducto.add(lblNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 13, -1, -1));

        lblPrecioVenta.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblPrecioVenta.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecioVenta.setText("Precio");
        plProducto.add(lblPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 9, -1, 24));

        lblStock.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblStock.setForeground(new java.awt.Color(0, 0, 0));
        lblStock.setText("Stock");
        plProducto.add(lblStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 46, -1, 20));

        lblCantidad.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(0, 0, 0));
        lblCantidad.setText("Cantidad");
        plProducto.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 43, -1, -1));

        txtProducto.setBackground(new java.awt.Color(204, 204, 204));
        txtProducto.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        txtProducto.setForeground(new java.awt.Color(0, 0, 51));
        txtProducto.setMinimumSize(new java.awt.Dimension(64, 25));
        txtProducto.setPreferredSize(new java.awt.Dimension(64, 25));
        plProducto.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 10, 170, 22));

        txtNombreProducto.setEditable(false);
        txtNombreProducto.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreProducto.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        txtNombreProducto.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreProducto.setFocusable(false);
        plProducto.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 10, 215, -1));

        txtCantidad.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidad.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(0, 0, 0));
        plProducto.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 44, 215, -1));

        txtPrecioProducto.setEditable(false);
        txtPrecioProducto.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecioProducto.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        txtPrecioProducto.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioProducto.setFocusable(false);
        plProducto.add(txtPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 10, 202, -1));

        txtStock.setEditable(false);
        txtStock.setBackground(new java.awt.Color(255, 255, 255));
        txtStock.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        txtStock.setForeground(new java.awt.Color(0, 0, 0));
        txtStock.setFocusable(false);
        plProducto.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 45, 215, -1));

        btnAgregarProducto.setBackground(new java.awt.Color(0, 102, 153));
        btnAgregarProducto.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        btnAgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CarritoWhite.png"))); // NOI18N
        btnAgregarProducto.setText("  Agregar Producto");
        btnAgregarProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CarritoCompras.png"))); // NOI18N
        btnAgregarProducto.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CarritoCompras.png"))); // NOI18N
        plProducto.add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 80, 200, 40));

        lblPrecioVenta1.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblPrecioVenta1.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecioVenta1.setText("Precio Venta");
        plProducto.add(lblPrecioVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 43, -1, 24));

        txtPrecioVenta.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecioVenta.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        txtPrecioVenta.setForeground(new java.awt.Color(0, 0, 0));
        plProducto.add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 44, 202, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Buscar18.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        plProducto.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, 20));

        getContentPane().add(plProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 302, 890, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregarProducto;
    public javax.swing.JButton btnCancelarVenta;
    public javax.swing.JButton btnGenerarVenta;
    public com.toedter.calendar.JDateChooser dtChFechaVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbCodigoCliente;
    private javax.swing.JLabel lblApellidoCliente;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCiudadEmpresa;
    private javax.swing.JLabel lblCodigoProducto;
    private javax.swing.JLabel lblDireccionCliente;
    private javax.swing.JLabel lblDireccionEmpresa;
    private javax.swing.JLabel lblDniCliente;
    private javax.swing.JLabel lblFechaFactura;
    private javax.swing.JLabel lblLogoFactura;
    private javax.swing.JLabel lblNitEmpresa;
    private javax.swing.JLabel lblNoFactura;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblNombreEmpresa;
    private javax.swing.JLabel lblNombreProducto;
    private javax.swing.JLabel lblNombreTotal;
    public javax.swing.JLabel lblNombreVendedor;
    private javax.swing.JLabel lblPrecioVenta;
    private javax.swing.JLabel lblPrecioVenta1;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblTelefonoEmpresa;
    public javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblVendedor;
    private javax.swing.JPanel plCliente;
    private javax.swing.JPanel plDetalle;
    private javax.swing.JPanel plEncabezado;
    private javax.swing.JPanel plLateral;
    private javax.swing.JPanel plProducto;
    public javax.swing.JTable tblCliente;
    public javax.swing.JTable tblDetalleFactura;
    public javax.swing.JTextField txtApellidoCliente;
    public javax.swing.JTextField txtCantidad;
    public javax.swing.JTextField txtCliente;
    public javax.swing.JTextField txtDireccionCliente;
    public javax.swing.JTextField txtNitCliente;
    public javax.swing.JTextField txtNombreCliente;
    public javax.swing.JTextField txtNombreProducto;
    public javax.swing.JLabel txtNumeroFactura;
    public javax.swing.JTextField txtPrecioProducto;
    public javax.swing.JTextField txtPrecioVenta;
    public javax.swing.JTextField txtProducto;
    public javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
