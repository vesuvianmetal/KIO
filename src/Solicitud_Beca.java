
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Solicitud_Beca extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    int limitefolio = 11;
    int limitepromedio = 3;
    int limitebeca = 45;
    int limiteemail = 30;

    public Solicitud_Beca() {
        conn = Conexion_BD.conectardb();
        initComponents();
        llenadodebeca();
        this.setResizable(false);
    }

    void llenadodebeca() {

        try {

            String llenadodeBECA = "SELECT * From becas";
            pst = conn.prepareStatement(llenadodeBECA);
            rs = pst.executeQuery();

            tablactrle.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    void actualizar_tablabecas() {
        try {

            String acti = "SELECT * From becas";
            pst = conn.prepareStatement(acti);
            rs = pst.executeQuery();

            tablactrle.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    void borrarcampos() {
        try {
            foliotxt.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField1.setText("");
            jTextField5.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        foliotxt = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablactrle = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel15.setText("jLabel15");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 153));
        jButton3.setText("Actualizar");
        jButton3.setToolTipText("Actualizar La Base De Datos.");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, -1, 20));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 130, 20));

        foliotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                foliotxtKeyTyped(evt);
            }
        });
        getContentPane().add(foliotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 130, 20));

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 130, 20));

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 130, 20));

        jTextField5.setToolTipText("Introducir Registro A Eliminar.");
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 120, 30));

        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setText("Eliminar");
        jButton2.setToolTipText("Numero De Folio A Eliminar.");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Folio Beca");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 210, 160));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Eliminar");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Editar");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Promedio:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrador de Becas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Aplicar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, -1, -1));

        tablactrle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Folio Beca", "Numero de control", "Promedio", "Tipo de Beca", "Correo Electronico"
            }
        ));
        tablactrle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablactrleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablactrle);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 590, 200));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Solicitud De Becas");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Correo Electronico:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ver");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Programa Interactivo Escolar V1.0");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Folio:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo de Beca:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/logoconstancia.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, -20, 80, 120));

        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 300, 160));

        jLabel3.setBackground(new java.awt.Color(0, 204, 204));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/interfazbiblioteca.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int verificacioncambio = JOptionPane.showConfirmDialog(null, "¿Seguro que desea modificar el registro?", "Modificar", JOptionPane.YES_NO_OPTION);
            if (foliotxt.getText().equals("") || jTextField3.getText().equals("") || jTextField4.getText().equals("") || jTextField1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Hay Uno o Varios Campos Vacios", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (Integer.parseInt(jTextField3.getText()) <1){
                JOptionPane.showMessageDialog(null, "El Campo De Promedio No Puede Ser Negativo");
            } else if (Integer.parseInt(jTextField3.getText()) > 10) {
                JOptionPane.showMessageDialog(null, "El Campo De Promedio No Puede Ser Mayor a 10", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
            else if (verificacioncambio == JOptionPane.YES_OPTION) {
                try {
                    String editnumc = foliotxt.getText();
                    String editpromedio = jTextField3.getText();
                    String edittipobeca = jTextField4.getText();
                    String editemail = jTextField1.getText();

                    String edit = "UPDATE becas set PROMEDIO='" + editpromedio + "', TIPO_BECA='" + edittipobeca + "', correo_electronico='" + editemail + "' WHERE FOLIO_BECAS='" + editnumc + "'";
                    pst = conn.prepareStatement(edit);
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Modificado Exitosamente");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            } else if (verificacioncambio == JOptionPane.NO_OPTION) {

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        actualizar_tablabecas();
        borrarcampos();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablactrleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablactrleMouseClicked

        try {
            int row = tablactrle.getSelectedRow();
            String Click_Tabla = (tablactrle.getModel().getValueAt(row, 0).toString());
            String Click = "SELECT * From becas where FOLIO_BECAS = '" + Click_Tabla + "' ";
            pst = conn.prepareStatement(Click);
            rs = pst.executeQuery();

            if (rs.next()) {

                String agregar1 = rs.getString("FOLIO_BECAS");
                foliotxt.setText(agregar1);

                String agregar2 = rs.getString("PROMEDIO");
                jTextField3.setText(agregar2);

                String agregar3 = rs.getString("TIPO_BECA");
                jTextField4.setText(agregar3);

                String agregar4 = rs.getString("correo_electronico");
                jTextField1.setText(agregar4);

                String agregar5 = rs.getString("FOLIO_BECAS");
                jTextField5.setText(agregar5);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_tablactrleMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            actualizar_tablabecas();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            int verificacion = JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar el registro?", "Borrar", JOptionPane.YES_NO_OPTION);

            if (jTextField5.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "No Hay Registro Seleccionado Para Borrar", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (verificacion == JOptionPane.YES_OPTION) {
                String elim = "DELETE from becas where FOLIO_BECAS=?";
                try {
                    pst = conn.prepareStatement(elim);
                    pst.setString(1, jTextField5.getText());
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Becado Eliminada");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            } else if (verificacion == JOptionPane.NO_OPTION) {

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        actualizar_tablabecas();
        borrarcampos();


    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {

            Interfaz_controlescolar Co = new Interfaz_controlescolar();
            Co.setVisible(true);
            this.dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        try {
            char c = evt.getKeyChar();

            if (Character.isLetter(c)) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Caracteres Numericos");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jTextField5KeyTyped

    private void foliotxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_foliotxtKeyTyped
        try {
            char c = evt.getKeyChar();

            if (Character.isLetter(c)) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Caracteres Numericos");

            }

            if (foliotxt.getText().length() == limitefolio) {
                evt.consume();
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud De 11 Caracteres", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_foliotxtKeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        try {

            int c = evt.getKeyChar();

            if (Character.isLetter(c)) {
                evt.consume();
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Caracteres Numericos", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

            if (jTextField3.getText().length() == limitepromedio) {
                evt.consume();
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitus de 2 Caracteres");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        try {

            int c = evt.getKeyChar();

            if (Character.isDigit(c)) {
                evt.consume();
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Caracteres Alphabeticos", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

            if (jTextField4.getText().length() == limitebeca) {
                evt.consume();
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitus de 45 Caracteres");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        try {

            if (jTextField1.getText().length() == limiteemail) {
                evt.consume();
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitus de 30 Caracteres");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField1KeyTyped

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
            java.util.logging.Logger.getLogger(Solicitud_Beca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Solicitud_Beca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Solicitud_Beca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Solicitud_Beca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Solicitud_Beca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField foliotxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable tablactrle;
    // End of variables declaration//GEN-END:variables
}
