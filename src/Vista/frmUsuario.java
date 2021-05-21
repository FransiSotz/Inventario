package Vista;


import com.placeholder.PlaceHolder;
import java.awt.Font;
import javax.swing.JInternalFrame;

public class frmUsuario extends JInternalFrame {

    public frmUsuario() 
    {
        initComponents();
        setSize(850, 550);
        PlaceHolder holder = new PlaceHolder(txtBuscar, "Nombre de Producto");
        txtBuscar.setFont( new Font("SansSerif",Font.ITALIC, 14) );
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        plBotones = new javax.swing.JPanel();
        btnInsertar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        pnFondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        lblNombre = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        cmbRol = new javax.swing.JComboBox<>();
        lblBarra = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        plControles = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuarios");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        plBotones.setBackground(new java.awt.Color(50, 57, 60));
        plBotones.setPreferredSize(new java.awt.Dimension(225, 625));

        btnInsertar.setBackground(new java.awt.Color(102, 102, 102));
        btnInsertar.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AddUserWhite.png"))); // NOI18N
        btnInsertar.setText("       Insertar");
        btnInsertar.setFocusable(false);
        btnInsertar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnInsertar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AgregaOrange.png"))); // NOI18N
        btnInsertar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AgregaOrange.png"))); // NOI18N

        btnActualizar.setBackground(new java.awt.Color(102, 102, 102));
        btnActualizar.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UpdateBlue.png"))); // NOI18N
        btnActualizar.setText("       Actualizar");
        btnActualizar.setFocusable(false);
        btnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnActualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UpdateOrange.png"))); // NOI18N
        btnActualizar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UpdateOrange.png"))); // NOI18N

        btnEliminar.setBackground(new java.awt.Color(102, 102, 102));
        btnEliminar.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Eliminar48.png"))); // NOI18N
        btnEliminar.setText("       Eliminar");
        btnEliminar.setFocusable(false);
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EliminarColor48.png"))); // NOI18N
        btnEliminar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EliminarColor48.png"))); // NOI18N

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Clientes200.png"))); // NOI18N

        btnConsultar.setBackground(new java.awt.Color(102, 102, 102));
        btnConsultar.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Search.png"))); // NOI18N
        btnConsultar.setText("          Consultar");
        btnConsultar.setFocusable(false);
        btnConsultar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnConsultar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BuscarColor48.png"))); // NOI18N
        btnConsultar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BuscarColor48.png"))); // NOI18N

        javax.swing.GroupLayout plBotonesLayout = new javax.swing.GroupLayout(plBotones);
        plBotones.setLayout(plBotonesLayout);
        plBotonesLayout.setHorizontalGroup(
            plBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(btnInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                .addContainerGap())
        );
        plBotonesLayout.setVerticalGroup(
            plBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        getContentPane().add(plBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 530));

        pnFondo.setBackground(new java.awt.Color(240, 244, 245));
        pnFondo.setPreferredSize(new java.awt.Dimension(625, 575));
        pnFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblUsuario.setBackground(new java.awt.Color(245, 250, 252));
        tblUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblUsuario.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblUsuario);

        pnFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 540, 290));

        lblNombre.setBackground(new java.awt.Color(255, 255, 255));
        lblNombre.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombre");
        pnFondo.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        lblPrecio.setBackground(new java.awt.Color(255, 255, 255));
        lblPrecio.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecio.setText("Usuario");
        pnFondo.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        lblStock.setBackground(new java.awt.Color(255, 255, 255));
        lblStock.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        lblStock.setForeground(new java.awt.Color(0, 0, 0));
        lblStock.setText("Password");
        pnFondo.add(lblStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        txtNombreUsuario.setBackground(new java.awt.Color(204, 204, 204));
        txtNombreUsuario.setForeground(new java.awt.Color(0, 0, 0));
        pnFondo.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 230, 23));

        txtUsuario.setBackground(new java.awt.Color(204, 204, 204));
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        pnFondo.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 140, 23));

        txtPassword.setBackground(new java.awt.Color(204, 204, 204));
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        pnFondo.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 140, 23));

        lblCategoria.setBackground(new java.awt.Color(255, 255, 255));
        lblCategoria.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(0, 0, 0));
        lblCategoria.setText("Rol");
        pnFondo.add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        txtBuscar.setBackground(new java.awt.Color(204, 204, 204));
        txtBuscar.setForeground(new java.awt.Color(0, 0, 0));
        pnFondo.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 230, 23));

        cmbRol.setBackground(new java.awt.Color(204, 204, 204));
        pnFondo.add(cmbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 230, 23));
        pnFondo.add(lblBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 90, 50));

        lblBuscar.setBackground(new java.awt.Color(255, 102, 0));
        lblBuscar.setForeground(new java.awt.Color(255, 102, 0));
        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BuscarOrange20.png"))); // NOI18N
        pnFondo.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        getContentPane().add(pnFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 600, 480));

        plControles.setBackground(new java.awt.Color(58, 97, 151));
        plControles.setPreferredSize(new java.awt.Dimension(625, 50));

        btnSalir.setBackground(new java.awt.Color(58, 97, 151));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Salir32Black.png"))); // NOI18N
        btnSalir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setFocusPainted(false);
        btnSalir.setFocusable(false);
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Salir32Red.png"))); // NOI18N
        btnSalir.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Salir32Red.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Usuarios");

        javax.swing.GroupLayout plControlesLayout = new javax.swing.GroupLayout(plControles);
        plControles.setLayout(plControlesLayout);
        plControlesLayout.setHorizontalGroup(
            plControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plControlesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 428, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        plControlesLayout.setVerticalGroup(
            plControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plControlesLayout.createSequentialGroup()
                .addGroup(plControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitulo)
                    .addComponent(btnSalir))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        getContentPane().add(plControles, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    public static void main(String args[]) 
    {
        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnConsultar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnSalir;
    public javax.swing.JComboBox<String> cmbRol;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public javax.swing.JLabel lblBarra;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel plBotones;
    private javax.swing.JPanel plControles;
    private javax.swing.JPanel pnFondo;
    public javax.swing.JTable tblUsuario;
    public javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtNombreUsuario;
    public javax.swing.JTextField txtPassword;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
