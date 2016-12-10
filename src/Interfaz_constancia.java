
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public final class Interfaz_constancia extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    int limitefolio = 11;

    public Interfaz_constancia() {
        conn = Conexion_BD.conectardb();
        
        initComponents();
        filltablacons();
        actualizartablacons();
    }

     void filltablacons() {

        try {

            String tablaconst = " select caja.FK_NUMERO_CONTROL_CAJA, alumno.NOMBRE, alumno.APELLIDO_PATERNO, alumno.APELLIDO_MATERNO, alumno.CARRERA, alumno.SEMESTRE from caja, alumno where FK_NUMERO_CONTROL_CAJA=alumno.NUMERO_CONTROL";
            pst = conn.prepareStatement(tablaconst);
            rs = pst.executeQuery();

            tablaconstancias.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
     
     void actualizartablacons(){
         try {
              String tablaconst = " select caja.FK_NUMERO_CONTROL_CAJA, alumno.NOMBRE, alumno.APELLIDO_PATERNO, alumno.APELLIDO_MATERNO, alumno.CARRERA, alumno.SEMESTRE from caja, alumno where FK_NUMERO_CONTROL_CAJA=alumno.NUMERO_CONTROL";
            pst = conn.prepareStatement(tablaconst);
            rs = pst.executeQuery();

            tablaconstancias.setModel(DbUtils.resultSetToTableModel(rs));
         } catch (Exception e){
             JOptionPane.showMessageDialog(null, e);
         }
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        btnactualizartabla = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaconstancias = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jLabel13.setText("jLabel13");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Interfaz Costancia");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 170, 30));

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 170, -1));

        btnactualizartabla.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnactualizartabla.setForeground(new java.awt.Color(0, 153, 153));
        btnactualizartabla.setText("Actualizar");
        btnactualizartabla.setToolTipText("Esta Tabla Muestra Los Registros Dentrol De La Base De Datos En La Tabla Biblioteca.");
        btnactualizartabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizartablaActionPerformed(evt);
            }
        });
        getContentPane().add(btnactualizartabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, -1, 20));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Folio Caja:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 80, 40));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Semestre:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 70, 20));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Carrera:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 60, 20));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Apellido Materno:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 130, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 60, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Numero de Control:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 140, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Visualizar Datos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 160, 20));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Programa interactivo Escolar PIE V1.0");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Generador de Constancias");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Apellido Paterno:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 120, 30));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 170, 30));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 170, 30));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 170, 30));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/logoconstancia.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 80, 120));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 170, 30));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 170, 30));

        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 350, 290));

        tablaconstancias = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaconstancias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Folio Caja", "Número de Control", "Apellido Paterno", "Apellido Materno", "Carrera", "Semestre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaconstancias.getTableHeader().setReorderingAllowed(false);
        tablaconstancias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaconstanciasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaconstancias);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 720, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/interfazbiblioteca.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            Interfaz_controlescolar Co = new Interfaz_controlescolar();
            Co.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
 
    }//GEN-LAST:event_formWindowClosing

    private void tablaconstanciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaconstanciasMouseClicked
 try {
            int row = tablaconstancias.getSelectedRow();
            String Click_Tabla = (tablaconstancias.getModel().getValueAt(row, 0).toString());
            
  // select caja.FK_NUMERO_CONTROL_CAJA, alumno.NOMBRE, alumno.APELLIDO_PATERNO, alumno.APELLIDO_MATERNO, 
  //alumno.CARRERA, alumno.SEMESTRE from caja, alumno where FK_NUMERO_CONTROL_CAJA=alumno.NUMERO_CONTROL"
            String Click = " select caja.FK_NUMERO_CONTROL_CAJA ,alumno.NUMERO_CONTROL, alumno.NOMBRE,alumno.APELLIDO_PATERNO, alumno.APELLIDO_MATERNO, alumno.CARRERA, alumno.SEMESTRE from alumno, caja where'" + Click_Tabla + "' = alumno.NUMERO_CONTROL ";
            pst = conn.prepareStatement(Click);
            rs = pst.executeQuery();

            if (rs.next()) {

                String agregar1 = rs.getString("alumno.NUMERO_CONTROL");
                jTextField3.setText(agregar1);

                String agregar2 = rs.getString("alumno.NOMBRE");
                jTextField4.setText(agregar2);

                String agregar3 = rs.getString("alumno.APELLIDO_PATERNO");
                jTextField5.setText(agregar3);

                String agregar4 = rs.getString("alumno.APELLIDO_MATERNO");
                jTextField6.setText(agregar4);
           
                String agregar5 = rs.getString("alumno.CARRERA");
               jTextField7.setText(agregar5);
                
                  String agregar6 = rs.getString("alumno.SEMESTRE");
                jTextField1.setText(agregar6);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_tablaconstanciasMouseClicked

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
      
    }//GEN-LAST:event_jTextField2KeyTyped

    private void btnactualizartablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizartablaActionPerformed
        try {
            actualizartablacons();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnactualizartablaActionPerformed

    
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
            java.util.logging.Logger.getLogger(Interfaz_constancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_constancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_constancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_constancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_constancia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizartabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTable tablaconstancias;
    // End of variables declaration//GEN-END:variables
}
