package Vista;

import Controlador.ControladorCategoria;
import Controlador.ControladorProducto;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JInternalFrame;

/**
 *
 * @author fransi
 */
public class Menu extends javax.swing.JFrame 
{
    public Menu() 
    {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        BufferedImage image = null;
        try 
        {
        image = ImageIO.read(new File("src/img/Ventas.png"));
        } catch (IOException ex) 
        {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        setIconImage(image);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plTitulo = new javax.swing.JPanel();
        lblLogueado = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        plControl = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        plFondo = new javax.swing.JPanel();
        plMenu = new javax.swing.JPanel();
        lblReportes = new javax.swing.JLabel();
        btnReporte = new javax.swing.JButton();
        lblMantenimiento = new javax.swing.JLabel();
        btnVenta = new javax.swing.JButton();
        lblVentas = new javax.swing.JLabel();
        btnCategoria = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("ventana"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        plTitulo.setBackground(new java.awt.Color(55, 120, 186));
        plTitulo.setPreferredSize(new java.awt.Dimension(1890, 40));
        plTitulo.setRequestFocusEnabled(false);

        lblLogueado.setBackground(new java.awt.Color(55, 120, 186));
        lblLogueado.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        lblLogueado.setForeground(new java.awt.Color(255, 255, 255));
        lblLogueado.setText("Bienvenido");

        lblUser.setBackground(new java.awt.Color(55, 120, 186));
        lblUser.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout plTituloLayout = new javax.swing.GroupLayout(plTitulo);
        plTitulo.setLayout(plTituloLayout);
        plTituloLayout.setHorizontalGroup(
            plTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plTituloLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblLogueado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1545, Short.MAX_VALUE))
        );
        plTituloLayout.setVerticalGroup(
            plTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plTituloLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(plTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblLogueado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(plTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 0, -1, -1));

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

        getContentPane().add(plControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        plFondo.setBackground(new java.awt.Color(255, 255, 255));
        plFondo.setPreferredSize(new java.awt.Dimension(1900, 1000));

        plMenu.setBackground(new java.awt.Color(153, 153, 153));
        plMenu.setPreferredSize(new java.awt.Dimension(225, 1080));

        lblReportes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblReportes.setForeground(new java.awt.Color(255, 255, 255));
        lblReportes.setText("Reportes");

        btnReporte.setBackground(new java.awt.Color(131, 129, 129));
        btnReporte.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
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

        lblMantenimiento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMantenimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblMantenimiento.setText("Mantenimiento");

        btnVenta.setBackground(new java.awt.Color(131, 129, 129));
        btnVenta.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        btnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoventas.png"))); // NOI18N
        btnVenta.setText("          Ventas");
        btnVenta.setFocusable(false);
        btnVenta.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnVenta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ventas48.png"))); // NOI18N
        btnVenta.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ventas48.png"))); // NOI18N
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });

        lblVentas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblVentas.setForeground(new java.awt.Color(255, 255, 255));
        lblVentas.setText("Ventas");

        btnCategoria.setBackground(new java.awt.Color(131, 129, 129));
        btnCategoria.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        btnCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Producto.png"))); // NOI18N
        btnCategoria.setText("          Categoria");
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
        btnProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Product.png"))); // NOI18N
        btnProducto.setText("          Producto");
        btnProducto.setFocusable(false);
        btnProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Factura.png"))); // NOI18N
        btnProducto.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Factura.png"))); // NOI18N
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plMenuLayout = new javax.swing.GroupLayout(plMenu);
        plMenu.setLayout(plMenuLayout);
        plMenuLayout.setHorizontalGroup(
            plMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plMenuLayout.createSequentialGroup()
                .addGroup(plMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plMenuLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblVentas))
                    .addGroup(plMenuLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(plMenuLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(plMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMantenimiento)
                            .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(plMenuLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblReportes))
                    .addGroup(plMenuLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        plMenuLayout.setVerticalGroup(
            plMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMantenimiento)
                .addGap(12, 12, 12)
                .addComponent(btnCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164)
                .addComponent(lblReportes)
                .addGap(8, 8, 8)
                .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout plFondoLayout = new javax.swing.GroupLayout(plFondo);
        plFondo.setLayout(plFondoLayout);
        plFondoLayout.setHorizontalGroup(
            plFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plFondoLayout.createSequentialGroup()
                .addComponent(plMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1675, Short.MAX_VALUE))
        );
        plFondoLayout.setVerticalGroup(
            plFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );

        getContentPane().add(plFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

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

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed
        frmCategoria frmCategoria = new frmCategoria();
        ControladorCategoria categoria = new ControladorCategoria(frmCategoria);
        centrarVentana(frmCategoria);
    }//GEN-LAST:event_btnCategoriaActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        frmProducto frmProducto = new frmProducto();
        ControladorProducto producto = new ControladorProducto(frmProducto);
        centrarVentana(frmProducto);
    }//GEN-LAST:event_btnProductoActionPerformed

    public void centrarVentana(JInternalFrame ventana)
    {
        plFondo.add(ventana);
        Dimension dimensionPrincipal = plFondo.getSize();
        Dimension dimensionVentana = ventana.getSize();
        ventana.setLocation((dimensionPrincipal.width - dimensionVentana.width)/4, (dimensionPrincipal.height - dimensionVentana.height)/6);
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCategoria;
    private javax.swing.JButton btnMenu;
    public javax.swing.JButton btnProducto;
    public javax.swing.JButton btnReporte;
    public javax.swing.JButton btnVenta;
    private javax.swing.JLabel lblLogueado;
    private javax.swing.JLabel lblMantenimiento;
    private javax.swing.JLabel lblReportes;
    public javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblVentas;
    private javax.swing.JPanel plControl;
    private javax.swing.JPanel plFondo;
    private javax.swing.JPanel plMenu;
    private javax.swing.JPanel plTitulo;
    // End of variables declaration//GEN-END:variables

}
