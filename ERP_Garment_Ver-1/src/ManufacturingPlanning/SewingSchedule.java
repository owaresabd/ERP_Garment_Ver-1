
package ManufacturingPlanning;

import MainSystem.AutoIdGenerator;
import MainSystem.MainWindow;


/**
 *
 * @author Dinushka
 */
public class SewingSchedule extends javax.swing.JInternalFrame {



    /**
     * Creates new form SalesDesignInquiry
     */
    public SewingSchedule() {
        initComponents();
        generate_shi();
      
   
    }
    public void AddSewingSchedule(){
        String Schedule_ID=jTextField6.getText();
        String Style_ID=jTextField4.getText();
        //String
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        datePicker4 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel17 = new javax.swing.JLabel();
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel24 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel10 = new javax.swing.JLabel();
        datePicker3 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        datePicker5 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel25 = new javax.swing.JLabel();
        datePicker6 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel26 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();

        setResizable(true);
        setTitle("Sewing Schedule");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("ADD schedule");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, -1, -1));

        jLabel1.setText("Schedule ID");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jTextField6.setEditable(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 130, -1));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Item"));

        jLabel14.setText("Style No");

        jLabel19.setText("Quantity");

        jLabel20.setText("Raw material");

        jButton6.setText("jButton4");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        jLabel4.setText("Size");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 410, 350));

        jLabel29.setText("Room No");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        jLabel28.setText("No of Lines");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, -1));

        jLabel22.setText("Damages");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, -1, -1));
        jPanel2.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 70, -1));
        jPanel2.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 70, -1));
        jPanel2.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, 70, -1));

        jLabel7.setText("pcs");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, -1, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Days"));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setText("End Date");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        jPanel7.add(datePicker4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jLabel17.setText("Start Date");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        jPanel7.add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jLabel24.setText("No of Days per Sample");
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel7.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 110, -1));

        jLabel30.setText("Total No of Days");
        jPanel7.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 110, -1));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 350, 170));

        jLabel5.setText("No of Labourers");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, -1, -1));
        jPanel2.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 100, -1));

        jLabel6.setText("Room No");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, -1, -1));
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 100, -1));

        jLabel9.setText("No of Lines");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, -1, -1));
        jPanel2.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 100, -1));

        jLabel13.setText("Supervisor ID");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, -1));
        jPanel2.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 100, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 1260, 520));

        jTabbedPane1.addTab("ADD Sewing schedule", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Schedule ID");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 34, -1, 10));
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 90, -1));

        jLabel3.setText("Start Date");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));
        jPanel3.add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jLabel10.setText("End Date");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));
        jPanel3.add(datePicker3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        jLabel11.setText("Room No");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 90, -1));

        jLabel12.setText("Supervisor ID");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));
        jPanel3.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 90, -1));

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
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, 310));

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton7.setText("Edit");

        jButton8.setText("Delete");

        jLabel15.setText("Schedule ID");

        jLabel18.setText("Style No");

        jLabel21.setText("Quantity");

        jLabel23.setText("Start Date");

        jLabel25.setText("End Date");

        jLabel26.setText("Supervisor ID");

        jLabel27.setText("Room No");

        jLabel31.setText("No. of Labourers");

        jLabel32.setText("No of Lines");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel31)
                    .addComponent(jLabel27)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15)
                                .addComponent(jLabel18)
                                .addComponent(jLabel21)
                                .addComponent(jLabel23)
                                .addComponent(jLabel25))
                            .addGap(59, 59, 59)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField14)
                                .addComponent(jTextField15)
                                .addComponent(jTextField20)
                                .addComponent(datePicker5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(datePicker6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(jButton7)))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGap(82, 82, 82)
                                    .addComponent(jButton8))
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField22)
                                        .addComponent(jTextField21)
                                        .addComponent(jTextField23)
                                        .addComponent(jTextField24)))))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23)
                    .addComponent(datePicker5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(datePicker6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addGap(20, 20, 20))
        );

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 480, 430));

        jTabbedPane1.addTab("Search &  Delete", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Reports", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AddSewingSchedule();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
       
    }//GEN-LAST:event_jTextField6ActionPerformed
    
    private void generate_shi(){
    AutoIdGenerator aid = new AutoIdGenerator();
    jTextField6.setText(aid.generate("SWG-SHI",Integer.toString(MainWindow.userid)));
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private com.github.lgooddatepicker.components.DatePicker datePicker3;
    private com.github.lgooddatepicker.components.DatePicker datePicker4;
    private com.github.lgooddatepicker.components.DatePicker datePicker5;
    private com.github.lgooddatepicker.components.DatePicker datePicker6;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
