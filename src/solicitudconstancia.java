
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import javax.swing.JOptionPane;


public class solicitudconstancia extends javax.swing.JFrame {
 Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    int limitecontrol=8;
    int limitefoliocaja=11;
    
    
    public solicitudconstancia() {
        conn = Conexion_BD.conectardb();
        initComponents();
        this.setResizable(false);
    }

   
    
    void enviadoborrar() {
        try {

            nombre1.setText("");
            carrera.setText("");
            numcontrl1.setText("");
            semestre.setText("");
            caja1.setText("");
            email.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
            
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        email = new javax.swing.JTextField();
        numcontrl1 = new javax.swing.JTextField();
        nombre1 = new javax.swing.JTextField();
        carrera = new javax.swing.JTextField();
        semestre = new javax.swing.JTextField();
        caja1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        name = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        aredatos = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Solicitud de Constancia-PIE V1.0");
        setExtendedState(6);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/borrar.png"))); // NOI18N
        jButton2.setToolTipText("Borrar Datos Ingresados");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 600, 130, 80));

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/enviar.png"))); // NOI18N
        jButton1.setToolTipText("Enviar Solicitud de Constancia");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 590, 110, 90));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/home.png"))); // NOI18N
        jButton3.setToolTipText("Volver a Menu");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 600, 110, 80));

        email.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        email.setToolTipText("Correo para envio de constancia");
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 350, 50));

        numcontrl1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        numcontrl1.setToolTipText("");
        numcontrl1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numcontrl1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numcontrl1KeyTyped(evt);
            }
        });
        getContentPane().add(numcontrl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 350, 50));

        nombre1.setEditable(false);
        nombre1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 350, 50));

        carrera.setEditable(false);
        carrera.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().add(carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 350, 50));

        semestre.setEditable(false);
        semestre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().add(semestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 350, 50));

        caja1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        caja1.setToolTipText("Folo Generado al momento de Pagar en Caja");
        caja1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                caja1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja1KeyTyped(evt);
            }
        });
        getContentPane().add(caja1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 540, 350, 50));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Folio Caja*:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Semestre:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Carrera:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Numero de Control*:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("* Campos Obligatorios");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresa los Datos Solicitados Despues Presione Continuar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Correo Electronico*:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, -1, -1));

        name.setBackground(new java.awt.Color(0, 204, 204));
        name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Solicitud  De Constancia");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/itess constancia.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/logoconstancia.png"))); // NOI18N
        jLabel10.setText("jLabel10");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/logoconstancia.png"))); // NOI18N

        javax.swing.GroupLayout nameLayout = new javax.swing.GroupLayout(name);
        name.setLayout(nameLayout);
        nameLayout.setHorizontalGroup(
            nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nameLayout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addGroup(nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nameLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        nameLayout.setVerticalGroup(
            nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, nameLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 820, 90));

        aredatos.setBackground(new java.awt.Color(0, 204, 204));
        aredatos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        getContentPane().add(aredatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 820, 570));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/fondo.jpg"))); // NOI18N
        FONDO.setToolTipText(" ");
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, -1, 1070));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void numcontrl1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numcontrl1KeyReleased
        
        
        
        
           
        try{
        String buscarfolio = "SELECT * from alumno where NUMERO_CONTROL=?";
            pst = conn.prepareStatement(buscarfolio);
            pst.setString(1, numcontrl1.getText());
            rs = pst.executeQuery();
        
         if (rs.next()) {

                String agregar1 = rs.getString("NOMBRE");
                nombre1.setText(agregar1);

                String agregar2 = rs.getString("CARRERA");
                carrera.setText(agregar2);

                String agregar3 = rs.getString("SEMESTRE");
                semestre.setText(agregar3);

                
            }
         
       
         
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_numcontrl1KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     

        try{
           
            if (numcontrl1.getText().equals("") && nombre1.getText().equals("") && carrera.getText().equals("") && email.getText().equals("") && caja1.getText().equals("")){
                JOptionPane.showMessageDialog(null, "No Hay Campos Por Borrar" , "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                enviadoborrar();
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
       
 try{
           
            if (numcontrl1.getText().equals("") || nombre1.getText().equals("") || carrera.getText().equals("") || email.getText().equals("") || caja1.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Hay Uno o Varios Campos Vacios" , "ERROR", JOptionPane.ERROR_MESSAGE);
            } 
            else if (Integer.parseInt(caja1.getText()) < 1){
                JOptionPane.showMessageDialog(null, "No Se Puede Poner Un Numero Negativo En El Campo Folio" , "ERROR" , JOptionPane.ERROR_MESSAGE);
            }
            else {
              String agr = "INSERT into constancia (FOLIO_CONSTANCIA,FK_NUMERO_CONTROL_CONSTANCIA,FECHA_SOL,FK_FOLIO_CAJA) values (?,?,?,?)";
            pst = conn.prepareStatement(agr);
            pst.setString(1, null);
            pst.setString(2, numcontrl1.getText());
            pst.setTimestamp(3, timestamp);
            pst.setString(4, caja1.getText());
           
            pst.execute();

            JOptionPane.showMessageDialog(null, "Se Ha Enviado La Solicitud");   
            }
        
           
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        enviadoborrar();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            item vp = new item();
            vp.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void numcontrl1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numcontrl1KeyTyped
         try {
            if (numcontrl1.getText().length() == limitecontrol) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud De 8 Caracteres");
            }

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_numcontrl1KeyTyped

    private void caja1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja1KeyTyped
      try {
            if (caja1.getText().length() == limitefoliocaja) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud De 11 Caracteres");
            }
            
            int c =evt.getKeyChar();
            if (Character.isLetter(c)){
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Caracteres Numericos" , "ERROR" , JOptionPane.ERROR_MESSAGE);
            }

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_caja1KeyTyped

    private void caja1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja1KeyReleased
        int c=evt.getKeyChar();
        
        try {
            
            if (Character.isLetter(c)){
                evt.consume();
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Caracteres Numericos");
            }
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_caja1KeyReleased

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
            java.util.logging.Logger.getLogger(solicitudconstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(solicitudconstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(solicitudconstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(solicitudconstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new solicitudconstancia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JLabel aredatos;
    private javax.swing.JTextField caja1;
    private javax.swing.JTextField carrera;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel name;
    private javax.swing.JTextField nombre1;
    private javax.swing.JTextField numcontrl1;
    private javax.swing.JTextField semestre;
    // End of variables declaration//GEN-END:variables
}
