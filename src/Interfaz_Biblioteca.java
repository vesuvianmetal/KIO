
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Interfaz_Biblioteca extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    private final int limitenumcontrol = 8;
    private final int limiteadeudo = 6;
    int limitefolio = 11;
    int limitecodlibro = 45;
    int editnumc = 0;
    int addo = 0;

    public Interfaz_Biblioteca() {

        conn = Conexion_BD.conectardb();
        initComponents();
        filltable();
        this.setResizable(false);
    }
    int elimno = 0;

    void actualizar_tabla() {
        try {

            String act = "SELECT * From biblioteca";
            pst = conn.prepareStatement(act);
            rs = pst.executeQuery();

            tabla_aduedo.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    void borrarcsv(){
        try {
            jTextField1.setText("");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    void borrar() {
        try {
            agrnumcontroltxt.setText("");
            agrcodlibrotxt.setText("");
            agradeudotxt.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    void borraredit() {
        try {
            
            editfoliotxt.setText("");
            editnumcontroltxt.setText("");
            editcodlibrotxt.setText("");
            editadeudotxt.setText("");
            elimnumerocontroltxt.setText("");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void filltable() {

        try {

            String B = "SELECT * From biblioteca";
            pst = conn.prepareStatement(B);
            rs = pst.executeQuery();

            tabla_aduedo.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnactualizartabla = new javax.swing.JButton();
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
        jButton3 = new javax.swing.JButton();
        buscarnumerocontroltxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        agradeudotxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        elimnumerocontroltxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        editfoliotxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnactualizartabla.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnactualizartabla.setForeground(new java.awt.Color(0, 153, 153));
        btnactualizartabla.setText("Actualizar");
        btnactualizartabla.setToolTipText("Actualiza La Base De Datos.");
        btnactualizartabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizartablaActionPerformed(evt);
            }
        });
        getContentPane().add(btnactualizartabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, -1, 20));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Adeudo");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Eliminar");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Adeudo:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Folio:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, -1, -1));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Codigo De Libro:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        buscarfoliotxt.setToolTipText("Introducir Folio Para Busqueda.");
        buscarfoliotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarfoliotxtActionPerformed(evt);
            }
        });
        buscarfoliotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarfoliotxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscarfoliotxtKeyTyped(evt);
            }
        });
        getContentPane().add(buscarfoliotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, -1));

        buscarcodigolibrotxt.setToolTipText("Introducir Codigo De Libro Para Busqueda.");
        buscarcodigolibrotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarcodigolibrotxtActionPerformed(evt);
            }
        });
        buscarcodigolibrotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarcodigolibrotxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscarcodigolibrotxtKeyTyped(evt);
            }
        });
        getContentPane().add(buscarcodigolibrotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, -1));

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
                {null, null, null, null},
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
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Buscar");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Codigo de Libro");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jButton3.setText("Eliminar");
        jButton3.setToolTipText("Eliminar El Registro Del Folio Ingresado");
        jButton3.setActionCommand("Eliminar.\n");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, -1, -1));

        buscarnumerocontroltxt.setToolTipText("Introducir Num. Control Para Busqueda.\n");
        buscarnumerocontroltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarnumerocontroltxtActionPerformed(evt);
            }
        });
        buscarnumerocontroltxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarnumerocontroltxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscarnumerocontroltxtKeyTyped(evt);
            }
        });
        getContentPane().add(buscarnumerocontroltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 30));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Codigo de Libro:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, -1));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Folio:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 62, -1, -1));

        agradeudotxt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        agradeudotxt.setToolTipText("No Es Factible Introducir Negativos Dentro Del Adeudo.\n");
        agradeudotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                agradeudotxtKeyTyped(evt);
            }
        });
        getContentPane().add(agradeudotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 130, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Adeudos Biblioteca");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 2, -1, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Numero de Control");
        jLabel17.setToolTipText("Este Campo No Debe Rebasar De 8 Caracteres");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        elimnumerocontroltxt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        elimnumerocontroltxt.setToolTipText("Introducir Numero De Folio Para Eliminar.");
        elimnumerocontroltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elimnumerocontroltxtActionPerformed(evt);
            }
        });
        elimnumerocontroltxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                elimnumerocontroltxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                elimnumerocontroltxtKeyTyped(evt);
            }
        });
        getContentPane().add(elimnumerocontroltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 150, -1));

        jLabel15.setBackground(new java.awt.Color(0, 153, 153));
        jLabel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 190, 100));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Numero De Control:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Folio:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Subir Registros");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setToolTipText("Subir Archivos Delimitado Por Comas (CSV).");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 170, -1));

        editfoliotxt.setEditable(false);
        editfoliotxt.setToolTipText("Editar El Folio Del Registro.");
        editfoliotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                editfoliotxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                editfoliotxtKeyTyped(evt);
            }
        });
        getContentPane().add(editfoliotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 150, -1));

        jButton2.setText("Buscar");
        jButton2.setToolTipText("Buscar Archivos CSV Que Desee Subir A La Base De Datos.\n");
        jButton2.setActionCommand("Buscar.");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, -1, -1));

        jButton1.setText("Guardar");
        jButton1.setToolTipText("Guardar El Archivo CSV A La Base De Datos.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, -1, -1));

        btncambio.setBackground(new java.awt.Color(255, 255, 255));
        btncambio.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btncambio.setForeground(new java.awt.Color(0, 153, 153));
        btncambio.setText("Aplicar Cambios");
        btncambio.setToolTipText("Aplicar Cambios En Los Registros.");
        btncambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncambioActionPerformed(evt);
            }
        });
        getContentPane().add(btncambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 150, -1));

        editcodlibrotxt.setEditable(false);
        editcodlibrotxt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        editcodlibrotxt.setToolTipText("Editar El Codigo Del Libro En El Registro.");
        editcodlibrotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                editcodlibrotxtKeyTyped(evt);
            }
        });
        getContentPane().add(editcodlibrotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 150, -1));

        editnumcontroltxt.setEditable(false);
        editnumcontroltxt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        editnumcontroltxt.setToolTipText("Editar El Num. Control Del Registro.");
        editnumcontroltxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                editnumcontroltxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                editnumcontroltxtKeyTyped(evt);
            }
        });
        getContentPane().add(editnumcontroltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 150, -1));

        editadeudotxt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        editadeudotxt.setToolTipText("Este Campo Solo Registra Numeros. No Introducir Numeros Negativos.");
        editadeudotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                editadeudotxtKeyTyped(evt);
            }
        });
        getContentPane().add(editadeudotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 150, -1));

        agrnumcontroltxt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        agrnumcontroltxt.setToolTipText("Para Agregar Este Campo No Debe Exceder 8 Caracteres.");
        agrnumcontroltxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                agrnumcontroltxtKeyTyped(evt);
            }
        });
        getContentPane().add(agrnumcontroltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 130, -1));

        agrcodlibrotxt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        agrcodlibrotxt.setToolTipText("Para Agregar Este Campo No Debe Exceder 45 Caracteres.");
        agrcodlibrotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                agrcodlibrotxtKeyTyped(evt);
            }
        });
        getContentPane().add(agrcodlibrotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 130, -1));

        btnagregar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnagregar.setForeground(new java.awt.Color(0, 153, 153));
        btnagregar.setText("Agregar");
        btnagregar.setToolTipText("Agregar Un Nuevo Registro.\n");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

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
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 150, 170));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Agregar");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Generador de Reportes ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 560, 250));

        jLabel7.setBackground(new java.awt.Color(0, 204, 204));
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 150, 210));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Programa Interactivo Escolar V.1.0");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/interfazbiblioteca.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_aduedoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_aduedoMouseEntered
        
    }//GEN-LAST:event_tabla_aduedoMouseEntered

    private void tabla_aduedoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_aduedoMouseClicked

        try {
            int row = tabla_aduedo.getSelectedRow();
            String Click_Tabla = (tabla_aduedo.getModel().getValueAt(row, 0).toString());
            String Click = "SELECT * From biblioteca where FOLIO_BIBLIOTECA = '" + Click_Tabla + "' ";
            pst = conn.prepareStatement(Click);
            rs = pst.executeQuery();

            if (rs.next()) {

                String agregar1 = rs.getString("FK_NUMERO_CONTROL_BIBLIOTECA");
                editnumcontroltxt.setText(agregar1);

                String agregar2 = rs.getString("CODIGO_LIBRO");
                editcodlibrotxt.setText(agregar2);

                String agregar3 = rs.getString("ADEUDO");
                editadeudotxt.setText(agregar3);

                String agregar4 = rs.getString("FOLIO_BIBLIOTECA");
                editfoliotxt.setText(agregar4);
           
                String agregar5 = rs.getString("FOLIO_BIBLIOTECA");
                elimnumerocontroltxt.setText(agregar5);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tabla_aduedoMouseClicked

    private void editnumcontroltxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editnumcontroltxtKeyReleased

        try {

            String search = "SELECT CODIGO_LIBRO,ADEUDO from biblioteca where FK_NUMERO_CONTROL_BIBLIOTECA=?";
            pst = conn.prepareStatement(search);
            pst.setString(1, editnumcontroltxt.getText());

            rs = pst.executeQuery();
            if (rs.next()) {

                String buscar1 = rs.getString("CODIGO_LIBRO");
                editcodlibrotxt.setText(buscar1);

                String buscar2 = rs.getString("ADEUDO");
                editadeudotxt.setText(buscar2);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_editnumcontroltxtKeyReleased

    private void btncambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncambioActionPerformed
        int verificacioncambio = JOptionPane.showConfirmDialog(null, "¿Seguro que desea modificar el registro?", "Modificar", JOptionPane.YES_NO_OPTION);
        try {
            if (editfoliotxt.getText().equals("") || editnumcontroltxt.getText().equals("") || editcodlibrotxt.getText().equals("") || editadeudotxt.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Hay Uno o Varios Campos Vacios", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (Integer.parseInt(editadeudotxt.getText()) < 1) {
                JOptionPane.showMessageDialog(null, "El Campo De Aduedo No Puede Ser Negativo");
            } else if (verificacioncambio == JOptionPane.YES_OPTION) {
                try {
                    String editnumc = editnumcontroltxt.getText();
                    String editcodlib = editcodlibrotxt.getText();
                    String editadeudo = editadeudotxt.getText();
                    String editfolio = editfoliotxt.getText();

                    String edit = "UPDATE biblioteca set CODIGO_LIBRO='" + editcodlib + "', ADEUDO='" + editadeudo + "' WHERE FOLIO_BIBLIOTECA='" + editfolio + "'";
                    pst = conn.prepareStatement(edit);
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Modificado Exitosamente");

                } catch (SQLException | HeadlessException e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            } else if (verificacioncambio == JOptionPane.NO_OPTION) {

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        actualizar_tabla();
        borraredit();
    }//GEN-LAST:event_btncambioActionPerformed

    private void elimnumerocontroltxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_elimnumerocontroltxtKeyReleased
        try {

            String buscarfolio2 = "SELECT * from biblioteca where FOLIO_BIBLIOTECA=?";
            pst = conn.prepareStatement(buscarfolio2);
            pst.setString(1, elimnumerocontroltxt.getText());
            rs = pst.executeQuery();

            tabla_aduedo.setModel(DbUtils.resultSetToTableModel(rs));

            if (elimnumerocontroltxt.getText().equals("")) {

                String B2 = "SELECT * from biblioteca";
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
             if ((agrnumcontroltxt.getText().equals("") || agrcodlibrotxt.getText().equals("")) || agradeudotxt.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Hay Uno o Varios Campos Vacio", "No Se Puedo Modificar El Registro", JOptionPane.ERROR_MESSAGE);
            } 
             else if (Integer.parseInt(agradeudotxt.getText()) < 1.00) {
                JOptionPane.showMessageDialog(null, "El Campo De Aduedo No Puede Ser Negativo");
            }else   {
                try {
                    String agr = "INSERT into biblioteca (FOLIO_BIBLIOTECA,CODIGO_LIBRO,ADEUDO,FK_NUMERO_CONTROL_BIBLIOTECA) values (?,?,?,?)";
                    pst = conn.prepareStatement(agr);
                    pst.setString(1, null);
                    pst.setString(4, agrnumcontroltxt.getText());
                    pst.setString(2, agrcodlibrotxt.getText());
                    pst.setInt(3, Integer.parseInt(agradeudotxt.getText()));
                    
                    pst.execute();
                    
                    JOptionPane.showMessageDialog(null, "Se Ha Agregado El Adeudo Exitosamente");
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        actualizar_tabla();
        borrar();

    }//GEN-LAST:event_btnagregarActionPerformed

    private void buscarcodigolibrotxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarcodigolibrotxtKeyReleased

        try {

            String buscarcodigolibro = "SELECT * from biblioteca where CODIGO_LIBRO=?";
            pst = conn.prepareStatement(buscarcodigolibro);
            pst.setString(1, buscarcodigolibrotxt.getText());
            rs = pst.executeQuery();

            tabla_aduedo.setModel(DbUtils.resultSetToTableModel(rs));

            if (buscarcodigolibrotxt.getText().equals("")) {

                String B3 = "SELECT * from biblioteca";
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

            String buscarnumerocnotrol = "SELECT * from biblioteca where FK_NUMERO_CONTROL_BIBLIOTECA=?";
            pst = conn.prepareStatement(buscarnumerocnotrol);
            pst.setString(1, buscarnumerocontroltxt.getText());
            rs = pst.executeQuery();

            tabla_aduedo.setModel(DbUtils.resultSetToTableModel(rs));

            if (buscarnumerocontroltxt.getText().equals("")) {

                String B3 = "SELECT * from biblioteca";
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

            String buscarfolio = "SELECT * from biblioteca where FOLIO_BIBLIOTECA=?";
            pst = conn.prepareStatement(buscarfolio);
            pst.setString(1, buscarfoliotxt.getText());
            rs = pst.executeQuery();

            tabla_aduedo.setModel(DbUtils.resultSetToTableModel(rs));

            if (buscarfoliotxt.getText().equals("")) {

                String B = "SELECT * from biblioteca";
                pst = conn.prepareStatement(B);
                rs = pst.executeQuery();

                tabla_aduedo.setModel(DbUtils.resultSetToTableModel(rs));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_buscarfoliotxtKeyReleased
    String nombrearchivo;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            JFileChooser escoger = new JFileChooser();
            escoger.showOpenDialog(null);
            File f = escoger.getSelectedFile();
            nombrearchivo = f.getAbsolutePath();

            jTextField1.setText(nombrearchivo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }



    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            if (jTextField1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No Hay Un Archivo CSV Que Guardar", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                BufferedReader br = new BufferedReader(new FileReader(nombrearchivo));
                String line;

                while ((line = br.readLine()) != null) {
                    String[] value = line.split(","); //separador de valor
                    String sql = "insert into biblioteca (FK_NUMERO_CONTROL_BIBLIOTECA,CODIGO_LIBRO,ADEUDO) Values('" + value[0] + "','" + value[1] + "','" + value[2] + "')";
                    pst = conn.prepareStatement(sql);
                    pst.executeUpdate();
                }
                br.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        actualizar_tabla();
        borrarcsv();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int a = JOptionPane.showConfirmDialog(null, "Está Seguro Que Deseea Salir?");
        try {
            if (a == JOptionPane.YES_OPTION) {
            this.dispose();
            login metodo1 = new login();
            metodo1.setVisible(true);
        }
            else if (a==JOptionPane.NO_OPTION){
                
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
            
    }//GEN-LAST:event_formWindowClosing

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String elim = "DELETE from biblioteca where FOLIO_BIBLIOTECA=?";
        int verificacion = JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar el registro?", "Borrar", JOptionPane.YES_NO_OPTION);

        try {
            if (elimnumerocontroltxt.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "No Hay Registro Ingresado", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (verificacion == JOptionPane.YES_OPTION) {

                try {
                    pst = conn.prepareStatement(elim);
                    pst.setString(1, elimnumerocontroltxt.getText());
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Deuda Eliminada");
                } catch (SQLException | HeadlessException e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            } else if (verificacion == JOptionPane.NO_OPTION) {

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        actualizar_tabla();
        borraredit();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void agrnumcontroltxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agrnumcontroltxtKeyTyped
        try {
            if (agrnumcontroltxt.getText().length() == limitenumcontrol) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud De 8 Caracteres");
            }

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_agrnumcontroltxtKeyTyped

    private void editadeudotxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editadeudotxtKeyTyped
char c = evt.getKeyChar();
           
        try {

            if (editadeudotxt.getText().length() == limiteadeudo) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud De 6 Caracteres");
            }
            

            if (Character.isLetter(c)) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Caracteres Numericos");

            }
           
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }

    }//GEN-LAST:event_editadeudotxtKeyTyped

    private void editnumcontroltxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editnumcontroltxtKeyTyped
        try {

            if (editnumcontroltxt.getText().length() == limitenumcontrol) {
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud De 8 Caracteres");
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }//GEN-LAST:event_editnumcontroltxtKeyTyped

    private void elimnumerocontroltxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_elimnumerocontroltxtKeyTyped
        try {
            if (elimnumerocontroltxt.getText().length() == limitenumcontrol) {
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud De 8 Caracteres");
            }

            char c = evt.getKeyChar();

            if (Character.isLetter(c)) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Caracteres Numericos");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_elimnumerocontroltxtKeyTyped

    private void buscarfoliotxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarfoliotxtKeyTyped
        try {
            if (buscarfoliotxt.getText().length() == limitefolio) {
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud De 11 Caracteres");
            }

            int c = evt.getKeyChar();
            if (Character.isLetter(c)) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Caracteres Numericos");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_buscarfoliotxtKeyTyped

    private void buscarnumerocontroltxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarnumerocontroltxtKeyTyped
        try {
            if (buscarnumerocontroltxt.getText().length() == limitenumcontrol) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud De 8 Caracteres");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_buscarnumerocontroltxtKeyTyped

    private void agradeudotxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agradeudotxtKeyTyped
        try {

            if (agradeudotxt.getText().length() == limiteadeudo) {
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud De 45 Caracteres");
            }

            int c = evt.getKeyChar();

            if (Character.isLetter(c)) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Caracteres Numericos");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_agradeudotxtKeyTyped

    private void btnactualizartablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizartablaActionPerformed
        try {
            actualizar_tabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnactualizartablaActionPerformed

    private void editfoliotxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editfoliotxtKeyTyped
        try {
            if (editfoliotxt.getText().length() == limitefolio) {
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud De 11 Caracteres");
            }

            char c = evt.getKeyChar();

            if (Character.isLetter(c)) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Caracteres Numericos");

            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }//GEN-LAST:event_editfoliotxtKeyTyped

    private void editfoliotxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editfoliotxtKeyReleased

        try {

            String buscarfolio = "SELECT * from biblioteca where FOLIO_BIBLIOTECA=?";
            pst = conn.prepareStatement(buscarfolio);
            pst.setString(1, editfoliotxt.getText());
            rs = pst.executeQuery();

            tabla_aduedo.setModel(DbUtils.resultSetToTableModel(rs));

            if (editfoliotxt.getText().equals("")) {

                String B = "SELECT * from biblioteca";
                pst = conn.prepareStatement(B);
                rs = pst.executeQuery();

                tabla_aduedo.setModel(DbUtils.resultSetToTableModel(rs));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_editfoliotxtKeyReleased

    private void buscarcodigolibrotxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarcodigolibrotxtKeyTyped
        try {
            if (buscarcodigolibrotxt.getText().length() == limitecodlibro) {
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud De 45 Caracteres");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_buscarcodigolibrotxtKeyTyped

    private void buscarnumerocontroltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarnumerocontroltxtActionPerformed


    }//GEN-LAST:event_buscarnumerocontroltxtActionPerformed

    private void buscarfoliotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarfoliotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarfoliotxtActionPerformed

    private void buscarcodigolibrotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarcodigolibrotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarcodigolibrotxtActionPerformed

    private void agrcodlibrotxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agrcodlibrotxtKeyTyped
        try {
            if (agrcodlibrotxt.getText().length() == limitecodlibro) {
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud De 45 Caracteres");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_agrcodlibrotxtKeyTyped

    private void editcodlibrotxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editcodlibrotxtKeyTyped
        try {
            if (editcodlibrotxt.getText().length() == limitecodlibro) {
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud De 45 Caracteres");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_editcodlibrotxtKeyTyped

    private void elimnumerocontroltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elimnumerocontroltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elimnumerocontroltxtActionPerformed
   

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
    private javax.swing.JButton btnactualizartabla;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btncambio;
    private javax.swing.JTextField buscarcodigolibrotxt;
    private javax.swing.JTextField buscarfoliotxt;
    private javax.swing.JTextField buscarnumerocontroltxt;
    private javax.swing.JTextField editadeudotxt;
    private javax.swing.JTextField editcodlibrotxt;
    private javax.swing.JTextField editfoliotxt;
    private javax.swing.JTextField editnumcontroltxt;
    private javax.swing.JTextField elimnumerocontroltxt;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabla_aduedo;
    // End of variables declaration//GEN-END:variables
}
