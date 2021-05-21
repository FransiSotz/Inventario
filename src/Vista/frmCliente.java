package Vista;

import com.placeholder.PlaceHolder;
import java.awt.Font;
import javax.swing.JInternalFrame;

public class frmCliente extends JInternalFrame {

    public frmCliente() 
    {
        initComponents();
        setSize(885, 500);
        PlaceHolder holder = new PlaceHolder(txtBuscar, "Nombre o Apellido");
        txtBuscar.setFont( new Font("SansSerif",Font.ITALIC, 14) );
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plBotones = new javax.swing.JPanel();
        btnInsertar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        pnFondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        lblNombre = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        lblBuscar = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        txtApellidoCliente = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccionCliente = new javax.swing.JTextField();
        lblNit = new javax.swing.JLabel();
        txtNitCliente = new javax.swing.JTextField();
        lblDireccion1 = new javax.swing.JLabel();
        txtTelefonoCliente = new javax.swing.JTextField();
        lblNit1 = new javax.swing.JLabel();
        txtCorreoCliente = new javax.swing.JTextField();
        dtChFechaNacimiento = new com.toedter.calendar.JDateChooser();
        lblNit2 = new javax.swing.JLabel();
        plControles = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        plBotones.setBackground(new java.awt.Color(50, 57, 60));
        plBotones.setPreferredSize(new java.awt.Dimension(225, 625));

        btnInsertar.setBackground(new java.awt.Color(102, 102, 102));
        btnInsertar.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AddUserWhite.png"))); // NOI18N
        btnInsertar.setText("      Insertar");
        btnInsertar.setFocusable(false);
        btnInsertar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnInsertar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AgregaOrange.png"))); // NOI18N
        btnInsertar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AgregaOrange.png"))); // NOI18N

        btnActualizar.setBackground(new java.awt.Color(102, 102, 102));
        btnActualizar.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UpdateBlue.png"))); // NOI18N
        btnActualizar.setText("      Actualizar");
        btnActualizar.setFocusable(false);
        btnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnActualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UpdateOrange.png"))); // NOI18N
        btnActualizar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UpdateOrange.png"))); // NOI18N

        btnEliminar.setBackground(new java.awt.Color(102, 102, 102));
        btnEliminar.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Eliminar48.png"))); // NOI18N
        btnEliminar.setText("      Eliminar");
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
                    .addComponent(lblLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(90, Short.MAX_VALUE))
        );

        getContentPane().add(plBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 480));

        pnFondo.setBackground(new java.awt.Color(240, 244, 245));
        pnFondo.setPreferredSize(new java.awt.Dimension(625, 575));

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        )
    );
    tblCliente = new javax.swing.JTable()
    {
        public boolean isCellEditable(int rowIndex, int colIndex)
        {
            return false;
        }
    };
    tblCliente.setFocusable(false);
    tblCliente.getTableHeader().setReorderingAllowed(false);
    jScrollPane1.setViewportView(tblCliente);

    lblNombre.setBackground(new java.awt.Color(255, 255, 255));
    lblNombre.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
    lblNombre.setForeground(new java.awt.Color(0, 0, 0));
    lblNombre.setText("Nombre");

    txtNombreCliente.setBackground(new java.awt.Color(204, 204, 204));
    txtNombreCliente.setForeground(new java.awt.Color(0, 0, 0));

    txtBuscar.setBackground(new java.awt.Color(204, 204, 204));

    lblBuscar.setBackground(new java.awt.Color(255, 102, 0));
    lblBuscar.setForeground(new java.awt.Color(255, 102, 0));
    lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BuscarOrange20.png"))); // NOI18N

    lblApellido.setBackground(new java.awt.Color(255, 255, 255));
    lblApellido.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
    lblApellido.setForeground(new java.awt.Color(0, 0, 0));
    lblApellido.setText("Apellido");

    txtApellidoCliente.setBackground(new java.awt.Color(204, 204, 204));
    txtApellidoCliente.setForeground(new java.awt.Color(0, 0, 0));

    lblDireccion.setBackground(new java.awt.Color(255, 255, 255));
    lblDireccion.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
    lblDireccion.setForeground(new java.awt.Color(0, 0, 0));
    lblDireccion.setText("Direccion");

    txtDireccionCliente.setBackground(new java.awt.Color(204, 204, 204));
    txtDireccionCliente.setForeground(new java.awt.Color(0, 0, 0));

    lblNit.setBackground(new java.awt.Color(255, 255, 255));
    lblNit.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
    lblNit.setForeground(new java.awt.Color(0, 0, 0));
    lblNit.setText("Nit");

    txtNitCliente.setBackground(new java.awt.Color(204, 204, 204));
    txtNitCliente.setForeground(new java.awt.Color(0, 0, 0));

    lblDireccion1.setBackground(new java.awt.Color(255, 255, 255));
    lblDireccion1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
    lblDireccion1.setForeground(new java.awt.Color(0, 0, 0));
    lblDireccion1.setText("Correo");

    txtTelefonoCliente.setBackground(new java.awt.Color(204, 204, 204));
    txtTelefonoCliente.setForeground(new java.awt.Color(0, 0, 0));

    lblNit1.setBackground(new java.awt.Color(255, 255, 255));
    lblNit1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
    lblNit1.setForeground(new java.awt.Color(0, 0, 0));
    lblNit1.setText("Telefono");

    txtCorreoCliente.setBackground(new java.awt.Color(204, 204, 204));
    txtCorreoCliente.setForeground(new java.awt.Color(0, 0, 0));

    dtChFechaNacimiento.setBackground(new java.awt.Color(204, 204, 204));

    lblNit2.setBackground(new java.awt.Color(255, 255, 255));
    lblNit2.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
    lblNit2.setForeground(new java.awt.Color(0, 0, 0));
    lblNit2.setText("Nacimiento");

    javax.swing.GroupLayout pnFondoLayout = new javax.swing.GroupLayout(pnFondo);
    pnFondo.setLayout(pnFondoLayout);
    pnFondoLayout.setHorizontalGroup(
        pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnFondoLayout.createSequentialGroup()
            .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFondoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblNombre)
                        .addGap(28, 28, 28)
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblApellido)
                        .addGap(6, 6, 6)
                        .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnFondoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblDireccion)
                        .addGap(18, 18, 18)
                        .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblNit)
                        .addGap(39, 39, 39)
                        .addComponent(txtNitCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnFondoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblNit1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(lblDireccion1)
                        .addGap(12, 12, 12)
                        .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnFondoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblNit2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dtChFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFondoLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lblBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(28, 28, 28))
    );
    pnFondoLayout.setVerticalGroup(
        pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnFondoLayout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnFondoLayout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(lblNombre))
                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnFondoLayout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(lblApellido))
                .addGroup(pnFondoLayout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(8, 8, 8)
            .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnFondoLayout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDireccion)
                        .addComponent(lblNit)
                        .addComponent(txtNitCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(8, 8, 8)
            .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnFondoLayout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblNit1)
                        .addComponent(lblDireccion1)
                        .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(lblNit2)
                .addComponent(dtChFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnFondoLayout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    getContentPane().add(pnFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 640, 430));

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
    lblTitulo.setText("Catalogo de Clientes");

    javax.swing.GroupLayout plControlesLayout = new javax.swing.GroupLayout(plControles);
    plControles.setLayout(plControlesLayout);
    plControlesLayout.setHorizontalGroup(
        plControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plControlesLayout.createSequentialGroup()
            .addGap(32, 32, 32)
            .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 341, Short.MAX_VALUE)
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

    getContentPane().add(plControles, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 640, -1));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnConsultar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnSalir;
    public com.toedter.calendar.JDateChooser dtChFechaNacimiento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDireccion1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNit;
    private javax.swing.JLabel lblNit1;
    private javax.swing.JLabel lblNit2;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel plBotones;
    private javax.swing.JPanel plControles;
    private javax.swing.JPanel pnFondo;
    public javax.swing.JTable tblCliente;
    public javax.swing.JTextField txtApellidoCliente;
    public javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtCorreoCliente;
    public javax.swing.JTextField txtDireccionCliente;
    public javax.swing.JTextField txtNitCliente;
    public javax.swing.JTextField txtNombreCliente;
    public javax.swing.JTextField txtTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
