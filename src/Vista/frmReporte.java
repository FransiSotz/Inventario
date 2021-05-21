package Vista;

public class frmReporte extends javax.swing.JInternalFrame 
{

 
    public frmReporte() 
    {
        initComponents();
        this.setSize(370, 381);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupMayorMenorStock = new javax.swing.ButtonGroup();
        btnGroupOpcion = new javax.swing.ButtonGroup();
        btnGenerar = new javax.swing.JButton();
        plPorProducto = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigoVenta = new javax.swing.JTextField();
        rbtnNumVenta = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        rbtnMayor = new javax.swing.JRadioButton();
        rbtnMenor = new javax.swing.JRadioButton();
        txtCantidadStock = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rbtnStock = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        lblCodigoCliente = new javax.swing.JLabel();
        txtCodigoCliente = new javax.swing.JTextField();
        rbtnPorCliente = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        rbtnPorProducto = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Reportes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GenerarFactura.png"))); // NOI18N
        btnGenerar.setText("Generar");
        getContentPane().add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 287, -1, -1));

        plPorProducto.setBackground(new java.awt.Color(255, 255, 255));
        plPorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Por Numero de Factura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 13), new java.awt.Color(0, 0, 0))); // NOI18N

        lblCodigo.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 0, 0));
        lblCodigo.setText("Codigo");

        txtCodigoVenta.setBackground(new java.awt.Color(204, 226, 243));
        txtCodigoVenta.setForeground(new java.awt.Color(0, 0, 0));

        rbtnNumVenta.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupOpcion.add(rbtnNumVenta);

        javax.swing.GroupLayout plPorProductoLayout = new javax.swing.GroupLayout(plPorProducto);
        plPorProducto.setLayout(plPorProductoLayout);
        plPorProductoLayout.setHorizontalGroup(
            plPorProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plPorProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCodigo)
                .addGap(18, 18, 18)
                .addComponent(txtCodigoVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnNumVenta)
                .addContainerGap())
        );
        plPorProductoLayout.setVerticalGroup(
            plPorProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plPorProductoLayout.createSequentialGroup()
                .addGroup(plPorProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plPorProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCodigo)
                        .addComponent(txtCodigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rbtnNumVenta))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        getContentPane().add(plPorProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 29, 350, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Por Stock", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 13), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbtnMayor.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupMayorMenorStock.add(rbtnMayor);
        rbtnMayor.setForeground(new java.awt.Color(0, 0, 0));
        rbtnMayor.setText("Mayor");
        rbtnMayor.setFocusPainted(false);
        jPanel1.add(rbtnMayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        rbtnMenor.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupMayorMenorStock.add(rbtnMenor);
        rbtnMenor.setForeground(new java.awt.Color(0, 0, 0));
        rbtnMenor.setText("Menor");
        rbtnMenor.setFocusPainted(false);
        jPanel1.add(rbtnMenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        txtCantidadStock.setBackground(new java.awt.Color(204, 226, 243));
        txtCantidadStock.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtCantidadStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 60, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cantidad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        rbtnStock.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupOpcion.add(rbtnStock);
        jPanel1.add(rbtnStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 24, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 90, 350, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Por Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 13), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigoCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblCodigoCliente.setText("Codigo");
        jPanel2.add(lblCodigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 27, -1, -1));

        txtCodigoCliente.setBackground(new java.awt.Color(204, 226, 243));
        jPanel2.add(txtCodigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 24, 230, -1));

        rbtnPorCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupOpcion.add(rbtnPorCliente);
        jPanel2.add(rbtnPorCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 155, 350, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Producto Más Vendído", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 13), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbtnPorProducto.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupOpcion.add(rbtnPorProducto);
        jPanel3.add(rbtnPorProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 221, 350, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnGenerar;
    private javax.swing.ButtonGroup btnGroupMayorMenorStock;
    private javax.swing.ButtonGroup btnGroupOpcion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigoCliente;
    private javax.swing.JPanel plPorProducto;
    public javax.swing.JRadioButton rbtnMayor;
    public javax.swing.JRadioButton rbtnMenor;
    public javax.swing.JRadioButton rbtnNumVenta;
    public javax.swing.JRadioButton rbtnPorCliente;
    public javax.swing.JRadioButton rbtnPorProducto;
    public javax.swing.JRadioButton rbtnStock;
    public javax.swing.JTextField txtCantidadStock;
    public javax.swing.JTextField txtCodigoCliente;
    public javax.swing.JTextField txtCodigoVenta;
    // End of variables declaration//GEN-END:variables
}
