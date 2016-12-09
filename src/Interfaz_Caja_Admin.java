
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Interfaz_Caja_Admin extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    int limitecontrol = 8;
    int limitefolio = 11;
    int limiteimporte = 6;

    public Interfaz_Caja_Admin() {
        conn = Conexion_BD.conectardb();
        initComponents();
        this.setResizable(false);
    }

    void eliminar_campos() {
        try {
            foliocajatxt.setText("");
            importetxt.setText("");
            numcontroltxtcaja.setText("");
            nombrecajatxt.setText("");
            apellidopattxtcaja.setText("");
            apellidomattxtcaja.setText("");
            carreracajatxt.setText("");
            semestrecajatxt.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        semestrecajatxt = new javax.swing.JTextField();
        foliocajatxt = new javax.swing.JTextField();
        importetxt = new javax.swing.JTextField();
        numcontroltxtcaja = new javax.swing.JTextField();
        nombrecajatxt = new javax.swing.JTextField();
        apellidopattxtcaja = new javax.swing.JTextField();
        apellidomattxtcaja = new javax.swing.JTextField();
        carreracajatxt = new javax.swing.JTextField();
        btndesbloq = new javax.swing.JButton();
        btnelim = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Caja PIE-V1.0");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        semestrecajatxt.setEditable(false);
        semestrecajatxt.setToolTipText("Muestra El Semestre Relacionado Con El Numero De Control.");
        getContentPane().add(semestrecajatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 150, 30));

        foliocajatxt.setToolTipText("Numero de folio asignado");
        foliocajatxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                foliocajatxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                foliocajatxtKeyTyped(evt);
            }
        });
        getContentPane().add(foliocajatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 150, 30));

        importetxt.setToolTipText("Cantidad a pagar");
        importetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                importetxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                importetxtKeyTyped(evt);
            }
        });
        getContentPane().add(importetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 150, 30));

        numcontroltxtcaja.setToolTipText("Introducir Numero De Control.");
        numcontroltxtcaja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numcontroltxtcajaKeyReleased(evt);
            }
        });
        getContentPane().add(numcontroltxtcaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 150, 30));

        nombrecajatxt.setEditable(false);
        nombrecajatxt.setToolTipText("Muestra Nombre Relacionado Con El Numero De Control.");
        getContentPane().add(nombrecajatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 150, 30));

        apellidopattxtcaja.setEditable(false);
        apellidopattxtcaja.setToolTipText("Muestra El Apellido Paterno Relacionado Con El Numero De Control.");
        getContentPane().add(apellidopattxtcaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 150, 30));

        apellidomattxtcaja.setEditable(false);
        apellidomattxtcaja.setToolTipText("Muestra El Apellido Materno Relacionado Con El Numero De Control.");
        getContentPane().add(apellidomattxtcaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 150, 30));

        carreracajatxt.setEditable(false);
        carreracajatxt.setToolTipText("Muestra Carrera Cursando Actualemnte Relacionada Con El Numero De Control.");
        getContentPane().add(carreracajatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 150, 30));

        btndesbloq.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btndesbloq.setForeground(new java.awt.Color(0, 153, 153));
        btndesbloq.setText("Desbloquear Datos");
        btndesbloq.setToolTipText("Enviar Registro De Constancia. ");
        btndesbloq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndesbloqActionPerformed(evt);
            }
        });
        getContentPane().add(btndesbloq, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 117, -1, 50));

        btnelim.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnelim.setForeground(new java.awt.Color(0, 153, 153));
        btnelim.setText("Eliminar");
        btnelim.setToolTipText("Borrar Dato Asignados");
        btnelim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnelimActionPerformed(evt);
            }
        });
        getContentPane().add(btnelim, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 160, 50));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Numero de Control:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Importe:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 70, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Folio Caja:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 90, 40));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Generador de Folio de pago para solicitud de Constancia");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Caja");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 60, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 60, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Apellido Paterno:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 120, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Apellido Materno:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 130, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Carrera:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 60, 20));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/logoconstancia.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 80, 120));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Semestre:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 70, 20));

        jLabel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 320, 360));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/interfazbiblioteca.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int a = JOptionPane.showConfirmDialog(null, "Está Seguro Que Deseea Salir?");
        if (a == JOptionPane.YES_OPTION) {
            Interfaz_Admin metodo1 = new Interfaz_Admin();
            metodo1.setVisible(true);
            this.dispose();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void btndesbloqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndesbloqActionPerformed

        String agr = "INSERT into caja (FOLIO_CAJA,IMPORTE,FK_NUMERO_CONTROL_CAJA) values (?,?,?)";

        try {

            if (foliocajatxt.getText().equals("") || importetxt.getText().equals("") || numcontroltxtcaja.getText().equals("") || nombrecajatxt.getText().equals("")
                    || apellidopattxtcaja.getText().equals("") || apellidomattxtcaja.getText().equals("") || carreracajatxt.getText().equals("") || semestrecajatxt.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Hay Uno o Varios Campos Vacios", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (Integer.parseInt(importetxt.getText()) < 1.00) {
                JOptionPane.showMessageDialog(null, "El Campo De Aduedo No Puede Ser Negativo");
            } else {
                pst = conn.prepareStatement(agr);
                pst.setString(1, null);
                pst.setString(2, importetxt.getText());
                pst.setInt(3, Integer.parseInt(numcontroltxtcaja.getText()));

                pst.execute();

                JOptionPane.showMessageDialog(null, "Se Han Desbloqueado Los Datos Correctamente");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        eliminar_campos();


    }//GEN-LAST:event_btndesbloqActionPerformed

    private void btnelimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnelimActionPerformed

        try {
            if (foliocajatxt.getText().equals("") && importetxt.getText().equals("") && numcontroltxtcaja.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "No Hay Campos Que Borrar");
            } else {
                eliminar_campos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnelimActionPerformed

    private void foliocajatxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_foliocajatxtKeyReleased

        try {
            if (foliocajatxt.getText().length() == limitefolio) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud De 11 Caracteres");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_foliocajatxtKeyReleased

    private void foliocajatxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_foliocajatxtKeyTyped

        int c = evt.getKeyChar();

        try {

            if (Character.isLetter(c)) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Caracteres Numericos", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_foliocajatxtKeyTyped

    private void importetxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_importetxtKeyReleased

        try {
            if (importetxt.getText().length() == limiteimporte) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud De 6 Caracteres");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_importetxtKeyReleased

    private void importetxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_importetxtKeyTyped
        int c = evt.getKeyChar();
        try {

            if (Character.isLetter(c)) {
                evt.consume();
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Caracteres Numericos");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_importetxtKeyTyped

    private void numcontroltxtcajaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numcontroltxtcajaKeyReleased
        try {
            String buscarfolio = "SELECT * from alumno where NUMERO_CONTROL=?";
            pst = conn.prepareStatement(buscarfolio);
            pst.setString(1, numcontroltxtcaja.getText());
            rs = pst.executeQuery();

            if (rs.next()) {

                String agregar1 = rs.getString("NOMBRE");
                nombrecajatxt.setText(agregar1);

                String agregar2 = rs.getString("CARRERA");
                carreracajatxt.setText(agregar2);

                String agregar3 = rs.getString("SEMESTRE");
                semestrecajatxt.setText(agregar3);

                String agregar4 = rs.getString("APELLIDO_PATERNO");
                apellidopattxtcaja.setText(agregar4);

                String agregar5 = rs.getString("APELLIDO_MATERNO");
                apellidomattxtcaja.setText(agregar5);

            }
            if (numcontroltxtcaja.getText().length() == limitecontrol) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud De 8 Caracteres");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_numcontroltxtcajaKeyReleased

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
            java.util.logging.Logger.getLogger(Interfaz_Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Caja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidomattxtcaja;
    private javax.swing.JTextField apellidopattxtcaja;
    private javax.swing.JButton btndesbloq;
    private javax.swing.JButton btnelim;
    private javax.swing.JTextField carreracajatxt;
    private javax.swing.JTextField foliocajatxt;
    private javax.swing.JTextField importetxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTextField nombrecajatxt;
    private javax.swing.JTextField numcontroltxtcaja;
    private javax.swing.JTextField semestrecajatxt;
    // End of variables declaration//GEN-END:variables
}
