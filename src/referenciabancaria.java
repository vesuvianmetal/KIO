
import java.util.Calendar;
import java.util.Scanner;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class referenciabancaria extends javax.swing.JFrame {

    int limitecontrol = 8;

    public referenciabancaria() {

        initComponents();
    }

    public void generar() {
        try {
            int Importe, RE = 0, NUM = 0, VF = 0;
            /*String dia = Integer.toString(c.get(Calendar.DATE));
        String mes = Integer.toString(c.get(Calendar.MONTH));
        String annio = Integer.toString(c.get(Calendar.YEAR));*/
            Scanner sc = new Scanner(System.in);
            /*System.out.println("Ingrese el dia:");
        Dia = sc.nextInt();
        System.out.println("Ingrese el mes");
        Mes = sc.nextInt();
        System.out.println("Ingrese el año");
        Año = sc.nextInt();*/
            String Dia = cuadro_dia.getText();
            String Mes = cuadro_mes.getText();
            String Año = annio.getText();
            System.out.println(Dia + "/" + Mes + "/" + Año);
            int año = Integer.valueOf(Año);
            int mes = Integer.valueOf(Mes);
            int dia = Integer.valueOf(Dia);
            año = ((año - 2013) * 372);
            mes = ((mes - 1) * 31);
            dia = (dia - 1);
            int Fecha = año + mes + dia;
            String LÑ = Integer.toString(Fecha);
            System.out.println("Fecha condensada:" + (año + mes + dia));

            //Calculo de la forma condensada del importe
            System.out.println("Ingrese el Total a pagar");

            String D = total_final.getText();
            String E = D.substring(0, D.length() - 3) + D.substring(D.length() - 2, D.length());
            String ax = E; // Pasamos el int a String
            String nuevaCadena = "";
            StringBuilder builder = new StringBuilder(ax);//Convertimos el String en StringBuffer para utilizar el metodo reverse()
            builder = builder.reverse(); //Invierte el StringBuffer
            nuevaCadena = builder.toString();
            int Z = nuevaCadena.length();
            if (Z == 5) {
                int A, B, C, F, G;
                A = Integer.parseInt(nuevaCadena.substring(0, 1));
                A = A * 7;
                B = Integer.parseInt(nuevaCadena.substring(1, 2));
                B = B * 3;
                C = Integer.parseInt(nuevaCadena.substring(2, 3));
                C = C * 1;
                F = Integer.parseInt(nuevaCadena.substring(3, 4));
                F = F * 7;
                G = Integer.parseInt(nuevaCadena.substring(4, 5));
                G = G * 3;
                RE = (A + B + C + F + G);
            } else if (Z == 6) {
                int A, B, C, F, G, H;
                A = Integer.parseInt(nuevaCadena.substring(0, 1));
                A = A * 7;
                B = Integer.parseInt(nuevaCadena.substring(1, 2));
                B = B * 3;
                C = Integer.parseInt(nuevaCadena.substring(2, 3));
                C = C * 1;
                F = Integer.parseInt(nuevaCadena.substring(3, 4));
                F = F * 7;
                G = Integer.parseInt(nuevaCadena.substring(4, 5));
                G = G * 3;
                H = Integer.parseInt(nuevaCadena.substring(5, 6));
                H = H * 1;
                RE = (A + B + C + F + G + H);
            } else if (Z == 7) {
                int A, B, C, F, G, H, I;
                A = Integer.parseInt(nuevaCadena.substring(0, 1));
                A = A * 7;
                B = Integer.parseInt(nuevaCadena.substring(1, 2));
                B = B * 3;
                C = Integer.parseInt(nuevaCadena.substring(2, 3));
                C = C * 1;
                F = Integer.parseInt(nuevaCadena.substring(3, 4));
                F = F * 7;
                G = Integer.parseInt(nuevaCadena.substring(4, 5));
                G = G * 3;
                H = Integer.parseInt(nuevaCadena.substring(5, 6));
                H = H * 1;
                I = Integer.parseInt(nuevaCadena.substring(6, 7));
                I = I * 7;
                RE = (A + B + C + F + G + H + I);
            } else if (Z == 8) {
                int A, B, C, F, G, H, I, J;
                A = Integer.parseInt(nuevaCadena.substring(0, 1));
                A = A * 7;
                B = Integer.parseInt(nuevaCadena.substring(1, 2));
                B = B * 3;
                C = Integer.parseInt(nuevaCadena.substring(2, 3));
                C = C * 1;
                F = Integer.parseInt(nuevaCadena.substring(3, 4));
                F = F * 7;
                G = Integer.parseInt(nuevaCadena.substring(4, 5));
                G = G * 3;
                H = Integer.parseInt(nuevaCadena.substring(5, 6));
                H = H * 1;
                I = Integer.parseInt(nuevaCadena.substring(6, 7));
                I = I * 7;
                J = Integer.parseInt(nuevaCadena.substring(7, 8));
                J = J * 3;
                RE = (A + B + C + F + G + H + I + J);
            }
            //Importe condensado
            int Po = RE % 10;
            System.out.println(Po);

            //Calculo de digitos verificadores globales
            int[] Digi = new int[8];
            //System.out.println("Ingresa El Numero:");
            String AX = numero_control.getText(); // Pasamos el int a String
            String nc = AX;
            String nuevacadena = "";
            StringBuilder builders = new StringBuilder(AX);//Convertimos el String en StringBuffer para utilizar el metodo reverse()
            builders = builders.reverse(); //Invierte el StringBuffer
            nuevacadena = builders.toString();
            //int ZX = 2 * 11;
            //System.out.println(ZX);
            int MN = Po * 11;
            System.out.println(MN);
            int DD = Integer.parseInt(LÑ.substring(3, 4)) * 13;
            System.out.println(DD);
            int DG = Integer.parseInt(LÑ.substring(2, 3)) * 17;
            System.out.println(DG);
            int DT = Integer.parseInt(LÑ.substring(1, 2)) * 19;
            System.out.println(DT);
            int DS = Integer.parseInt(LÑ.substring(0, 1)) * 23;
            System.out.println(DS);
            VF = MN + DD + DG + DT + DS;
            int DE = 0, VB = 0, CX = 0;
            for (int i = 0; i < Digi.length; i++) {
                switch (DE) {
                    case 0: {
                        Digi[i] = Integer.parseInt(nuevacadena.substring(i, i + 1));
                        DE = 1;
                        CX = Digi[i] * 11;
                        break;
                    }
                    case 1: {
                        Digi[i] = Integer.parseInt(nuevacadena.substring(i, i + 1));
                        DE = 2;
                        CX = Digi[i] * 13;
                        break;
                    }
                    case 2: {
                        Digi[i] = Integer.parseInt(nuevacadena.substring(i, i + 1));
                        DE = 3;
                        CX = Digi[i] * 17;
                        break;
                    }
                    case 3: {
                        Digi[i] = Integer.parseInt(nuevacadena.substring(i, i + 1));
                        DE = 4;
                        CX = Digi[i] * 19;
                        break;
                    }
                    case 4: {
                        Digi[i] = Integer.parseInt(nuevacadena.substring(i, i + 1));
                        DE = 0;
                        CX = Digi[i] * 23;
                        break;
                    }
                }
                VB = VB + CX;
                System.out.println("Importe" + CX);
            }
            VB = VF + VB;
            int PE = (VB % 97) + 1;
            System.out.println();
            System.out.println("importe sin divirid" + VB);
            System.out.println("importe condensado" + PE);
            String DAS = Integer.toString(PE);
            String DASE = DAS.substring(0, 1);
            String DASE2 = DAS.substring(1, 2);
            /*for (int i = Digi.length; i > 1; i--) {
            System.out.print(Digi[i-1]);
        }*/
            System.out.print(nc + LÑ + Po + DASE + DASE2);
            referencia.setText(nc + LÑ + Po + DASE + DASE2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        cuadro_dia = new javax.swing.JTextField();
        cuadro_mes = new javax.swing.JTextField();
        annio = new javax.swing.JTextField();
        total_final = new javax.swing.JTextField();
        total1 = new javax.swing.JTextField();
        total2 = new javax.swing.JTextField();
        total3 = new javax.swing.JTextField();
        referencia = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        beca_hijo = new javax.swing.JRadioButton();
        curso_ingles = new javax.swing.JRadioButton();
        beca_eji = new javax.swing.JRadioButton();
        beca_ex = new javax.swing.JRadioButton();
        reinscripcion = new javax.swing.JRadioButton();
        Regresar = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        borrar = new javax.swing.JButton();
        numero_control = new javax.swing.JTextField();
        ninguno = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        name1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        name2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Solicitud de Referencia-PIE v1.0");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cuadro_dia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cuadro_diaKeyTyped(evt);
            }
        });
        getContentPane().add(cuadro_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 60, -1));

        cuadro_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadro_mesActionPerformed(evt);
            }
        });
        cuadro_mes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cuadro_mesKeyTyped(evt);
            }
        });
        getContentPane().add(cuadro_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 60, -1));

        annio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                annioKeyTyped(evt);
            }
        });
        getContentPane().add(annio, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 180, 60, -1));

        total_final.setEditable(false);
        total_final.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        total_final.setToolTipText("total a pagar");
        getContentPane().add(total_final, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 540, 70, 20));

        total1.setEditable(false);
        total1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        total1.setToolTipText("costo de la beca seleccionada");
        getContentPane().add(total1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, 70, 20));

        total2.setEditable(false);
        total2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        total2.setToolTipText("costo de reinscripcion");
        total2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                total2MouseClicked(evt);
            }
        });
        getContentPane().add(total2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 70, 20));

        total3.setEditable(false);
        total3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        total3.setToolTipText("costo de curso de ingles");
        getContentPane().add(total3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 480, 70, 20));

        referencia.setEditable(false);
        referencia.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        referencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        referencia.setToolTipText("numero de referencia generado");
        referencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referenciaActionPerformed(evt);
            }
        });
        getContentPane().add(referencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 700, 320, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Generar");
        jButton1.setToolTipText("Genera la referencia con los datos insertados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 600, 100, 30));

        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Número de Referencia Bancario:");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 670, -1, -1));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Numero de control");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, -1, -1));

        grupo.add(beca_hijo);
        beca_hijo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        beca_hijo.setText("Beca Hijo de Maestro");
        beca_hijo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                beca_hijoMouseClicked(evt);
            }
        });
        getContentPane().add(beca_hijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 160, -1));

        curso_ingles.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        curso_ingles.setText("Curso de Ingles");
        curso_ingles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                curso_inglesMouseClicked(evt);
            }
        });
        getContentPane().add(curso_ingles, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, 160, -1));

        grupo.add(beca_eji);
        beca_eji.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        beca_eji.setText("Beca Ejidatarios");
        beca_eji.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                beca_ejiMouseClicked(evt);
            }
        });
        beca_eji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beca_ejiActionPerformed(evt);
            }
        });
        getContentPane().add(beca_eji, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 160, -1));

        grupo.add(beca_ex);
        beca_ex.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        beca_ex.setText("Beca de Excelencia");
        beca_ex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                beca_exMouseClicked(evt);
            }
        });
        beca_ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beca_exActionPerformed(evt);
            }
        });
        getContentPane().add(beca_ex, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 160, -1));

        reinscripcion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        reinscripcion.setText("Reinscripcion");
        reinscripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reinscripcionMouseClicked(evt);
            }
        });
        getContentPane().add(reinscripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 160, -1));

        Regresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Regresar.setForeground(new java.awt.Color(0, 153, 153));
        Regresar.setText("Regreso");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 600, 120, 30));

        jLabel28.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Becas:");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, -1));

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Total a Pagar:");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, -1, -1));

        borrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        borrar.setForeground(new java.awt.Color(0, 153, 153));
        borrar.setText("Borrar");
        borrar.setToolTipText("Borra todos los campos de la ventana");
        borrar.setMaximumSize(new java.awt.Dimension(79, 23));
        borrar.setMinimumSize(new java.awt.Dimension(79, 23));
        borrar.setPreferredSize(new java.awt.Dimension(79, 23));
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        getContentPane().add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 600, 100, 30));

        numero_control.setToolTipText("inserta un numero de control");
        numero_control.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numero_controlMouseClicked(evt);
            }
        });
        numero_control.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_controlActionPerformed(evt);
            }
        });
        numero_control.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numero_controlKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numero_controlKeyTyped(evt);
            }
        });
        getContentPane().add(numero_control, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 570, 140, -1));

        grupo.add(ninguno);
        ninguno.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        ninguno.setText("Ninguno");
        ninguno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ningunoMouseClicked(evt);
            }
        });
        getContentPane().add(ninguno, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 160, -1));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Concepto de Pago:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, -1));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Año:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, -1, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Mes:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, -1, -1));

        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Importe");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 260, -1, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Dia:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Generador de Referencia Bancaria");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, -1, -1));

        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true), "Importe", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(0, 204, 204))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 560, 430));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bienvenido Alumn@  ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, -1, 30));

        jLabel21.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true), "Fecha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(0, 204, 204))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 560, 70));

        name1.setBackground(new java.awt.Color(0, 204, 204));
        name1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Referencia Bancaria");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/itess constancia.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/logoconstancia.png"))); // NOI18N
        jLabel13.setText("jLabel10");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/logoconstancia.png"))); // NOI18N

        javax.swing.GroupLayout name1Layout = new javax.swing.GroupLayout(name1);
        name1.setLayout(name1Layout);
        name1Layout.setHorizontalGroup(
            name1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, name1Layout.createSequentialGroup()
                .addGroup(name1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(name1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(name1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(32, 32, 32)))
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        name1Layout.setVerticalGroup(
            name1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(name1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(name1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, name1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(name1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 760, 90));

        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 760, 650));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        name.setBackground(new java.awt.Color(0, 204, 204));
        name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Adeudos Biblioteca");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/itess constancia.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/logoconstancia.png"))); // NOI18N
        jLabel10.setText("jLabel10");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/logoconstancia.png"))); // NOI18N

        javax.swing.GroupLayout nameLayout = new javax.swing.GroupLayout(name);
        name.setLayout(nameLayout);
        nameLayout.setHorizontalGroup(
            nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nameLayout.createSequentialGroup()
                .addGroup(nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nameLayout.createSequentialGroup()
                        .addContainerGap(496, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(nameLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addGap(48, 48, 48)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
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
                            .addComponent(jLabel2)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 760, 90));

        name2.setBackground(new java.awt.Color(0, 204, 204));
        name2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Adeudos Biblioteca");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/itess constancia.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/logoconstancia.png"))); // NOI18N
        jLabel16.setText("jLabel10");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilizables/logoconstancia.png"))); // NOI18N

        javax.swing.GroupLayout name2Layout = new javax.swing.GroupLayout(name2);
        name2.setLayout(name2Layout);
        name2Layout.setHorizontalGroup(
            name2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, name2Layout.createSequentialGroup()
                .addGroup(name2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(name2Layout.createSequentialGroup()
                        .addContainerGap(496, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(name2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addGap(48, 48, 48)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        name2Layout.setVerticalGroup(
            name2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(name2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(name2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, name2Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(name2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 760, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cuadro_mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadro_mesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuadro_mesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            
            if (cuadro_dia.getText().equals("") || cuadro_mes.getText().equals("") || annio.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Hay Uno o Varios Campos Vacios" , "ERROR" , JOptionPane.ERROR_MESSAGE);
            }
            else {
                generar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void referenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_referenciaActionPerformed

    private void numero_controlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_controlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero_controlActionPerformed

    private void beca_exActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beca_exActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beca_exActionPerformed

    private void beca_ejiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beca_ejiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beca_ejiActionPerformed

    private void beca_hijoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beca_hijoMouseClicked
        total1.setText("310.00");

    }//GEN-LAST:event_beca_hijoMouseClicked

    private void beca_ejiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beca_ejiMouseClicked
        total1.setText("350.00");     // TODO add your handling code here:
    }//GEN-LAST:event_beca_ejiMouseClicked

    private void beca_exMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beca_exMouseClicked
        total1.setText("350.00");        // TODO add your handling code here:
    }//GEN-LAST:event_beca_exMouseClicked

    private void reinscripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reinscripcionMouseClicked
        total2.setText("1900.00");        // TODO add your handling code here:
    }//GEN-LAST:event_reinscripcionMouseClicked

    private void total2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_total2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_total2MouseClicked

    private void curso_inglesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curso_inglesMouseClicked
        total3.setText("1000.00");        // TODO add your handling code here:
    }//GEN-LAST:event_curso_inglesMouseClicked

    private void ningunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ningunoMouseClicked
        total1.setText("0.00");        // TODO add your handling code here:
    }//GEN-LAST:event_ningunoMouseClicked

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        try {
            total1.setText("");
            total2.setText("");
            total3.setText("");
            total_final.setText("");
            cuadro_dia.setText("");
            cuadro_mes.setText("");
            annio.setText("");
            numero_control.setText("");
            referencia.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_borrarActionPerformed

    private void numero_controlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numero_controlMouseClicked
        try {
            if (ninguno.isSelected() == true) {
                float total_1 = Float.valueOf(total1.getText());
                float total_2 = Float.valueOf(total2.getText());
                float total_3 = Float.valueOf(total3.getText());
                float total_finalnum = total_1 + total_2 + total_3;
                String total_finaltext = String.valueOf(total_finalnum);
                total_final.setText(total_finaltext + "0");
            } else {

                total2.setText(total1.getText());
                float total_1 = Float.valueOf(total1.getText());
                //float total_2=Float.valueOf(total2.getText());
                float total_3 = Float.valueOf(total3.getText());
                float total_finalnum = total_1 + total_3;
                String total_finaltext = String.valueOf(total_finalnum);
                total_final.setText(total_finaltext + "0");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_numero_controlMouseClicked

    private void numero_controlKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numero_controlKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero_controlKeyPressed

    private void numero_controlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numero_controlKeyTyped
        try {

            if (numero_control.getText().length() == limitecontrol) {

                evt.consume();
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Una Longitud 8 Caracteres");
            }
           
            
            
            int c =evt.getKeyChar();
            
            if (Character.isLetter(c)){
                evt.consume();
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Caracteres Numericos" , "ERROR" , JOptionPane.ERROR_MESSAGE);
            }
            
        

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_numero_controlKeyTyped

    private void cuadro_diaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuadro_diaKeyTyped
        try {
            
            
            int c =evt.getKeyChar();
            
            if (Character.isLetter(c)){
                evt.consume();
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Caracteres Numericos" , "ERROR" , JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cuadro_diaKeyTyped

    private void cuadro_mesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuadro_mesKeyTyped
        try {
            
            
            int c =evt.getKeyChar();
            
            if (Character.isLetter(c)){
                evt.consume();
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Caracteres Numericos" , "ERROR" , JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cuadro_mesKeyTyped

    private void annioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_annioKeyTyped
        try {
            
            
            int c =evt.getKeyChar();
            
            if (Character.isLetter(c)){
                evt.consume();
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Este Campo Solo Acepta Caracteres Numericos" , "ERROR" , JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_annioKeyTyped

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
    try {
      item it = new item();
      it.setVisible(true);
      this.dispose();
        
        
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_RegresarActionPerformed

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
            java.util.logging.Logger.getLogger(referenciabancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(referenciabancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(referenciabancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(referenciabancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new referenciabancaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField annio;
    private javax.swing.JRadioButton beca_eji;
    private javax.swing.JRadioButton beca_ex;
    private javax.swing.JRadioButton beca_hijo;
    private javax.swing.JButton borrar;
    private javax.swing.JTextField cuadro_dia;
    private javax.swing.JTextField cuadro_mes;
    private javax.swing.JRadioButton curso_ingles;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel name;
    private javax.swing.JPanel name1;
    private javax.swing.JPanel name2;
    private javax.swing.JRadioButton ninguno;
    private javax.swing.JTextField numero_control;
    private javax.swing.JTextField referencia;
    private javax.swing.JRadioButton reinscripcion;
    private javax.swing.JTextField total1;
    private javax.swing.JTextField total2;
    private javax.swing.JTextField total3;
    private javax.swing.JTextField total_final;
    // End of variables declaration//GEN-END:variables
}
