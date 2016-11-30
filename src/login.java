import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




public class login extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;
int limitecontraseña = 10;
   
    public login() {
         conn=Conexion_BD.conectardb(); //llamado de conexion de base de datos
        initComponents();
      this.setResizable(false);
    }
    
      String cap=null;
public String pass;

    void acceder (String usuario, String pass) throws Exception{

        //lee datos de la tabla usuarios donde sea el usuario concuerde con la contraseña de su dicho usuario
        String sql = "SELECT * FROM usuarios WHERE USUARIO='" + usuario + "' AND CONTRASENA='"+pass+"'";
        
        try {
            Statement st = conn.createStatement(); 
ResultSet rs1 = st.executeQuery (sql);
            while (rs1.next()) {
                //variable cap captura el tipo de usuario de cada quien
                cap = rs1.getString("TIPO_USUARIO");

            }
            
            if (cap.equals("admin")) {
                Interfaz_Admin IA = new Interfaz_Admin();
                IA.setVisible(true);
                this.dispose();
            }
            if (cap.equals("caja")) {
                Interfaz_Caja IC = new Interfaz_Caja();
                IC.setVisible(true);
                this.dispose();
            }

            if (cap.equals("biblioteca")) {
                Interfaz_Biblioteca IB = new Interfaz_Biblioteca();
                IB.setVisible(true);
                this.dispose();
            }
            if (cap.equals("idiomas")) {
                Interfaz_Lenguajes IL = new Interfaz_Lenguajes();
                IL.setVisible(true);
                this.dispose();
            }
            if (cap.equals("alumno")) {
                item IAL = new item();
                IAL.setVisible(true);
                this.dispose();
            }  
             if (cap.equals("control")) {
                Interfaz_controlescolar ic= new Interfaz_controlescolar();
                ic.setVisible(true);
                this.dispose();
            }  
             
            if (cap.equals("becas")) {
                Solicitud_Beca sb= new Solicitud_Beca();
                sb.setVisible(true);
                this.dispose();
            }  
            
        } catch (SQLException e) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error Usuario no Registrado en la base de datos");
        }
}

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        usuariotxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        contratxt = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Iniciar Session");
        setMaximumSize(new java.awt.Dimension(1336, 768));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("B   I   E   N   V   E   N   I   D   O");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ingrese nombre de usuario y contraseña");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(219, 219, 219))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 680, 60));

        jPanel4.setBackground(new java.awt.Color(0, 114, 130));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));

        usuariotxt.setBackground(new java.awt.Color(0, 114, 130));
        usuariotxt.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        usuariotxt.setForeground(new java.awt.Color(255, 255, 255));
        usuariotxt.setToolTipText("");
        usuariotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usuariotxtKeyTyped(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("USUARIO");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CONTRASEÑA");

        contratxt.setBackground(new java.awt.Color(0, 114, 130));
        contratxt.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        contratxt.setForeground(new java.awt.Color(255, 255, 255));
        contratxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contratxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contratxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contratxtKeyTyped(evt);
            }
        });

        login.setBackground(new java.awt.Color(0, 204, 204));
        login.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        login.setText("Iniciar Sesion");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        borrar.setBackground(new java.awt.Color(0, 204, 204));
        borrar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(66, 66, 66)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(contratxt, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addComponent(usuariotxt))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(usuariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(contratxt, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 680, 260));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/logggoooooofinal.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 330, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/fondo.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1470, 920));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

         String usu=usuariotxt.getText();
        String pas=contratxt.getText();
    
           if (usuariotxt.getText().isEmpty() && contratxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error Ingrese Usuario Y Contraseña","Error",JOptionPane.WARNING_MESSAGE);
            
           }else if (usuariotxt.getText().isEmpty() || contratxt.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Error Ingrese Todos Los Campos","Error",JOptionPane.WARNING_MESSAGE);
            }
    }//GEN-LAST:event_loginActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
   usuariotxt.setText("");
   contratxt.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_borrarActionPerformed

    private void contratxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contratxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_contratxtKeyReleased

    private void contratxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contratxtKeyPressed
       
         if (evt.getKeyCode()==KeyEvent.VK_ENTER){
           String usu=usuariotxt.getText();
        String pas=contratxt.getText();
        try {
             acceder(usu , pas);
             if (usuariotxt.getText().isEmpty() || contratxt.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Error Rellene El Campo Faltante","Error",JOptionPane.WARNING_MESSAGE);
            }
            else if (usuariotxt.getText().isEmpty() && contratxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error Rellene Ambos Campos","Error",JOptionPane.WARNING_MESSAGE);
            }
        }
        
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Bienvenido "+usuariotxt+"");
        } 
        }
        
        
        
    }//GEN-LAST:event_contratxtKeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
String user = JOptionPane.showInputDialog(null, "Usuario");
		String password = JOptionPane.showInputDialog(null, "Contraseña");

		if ("admin".equals(user) && "admin".equals(password)) {
			JOptionPane.showMessageDialog(null, "Inicio de Sesion Correcto");
		}else {
                    
			JOptionPane.showMessageDialog(null, "Inicio de Sesion Fallido");
                        login vp=new login();
                        vp.setVisible(true);
                        this.dispose();
                        		}        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void usuariotxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuariotxtKeyTyped
// ignorar el evento de teclado
    }//GEN-LAST:event_usuariotxtKeyTyped

    private void contratxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contratxtKeyTyped
       try {
           if (contratxt.getText().length() == limitecontraseña) {
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud De 10 Caracteres");
            }
       } catch (Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
        
          
    }//GEN-LAST:event_contratxtKeyTyped

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JPasswordField contratxt;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton login;
    private javax.swing.JTextField usuariotxt;
    // End of variables declaration//GEN-END:variables
}
