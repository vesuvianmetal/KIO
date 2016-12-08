
import java.util.Calendar;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Disco
 */
public class referenciabancaria extends javax.swing.JFrame {

    /**
     * Creates new form referenciabancaria
     */
    public referenciabancaria() {
        initComponents();
    }
    public  void generar (){
        int Importe, RE = 0, NUM = 0, VF = 0;
        /*dia = Integer.toString(c.get(Calendar.DATE));
        mes = Integer.toString(c.get(Calendar.MONTH));
        annio = Integer.toString(c.get(Calendar.YEAR));*/
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Ingrese el dia:");
        Dia = sc.nextInt();
        System.out.println("Ingrese el mes");
        Mes = sc.nextInt();
        System.out.println("Ingrese el año");
        Año = sc.nextInt();*/
        String Dia=cuadro_dia.getText();
        String Mes=cuadro_mes.getText();
        String Año=annio.getText();
        System.out.println(Dia + "/" + Mes + "/" + Año);
        int año=Integer.valueOf(Año);
        int mes=Integer.valueOf(Mes);
        int dia=Integer.valueOf(Dia);
        año = ((año - 2013) * 372);
        mes = ((mes - 1) * 31);
        dia = (dia - 1);
        int Fecha = año + mes + dia;
        String LÑ = Integer.toString(Fecha);
        System.out.println("Fecha condensada:" + (año + mes + dia));

        //Calculo de la forma condensada del importe
        System.out.println("Ingrese el Total a pagar");
        
        String D = total.getText();
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
        String nc=AX;
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
        int PE = (VB % 97) +1;
        System.out.println();
        System.out.println("importe sin divirid" + VB);
        System.out.println("importe condensado"  + PE);
        String DAS = Integer.toString(PE);
        String DASE = DAS.substring(0, 1);
        String DASE2 = DAS.substring(1, 2);
        /*for (int i = Digi.length; i > 1; i--) {
            System.out.print(Digi[i-1]);
        }*/
        System.out.print(nc+LÑ + Po + DASE + DASE2);
        referencia.setText(nc+LÑ + Po + DASE + DASE2);

    }

    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cuadro_dia = new javax.swing.JTextField();
        cuadro_mes = new javax.swing.JTextField();
        annio = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        referencia = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        beca_hijo = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        beca_eji = new javax.swing.JRadioButton();
        beca_ex = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        numero_control = new javax.swing.JTextField();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(cuadro_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 60, -1));

        cuadro_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadro_mesActionPerformed(evt);
            }
        });
        getContentPane().add(cuadro_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 60, -1));
        getContentPane().add(annio, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, 60, -1));

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, 70, 20));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, 70, 20));

        total.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 370, 70, 20));

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 310, 70, 20));

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 70, 20));

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 470, 70, 20));

        referencia.setEditable(false);
        referencia.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        referencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        referencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referenciaActionPerformed(evt);
            }
        });
        getContentPane().add(referencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 670, 320, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 560, 100, 30));

        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Número de Referencia Bancario:");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 630, -1, -1));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Numero de control");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, -1, -1));

        beca_hijo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        beca_hijo.setText("Beca Hijo de Maestro");
        getContentPane().add(beca_hijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 160, -1));

        jRadioButton1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jRadioButton1.setText("Curso de Ingles");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 160, -1));

        beca_eji.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        beca_eji.setText("Beca Ejidatarios");
        beca_eji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beca_ejiActionPerformed(evt);
            }
        });
        getContentPane().add(beca_eji, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 160, -1));

        beca_ex.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        beca_ex.setText("Beca de Excelencia");
        beca_ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beca_exActionPerformed(evt);
            }
        });
        getContentPane().add(beca_ex, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 160, -1));

        jRadioButton2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jRadioButton2.setText("Reinscripcion");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 160, -1));

        jLabel28.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Becas:");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, -1, -1));

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Total a Pagar:");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 520, -1, -1));

        numero_control.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_controlActionPerformed(evt);
            }
        });
        getContentPane().add(numero_control, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, 140, -1));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Concepto de Pago:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, -1));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Año:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, -1, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Mes:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, -1, -1));

        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Importe");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 280, -1, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Dia:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Generador de Referencia Bancaria");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, -1, -1));

        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true), "Importe", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(0, 204, 204))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 560, 380));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bienvenido Alumn@  ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, -1, 30));

        jLabel21.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true), "Fecha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(0, 204, 204))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 560, 70));

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

        getContentPane().add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 760, 90));

        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 760, 610));

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

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void beca_exActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beca_exActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beca_exActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
generar();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void referenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_referenciaActionPerformed

    private void numero_controlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_controlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero_controlActionPerformed

    private void beca_ejiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beca_ejiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beca_ejiActionPerformed

    
    
    
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
    private javax.swing.JTextField annio;
    private javax.swing.JRadioButton beca_eji;
    private javax.swing.JRadioButton beca_ex;
    private javax.swing.JRadioButton beca_hijo;
    private javax.swing.JTextField cuadro_dia;
    private javax.swing.JTextField cuadro_mes;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel name;
    private javax.swing.JPanel name1;
    private javax.swing.JPanel name2;
    private javax.swing.JTextField numero_control;
    private javax.swing.JTextField referencia;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
