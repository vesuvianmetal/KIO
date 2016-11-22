
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Interfaz_Biblioteca extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Interfaz_Biblioteca() {
      //  conn = Conexion_BD.conectardb();
        initComponents();
        filltable();
        this.setLocationRelativeTo(this);

    }
    int elimno = 0;

    void actualizar_tabla() {
        try {

            String act = "SELECT * From Adeudo_Biblioteca";
            pst = conn.prepareStatement(act);
            rs = pst.executeQuery();

            tabla_aduedo.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    void filltable() {

        try {

            String B = "SELECT * from Adeudo_Biblioteca";
            pst = conn.prepareStatement(B);
            rs = pst.executeQuery();

            tabla_aduedo.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        buscarfoliotxt = new javax.swing.JTextField();
        buscarcodigolibrotxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_aduedo = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        buscarnumerocontroltxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        agradeudotxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        elimnumerocontroltxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btncambio = new javax.swing.JButton();
        editcodlibrotxt = new javax.swing.JTextField();
        editnumcontroltxt = new javax.swing.JTextField();
        editadeudotxt = new javax.swing.JTextField();
        agrnumcontroltxt = new javax.swing.JTextField();
        agrcodlibrotxt = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Adeudo");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Eliminar");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Adeudo:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 312, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Folio:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, -1, -1));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Codigo De Libro:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        buscarfoliotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarfoliotxtKeyReleased(evt);
            }
        });
        getContentPane().add(buscarfoliotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 110, -1));

        buscarcodigolibrotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarcodigolibrotxtKeyReleased(evt);
            }
        });
        getContentPane().add(buscarcodigolibrotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 110, -1));

        tabla_aduedo = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tabla_aduedo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));
        tabla_aduedo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tabla_aduedo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Folio", "Numero De Control", "Codigo De Libro", "Adeudo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_aduedo.getTableHeader().setResizingAllowed(false);
        tabla_aduedo.getTableHeader().setReorderingAllowed(false);
        tabla_aduedo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_aduedoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabla_aduedoMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_aduedo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 560, 120));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Numero de Control:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 232, -1, -1));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Buscar");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Codigo de Libro");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        buscarnumerocontroltxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarnumerocontroltxtKeyReleased(evt);
            }
        });
        getContentPane().add(buscarnumerocontroltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Codigo de Libro:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 272, -1, -1));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Folio:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 62, -1, -1));

        agradeudotxt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(agradeudotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 120, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Adeudos Biblioteca");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 2, -1, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Numero de Control");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        elimnumerocontroltxt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        elimnumerocontroltxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                elimnumerocontroltxtKeyReleased(evt);
            }
        });
        getContentPane().add(elimnumerocontroltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 150, -1));

        jLabel15.setBackground(new java.awt.Color(0, 153, 153));
        jLabel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 190, 100));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Numero De Control:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        btncambio.setBackground(new java.awt.Color(255, 255, 255));
        btncambio.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btncambio.setForeground(new java.awt.Color(0, 153, 153));
        btncambio.setText("Aplicar Cambios");
        btncambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncambioActionPerformed(evt);
            }
        });
        getContentPane().add(btncambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 402, 150, -1));

        editcodlibrotxt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(editcodlibrotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 272, 150, -1));

        editnumcontroltxt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        editnumcontroltxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                editnumcontroltxtKeyReleased(evt);
            }
        });
        getContentPane().add(editnumcontroltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 232, 150, -1));

        editadeudotxt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(editadeudotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 312, 150, -1));

        agrnumcontroltxt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(agrnumcontroltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 120, -1));

        agrcodlibrotxt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(agrcodlibrotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 120, -1));

        btnagregar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnagregar.setForeground(new java.awt.Color(0, 153, 153));
        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Editar");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ver");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jLabel24.setBackground(new java.awt.Color(0, 204, 204));
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, 170));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Agregar");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Generador de Reportes ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 560, 250));

        jLabel7.setBackground(new java.awt.Color(0, 204, 204));
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 150, 210));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Programa Interactivo Escolar V.1.0");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/interfazbiblioteca.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_aduedoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_aduedoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tabla_aduedoMouseEntered

    private void tabla_aduedoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_aduedoMouseClicked

        try {
            int row = tabla_aduedo.getSelectedRow();
            String Click_Tabla = (tabla_aduedo.getModel().getValueAt(row, 0).toString());
            String Click = "select * from Adeudo_Biblioteca where Folio_Biblioteca = '" + Click_Tabla + "' ";
            pst = conn.prepareStatement(Click);
            rs = pst.executeQuery();

            if (rs.next()) {

                String agregar1 = rs.getString("Numero_Control_Alumno");
                editnumcontroltxt.setText(agregar1);

                String agregar2 = rs.getString("Codigo_Libro");
                editcodlibrotxt.setText(agregar2);

                String agregar3 = rs.getString("Adeudo_Biblioteca");
                editadeudotxt.setText(agregar3);

                String agregar4 = rs.getString("Folio_Biblioteca");
                elimnumerocontroltxt.setText(agregar4);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tabla_aduedoMouseClicked

    private void editnumcontroltxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editnumcontroltxtKeyReleased

        try {

            String search = "SELECT Codigo_Libro,Adeudo_Biblioteca from Adeudo_Biblioteca where Numero_Control_Alumno=?";
            pst = conn.prepareStatement(search);
            pst.setString(1, editnumcontroltxt.getText());

            rs = pst.executeQuery();
            if (rs.next()) {

                String buscar1 = rs.getString("Codigo_Libro");
                editcodlibrotxt.setText(buscar1);

                String buscar2 = rs.getString("Adeudo_Biblioteca");
                editadeudotxt.setText(buscar2);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_editnumcontroltxtKeyReleased

    private void btncambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncambioActionPerformed
        int verificacioncambio = JOptionPane.showConfirmDialog(null, "¿Segudo que desea modificar el registro?", "Modificar", JOptionPane.YES_NO_OPTION);
        if (verificacioncambio == 0) {
            try {
                String editnumc = editnumcontroltxt.getText();
                String editcodlib = editcodlibrotxt.getText();
                String editadeudo = editadeudotxt.getText();

                String edit = "UPDATE Adeudo_Biblioteca set Codigo_Libro='" + editcodlib + "', Adeudo_Biblioteca='" + editadeudo + "' WHERE Numero_Control_Alumno='" + editnumc + "'";
                pst = conn.prepareStatement(edit);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            actualizar_tabla();
        }

    }//GEN-LAST:event_btncambioActionPerformed

    private void elimnumerocontroltxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_elimnumerocontroltxtKeyReleased
        try {

            String buscarfolio2 = "SELECT * from Adeudo_Biblioteca where Folio_Biblioteca=?";
            pst = conn.prepareStatement(buscarfolio2);
            pst.setString(1, elimnumerocontroltxt.getText());
            rs = pst.executeQuery();

            tabla_aduedo.setModel(DbUtils.resultSetToTableModel(rs));

            if (elimnumerocontroltxt.getText().equals("")) {

                String B2 = "SELECT * from Adeudo_Biblioteca";
                pst = conn.prepareStatement(B2);
                rs = pst.executeQuery();

                tabla_aduedo.setModel(DbUtils.resultSetToTableModel(rs));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_elimnumerocontroltxtKeyReleased

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed

        try {
            String agr = "INSERT into Adeudo_Biblioteca (Folio_Biblioteca,Numero_Control_Alumno,Codigo_Libro,Adeudo_Biblioteca) values (?,?,?,?)";
            pst = conn.prepareStatement(agr);
            pst.setString(1, null);
            pst.setString(2, agrnumcontroltxt.getText());
            pst.setString(3, agrcodlibrotxt.getText());
            pst.setString(4, agradeudotxt.getText());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Se Ha Agregado El Adeudo Exitosamente");
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        actualizar_tabla();
    }//GEN-LAST:event_btnagregarActionPerformed

    private void buscarcodigolibrotxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarcodigolibrotxtKeyReleased

        try {

            String buscarcodigolibro = "SELECT * from Adeudo_Biblioteca where Codigo_Libro=?";
            pst = conn.prepareStatement(buscarcodigolibro);
            pst.setString(1, buscarcodigolibrotxt.getText());
            rs = pst.executeQuery();

            tabla_aduedo.setModel(DbUtils.resultSetToTableModel(rs));

            if (buscarcodigolibrotxt.getText().equals("")) {

                String B3 = "SELECT * from Adeudo_Biblioteca";
                pst = conn.prepareStatement(B3);
                rs = pst.executeQuery();

                tabla_aduedo.setModel(DbUtils.resultSetToTableModel(rs));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_buscarcodigolibrotxtKeyReleased

    private void buscarnumerocontroltxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarnumerocontroltxtKeyReleased

        try {

            String buscarnumerocnotrol = "SELECT * from Adeudo_Biblioteca where Numero_Control_Alumno=?";
            pst = conn.prepareStatement(buscarnumerocnotrol);
            pst.setString(1, buscarnumerocontroltxt.getText());
            rs = pst.executeQuery();

            tabla_aduedo.setModel(DbUtils.resultSetToTableModel(rs));

            if (buscarnumerocontroltxt.getText().equals("")) {

                String B3 = "SELECT * from Adeudo_Biblioteca";
                pst = conn.prepareStatement(B3);
                rs = pst.executeQuery();

                tabla_aduedo.setModel(DbUtils.resultSetToTableModel(rs));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_buscarnumerocontroltxtKeyReleased

    private void buscarfoliotxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarfoliotxtKeyReleased

        try {

            String buscarfolio = "SELECT * from Adeudo_Biblioteca where Folio_Biblioteca=?";
            pst = conn.prepareStatement(buscarfolio);
            pst.setString(1, buscarfoliotxt.getText());
            rs = pst.executeQuery();

            tabla_aduedo.setModel(DbUtils.resultSetToTableModel(rs));

            if (buscarfoliotxt.getText().equals("")) {

                String B = "SELECT * from Adeudo_Biblioteca";
                pst = conn.prepareStatement(B);
                rs = pst.executeQuery();

                tabla_aduedo.setModel(DbUtils.resultSetToTableModel(rs));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_buscarfoliotxtKeyReleased
    int editnumc = 0;

    int addo = 0;
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
            java.util.logging.Logger.getLogger(Interfaz_Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Biblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agradeudotxt;
    private javax.swing.JTextField agrcodlibrotxt;
    private javax.swing.JTextField agrnumcontroltxt;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btncambio;
    private javax.swing.JTextField buscarcodigolibrotxt;
    private javax.swing.JTextField buscarfoliotxt;
    private javax.swing.JTextField buscarnumerocontroltxt;
    private javax.swing.JTextField editadeudotxt;
    private javax.swing.JTextField editcodlibrotxt;
    private javax.swing.JTextField editnumcontroltxt;
    private javax.swing.JTextField elimnumerocontroltxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_aduedo;
    // End of variables declaration//GEN-END:variables
}
