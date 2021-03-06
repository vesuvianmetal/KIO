
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Interfaz_Admin extends javax.swing.JFrame {
Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    private Component jButton6;
    
    public Interfaz_Admin() {
       conn = Conexion_BD.conectardb();
        initComponents();
        filltable();
        this.setResizable(false);
    }
    void actualizar_tabla() {
        try {

            String act = "select * FROM USUARIOS";
            pst = conn.prepareStatement(act);
            rs = pst.executeQuery();

            tabla_admin.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    void filltable() {

        try {

            String act = "select * FROM USUARIOS";
            pst = conn.prepareStatement(act);
            rs = pst.executeQuery();

            tabla_admin.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    
    void borraragrtxt() {
        try {
            inserta_idusuario.setText("");
            inserta_usuario.setText("");
            inserta_contrasena.setText("");
            inserta_tipo_usuario.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    void borrartxtmod() {
        try {
            modificar_idusuario.setText("");
            modifica_contrasena.setText("");
            modifica_tipo_usuario.setText("");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    void borrartxtelim() {
        try {
            eliminaid_usuario.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_admin = new javax.swing.JTable();
        eliminar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        modificar_idusuario = new javax.swing.JTextField();
        modifica_contrasena = new javax.swing.JTextField();
        modifica_tipo_usuario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        boton_biblioteca = new javax.swing.JButton();
        boton_caja = new javax.swing.JButton();
        boton_idiomas = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        actualizar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Modificar_Botones = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        eliminaid_usuario = new javax.swing.JTextField();
        Eliminar_Botones = new javax.swing.JLabel();
        control_escolar = new javax.swing.JButton();
        insetar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        inserta_usuario = new javax.swing.JTextField();
        inserta_idusuario = new javax.swing.JTextField();
        inserta_contrasena = new javax.swing.JTextField();
        inserta_tipo_usuario = new javax.swing.JTextField();
        Bitacora = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        Vistas_usuario = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Agregar_Botones = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        jLabel13.setText("jLabel13");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_admin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tabla_admin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID_Usuario", "Usuario", "Contraseña", "Tipo de  Usuario"
            }
        ));
        tabla_admin.setToolTipText("En Esta Tabla Se Muestran Los Registros De La Base De Datos De Usuarios.");
        tabla_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_adminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_admin);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 480, 110));

        eliminar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        eliminar.setForeground(new java.awt.Color(0, 153, 153));
        eliminar.setText("Eliminar");
        eliminar.setToolTipText("Conservar Los Cambios De Eliminacion.");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, -1, -1));

        modificar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        modificar.setForeground(new java.awt.Color(0, 153, 153));
        modificar.setText("Modificar");
        modificar.setToolTipText("Conservar Los Cambios De Modifcacion.");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        getContentPane().add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Eliminar");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tipos de Usuario:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, -1));

        modificar_idusuario.setEditable(false);
        modificar_idusuario.setToolTipText("Modificar El ID_Usuario.");
        modificar_idusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_idusuarioActionPerformed(evt);
            }
        });
        modificar_idusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modificar_idusuarioKeyTyped(evt);
            }
        });
        getContentPane().add(modificar_idusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 100, 30));

        modifica_contrasena.setToolTipText("Modificar La Contraseña.");
        modifica_contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifica_contrasenaActionPerformed(evt);
            }
        });
        getContentPane().add(modifica_contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 100, 30));

        modifica_tipo_usuario.setToolTipText("Modificar El Tipo De Usuario.");
        getContentPane().add(modifica_tipo_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 100, 30));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Contraseña:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID_Usuario:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Modificar");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        boton_biblioteca.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        boton_biblioteca.setForeground(new java.awt.Color(0, 153, 153));
        boton_biblioteca.setText("Biblioteca");
        boton_biblioteca.setToolTipText("Direcciona Vista Usuario Administrador Biblioteca.");
        boton_biblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_bibliotecaActionPerformed(evt);
            }
        });
        getContentPane().add(boton_biblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 210, 30));

        boton_caja.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        boton_caja.setForeground(new java.awt.Color(0, 153, 153));
        boton_caja.setText("Caja");
        boton_caja.setToolTipText("Direcciona Vista Usuario Administrador Cajas.");
        boton_caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cajaActionPerformed(evt);
            }
        });
        getContentPane().add(boton_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 210, 30));

        boton_idiomas.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        boton_idiomas.setForeground(new java.awt.Color(0, 153, 153));
        boton_idiomas.setText("Idiomas");
        boton_idiomas.setToolTipText("Direcciona Vista Usuario Administrador Idiomas.");
        boton_idiomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_idiomasActionPerformed(evt);
            }
        });
        getContentPane().add(boton_idiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 210, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Visuaizar Usuarios");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        actualizar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        actualizar.setForeground(new java.awt.Color(0, 153, 153));
        actualizar.setText("Actualizar");
        actualizar.setToolTipText("Actualiza La Base De Datos.");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, 20));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/logoconstancia.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 80, 120));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Vistas de Usuario");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        Modificar_Botones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        getContentPane().add(Modificar_Botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 230, 200));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Programa Interactivo Escolar  V1.0");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bienvenido Administrad@r ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("ID_Usuario:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administrador");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        eliminaid_usuario.setToolTipText("Introduzca La ID_Usuario A Eliminar.");
        eliminaid_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eliminaid_usuarioKeyTyped(evt);
            }
        });
        getContentPane().add(eliminaid_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 100, 30));

        Eliminar_Botones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        getContentPane().add(Eliminar_Botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 230, 200));

        control_escolar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        control_escolar.setForeground(new java.awt.Color(0, 153, 153));
        control_escolar.setText("Control Escolar");
        control_escolar.setToolTipText("Direcciona Vista Usuario Administrador Control Escolar.");
        control_escolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                control_escolarActionPerformed(evt);
            }
        });
        getContentPane().add(control_escolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, 30));

        insetar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        insetar.setForeground(new java.awt.Color(0, 153, 153));
        insetar.setText("Agregar");
        insetar.setToolTipText("Guarda El Registro De El Usuario Ingresado");
        insetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insetarActionPerformed(evt);
            }
        });
        getContentPane().add(insetar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Tipos de Usuario:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        inserta_usuario.setToolTipText("Introducir El Nombre Usuario.");
        inserta_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserta_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(inserta_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 100, 30));

        inserta_idusuario.setToolTipText("Introducir ID_Usuario.");
        inserta_idusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserta_idusuarioActionPerformed(evt);
            }
        });
        inserta_idusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inserta_idusuarioKeyTyped(evt);
            }
        });
        getContentPane().add(inserta_idusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 100, 30));

        inserta_contrasena.setToolTipText("Introducir La Contraseña.");
        inserta_contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserta_contrasenaActionPerformed(evt);
            }
        });
        getContentPane().add(inserta_contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 100, 30));

        inserta_tipo_usuario.setToolTipText("Determinar El Tipo De Usuario.");
        inserta_tipo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserta_tipo_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(inserta_tipo_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 100, 30));

        Bitacora.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Bitacora.setForeground(new java.awt.Color(0, 153, 153));
        Bitacora.setText("Bitacora");
        Bitacora.setToolTipText("Direcciona Vista Usuario Administrador Bitacora.");
        Bitacora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BitacoraActionPerformed(evt);
            }
        });
        getContentPane().add(Bitacora, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 210, 30));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Usuario:");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        Vistas_usuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        getContentPane().add(Vistas_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 230, 220));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Contraseña:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("ID_Usuario:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Agregar");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        Agregar_Botones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        getContentPane().add(Agregar_Botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 230, 200));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/interfazbiblioteca.jpg"))); // NOI18N
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int a = JOptionPane.showConfirmDialog(null, "Está Seguro Que Deseea Salir?");
        try {
            if (a == JOptionPane.YES_OPTION) {
                this.dispose();
                login metodo1 = new login();
                metodo1.setVisible(true);
                
            } else if (a == JOptionPane.NO_OPTION) {
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
            
    }//GEN-LAST:event_formWindowClosing

    private void boton_idiomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_idiomasActionPerformed
       
         Interfaz_Lenguajes_Admin it = new Interfaz_Lenguajes_Admin();
        it.setVisible(true);
       this.dispose();
       
        
        
    }//GEN-LAST:event_boton_idiomasActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        int verificacion = JOptionPane.showConfirmDialog(null, "¿Seguro que desea modificar el registro?", "Modificar", JOptionPane.YES_NO_OPTION);

        try {

            if (modificar_idusuario.getText().equals("") || modifica_contrasena.getText().equals("") || modifica_tipo_usuario.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Hay Uno O Varios Campos Vacios", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (verificacion == JOptionPane.YES_OPTION) {
                if (modificar_idusuario.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay Datos que modificar");
                } else {
                    String mod = "update usuarios set contrasena=?, tipo_usuario=? where ID_usuario=?";
                    try {
                        pst = conn.prepareStatement(mod);
                        pst.setString(1, modifica_contrasena.getText());
                        pst.setString(2, modifica_tipo_usuario.getText());
                        pst.setString(3, modificar_idusuario.getText());
                        pst.execute();
                        JOptionPane.showMessageDialog(null, "Registro Actualizado");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            } else if (verificacion == JOptionPane.NO_OPTION){
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        actualizar_tabla();
        borrartxtmod();
    }//GEN-LAST:event_modificarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
actualizar_tabla();   
       
  
    }//GEN-LAST:event_actualizarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        int verificacion = JOptionPane.showConfirmDialog(null, "¿Seguro que desea borrar el registro?", "Borrar", JOptionPane.YES_NO_OPTION);
        try {
            if (verificacion == JOptionPane.YES_OPTION) {
                if (eliminaid_usuario.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay Datos que borrar", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else {
                    String elim = "Delete from usuarios where id_usuario=?";
                    try {
                        pst = conn.prepareStatement(elim);
                        pst.setString(1, eliminaid_usuario.getText());
                        pst.execute();
                        JOptionPane.showMessageDialog(null, "Registro Eliminado");
                        
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            } else if (verificacion == JOptionPane.NO_OPTION) {

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null ,e);
        }
        
        borrartxtelim();
        actualizar_tabla();
    }//GEN-LAST:event_eliminarActionPerformed

    private void modificar_idusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_idusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar_idusuarioActionPerformed

    private void modifica_contrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifica_contrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifica_contrasenaActionPerformed

    private void insetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insetarActionPerformed
        int verificacion = JOptionPane.showConfirmDialog(null, "¿Seguro que desea insertar el registro?", "Insertar", JOptionPane.YES_NO_OPTION);
        try {
            if (inserta_idusuario.getText().equals("") || inserta_usuario.getText().equals("") || inserta_contrasena.getText().equals("") || inserta_tipo_usuario.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Hay Uno o Varios Campos Vacios", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (verificacion == JOptionPane.YES_OPTION) {
               

                    String mod = "insert into usuarios values(?,?,?,?)";
                    try {
                        pst = conn.prepareStatement(mod);

                        pst.setString(1, inserta_idusuario.getText());
                        pst.setString(2, inserta_usuario.getText());
                        pst.setString(3, inserta_contrasena.getText());
                        pst.setString(4, inserta_tipo_usuario.getText());
                        pst.execute();
                        JOptionPane.showMessageDialog(null, "Registro Actualizado");
                       
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                
            }
            else if (verificacion == JOptionPane.NO_OPTION){
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        borraragrtxt();
        actualizar_tabla();
            
    }//GEN-LAST:event_insetarActionPerformed

    private void inserta_contrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserta_contrasenaActionPerformed
      
    }//GEN-LAST:event_inserta_contrasenaActionPerformed

    private void inserta_tipo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserta_tipo_usuarioActionPerformed
       
    }//GEN-LAST:event_inserta_tipo_usuarioActionPerformed

    private void inserta_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserta_usuarioActionPerformed
        
    }//GEN-LAST:event_inserta_usuarioActionPerformed

    private void boton_bibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_bibliotecaActionPerformed
     Interfaz_Biblioteca_Admin  it = new Interfaz_Biblioteca_Admin ();
     it.setVisible(true);
     this.dispose();
     
       
       
        
        
        
    }//GEN-LAST:event_boton_bibliotecaActionPerformed

    private void boton_cajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cajaActionPerformed
     
        Interfaz_Caja_Admin it = new Interfaz_Caja_Admin();
     it.setVisible(true);
     this.dispose();
     
          
       
    }//GEN-LAST:event_boton_cajaActionPerformed

    private void inserta_idusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserta_idusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inserta_idusuarioActionPerformed

    private void control_escolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_control_escolarActionPerformed
    Interfaz_controlescolar_Admin vp = new Interfaz_controlescolar_Admin();
    vp.setVisible(true);
    this.dispose();
    
            
    }//GEN-LAST:event_control_escolarActionPerformed

    private void BitacoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BitacoraActionPerformed
    bitacora_admin vp = new bitacora_admin();
    vp.setVisible(true);
    this.dispose();
        
        
        
        
    }//GEN-LAST:event_BitacoraActionPerformed

    private void modificar_idusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modificar_idusuarioKeyTyped
char c = evt.getKeyChar();

            if (Character.isLetter(c)) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Caracteres Numericos");

            }        // TODO add your handling code here:
    }//GEN-LAST:event_modificar_idusuarioKeyTyped

    private void inserta_idusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inserta_idusuarioKeyTyped
char c = evt.getKeyChar();

            if (Character.isLetter(c)) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Caracteres Numericos");

            }        // TODO add your handling code here:
    }//GEN-LAST:event_inserta_idusuarioKeyTyped

    private void eliminaid_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eliminaid_usuarioKeyTyped
char c = evt.getKeyChar();

            if (Character.isLetter(c)) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Caracteres Numericos");

            }        // TODO add your handling code here:
    }//GEN-LAST:event_eliminaid_usuarioKeyTyped

    private void tabla_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_adminMouseClicked
try {
            int row = tabla_admin.getSelectedRow();
            String Click_Tabla = (tabla_admin.getModel().getValueAt(row, 0).toString());
            String Click = "SELECT * From usuarios where id_usuario = '" + Click_Tabla + "' ";
            pst = conn.prepareStatement(Click);
            rs = pst.executeQuery();

            if (rs.next()) {

                String agregar1 = rs.getString("id_usuario");
                modificar_idusuario.setText(agregar1);

                String agregar2 = rs.getString("contrasena");
                modifica_contrasena.setText(agregar2);

                String agregar3 = rs.getString("tipo_usuario");
                modifica_tipo_usuario.setText(agregar3);
                
                String agregar4= rs.getString("id_usuario");
                eliminaid_usuario.setText(agregar4);
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }// TODO add your handling code here:
    }//GEN-LAST:event_tabla_adminMouseClicked

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
            java.util.logging.Logger.getLogger(Interfaz_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Admin().setVisible(true);
            }
        });
        */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agregar_Botones;
    private javax.swing.JButton Bitacora;
    private javax.swing.JLabel Eliminar_Botones;
    private javax.swing.JLabel Modificar_Botones;
    private javax.swing.JLabel Vistas_usuario;
    private javax.swing.JButton actualizar;
    private javax.swing.JButton boton_biblioteca;
    private javax.swing.JButton boton_caja;
    private javax.swing.JButton boton_idiomas;
    private javax.swing.JButton control_escolar;
    private javax.swing.JTextField eliminaid_usuario;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField inserta_contrasena;
    private javax.swing.JTextField inserta_idusuario;
    private javax.swing.JTextField inserta_tipo_usuario;
    private javax.swing.JTextField inserta_usuario;
    private javax.swing.JButton insetar;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField modifica_contrasena;
    private javax.swing.JTextField modifica_tipo_usuario;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField modificar_idusuario;
    private javax.swing.JTable tabla_admin;
    // End of variables declaration//GEN-END:variables
}
