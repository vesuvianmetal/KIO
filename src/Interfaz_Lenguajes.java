
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

        fol = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        pie = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        generador = new javax.swing.JLabel();
        panever = new javax.swing.JPanel();
        ve = new javax.swing.JLabel();
        tablavalores = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        numconag1 = new javax.swing.JTextField();
        numcontrol2 = new javax.swing.JLabel();
        panebuscar = new javax.swing.JPanel();
        trytofind = new javax.swing.JLabel();
        areabucar = new javax.swing.JLabel();
        paneleiminiar = new javax.swing.JPanel();
        elim = new javax.swing.JLabel();
        numcon = new javax.swing.JTextField();
        numcontrol = new javax.swing.JLabel();
        texttipo = new javax.swing.JTextField();
        calif = new javax.swing.JLabel();
        textcalif = new javax.swing.JTextField();
        tipcalif = new javax.swing.JLabel();
        areaeliminar = new javax.swing.JLabel();
        paneditar = new javax.swing.JPanel();
        edit = new javax.swing.JLabel();
        areaeditar = new javax.swing.JLabel();
        panelagregar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tipcalif1 = new javax.swing.JLabel();
        calif1 = new javax.swing.JLabel();
        numcontrol1 = new javax.swing.JLabel();
        numconag = new javax.swing.JTextField();
        textcalifagr = new javax.swing.JTextField();
        texttipoag = new javax.swing.JTextField();
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

        fol.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        fol.setForeground(new java.awt.Color(255, 255, 255));
        fol.setText("Folio:");
        getContentPane().add(fol, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 130, 30));

        pie.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        pie.setForeground(new java.awt.Color(255, 255, 255));
        pie.setText("Programa Interactivo Escolar PIE V1.0");
        getContentPane().add(pie, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        titulo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Centro de Idiomas");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, -1));

        generador.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        generador.setForeground(new java.awt.Color(255, 255, 255));
        generador.setText("Generador de Reportes");
        getContentPane().add(generador, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, 20));

        panever.setBackground(new java.awt.Color(0, 204, 204));
        panever.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));

        ve.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ve.setForeground(new java.awt.Color(255, 255, 255));
        ve.setText("Ver");

        javax.swing.GroupLayout paneverLayout = new javax.swing.GroupLayout(panever);
        panever.setLayout(paneverLayout);
        paneverLayout.setHorizontalGroup(
            paneverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ve)
                .addContainerGap(498, Short.MAX_VALUE))
        );
        paneverLayout.setVerticalGroup(
            paneverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneverLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ve))
        );

        getContentPane().add(panever, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 540, 30));

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

        getContentPane().add(tablavalores, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 540, 110));

        numconag1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(numconag1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 130, 30));

        numcontrol2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        numcontrol2.setForeground(new java.awt.Color(255, 255, 255));
        numcontrol2.setText("Numero de Control:");
        getContentPane().add(numcontrol2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        panebuscar.setBackground(new java.awt.Color(0, 204, 204));
        panebuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));

        trytofind.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        trytofind.setForeground(new java.awt.Color(255, 255, 255));
        trytofind.setText("Buscar");

        javax.swing.GroupLayout panebuscarLayout = new javax.swing.GroupLayout(panebuscar);
        panebuscar.setLayout(panebuscarLayout);
        panebuscarLayout.setHorizontalGroup(
            panebuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panebuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(trytofind)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        panebuscarLayout.setVerticalGroup(
            panebuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panebuscarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(trytofind))
        );

        getContentPane().add(panebuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 190, 30));

        areabucar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        getContentPane().add(areabucar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 190, 160));

        paneleiminiar.setBackground(new java.awt.Color(0, 204, 204));

        elim.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        elim.setForeground(new java.awt.Color(255, 255, 255));
        elim.setText("Eliminar");

        javax.swing.GroupLayout paneleiminiarLayout = new javax.swing.GroupLayout(paneleiminiar);
        paneleiminiar.setLayout(paneleiminiarLayout);
        paneleiminiarLayout.setHorizontalGroup(
            paneleiminiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneleiminiarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(elim)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        paneleiminiarLayout.setVerticalGroup(
            paneleiminiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneleiminiarLayout.createSequentialGroup()
                .addComponent(elim)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        getContentPane().add(paneleiminiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 190, 30));

        numcon.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(numcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 130, 30));

        numcontrol.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        numcontrol.setForeground(new java.awt.Color(255, 255, 255));
        numcontrol.setText("Numero de Control:");
        getContentPane().add(numcontrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, -1, -1));

        texttipo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(texttipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 130, 30));

        calif.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        calif.setForeground(new java.awt.Color(255, 255, 255));
        calif.setText("Calificación:");
        getContentPane().add(calif, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, -1, -1));

        textcalif.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(textcalif, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 130, 30));

        tipcalif.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tipcalif.setForeground(new java.awt.Color(255, 255, 255));
        tipcalif.setText("Tipo de Certificación:");
        getContentPane().add(tipcalif, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 150, 20));

        areaeliminar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        getContentPane().add(areaeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 190, 190));

        paneditar.setBackground(new java.awt.Color(0, 204, 204));
        paneditar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));

        edit.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("Editar");

        javax.swing.GroupLayout paneditarLayout = new javax.swing.GroupLayout(paneditar);
        paneditar.setLayout(paneditarLayout);
        paneditarLayout.setHorizontalGroup(
            paneditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneditarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edit)
                .addContainerGap(260, Short.MAX_VALUE))
        );
        paneditarLayout.setVerticalGroup(
            paneditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneditarLayout.createSequentialGroup()
                .addComponent(edit)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        getContentPane().add(paneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 320, 30));

        areaeditar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        getContentPane().add(areaeditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 320, 190));

        panelagregar.setBackground(new java.awt.Color(0, 204, 204));
        panelagregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Agregar");

        javax.swing.GroupLayout panelagregarLayout = new javax.swing.GroupLayout(panelagregar);
        panelagregar.setLayout(panelagregarLayout);
        panelagregarLayout.setHorizontalGroup(
            panelagregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelagregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        panelagregarLayout.setVerticalGroup(
            panelagregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelagregarLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        getContentPane().add(panelagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 210, 30));

        tipcalif1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tipcalif1.setForeground(new java.awt.Color(255, 255, 255));
        tipcalif1.setText("Tipo de Certificación:");
        getContentPane().add(tipcalif1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 150, 20));

        calif1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        calif1.setForeground(new java.awt.Color(255, 255, 255));
        calif1.setText("Calificación:");
        getContentPane().add(calif1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        numcontrol1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        numcontrol1.setForeground(new java.awt.Color(255, 255, 255));
        numcontrol1.setText("Numero de Control:");
        getContentPane().add(numcontrol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, -1, -1));

        numconag.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(numconag, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 130, 30));

        textcalifagr.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(textcalifagr, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 130, 30));

        texttipoag.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(texttipoag, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 130, 30));

        areaagregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        getContentPane().add(areaagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 210, 190));

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
    private javax.swing.JLabel areaeliminar;
    private javax.swing.JLabel calif;
    private javax.swing.JLabel calif1;
    private javax.swing.JLabel edit;
    private javax.swing.JLabel elim;
    private javax.swing.JLabel fol;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel generador;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField numcon;
    private javax.swing.JTextField numconag;
    private javax.swing.JTextField numconag1;
    private javax.swing.JLabel numcontrol;
    private javax.swing.JLabel numcontrol1;
    private javax.swing.JLabel numcontrol2;
    private javax.swing.JPanel panebuscar;
    private javax.swing.JPanel paneditar;
    private javax.swing.JPanel panelagregar;
    private javax.swing.JPanel paneleiminiar;
    private javax.swing.JPanel panever;
    private javax.swing.JLabel pie;
    private javax.swing.JScrollPane tablavalores;
    private javax.swing.JTextField textcalif;
    private javax.swing.JTextField textcalifagr;
    private javax.swing.JTextField texttipo;
    private javax.swing.JTextField texttipoag;
    private javax.swing.JLabel tipcalif;
    private javax.swing.JLabel tipcalif1;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel trytofind;
    private javax.swing.JLabel ve;
    // End of variables declaration//GEN-END:variables
}
