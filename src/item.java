
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class item extends javax.swing.JFrame {

Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public item() {
        conn = Conexion_BD.conectardb();
        initComponents();
        this.setResizable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        btnsolconstancia = new javax.swing.JButton();
        btnsolbecas = new javax.swing.JButton();
        btndeudabib = new javax.swing.JButton();
        solkardex = new javax.swing.JButton();
        btnreferencia = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setExtendedState(6);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Programa Interactivo Escolar V1.0");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 460, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/logggoooooofinal.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, 320, 310));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bienvenido Alumn@");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 510, 60));

        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/logout2.png"))); // NOI18N
        btnlogout.setBorder(null);
        btnlogout.setBorderPainted(false);
        btnlogout.setContentAreaFilled(false);
        btnlogout.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnlogout.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/logoutgrandesita.png"))); // NOI18N
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 500, 80, 70));

        btnsolconstancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/contancia.png"))); // NOI18N
        btnsolconstancia.setBorder(null);
        btnsolconstancia.setBorderPainted(false);
        btnsolconstancia.setContentAreaFilled(false);
        btnsolconstancia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnsolconstancia.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/constanciagrande_1.png"))); // NOI18N
        btnsolconstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsolconstanciaActionPerformed(evt);
            }
        });
        getContentPane().add(btnsolconstancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 400, 100));

        btnsolbecas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/volteado.png"))); // NOI18N
        btnsolbecas.setBorder(null);
        btnsolbecas.setContentAreaFilled(false);
        btnsolbecas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnsolbecas.setDefaultCapable(false);
        btnsolbecas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/becasgrnade.png"))); // NOI18N
        btnsolbecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsolbecasActionPerformed(evt);
            }
        });
        getContentPane().add(btnsolbecas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 370, 100));

        btndeudabib.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/biblliotca.png"))); // NOI18N
        btndeudabib.setBorderPainted(false);
        btndeudabib.setContentAreaFilled(false);
        btndeudabib.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btndeudabib.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/bibliotecados.png"))); // NOI18N
        btndeudabib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeudabibActionPerformed(evt);
            }
        });
        getContentPane().add(btndeudabib, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 390, 110));

        solkardex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/kardex.png"))); // NOI18N
        solkardex.setBorder(null);
        solkardex.setBorderPainted(false);
        solkardex.setContentAreaFilled(false);
        solkardex.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/kardexdos.png"))); // NOI18N
        solkardex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solkardexActionPerformed(evt);
            }
        });
        getContentPane().add(solkardex, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 400, 110));

        btnreferencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/referencia bancaria_1.png"))); // NOI18N
        btnreferencia.setBorder(null);
        btnreferencia.setBorderPainted(false);
        btnreferencia.setContentAreaFilled(false);
        btnreferencia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnreferencia.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/referencia bancaridos_1.png"))); // NOI18N
        btnreferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreferenciaActionPerformed(evt);
            }
        });
        getContentPane().add(btnreferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 380, 120));

        jLabel5.setBackground(new java.awt.Color(0, 204, 204));
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, 400, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-400, -20, -1, 1070));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnreferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreferenciaActionPerformed
       
     referenciabancaria rb= new referenciabancaria();
     rb.setVisible(true);
        
        
        
    }//GEN-LAST:event_btnreferenciaActionPerformed

    private void btnsolbecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsolbecasActionPerformed
solicitudbecas vp=new solicitudbecas();
vp.setVisible(true);// TODO add your handling code here:
        
    }//GEN-LAST:event_btnsolbecasActionPerformed

    private void solkardexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solkardexActionPerformed

        Runtime myRuntime = Runtime.getRuntime();
        try {
            myRuntime.exec("C:\\Program Files\\Internet Explorer\\IEXPLORE.EXE http://201.144.14.171/conectv4/");
        } catch (Exception ex) {
           // ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex);
        }     
    }//GEN-LAST:event_solkardexActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
   int a=JOptionPane.showConfirmDialog(null,"Está Seguro Que Deseea Salir?");
            if(a==JOptionPane.YES_OPTION){
               
            login metodo1=new login();
            this.dispose();
            metodo1.setVisible(true);
            
            /*int a=JOptionPane.showConfirmDialog(null,"Está Seguro Que Deseea Salir?");
            if(a==JOptionPane.YES_OPTION){
                this.dispose();
                login metodo1=new login();
                metodo1.setVisible(true);
            }  */
            
            }
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnsolconstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsolconstanciaActionPerformed
solicitudconstancia vp=new solicitudconstancia();   
vp.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_btnsolconstanciaActionPerformed

    private void btndeudabibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeudabibActionPerformed
      adeudosbiblioteca vp= new adeudosbiblioteca();
      vp.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_btndeudabibActionPerformed

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
            java.util.logging.Logger.getLogger(item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new item().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndeudabib;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnreferencia;
    private javax.swing.JButton btnsolbecas;
    private javax.swing.JButton btnsolconstancia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton solkardex;
    // End of variables declaration//GEN-END:variables
}
