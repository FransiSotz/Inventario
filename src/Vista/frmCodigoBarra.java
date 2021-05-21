package Vista;

import com.placeholder.PlaceHolder;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class frmCodigoBarra extends JInternalFrame {

    public static BufferedImage imagen = null;

    public frmCodigoBarra() {
        initComponents();
        setSize(850, 625);
        PlaceHolder holder = new PlaceHolder(txtNombre, "Nombre de Producto");
        txtNombre.setFont(new Font("SansSerif", Font.ITALIC, 14));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plBotones = new javax.swing.JPanel();
        btnConsultar = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        pnFondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        ChkBTodos = new javax.swing.JCheckBox();
        lblBuscar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductoBuscar = new javax.swing.JTable();
        plControles = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Generador Codigo de Barras");
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

        btnGenerar.setBackground(new java.awt.Color(102, 102, 102));
        btnGenerar.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BuscarColor48.png"))); // NOI18N
        btnGenerar.setText("      Generar");
        btnGenerar.setFocusable(false);
        btnGenerar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnGenerar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AgregaOrange.png"))); // NOI18N
        btnGenerar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AgregaOrange.png"))); // NOI18N

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BarCodeLogo.png"))); // NOI18N

        javax.swing.GroupLayout plBotonesLayout = new javax.swing.GroupLayout(plBotones);
        plBotones.setLayout(plBotonesLayout);
        plBotonesLayout.setHorizontalGroup(
            plBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(btnGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
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
                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(342, Short.MAX_VALUE))
        );

        getContentPane().add(plBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 610));

        pnFondo.setBackground(new java.awt.Color(240, 244, 245));
        pnFondo.setPreferredSize(new java.awt.Dimension(625, 575));

        tblProductos.setBackground(new java.awt.Color(245, 250, 252));
        tblProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblProductos);

        lblNombre.setBackground(new java.awt.Color(255, 255, 255));
        lblNombre.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Todos");

        txtNombre.setBackground(new java.awt.Color(204, 204, 204));
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));

        ChkBTodos.setBackground(new java.awt.Color(204, 204, 204));
        ChkBTodos.setBorder(null);
        ChkBTodos.setFocusable(false);

        lblBuscar.setBackground(new java.awt.Color(255, 102, 0));
        lblBuscar.setForeground(new java.awt.Color(255, 102, 0));
        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BuscarOrange20.png"))); // NOI18N

        tblProductoBuscar.setBackground(new java.awt.Color(255, 255, 255));
        tblProductoBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo"
            }
        ));
        tblProductoBuscar.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblProductoBuscar);

        javax.swing.GroupLayout pnFondoLayout = new javax.swing.GroupLayout(pnFondo);
        pnFondo.setLayout(pnFondoLayout);
        pnFondoLayout.setHorizontalGroup(
            pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFondoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFondoLayout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(18, 18, 18)
                        .addComponent(ChkBTodos))
                    .addGroup(pnFondoLayout.createSequentialGroup()
                        .addComponent(lblBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnFondoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnFondoLayout.setVerticalGroup(
            pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFondoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(ChkBTodos))
                .addGap(18, 18, 18)
                .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnFondoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(pnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .addGap(3, 3, 3))
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
        lblTitulo.setText("Codigo De Barras");

        javax.swing.GroupLayout plControlesLayout = new javax.swing.GroupLayout(plControles);
        plControles.setLayout(plControlesLayout);
        plControlesLayout.setHorizontalGroup(
            plControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plControlesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 375, Short.MAX_VALUE)
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
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(frmCodigoBarra.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(frmCodigoBarra.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(frmCodigoBarra.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(frmCodigoBarra.class.getName()).log(Level.SEVERE, null, ex);
                }

                new frmCodigoBarra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox ChkBTodos;
    public javax.swing.JButton btnConsultar;
    public javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel plBotones;
    private javax.swing.JPanel plControles;
    private javax.swing.JPanel pnFondo;
    public javax.swing.JTable tblProductoBuscar;
    public javax.swing.JTable tblProductos;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
