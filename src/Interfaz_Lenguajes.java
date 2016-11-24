
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Penudo McFly
 */
public class Interfaz_Lenguajes extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz_Lenguajes
     */
    public Interfaz_Lenguajes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        tablavalores = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panebuscar = new javax.swing.JPanel();
        areabucar = new javax.swing.JLabel();
        paneditar = new javax.swing.JPanel();
        areaeditar = new javax.swing.JLabel();
        panelagregar = new javax.swing.JPanel();
        areaagregar = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Centro de Idiomas");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablavalores.setViewportView(jTable1);

        getContentPane().add(tablavalores, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 520, 110));

        panebuscar.setBackground(new java.awt.Color(0, 204, 204));
        panebuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));

        javax.swing.GroupLayout panebuscarLayout = new javax.swing.GroupLayout(panebuscar);
        panebuscar.setLayout(panebuscarLayout);
        panebuscarLayout.setHorizontalGroup(
            panebuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );
        panebuscarLayout.setVerticalGroup(
            panebuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        getContentPane().add(panebuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 20));

        areabucar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        getContentPane().add(areabucar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 210, 170));

        paneditar.setBackground(new java.awt.Color(0, 204, 204));
        paneditar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));

        javax.swing.GroupLayout paneditarLayout = new javax.swing.GroupLayout(paneditar);
        paneditar.setLayout(paneditarLayout);
        paneditarLayout.setHorizontalGroup(
            paneditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );
        paneditarLayout.setVerticalGroup(
            paneditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        getContentPane().add(paneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 520, 30));

        areaeditar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        getContentPane().add(areaeditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 520, 240));

        panelagregar.setBackground(new java.awt.Color(0, 204, 204));
        panelagregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));

        javax.swing.GroupLayout panelagregarLayout = new javax.swing.GroupLayout(panelagregar);
        panelagregar.setLayout(panelagregarLayout);
        panelagregarLayout.setHorizontalGroup(
            panelagregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 206, Short.MAX_VALUE)
        );
        panelagregarLayout.setVerticalGroup(
            panelagregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        getContentPane().add(panelagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 210, 30));

        areaagregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        getContentPane().add(areaagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 210, 240));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/interfazbiblioteca.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
int a=JOptionPane.showConfirmDialog(null,"Está Seguro Que Deseea Salir?");
            if(a==JOptionPane.YES_OPTION){
                this.dispose();
                login metodo1=new login();
                metodo1.setVisible(true);
            }        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Interfaz_Lenguajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Lenguajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Lenguajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Lenguajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Lenguajes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel areaagregar;
    private javax.swing.JLabel areabucar;
    private javax.swing.JLabel areaeditar;
    private javax.swing.JLabel fondo;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panebuscar;
    private javax.swing.JPanel paneditar;
    private javax.swing.JPanel panelagregar;
    private javax.swing.JScrollPane tablavalores;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
