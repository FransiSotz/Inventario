package Vista;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() 
    {
        initComponents();
        this.setSize(650, 450);
        this.setLocationRelativeTo(null);
        btnSalir.setToolTipText("Salir");
//        BufferedImage image = null;
//        try 
//        {
//        image = ImageIO.read(new File("src/img/Key.png"));
//        } catch (IOException ex) 
//        {
//        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        setIconImage(image);
        setIconImage(new ImageIcon(getClass().getResource("/img/Key.png")).getImage());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plLateral = new javax.swing.JPanel();
        lblVentas = new javax.swing.JLabel();
        plPrincipal = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        pssPassword = new javax.swing.JPasswordField();
        jChkBxMostrar = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        plControl = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        plLateral.setBackground(new java.awt.Color(51, 51, 51));

        lblVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ventas.png"))); // NOI18N

        javax.swing.GroupLayout plLateralLayout = new javax.swing.GroupLayout(plLateral);
        plLateral.setLayout(plLateralLayout);
        plLateralLayout.setHorizontalGroup(
            plLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 250, Short.MAX_VALUE)
        );
        plLateralLayout.setVerticalGroup(
            plLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plLateralLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(lblVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        getContentPane().add(plLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 460));

        plPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        plPrincipal.setPreferredSize(new java.awt.Dimension(200, 100));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Candado.png"))); // NOI18N

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setBorder(null);

        pssPassword.setBackground(new java.awt.Color(255, 255, 255));
        pssPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pssPassword.setBorder(null);

        jChkBxMostrar.setText("Mostrar");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Password");

        btnIngresar.setBackground(new java.awt.Color(255, 102, 0));
        btnIngresar.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnIngresar.setBorderPainted(false);

        javax.swing.GroupLayout plPrincipalLayout = new javax.swing.GroupLayout(plPrincipal);
        plPrincipal.setLayout(plPrincipalLayout);
        plPrincipalLayout.setHorizontalGroup(
            plPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plPrincipalLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(plPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plPrincipalLayout.createSequentialGroup()
                        .addComponent(lblLogo)
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plPrincipalLayout.createSequentialGroup()
                        .addGroup(plPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(plPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, plPrincipalLayout.createSequentialGroup()
                                    .addComponent(jChkBxMostrar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator2)
                                .addComponent(pssPassword)
                                .addComponent(jSeparator1)
                                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(64, 64, 64))))
        );
        plPrincipalLayout.setVerticalGroup(
            plPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plPrincipalLayout.createSequentialGroup()
                .addComponent(lblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pssPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkBxMostrar)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(plPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 400, 410));

        plControl.setBackground(new java.awt.Color(58, 97, 151));

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

        javax.swing.GroupLayout plControlLayout = new javax.swing.GroupLayout(plControl);
        plControl.setLayout(plControlLayout);
        plControlLayout.setHorizontalGroup(
            plControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plControlLayout.createSequentialGroup()
                .addGap(0, 353, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        plControlLayout.setVerticalGroup(
            plControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plControlLayout.createSequentialGroup()
                .addComponent(btnSalir)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        getContentPane().add(plControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 400, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       int mensaje = JOptionPane.YES_NO_OPTION;
        int respuesta = JOptionPane.showConfirmDialog(null, "Desea Salir","Confirmacion",mensaje);
        if (respuesta == 0) 
        {
            System.exit(0);            
        }
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    public javax.swing.JCheckBox jChkBxMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblVentas;
    private javax.swing.JPanel plControl;
    private javax.swing.JPanel plLateral;
    private javax.swing.JPanel plPrincipal;
    public javax.swing.JPasswordField pssPassword;
    public javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
