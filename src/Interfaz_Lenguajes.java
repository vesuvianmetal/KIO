
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Interfaz_Lenguajes extends javax.swing.JFrame {

  Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    int limitebuscarfolioidiomas = 11;
    int limitecertificadoidiomas = 45;
    int limitecalificacionidiomas = 3;
    int limitenumcontrolidiomas = 8;
    public Interfaz_Lenguajes() {
        conn = Conexion_BD.conectardb();
         
      
        initComponents();
        filltableidiomas();
        this.setResizable(false);
    }

     void actualizar_tablaidiomas() {
        try {

            String acti = "SELECT * From idiomas";
            pst = conn.prepareStatement(acti);
            rs = pst.executeQuery();

            tablaidiomas.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     void filltableidiomas() {

        try {

            String Bi = "SELECT * From idiomas";
            pst = conn.prepareStatement(Bi);
            rs = pst.executeQuery();

            tablaidiomas.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        edit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        elim = new javax.swing.JLabel();
        ve = new javax.swing.JLabel();
        trytofind = new javax.swing.JLabel();
        btnagregaridiomas = new javax.swing.JButton();
        fol = new javax.swing.JLabel();
        buscarfolioidiomatxt = new javax.swing.JTextField();
        pie = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        generador = new javax.swing.JLabel();
        tablavalores = new javax.swing.JScrollPane();
        tablaidiomas = new javax.swing.JTable();
        buscarnumeroidiomatxt = new javax.swing.JTextField();
        numcontrol2 = new javax.swing.JLabel();
        areabucar = new javax.swing.JLabel();
        editfolioidiomas = new javax.swing.JTextField();
        numcontrol = new javax.swing.JLabel();
        editcertitxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        calif = new javax.swing.JLabel();
        btneditaridioma = new javax.swing.JButton();
        editcaliidiomatxt = new javax.swing.JTextField();
        tipcalif = new javax.swing.JLabel();
        eliminarfolioidiomastxt = new javax.swing.JTextField();
        fol1 = new javax.swing.JLabel();
        areaeliminar = new javax.swing.JLabel();
        areaeditar = new javax.swing.JLabel();
        tipcalif1 = new javax.swing.JLabel();
        calif1 = new javax.swing.JLabel();
        numcontrol1 = new javax.swing.JLabel();
        numconag = new javax.swing.JTextField();
        textcalifagr = new javax.swing.JTextField();
        texttipoag = new javax.swing.JTextField();
        areaagregar = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 153, 153));
        jButton5.setText("Actualizar");
        jButton5.setToolTipText("Actualizar La Base De Datos.");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, -1, 20));

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Borrar");
        jButton1.setToolTipText("Confirmar Eliminacion De Registro Por Numero De Folio.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        edit.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("Editar");
        getContentPane().add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Agregar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        elim.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        elim.setForeground(new java.awt.Color(255, 255, 255));
        elim.setText("Eliminar");
        getContentPane().add(elim, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        ve.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ve.setForeground(new java.awt.Color(255, 255, 255));
        ve.setText("Ver");
        getContentPane().add(ve, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        trytofind.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        trytofind.setForeground(new java.awt.Color(255, 255, 255));
        trytofind.setText("Buscar");
        getContentPane().add(trytofind, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        btnagregaridiomas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/palomitafeliz.png"))); // NOI18N
        btnagregaridiomas.setToolTipText("Confirmar Nuevos Registros.");
        btnagregaridiomas.setBorder(null);
        btnagregaridiomas.setBorderPainted(false);
        btnagregaridiomas.setContentAreaFilled(false);
        btnagregaridiomas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnagregaridiomas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/palomitagrande.png"))); // NOI18N
        btnagregaridiomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregaridiomasActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregaridiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 60, 40));

        fol.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        fol.setForeground(new java.awt.Color(255, 255, 255));
        fol.setText("Folio:");
        getContentPane().add(fol, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        buscarfolioidiomatxt.setToolTipText("Introducir Folio Para Busqueda.");
        buscarfolioidiomatxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarfolioidiomatxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscarfolioidiomatxtKeyTyped(evt);
            }
        });
        getContentPane().add(buscarfolioidiomatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 130, 30));

        pie.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        pie.setForeground(new java.awt.Color(255, 255, 255));
        pie.setText("Programa Interactivo Escolar PIE V1.0");
        getContentPane().add(pie, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        titulo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Centro de Idiomas");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, -1, -1));

        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 153));
        jButton3.setText("Buscar");
        jButton3.setToolTipText("Buscar Dentro De La Base De Datos.");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        generador.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        generador.setForeground(new java.awt.Color(255, 255, 255));
        generador.setText("Generador de Reportes");
        getContentPane().add(generador, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, 20));

        tablaidiomas.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        tablaidiomas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Folio", "Tipo de Certificación", "Calificación", "Numero de Control"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaidiomas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaidiomasMouseClicked(evt);
            }
        });
        tablavalores.setViewportView(tablaidiomas);

        getContentPane().add(tablavalores, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 540, 140));

        buscarnumeroidiomatxt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        buscarnumeroidiomatxt.setToolTipText("Introducir Num. Control Para Busqueda.");
        buscarnumeroidiomatxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarnumeroidiomatxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscarnumeroidiomatxtKeyTyped(evt);
            }
        });
        getContentPane().add(buscarnumeroidiomatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 130, 30));

        numcontrol2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        numcontrol2.setForeground(new java.awt.Color(255, 255, 255));
        numcontrol2.setText("Numero de Control:");
        getContentPane().add(numcontrol2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        areabucar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        getContentPane().add(areabucar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 190, 180));

        editfolioidiomas.setEditable(false);
        editfolioidiomas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        editfolioidiomas.setToolTipText("Modificar El Numero De Folio.");
        editfolioidiomas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                editfolioidiomasKeyTyped(evt);
            }
        });
        getContentPane().add(editfolioidiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 130, 30));

        numcontrol.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        numcontrol.setForeground(new java.awt.Color(255, 255, 255));
        numcontrol.setText("Folio:");
        getContentPane().add(numcontrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, -1, -1));

        editcertitxt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        editcertitxt.setToolTipText("Modificar El Tipo De Certificacion. ");
        editcertitxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                editcertitxtKeyTyped(evt);
            }
        });
        getContentPane().add(editcertitxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 130, 30));

        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 150, 150));
        jButton2.setText("Limpiar Campos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, 20));

        calif.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        calif.setForeground(new java.awt.Color(255, 255, 255));
        calif.setText("Calificación:");
        getContentPane().add(calif, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, -1, -1));

        btneditaridioma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/palomitafeliz.png"))); // NOI18N
        btneditaridioma.setToolTipText("Confirmar Modificaciones Dentro De Los Datos.");
        btneditaridioma.setBorder(null);
        btneditaridioma.setBorderPainted(false);
        btneditaridioma.setContentAreaFilled(false);
        btneditaridioma.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btneditaridioma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/palomitagrande.png"))); // NOI18N
        btneditaridioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditaridiomaActionPerformed(evt);
            }
        });
        getContentPane().add(btneditaridioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 60, 40));

        editcaliidiomatxt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        editcaliidiomatxt.setToolTipText("Modificar La Calificacion Asignada.");
        editcaliidiomatxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                editcaliidiomatxtKeyTyped(evt);
            }
        });
        getContentPane().add(editcaliidiomatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 130, 30));

        tipcalif.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tipcalif.setForeground(new java.awt.Color(255, 255, 255));
        tipcalif.setText("Tipo de Certificación:");
        getContentPane().add(tipcalif, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 150, 20));

        eliminarfolioidiomastxt.setToolTipText("Numero De Folio A Eliminar.");
        eliminarfolioidiomastxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eliminarfolioidiomastxtKeyTyped(evt);
            }
        });
        getContentPane().add(eliminarfolioidiomastxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 130, 30));

        fol1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        fol1.setForeground(new java.awt.Color(255, 255, 255));
        fol1.setText("Folio:");
        getContentPane().add(fol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        areaeliminar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        getContentPane().add(areaeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 150, 190));

        areaeditar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        getContentPane().add(areaeditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 300, 190));

        tipcalif1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tipcalif1.setForeground(new java.awt.Color(255, 255, 255));
        tipcalif1.setText("Tipo de Certificación:");
        getContentPane().add(tipcalif1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 150, 20));

        calif1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        calif1.setForeground(new java.awt.Color(255, 255, 255));
        calif1.setText("Calificación:");
        getContentPane().add(calif1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        numcontrol1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        numcontrol1.setForeground(new java.awt.Color(255, 255, 255));
        numcontrol1.setText("Numero de Control:");
        getContentPane().add(numcontrol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));

        numconag.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        numconag.setToolTipText("Agregar Num. Control.");
        numconag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numconagKeyTyped(evt);
            }
        });
        getContentPane().add(numconag, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 100, 30));

        textcalifagr.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        textcalifagr.setToolTipText("Agregar Calificacion Lograda.");
        textcalifagr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textcalifagrActionPerformed(evt);
            }
        });
        textcalifagr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textcalifagrKeyTyped(evt);
            }
        });
        getContentPane().add(textcalifagr, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 100, 30));

        texttipoag.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        texttipoag.setToolTipText("Agregar Tipo De Certificacion.");
        texttipoag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                texttipoagKeyTyped(evt);
            }
        });
        getContentPane().add(texttipoag, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 100, 30));

        areaagregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        getContentPane().add(areaagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 270, 190));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/logoconstancia.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, -20, 80, 120));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/interfazbiblioteca.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
int a=JOptionPane.showConfirmDialog(null,"Está Seguro Que Deseea Salir?");
            if(a==JOptionPane.YES_OPTION){
                this.dispose();
                login metodo1=new login();
              metodo1.setVisible(true);
            }      
    }//GEN-LAST:event_formWindowClosing

    private void btnagregaridiomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregaridiomasActionPerformed
         
         try {
             
             if (Integer.parseInt(textcalifagr.getText()) < 1.00) {
                JOptionPane.showMessageDialog(null, "El Campo De Aduedo No Puede Ser Negativo");
             } else if (texttipoag.getText().equals("") || textcalifagr.getText().equals("") || numconag.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Hay Uno o Varios Campos Vacio", "No Se Puedo Modificar El Registro", JOptionPane.ERROR_MESSAGE);
             }else  {
                try {
            String agr = "INSERT into idiomas (FOLIO_IDIOMAS,TIPO_CERT,CALIFICACION,FK_NUM_CONTROL) values (?,?,?,?)";
            pst = conn.prepareStatement(agr);
            pst.setString(1, null);
            pst.setString(4, numconag.getText());
            pst.setString(2, texttipoag.getText());
            pst.setString(3, textcalifagr.getText());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Se Ha Agregado El Adeudo Exitosamente");
                } catch (Exception e){
                   JOptionPane.showMessageDialog(null, e);
                }
                actualizar_tablaidiomas();
             }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    
    }//GEN-LAST:event_btnagregaridiomasActionPerformed

    private void btneditaridiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditaridiomaActionPerformed
       int verificacioncambio = JOptionPane.showConfirmDialog(null, "¿Seguro que desea modificar el registro?", "Modificar", JOptionPane.YES_NO_OPTION);
        
       if (editcertitxt.getText().equals("") || editcaliidiomatxt.getText().equals("") || editfolioidiomas.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Hay Uno o Varios Campos Vacios");
       } else if (verificacioncambio == 0){
       
       
            try {
                String edittipocerti = editcertitxt.getText();
                String editcali = editcaliidiomatxt.getText();
                //String editnumcontrol = editfolioidiomas.getText();
                String editfolio = editfolioidiomas.getText();
                

                String edit = "UPDATE idiomas set TIPO_CERT='" + edittipocerti + "', CALIFICACION='" + editcali + "' WHERE FOLIO_IDIOMAS='" + editfolio + "'";
                pst = conn.prepareStatement(edit);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
           actualizar_tablaidiomas();
        
       }
                
    }//GEN-LAST:event_btneditaridiomaActionPerformed

    private void tablaidiomasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaidiomasMouseClicked
        // TODO add your handling code here:
        
        
        try {
            int row = tablaidiomas.getSelectedRow();
            String Click_Tabla = (tablaidiomas.getModel().getValueAt(row, 0).toString());
            String Click = "SELECT * From idiomas where FOLIO_IDIOMAS = '" + Click_Tabla + "' ";
            pst = conn.prepareStatement(Click);
            rs = pst.executeQuery();

            if (rs.next()) {

                String agregar1 = rs.getString("FOLIO_IDIOMAS");
                eliminarfolioidiomastxt.setText(agregar1);

                String agregar2 = rs.getString("TIPO_CERT");
                texttipoag.setText(agregar2);

                String agregar3 = rs.getString("CALIFICACION");
                textcalifagr.setText(agregar3);

                String agregar4 = rs.getString("FK_NUM_CONTROL");
                numconag.setText(agregar4);
                
                String agregar5 = rs.getString("TIPO_CERT");
                editcertitxt.setText(agregar5);
                
                String agregar6 = rs.getString("CALIFICACION");
                editcaliidiomatxt.setText(agregar6);
                
                String agregar7 = rs.getString("FOLIO_IDIOMAS");
               editfolioidiomas.setText(agregar7);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tablaidiomasMouseClicked

    private void buscarfolioidiomatxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarfolioidiomatxtKeyReleased
        // TODO add your handling code here:
        
        try {

            String buscarfolio = "SELECT * from idiomas where FOLIO_IDIOMAS=?";
            pst = conn.prepareStatement(buscarfolio);
            pst.setString(1, buscarfolioidiomatxt.getText());
            rs = pst.executeQuery();

            tablaidiomas.setModel(DbUtils.resultSetToTableModel(rs));

            if (buscarfolioidiomatxt.getText().equals("")) {

                String B = "SELECT * from idiomas";
                pst = conn.prepareStatement(B);
                rs = pst.executeQuery();

                tablaidiomas.setModel(DbUtils.resultSetToTableModel(rs));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_buscarfolioidiomatxtKeyReleased

    private void buscarnumeroidiomatxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarnumeroidiomatxtKeyReleased

        
         try {

            String buscarnumerocnotrol = "SELECT * from idiomas where FK_NUM_CONTROL=?";
            pst = conn.prepareStatement(buscarnumerocnotrol);
            pst.setString(1, buscarnumeroidiomatxt.getText());
            rs = pst.executeQuery();

            tablaidiomas.setModel(DbUtils.resultSetToTableModel(rs));

            if (buscarnumeroidiomatxt.getText().equals("")) {

                String B3 = "SELECT * from idiomas";
                pst = conn.prepareStatement(B3);
                rs = pst.executeQuery();

                tablaidiomas.setModel(DbUtils.resultSetToTableModel(rs));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //
    }//GEN-LAST:event_buscarnumeroidiomatxtKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
//Interfaz_Biblioteca vp=new Interfaz_Biblioteca();
 //       vp.actualizar_tabla();
 actualizar_tablaidiomas();// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        int verificacion = JOptionPane.showConfirmDialog(null, "¿Segudo que desea eliminar el registro?", "Borrar", JOptionPane.YES_NO_OPTION);
        if (verificacion == 0) {
            String elim = "DELETE from idiomas where FOLIO_IDIOMAS=?";
            try {
                pst = conn.prepareStatement(elim);
                pst.setString(1, eliminarfolioidiomastxt.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Deuda Eliminada");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            actualizar_tablaidiomas();
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buscarfolioidiomatxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarfolioidiomatxtKeyTyped

        int c=evt.getKeyChar();
       try {
           if (buscarfolioidiomatxt.getText().length()==limitebuscarfolioidiomas){
    evt.consume();
    JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud De 11 Caracteres","Error",JOptionPane.ERROR_MESSAGE);
}      
           if(Character.isLetter(c)){
               getToolkit().beep();
               evt.consume();
               JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Caracteres Numericos");
           }
           
       } catch (Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
        
    }//GEN-LAST:event_buscarfolioidiomatxtKeyTyped

    private void buscarnumeroidiomatxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarnumeroidiomatxtKeyTyped
       
       
       try {
           
           if (buscarnumeroidiomatxt.getText().length() == limitenumcontrolidiomas) {
               evt.consume();
               JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud De 8 Caracteres", "Error", JOptionPane.ERROR_MESSAGE);
}  
           
           
           
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_buscarnumeroidiomatxtKeyTyped

    private void eliminarfolioidiomastxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eliminarfolioidiomastxtKeyTyped
        int c = evt.getKeyChar();

        try {

            if (eliminarfolioidiomastxt.getText().length() == limitebuscarfolioidiomas) {
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud De 11 Caracteres");
            }
            if (Character.isLetter(c)) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Caracteres Numericos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_eliminarfolioidiomastxtKeyTyped

    private void textcalifagrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textcalifagrKeyTyped
       int c= evt.getKeyChar();
       try 
       {
        if (textcalifagr.getText().length() == limitecalificacionidiomas) {
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud De 3 Caracteres");
            }
           if(Character.isLetter(c)){
               getToolkit().beep();
               evt.consume();
               JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Caracteres Numericos");
           }
           
       } catch (Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_textcalifagrKeyTyped

    private void texttipoagKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texttipoagKeyTyped
         int c = evt.getKeyChar();

        try {

            if (texttipoag.getText().length() == limitecertificadoidiomas) {
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud De 45 Caracteres");
            }
            if (Character.isDigit(c)) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Caracteres Alphabeticos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_texttipoagKeyTyped

    private void numconagKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numconagKeyTyped
       
        
        try {
            
             if (numconag.getText().length() == limitenumcontrolidiomas) {
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud De 8 Caracteres");
            }
            
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
        
    }//GEN-LAST:event_numconagKeyTyped

    private void editcertitxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editcertitxtKeyTyped
        
        try {
           
            
            if (editcertitxt.getText().length() == limitecertificadoidiomas) {
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud De 45 Caracteres");
            }
            
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_editcertitxtKeyTyped

    private void editcaliidiomatxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editcaliidiomatxtKeyTyped
        
       int c=evt.getKeyChar();
                
                try {
                    if (editcaliidiomatxt.getText().length() == limitecalificacionidiomas) {
                        evt.consume();
                        JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud De 10 Caracteres");
                    }
                    
                    if (Character.isLetter(c)){
                        evt.consume();
                        getToolkit().beep();
                        JOptionPane.showMessageDialog(null, "Error", "Este Campo Solo Acepta Caracteres Numericos", JOptionPane.ERROR_MESSAGE);
                    }
                    
                    
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
        
        
    }//GEN-LAST:event_editcaliidiomatxtKeyTyped

    private void editfolioidiomasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editfolioidiomasKeyTyped
      
              
              try {
                  
                 if (editfolioidiomas.getText().length() == limitebuscarfolioidiomas) {
                        evt.consume();
                        JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud De 11 Caracteres");
                    } 
                  
                  
              }catch (Exception e){
                  JOptionPane.showMessageDialog(null, evt);
              }
              
    }//GEN-LAST:event_editfolioidiomasKeyTyped

    private void textcalifagrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textcalifagrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textcalifagrActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
buscarfolioidiomatxt.setText(""); 
buscarnumeroidiomatxt.setText(""); 
eliminarfolioidiomastxt.setText(""); 
texttipoag.setText(""); 
textcalifagr.setText(""); 
numconag.setText(""); 
editcertitxt.setText(""); 
editcaliidiomatxt.setText(""); 
editfolioidiomas.setText(""); 
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton btnagregaridiomas;
    private javax.swing.JButton btneditaridioma;
    private javax.swing.JTextField buscarfolioidiomatxt;
    private javax.swing.JTextField buscarnumeroidiomatxt;
    private javax.swing.JLabel calif;
    private javax.swing.JLabel calif1;
    private javax.swing.JLabel edit;
    private javax.swing.JTextField editcaliidiomatxt;
    private javax.swing.JTextField editcertitxt;
    private javax.swing.JTextField editfolioidiomas;
    private javax.swing.JLabel elim;
    private javax.swing.JTextField eliminarfolioidiomastxt;
    private javax.swing.JLabel fol;
    private javax.swing.JLabel fol1;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel generador;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField numconag;
    private javax.swing.JLabel numcontrol;
    private javax.swing.JLabel numcontrol1;
    private javax.swing.JLabel numcontrol2;
    private javax.swing.JLabel pie;
    private javax.swing.JTable tablaidiomas;
    private javax.swing.JScrollPane tablavalores;
    private javax.swing.JTextField textcalifagr;
    private javax.swing.JTextField texttipoag;
    private javax.swing.JLabel tipcalif;
    private javax.swing.JLabel tipcalif1;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel trytofind;
    private javax.swing.JLabel ve;
    // End of variables declaration//GEN-END:variables
}
