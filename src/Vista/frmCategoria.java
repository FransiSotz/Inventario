package Vista;

import com.placeholder.PlaceHolder;
import java.awt.Font;
import javax.swing.JInternalFrame;

public class frmCategoria extends JInternalFrame {

    public frmCategoria() 
    {
        initComponents();
        setSize(850, 465);
        PlaceHolder holder = new PlaceHolder(txtBuscar, "Nombre Categoria");
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
        tblCategoria = new javax.swing.JTable();
        lblDescripcionCategoria = new javax.swing.JLabel();
        txtNombreCategoria = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        lblBuscar = new javax.swing.JLabel();
        plControles = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Categoria");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        plBotones.setBackground(new java.awt.Color(50, 57, 60));
        plBotones.setPreferredSize(new java.awt.Dimension(225, 625));

        btnInsertar.setBackground(new java.awt.Color(102, 102, 102));
        btnInsertar.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AddUserWhite.png"))); // NOI18N
        btnInsertar.setText("           Insertar");
        btnInsertar.setFocusable(false);
        btnInsertar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnInsertar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AgregaOrange.png"))); // NOI18N
        btnInsertar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AgregaOrange.png"))); // NOI18N

        btnActualizar.setBackground(new java.awt.Color(102, 102, 102));
        btnActualizar.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UpdateBlue.png"))); // NOI18N
        btnActualizar.setText("         Actualizar");
        btnActualizar.setFocusable(false);
        btnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnActualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UpdateOrange.png"))); // NOI18N
        btnActualizar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UpdateOrange.png"))); // NOI18N

        btnEliminar.setBackground(new java.awt.Color(102, 102, 102));
        btnEliminar.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Eliminar48.png"))); // NOI18N
        btnEliminar.setText("           Eliminar");
        btnEliminar.setFocusable(false);
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EliminarColor48.png"))); // NOI18N
        btnEliminar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EliminarColor48.png"))); // NOI18N

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/B0xProduct.png"))); // NOI18N

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
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(plBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 440));

        pnFondo.setBackground(new java.awt.Color(240, 244, 245));
        pnFondo.setPreferredSize(new java.awt.Dimension(625, 575));

        tblCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        )
    );
    tblCategoria = new javax.swing.JTable()
    {
        public boolean isCellEditable(int rowIndex, int colIndex)
        {
            return false;
        }
    };
    tblCategoria.setFocusable(false);
    tblCategoria.getTableHeader().setReorderingAllowed(false);
    jScrollPane1.setViewportView(tblCategoria);

    lblDescripcionCategoria.setBackground(new java.awt.Color(255, 255, 255));
    lblDescripcionCategoria.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
    lblDescripcionCategoria.setForeground(new java.awt.Color(0, 0, 0));
    lblDescripcionCategoria.setText("Descripcion");

    txtNombreCategoria.setBackground(new java.awt.Color(204, 204, 204));
    txtNombreCategoria.setForeground(new java.awt.Color(0, 0, 0));

    txtBuscar.setBackground(new java.awt.Color(204, 204, 204));

    lblBuscar.setBackground(new java.awt.Color(255, 102, 0));
    lblBuscar.setForeground(new java.awt.Color(255, 102, 0));
    lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BuscarOrange20.png"))); // NOI18N

    javax.swing.GroupLayout pnFondoLayout = new javax.swing.GroupLayout(pnFondo);
    pnFondo.setLayout(pnFondoLayout);
    pnFondoLayout.setHorizontalGroup(
        pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnFondoLayout.createSequentialGroup()
            .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnFondoLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnFondoLayout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblDescripcionCategoria)
                        .addComponent(lblBuscar))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtBuscar)
                        .addComponent(txtNombreCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))))
            .addContainerGap(23, Short.MAX_VALUE))
    );
    pnFondoLayout.setVerticalGroup(
        pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFondoLayout.createSequentialGroup()
            .addGap(16, 16, 16)
            .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblDescripcionCategoria)
                .addComponent(txtNombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(39, Short.MAX_VALUE))
    );

    getContentPane().add(pnFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 600, 390));

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
    lblTitulo.setText("Categoria de Productos");

    javax.swing.GroupLayout plControlesLayout = new javax.swing.GroupLayout(plControles);
    plControles.setLayout(plControlesLayout);
    plControlesLayout.setHorizontalGroup(
        plControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plControlesLayout.createSequentialGroup()
            .addGap(32, 32, 32)
            .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 311, Short.MAX_VALUE)
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

    getContentPane().add(plControles, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 610, -1));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnConsultar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblDescripcionCategoria;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel plBotones;
    private javax.swing.JPanel plControles;
    private javax.swing.JPanel pnFondo;
    public javax.swing.JTable tblCategoria;
    public javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtNombreCategoria;
    // End of variables declaration//GEN-END:variables
}
