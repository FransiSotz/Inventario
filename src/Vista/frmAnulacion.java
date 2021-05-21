package Vista;

import javax.swing.JInternalFrame;

public class frmAnulacion extends JInternalFrame {

    public frmAnulacion() {
        initComponents();
        setSize(850, 625);
//        PlaceHolder holder = new PlaceHolder(txtNoFactura, "Nombre de Producto");
//        txtNoFactura.setFont( new Font("SansSerif",Font.ITALIC, 14) );
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plBotones = new javax.swing.JPanel();
        btnConsultar = new javax.swing.JButton();
        btnAnular = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        pnFondo = new javax.swing.JPanel();
        lblBuscar = new javax.swing.JLabel();
        txtNumeroVenta = new javax.swing.JTextField();
        plControles = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Anulación De Venta");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        plBotones.setBackground(new java.awt.Color(50, 57, 60));
        plBotones.setPreferredSize(new java.awt.Dimension(225, 625));

        btnConsultar.setBackground(new java.awt.Color(102, 102, 102));
        btnConsultar.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Search.png"))); // NOI18N
        btnConsultar.setText("          Consultar");
        btnConsultar.setFocusable(false);
        btnConsultar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnConsultar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BuscarColor48.png"))); // NOI18N
        btnConsultar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BuscarColor48.png"))); // NOI18N

        btnAnular.setBackground(new java.awt.Color(102, 102, 102));
        btnAnular.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        btnAnular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BuscarColor48.png"))); // NOI18N
        btnAnular.setText("      Anular");
        btnAnular.setFocusable(false);
        btnAnular.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnAnular.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AgregaOrange.png"))); // NOI18N
        btnAnular.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AgregaOrange.png"))); // NOI18N

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BarCodeLogo.png"))); // NOI18N

        javax.swing.GroupLayout plBotonesLayout = new javax.swing.GroupLayout(plBotones);
        plBotones.setLayout(plBotonesLayout);
        plBotonesLayout.setHorizontalGroup(
            plBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(btnAnular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
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
                .addComponent(btnAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(357, Short.MAX_VALUE))
        );

        getContentPane().add(plBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, -1));

        pnFondo.setBackground(new java.awt.Color(240, 244, 245));
        pnFondo.setPreferredSize(new java.awt.Dimension(625, 575));

        lblBuscar.setBackground(new java.awt.Color(255, 102, 0));
        lblBuscar.setForeground(new java.awt.Color(255, 102, 0));
        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BuscarOrange20.png"))); // NOI18N

        txtNumeroVenta.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroVenta.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnFondoLayout = new javax.swing.GroupLayout(pnFondo);
        pnFondo.setLayout(pnFondoLayout);
        pnFondoLayout.setHorizontalGroup(
            pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFondoLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(lblBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumeroVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        pnFondoLayout.setVerticalGroup(
            pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(535, Short.MAX_VALUE))
        );

        getContentPane().add(pnFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 610, -1));

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
        lblTitulo.setText("Anulación de Venta");
        lblTitulo.setToolTipText("");

        javax.swing.GroupLayout plControlesLayout = new javax.swing.GroupLayout(plControles);
        plControles.setLayout(plControlesLayout);
        plControlesLayout.setHorizontalGroup(
            plControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plControlesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 339, Short.MAX_VALUE)
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

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmAnulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAnulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAnulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAnulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAnulacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAnular;
    public javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel plBotones;
    private javax.swing.JPanel plControles;
    private javax.swing.JPanel pnFondo;
    public javax.swing.JTextField txtNumeroVenta;
    // End of variables declaration//GEN-END:variables
}
