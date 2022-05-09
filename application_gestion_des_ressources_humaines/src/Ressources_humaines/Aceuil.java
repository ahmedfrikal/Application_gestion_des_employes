package Ressources_humaines;

import Employes.Connexion;
import Employes.Mes_outils;
import Employes.type_conges;
import java.awt.BorderLayout;
import java.awt.Font;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;

public class Aceuil extends javax.swing.JFrame {  
    public Aceuil() {
         Mes_outils.con=Connexion.connecterDB();
        initComponents();
        statistiques();
        nbr_employes();
       les_employes_qui_se_termine();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        btn_parametres = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jToggleButton4 = new javax.swing.JToggleButton();
        btn_pointage = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jToggleButton5 = new javax.swing.JToggleButton();
        btn_absence = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jToggleButton6 = new javax.swing.JToggleButton();
        btn_sanction = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jToggleButton7 = new javax.swing.JToggleButton();
        btn_statistiques = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jToggleButton8 = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Salariés dont le contrat expire moins de 40 jours");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        jPanel5.setBackground(new java.awt.Color(54, 33, 89));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/images/icons8_user_50px_3.png"))); // NOI18N
        jLabel4.setText("      Hello Admin");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 188, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 180, -1, -1));

        jPanel6.setBackground(new java.awt.Color(54, 33, 89));
        jPanel6.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel6.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("       Le nombre des employes");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/images/icons8_user_50px_3.png"))); // NOI18N

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("200 Employes");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 250, 180));

        jPanel7.setBackground(new java.awt.Color(54, 33, 89));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Le nombre de service");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("200 Employes");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/images/icons8_slack_64px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 260, 180));

        jPanel8.setBackground(new java.awt.Color(54, 33, 89));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("[255,255,255]");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel10)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 240, 180));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 350));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 437, 920, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 950, 610));

        jPanel3.setBackground(new java.awt.Color(54, 33, 89));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(127, 101, 156));
        jPanel2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPanel2FocusLost(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/images/icons8_user_50px_3.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jToggleButton1.setText("jToggleButton1");

        jToggleButton3.setBackground(new java.awt.Color(127, 101, 156));
        jToggleButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jToggleButton3.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton3.setText("Employes");
        jToggleButton3.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToggleButton1)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton3))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addContainerGap())
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 240, 50));

        btn_parametres.setBackground(new java.awt.Color(127, 101, 156));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/images/icons8_settings_32px.png"))); // NOI18N

        jToggleButton4.setBackground(new java.awt.Color(127, 101, 156));
        jToggleButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jToggleButton4.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton4.setText("Parametres");
        jToggleButton4.setBorder(null);

        javax.swing.GroupLayout btn_parametresLayout = new javax.swing.GroupLayout(btn_parametres);
        btn_parametres.setLayout(btn_parametresLayout);
        btn_parametresLayout.setHorizontalGroup(
            btn_parametresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_parametresLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 188, Short.MAX_VALUE))
            .addGroup(btn_parametresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_parametresLayout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(36, Short.MAX_VALUE)))
        );
        btn_parametresLayout.setVerticalGroup(
            btn_parametresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_parametresLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_parametresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_parametresLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(jToggleButton4)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        jPanel3.add(btn_parametres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        btn_pointage.setBackground(new java.awt.Color(85, 55, 118));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/images/icons8_attendance_32px.png"))); // NOI18N

        jToggleButton5.setBackground(new java.awt.Color(85, 55, 118));
        jToggleButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jToggleButton5.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton5.setText("Pointage");
        jToggleButton5.setBorder(null);

        javax.swing.GroupLayout btn_pointageLayout = new javax.swing.GroupLayout(btn_pointage);
        btn_pointage.setLayout(btn_pointageLayout);
        btn_pointageLayout.setHorizontalGroup(
            btn_pointageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_pointageLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 223, Short.MAX_VALUE))
            .addGroup(btn_pointageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_pointageLayout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(79, Short.MAX_VALUE)))
        );
        btn_pointageLayout.setVerticalGroup(
            btn_pointageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_pointageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(btn_pointageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_pointageLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jToggleButton5)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        jPanel3.add(btn_pointage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        btn_absence.setBackground(new java.awt.Color(85, 55, 118));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/images/icons8_exhibitor_50px.png"))); // NOI18N

        jToggleButton6.setBackground(new java.awt.Color(85, 55, 118));
        jToggleButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jToggleButton6.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton6.setText("Absence");
        jToggleButton6.setBorder(null);

        javax.swing.GroupLayout btn_absenceLayout = new javax.swing.GroupLayout(btn_absence);
        btn_absence.setLayout(btn_absenceLayout);
        btn_absenceLayout.setHorizontalGroup(
            btn_absenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_absenceLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 172, Short.MAX_VALUE))
            .addGroup(btn_absenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_absenceLayout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(49, Short.MAX_VALUE)))
        );
        btn_absenceLayout.setVerticalGroup(
            btn_absenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_absenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_absenceLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(jToggleButton6)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        jPanel3.add(btn_absence, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 240, -1));

        btn_sanction.setBackground(new java.awt.Color(54, 33, 89));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/images/icons8_slack_64px.png"))); // NOI18N

        jToggleButton7.setBackground(new java.awt.Color(54, 33, 89));
        jToggleButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jToggleButton7.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton7.setText("Sanction");
        jToggleButton7.setBorder(null);

        javax.swing.GroupLayout btn_sanctionLayout = new javax.swing.GroupLayout(btn_sanction);
        btn_sanction.setLayout(btn_sanctionLayout);
        btn_sanctionLayout.setHorizontalGroup(
            btn_sanctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_sanctionLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(0, 176, Short.MAX_VALUE))
            .addGroup(btn_sanctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_sanctionLayout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(48, Short.MAX_VALUE)))
        );
        btn_sanctionLayout.setVerticalGroup(
            btn_sanctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_sanctionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(btn_sanctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_sanctionLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(jToggleButton7)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        jPanel3.add(btn_sanction, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        btn_statistiques.setBackground(new java.awt.Color(54, 33, 89));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/images/icons8_combo_chart_80px.png"))); // NOI18N

        jToggleButton8.setBackground(new java.awt.Color(54, 33, 89));
        jToggleButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jToggleButton8.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton8.setText("statestiques");
        jToggleButton8.setBorder(null);

        javax.swing.GroupLayout btn_statistiquesLayout = new javax.swing.GroupLayout(btn_statistiques);
        btn_statistiques.setLayout(btn_statistiquesLayout);
        btn_statistiquesLayout.setHorizontalGroup(
            btn_statistiquesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_statistiquesLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 172, Short.MAX_VALUE))
            .addGroup(btn_statistiquesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_statistiquesLayout.createSequentialGroup()
                    .addGap(85, 85, 85)
                    .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(51, Short.MAX_VALUE)))
        );
        btn_statistiquesLayout.setVerticalGroup(
            btn_statistiquesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_statistiquesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(btn_statistiquesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_statistiquesLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(jToggleButton8)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        jPanel3.add(btn_statistiques, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 160, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("RH PLUS");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 250, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void nbr_employes(){
        try {
            Mes_outils.stm=Mes_outils.con.createStatement();
            Mes_outils.rs=Mes_outils.stm.executeQuery("select COUNT(*) as 'nbr_employes'  from employer ");
            if(Mes_outils.rs.next()){
                String nbr=Mes_outils.rs.getString("nbr_employes")+" Employes";
                jLabel14.setText(nbr);
            }
            Mes_outils.rs=Mes_outils.stm.executeQuery("select COUNT(*) as 'nbr_services'  from service ");
             if(Mes_outils.rs.next()){
                String nbr1=Mes_outils.rs.getString("nbr_services")+" Services";
                jLabel15.setText(nbr1);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Aceuil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void statistiques(){
        try {
            /* try {
            String query="SELECT Cin_emp,nbr_jour from conge";
            JDBCCategoryDataset dataset=new JDBCCategoryDataset(Connexion.connecterDB(), query);
            JFreeChart chart=ChartFactory.createLineChart("Quey chart", "pressue", "Date", dataset, PlotOrientation.VERTICAL, false, true,true);
            BarRenderer render=null;
            CategoryPlot plot=null;
            render=new BarRenderer();
            ChartFrame frame=new ChartFrame("Query", chart);
            frame.setVisible(true);
            frame.setSize(100, 650);
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            }*/
           
            Mes_outils.stm=Mes_outils.con.createStatement();
            Mes_outils.rs=Mes_outils.stm.executeQuery("select COUNT(*) as 'nbr_conges' ,Cin_emp from conge GROUP by Cin_emp ");
            
            //SELECT DATEDIFF(CURRENT_DATE,Date_fin) as 'Date_fin' ,e.Nom_emp from contrat_determine c INNER join employer e on(e.id_contrat_determine=c.id_contrat_determine) where DATEDIFF(CURRENT_DATE,Date_fin)<40
            DefaultCategoryDataset dataBar=new DefaultCategoryDataset();
            while (Mes_outils.rs.next())
            {
                int nbr = Mes_outils.rs.getInt("nbr_conges");
                String cin=Mes_outils.rs.getString("Cin_emp");
                dataBar.setValue(nbr, cin, "2009");
              } 
                JFreeChart chart=ChartFactory.createBarChart("Les statistiques des employes", "Les employes", "", dataBar, PlotOrientation.VERTICAL, true, true,true);
                ChartFrame frame=new ChartFrame("keluhan siswa",chart);
                frame.setSize(800, 400);
                frame.setVisible(true);
           
        } catch (SQLException ex) {
            Logger.getLogger(Aceuil.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     }
     public void les_employes_qui_se_termine(){
         DefaultTableModel D = new DefaultTableModel(null,new String[]{"Cin","Nom","Prenom","Nbr _jour_restant"});
      try {
             Mes_outils.stm=Mes_outils.con.createStatement();
            Mes_outils.rs=Mes_outils.stm.executeQuery("SELECT  DATEDIFF(CURRENT_DATE,Date_fin) as 'le_nbr_de_jour_restant ' ,e.Nom_emp,e.Cin_emp,e.Prenom_emp,e.Numero_tel_emp from contrat_determine c INNER join employer e on(e.id_contrat_determine=c.id_contrat_determine) where DATEDIFF(CURRENT_DATE,Date_fin)<40 ");
            while(Mes_outils.rs.next()){
               
                 D.addRow(new Object[]{Mes_outils.rs.getObject(3),Mes_outils.rs.getObject(2),Mes_outils.rs.getObject(4),Mes_outils.rs.getObject(5),Mes_outils.rs.getObject(1)});
            }
            
            jTable1.setModel(D);          
        } catch (SQLException ex) {
            Logger.getLogger(Aceuil.class.getName()).log(Level.SEVERE, null, ex);
        }
             
     }
    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
      
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel2FocusLost
     
    }//GEN-LAST:event_jPanel2FocusLost
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aceuil().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_absence;
    private javax.swing.JPanel btn_parametres;
    private javax.swing.JPanel btn_pointage;
    private javax.swing.JPanel btn_sanction;
    private javax.swing.JPanel btn_statistiques;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    // End of variables declaration//GEN-END:variables
}
