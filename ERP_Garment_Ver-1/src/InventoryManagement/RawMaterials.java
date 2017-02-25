
package InventoryManagement;

import com.github.lgooddatepicker.components.DatePickerSettings;
import MainSystem.AutoIdGenerator;
import static MainSystem.AutoSQLQuery.db_con;
import MainSystem.DB_Connect;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import MainSystem.MainWindow;

/**
 *
 * @author Dinushka
 */
public class RawMaterials extends javax.swing.JInternalFrame {
DefaultTableModel model;
int RowCountjTable;





    /**
     * Creates new form SalesDesignInquiry
     */
    public RawMaterials() {
        
        initComponents();
        TableLoad();
        TableLoad2();
        
        
        generate_mid();
        datePicker2.setDateToToday();
      
    }

    /**
     * This method is called from within the constructor to initialised the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        idfield = new javax.swing.JTextField();
        namefield = new javax.swing.JTextField();
        costfield = new javax.swing.JTextField();
        quantityfield = new javax.swing.JTextField();
        reorderfield = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        valuefield = new javax.swing.JTextField();
        DatePickerSettings dateSettings1 = new DatePickerSettings();
        dateSettings1.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings1.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker(dateSettings1);
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        searchname = new javax.swing.JTextField();
        ViewAll = new javax.swing.JButton();
        ResetButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        DatePickerSettings dateSettings2 = new DatePickerSettings();
        dateSettings2.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings2.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker(dateSettings2);
        EditButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setResizable(true);
        setTitle("Raw Materils");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Material ID");
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setText("Material Name");
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel14.setText("Material Cost Per Unit");
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel19.setText("Quantity");
        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel20.setText("Re-Order Quantity");
        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel21.setText("Date");
        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        idfield.setEditable(false);

        quantityfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityfieldActionPerformed(evt);
            }
        });
        quantityfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityfieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityfieldKeyTyped(evt);
            }
        });

        AddButton.setText("Add Material");
        AddButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        ResetButton.setText("Reset All");
        ResetButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Value");
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        valuefield.setEnabled(false);
        valuefield.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valuefield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                valuefieldKeyReleased(evt);
            }
        });

        datePicker2.setEnabled(false);
        datePicker2.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddButton)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel2))
                        .addGap(97, 97, 97)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idfield, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(namefield)
                            .addComponent(costfield)
                            .addComponent(quantityfield)
                            .addComponent(reorderfield)
                            .addComponent(valuefield)
                            .addComponent(datePicker2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(67, 67, 67)
                .addComponent(ResetButton)
                .addGap(66, 66, 66))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(idfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(costfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(quantityfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(valuefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(reorderfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(datePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton)
                    .addComponent(ResetButton))
                .addGap(50, 50, 50))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 680, 530));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 600, 530));

        jTabbedPane1.addTab("ADD Materials", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel12.setText("Material Name");
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ViewAll.setText("View All");
        ViewAll.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAllActionPerformed(evt);
            }
        });

        ResetButton1.setText("Reset All");
        ResetButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ResetButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButton1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton1.setText("Search");
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(142, 142, 142)
                .addComponent(searchname, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ResetButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(searchname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ViewAll)
                        .addComponent(jButton1)))
                .addGap(28, 28, 28)
                .addComponent(ResetButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 680, 530));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setText("Material ID");
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setText("Material Name");
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setText("Material Cost Per Unit");
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setText("Quantity");
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setText("Material Value");
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setText("Re-Order Quantity");
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setText("Date");
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        datePicker1.setName(""); // NOI18N
        datePicker1.setEnabled(false);
        datePicker1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        EditButton.setText("Edit");
        EditButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(88, 88, 88)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField6)
                        .addComponent(jTextField5)
                        .addComponent(jTextField4)
                        .addComponent(jTextField3)
                        .addComponent(jTextField2)
                        .addComponent(jTextField1)
                        .addComponent(datePicker1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(jLabel7))
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(62, 62, 62))
                    .addComponent(jLabel10)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditButton)
                    .addComponent(DeleteButton))
                .addGap(32, 32, 32))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 600, 530));

        jTabbedPane1.addTab("Search & Edit || Delete", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Reports", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        // TODO add your handling code here:
        TextBoxClear();
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void quantityfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityfieldKeyTyped
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_quantityfieldKeyTyped

    private void quantityfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityfieldActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here;
        
        AddMaterial();
        TableLoad();
        TableLoad2();
        TextBoxClear();
        
        
        
    }//GEN-LAST:event_AddButtonActionPerformed


    
    private void quantityfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityfieldKeyReleased
        // TODO add your handling code here:
        double qty = Double.parseDouble(quantityfield.getText());
        double perunit = Double.parseDouble(costfield.getText());
        
        double val = perunit * qty;
        
        valuefield.setText(Double.toString(val));
    }//GEN-LAST:event_quantityfieldKeyReleased

    private void ViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAllActionPerformed
        // TODO add your handling code here:
        TableLoad2();
    }//GEN-LAST:event_ViewAllActionPerformed

    private void ResetButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButton1ActionPerformed
        // TODO add your handling code here:
        clearSearch();

        
    }//GEN-LAST:event_ResetButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MaterialNameSearch();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int row =jTable2.getSelectedRow();
        String id = jTable2.getValueAt(row,0).toString();
        String name = jTable2.getValueAt(row,1).toString();
        String cost = jTable2.getValueAt(row,2).toString();
        String qty = jTable2.getValueAt(row,3).toString();
        String value = jTable2.getValueAt(row,4).toString();
        String reorder = jTable2.getValueAt(row,5).toString();
        String date = jTable2.getValueAt(row,6).toString();
        
        jTextField1.setText(id);
        jTextField2.setText(name);
        jTextField3.setText(cost);
        jTextField4.setText(qty);
        jTextField5.setText(value);
        jTextField6.setText(reorder);
        datePicker1.setText(date);
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        // TODO add your handling code here:
        EditMaterials();
        TextBoxClear2();
        TableLoad2();
    }//GEN-LAST:event_EditButtonActionPerformed

    private void valuefieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valuefieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_valuefieldKeyReleased

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        // TODO add your handling code here:
        double perunit = Double.parseDouble(jTextField3.getText());
        double qty = Double.parseDouble(jTextField4.getText());
        
        double val = perunit * qty;
        
        jTextField5.setText(Double.toString(val));
    }//GEN-LAST:event_jTextField4KeyReleased

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        String id = jTextField1.getText();
        
        boolean x = db_con.execute("DELETE FROM `garmentsystem`.`Raw_Materials`\n" +
"WHERE Material_id = '"+id+"';");
        
        try
        {
            if (x==true)
            {
                TextBoxClear2();
                TableLoad2();
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        
//        DB_Connect.DB_ResultSet = db_con.executeQuery("DELETE FROM `garmentsystem`.`Raw_Materials`\n" +
//"WHERE Material_id = '"+id+"';");
        


        

    }//GEN-LAST:event_DeleteButtonActionPerformed
    private void generate_mid(){
    AutoIdGenerator aid = new AutoIdGenerator();
    idfield.setText(aid.generate("MAT",Integer.toString(MainWindow.userid)));
    }
    private void TableLoad()
    {

            DB_Connect.DB_ResultSet = db_con.executeQuery("SELECT * FROM garmentsystem.Raw_Materials");
            jTable1.setModel(DbUtils.resultSetToTableModel(DB_Connect.DB_ResultSet));

    }
    private void TableLoad2()
    {

            DB_Connect.DB_ResultSet = db_con.executeQuery("SELECT * FROM garmentsystem.Raw_Materials");
            jTable2.setModel(DbUtils.resultSetToTableModel(DB_Connect.DB_ResultSet));

    }
    private void TextBoxClear(){
            generate_mid();
            namefield.setText("");
            costfield.setText("");
            quantityfield.setText("");
            reorderfield.setText("");
            datePicker2.setText("");
    }
    
    private void TextBoxClear2()
    {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        datePicker1.setText("");
    }
    
    public void AddMaterial()
    {
        
        
        String id = idfield.getText();
        String name = namefield.getText();
        String cost =  costfield.getText();
        String qty = quantityfield.getText();
        String value = valuefield.getText();
        String reorder = reorderfield.getText();
        String date = datePicker2.getText();
        
        boolean x = db_con.execute("INSERT INTO `garmentsystem`.`Raw_Materials`\n" +
"(`Material_id`,\n" +
"`Material_Name`,\n" +
"`Material_cost`,\n" +
"`Material_qty`,\n" +
"`Material_Value`,\n" +
"`Material_reorder`,\n" +
"`Material_date`)\n" +
"VALUES\n" +
"('"+id+"',\n" +
"'"+name+"',\n" +
"'"+cost+"',\n" +
"'"+qty+"',\n" +
"'"+value+"',\n" +
"'"+reorder+"',\n" +
"'"+date+"');");
        
        
        try
        {
            if(x==true)
            {
                TableLoad();
                TextBoxClear();
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
      
    }
    
    public void EditMaterials()
    {
        String id,name,cost,qty,value,reorder,date;
        id=jTextField1.getText();
        name=jTextField2.getText();
        cost=jTextField3.getText();
        qty=jTextField4.getText();
        value=jTextField5.getText();
        reorder=jTextField6.getText();
        date=datePicker1.getText();
        
        boolean x = db_con.execute("UPDATE `garmentsystem`.`Raw_Materials`\n" +
"SET\n" +
"`Material_id` = '"+id+"',\n" +
"`Material_Name` = '"+name+"',\n" +
"`Material_cost` = '"+cost+"',\n" +
"`Material_qty` = '"+qty+"',\n" +
"`Material_Value` = '"+value+"',\n" +
"`Material_reorder` = '"+reorder+"',\n" +
"`Material_date` = '"+date+"'\n" +
"WHERE `Material_id` = '"+id+"'");
        
        try
        {
            if (x==true)
            {
                TextBoxClear2();
                TableLoad2();
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        
        

    }
        
    
        public void MaterialNameSearch()
    {
            String matname = searchname.getText();
            DB_Connect.DB_ResultSet = db_con.executeQuery("SELECT * FROM garmentsystem.Raw_Materials WHERE Material_Name LIKE '"+matname+"%'");
            jTable2.setModel(DbUtils.resultSetToTableModel(DB_Connect.DB_ResultSet));       
    }
    
    public void ChangeMaterialTableHeader()
    {
        jTable1.getColumnModel().getColumn(0).setHeaderValue("Matrial ID");
        jTable1.getColumnModel().getColumn(1).setHeaderValue("Material Name");
        jTable1.getColumnModel().getColumn(2).setHeaderValue("Material Cost");
        jTable1.getColumnModel().getColumn(3).setHeaderValue("Material Quantity");
        jTable1.getColumnModel().getColumn(4).setHeaderValue("Material Re-Order Level");
        jTable1.getColumnModel().getColumn(5).setHeaderValue("Material Added Date");

    }
    

    
    private void clearSearch()
    {
        searchname.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton ResetButton1;
    private javax.swing.JButton ViewAll;
    private javax.swing.JTextField costfield;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private javax.swing.JTextField idfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField namefield;
    private javax.swing.JTextField quantityfield;
    private javax.swing.JTextField reorderfield;
    private javax.swing.JTextField searchname;
    private javax.swing.JTextField valuefield;
    // End of variables declaration//GEN-END:variables
}
