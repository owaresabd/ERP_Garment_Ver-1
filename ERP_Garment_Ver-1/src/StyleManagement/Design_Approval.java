
package StyleManagement;

import com.github.lgooddatepicker.components.DatePickerSettings;
import MainSystem.AutoIdGenerator;
import MainSystem.AutoDB_Connect;
import net.proteanit.sql.DbUtils;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoReport;
import static MainSystem.MainWindow.autoSqlQuery;
import javax.swing.JOptionPane;

/**
 *
 * @author Dinushka
 */
public class Design_Approval extends javax.swing.JInternalFrame {






    /**
     * Creates new form SalesDesignInquiry
     */
    public Design_Approval() {
        
        initComponents();
        TableLoad();
        FillTextCombo();
        FillTextCombo1();
        FillTextComboApprover();
        TableLoad2();
        TableLoad4();
        generate_Aid();
        datePicker1.setDateToToday();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Approval = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jTextField7 = new javax.swing.JTextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        DatePickerSettings dateSettings1 = new DatePickerSettings();
        dateSettings1.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings1.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker(dateSettings1);
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        Appid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Appstid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Appname = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        DatePickerSettings dateSettings11 = new DatePickerSettings();
        dateSettings11.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings11.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker(dateSettings11);
        jLabel18 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Appcomment = new javax.swing.JTextArea();
        Appstatus = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();

        setResizable(true);
        setTitle("Design Approval Form");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 153)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("View Design");
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Design ID" }));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Style Id", "Style Description", "Size", "Gender", "Type", "Collection", "Colour", "Status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 54, 714, 130));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setText("Status");
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel4.setText("Approval Name");
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 26));

        jLabel13.setText("Approval ID");
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 21));

        Approval.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setText("Approve");
        jRadioButton1.setToolTipText("Click Me");
        jPanel8.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jTextField7.setEnabled(false);
        jTextField7.setToolTipText("System Generated AID");
        jPanel8.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 129, 28));

        Approval.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton2.setText("Not Approved");
        jRadioButton2.setToolTipText("Click Me");
        jPanel8.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel16.setText("Comment");
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText("Give a Comment");
        jScrollPane3.setViewportView(jTextArea1);

        jPanel8.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        jLabel2.setText("Date");
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        datePicker1.setName("");
        datePicker1.setEnabled(false);
        jPanel8.add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        jLabel3.setText("StyleId");
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jTextField1.setToolTipText("StyleID fills");
        jPanel8.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 166, 33));

        jButton7.setText("Add Approve");
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setToolTipText("");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        jButton8.setText("Reset");
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        jButton5.setText("Demo");
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 70, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Approver" }));
        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox3.setToolTipText("Approver Please");
        jPanel8.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 130, 30));
        jComboBox3.getAccessibleContext().setAccessibleDescription("");

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 700, 310));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Approved ID");
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", " " }));
        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 99, -1));

        jButton1.setText("View");
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jButton3.setText("View All");
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ApprovalID", "ApprovedBy", "StyleId", "Status", "Comment", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 45, 523, 107));

        jButton4.setText("Update");
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 403, -1, -1));

        jLabel14.setText("Approval ID");
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 158, -1, 21));

        Appid.setToolTipText("No need to type fill here");
        jPanel4.add(Appid, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 157, 30));

        jLabel5.setText("StyleId");
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 337, -1, -1));

        Appstid.setToolTipText("No need to type fill here");
        jPanel4.add(Appstid, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 157, 28));

        jLabel6.setText("Approval Name");
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 199, -1, 26));

        Appname.setToolTipText("No need to type fill here");
        jPanel4.add(Appname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 157, 26));

        jLabel17.setText("Status");
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 249, -1, -1));

        jLabel7.setText("Date");
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 288, -1, -1));

        datePicker2.setEnabled(false);
        jPanel4.add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 157, -1));

        jLabel18.setText("Comment");
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        Appcomment.setColumns(20);
        Appcomment.setRows(5);
        Appcomment.setToolTipText("No need to type fill here");
        jScrollPane4.setViewportView(Appcomment);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 180, 110));

        Appstatus.setToolTipText("No need to type fill here");
        jPanel4.add(Appstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 157, 28));

        jButton10.setText("Delete");
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 403, -1, -1));

        jButton6.setText("Reset");
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 403, 70, -1));

        jButton12.setText("Report");
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 14, 570, 500));

        jButton9.setText("ViewAll");
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jButton11.setText("View Cost");
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 130, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1330, 530));

        jTabbedPane1.addTab("Approve Designs", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CreateDesignSearch();
        FillTextCombo();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        AddDesignApproval();
        TableLoad2();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        TableLoad();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        FillTextCombo1();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        TableLoad4();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        
        
        int row =jTable2.getSelectedRow();
        String id = jTable2.getValueAt(row,0).toString();
        String by = jTable2.getValueAt(row,1).toString();
        String stid = jTable2.getValueAt(row,2).toString();
        String status = jTable2.getValueAt(row,3).toString();
        String comment = jTable2.getValueAt(row,4).toString();
        String date = jTable2.getValueAt(row,5).toString();

        Appid.setText(id);
        Appname.setText(by);
        Appcomment.setText(comment);
        Appstatus.setText(status);
        Appstid.setText(stid);
        datePicker2.setText(date);

        
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        int row =jTable1.getSelectedRow();
        String id = jTable1.getValueAt(row,0).toString();
        
         jTextField1.setText(id);
         jTextField4.setText(id);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        TableLoad4();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        EditApprovedDesigns();
        TextBoxClear2();
        TableLoad2();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        //Load data by usingg Demo
        
        jTextArea1.setText("Approved");
       jRadioButton1.setSelected(true);
        jComboBox3.setSelectedItem("dinu");
        datePicker1.setDateToToday();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        DeleteApprovedDesigns();
        TextBoxClear2();
        TableLoad2();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Reset();
        //generate AID again
        generate_Aid();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        //Reset update and delete added approve
        TextBoxClear2();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        String FileLocation=System.getProperty("user.dir")+"\\src\\StyleManagement\\Reports\\Approval.jrxml";
        autoReport.Table2Report(FileLocation, jTable2);
    }//GEN-LAST:event_jButton12ActionPerformed


        private void generate_Aid(){
    AutoIdGenerator aid = new AutoIdGenerator();
    jTextField7.setText(aid.generate("AID",Integer.toString(MainWindow.userid)));
    }
    private void TableLoad()
    {

            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT StyleId,StyleDesc,Size,Gender,Type,Collection,Color,Status FROM `garmentsystem`.`T_Design_table`;");
            jTable1.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));

    }
    private void TableLoad2()
    {

            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM `garmentsystem`.`T_Design_Approval_Table`;");
            jTable2.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
    }
    
    
    private void TextBoxClear(){
            
            jTextField7.setText("");
            jComboBox3.setSelectedItem("");
            jTextArea1.setText("");
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            datePicker1.setText("");
    }
     private void TextBoxClear2(){
            
            Appid.setText("");
            Appname.setText("");
            Appstid.setText("");
            Appstatus.setText("");
            Appcomment.setText("");
    }
    
   
    
    public void AddDesignApproval()
    {
        
        
        String id = jTextField7.getText();
        String name = jComboBox3.getSelectedItem().toString();
        String StyleId = jTextField1.getText();
        String comment =  jTextArea1.getText();
        
        jRadioButton1.setActionCommand("Approve");
        jRadioButton2.setActionCommand("NotApprove");
        
        
        String status = Approval.getSelection().getActionCommand();
        
        String date = datePicker1.getText();
        
        if(id.isEmpty()||name.isEmpty()||StyleId.isEmpty()||comment.
        isEmpty()||status.isEmpty()||date.isEmpty())
        {
        JOptionPane.showMessageDialog(null, "WARNING FIELDS ARE EMPTY");
        }
        if(comment.length()>10){
            
            JOptionPane.showMessageDialog(null, "WARNING YOU CAN'T ENTER MORE "
                    + "IN THE STYLE DESCRIPTION FIELD");
            
            
        }
        else{
            try
        {
        
        
       boolean  x = autoSqlQuery.execute("INSERT INTO `garmentsystem`.`T_Design_Approval_Table`\n" +
"(`ApprovalId`,\n" +
"`ApprovedBy`,\n" +
"`StyleId`,\n" +
"`Status`,\n" +
"`Comment`,\n" +
"`Date`)\n" +
"VALUES\n" +
"('"+id+"',\n" +
"'"+name+"',\n" +
"'"+StyleId+"',\n" +
"'"+status+"',\n" +
"'"+comment+"',\n" +
"'"+date+"');");
        
        
            if(x==true)
            {
                TableLoad2();
                TextBoxClear2();
                JOptionPane.showMessageDialog(null,"SUCCESSFULLY ADDED");
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        }
        
        
        
      
    }
     private void FillTextCombo()
    {
        try
        {
            AutoDB_Connect.DB_ResultSet=autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.T_Design_table");
            
            while(AutoDB_Connect.DB_ResultSet.next())
            {
                String id = AutoDB_Connect.DB_ResultSet.getString("StyleId");
                jComboBox1.addItem(id);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
        
        
    }
     public void CreateDesignSearch()
    {
        String StyleId = jComboBox1.getSelectedItem().toString();
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * "
         + "FROM garmentsystem.T_Design_table WHERE StyleId = '"+StyleId+"'");
   jTable1.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));       
    }
     
        private void FillTextCombo1()
    {
        try
        {
            AutoDB_Connect.DB_ResultSet=autoSqlQuery.executeQuery("SELECT *"
                    + "FROM `garmentsystem`.`T_Design_Approval_Table`;");
            
            while(AutoDB_Connect.DB_ResultSet.next())
            {
                String id = AutoDB_Connect.DB_ResultSet.getString("ApprovalId");
                jComboBox2.addItem(id);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
        
        
        
        
    }
        private void TableLoad4()
    {

            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECt * "
             + "FROM `garmentsystem`.`T_Design_Approval_Table`;");
            jTable2.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.
                    DB_ResultSet));

    }
        
        public void EditApprovedDesigns()
    {
        String id = Appid.getText();
        String by =   Appname.getText();
        String stid = Appstid.getText();
        String status = Appstatus.getText();
        String comment =  Appcomment.getText();
        String date = datePicker2.getText();
        
         if(id.isEmpty()||by.isEmpty()||stid.isEmpty()||status.
        isEmpty()||comment.isEmpty()||date.isEmpty()){
        JOptionPane.showMessageDialog(null, "WARNING FIELDS ARE EMPTY");
        }
        
        else if(comment.length()>10){
            
            JOptionPane.showMessageDialog(null, "WARNING YOU CAN'T ENTER MORE "
                    + "IN THE STYLE DESCRIPTION FIELD");
            
            
        }
        else{
             try
        {
        
        
        int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want"
                + " to Update?", "Update?", 
                            JOptionPane.YES_NO_OPTION);
        
          if (reply == JOptionPane.YES_OPTION){
        
        boolean x = autoSqlQuery.execute("UPDATE `garmentsystem`.`T_Design_Approval_Table`\n" +
"SET\n" +
"`ApprovalId` = '"+id+"',\n" +
"`ApprovedBy` = '"+by+"',\n" +
"`StyleId` = '"+stid+"',\n" +
"`Status` = '"+status+"',\n" +
"`Comment` = '"+comment+"',\n" +
"`Date` = '"+date+"'\n" +
"WHERE `ApprovalId` = '"+id+"'");
       
            if(x==true){
               Reset();
               JOptionPane.showMessageDialog(null,"SUCCESSFULLY UPDATED");
             }
             else
             {
              
              
             }
        }
            }
            
       
        catch (Exception ex){
            System.out.println(ex);
        }
      
          }
       

    }
         private void DeleteApprovedDesigns()
    {
        String id =Appid.getText();
         if(id.isEmpty()){
        JOptionPane.showMessageDialog(null, "WARNING FIELDS ARE EMPTY");
        }
         else{
             try
        {
         
       int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to Delete?", "Delete?", 
                            JOptionPane.YES_NO_OPTION);
        
        if (reply == JOptionPane.YES_OPTION){ 
        
        boolean x = autoSqlQuery.execute("DELETE FROM `garmentsystem`.`T_Design_Approval_Table`\n" +
"WHERE ApprovalId = '"+id+"';");
        
        
            if (x==true)
            {
                TextBoxClear2();
                TableLoad2();
                JOptionPane.showMessageDialog(null,"Successfully Deleted");
            }
            
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }
    }
         public void Reset(){
        jTextField7.setText("");
        jTextField4.setText("");
        jComboBox3.setSelectedItem("");
        jTextField1.setText("");
        jTextArea1.setText("");
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        datePicker1.setText("");
         }
         
         private void FillTextComboApprover()
    {
        try
        {
            AutoDB_Connect.DB_ResultSet=autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.emp_table");
            
            while(AutoDB_Connect.DB_ResultSet.next())
            {
                String approver = AutoDB_Connect.DB_ResultSet.getString("f_name");
                jComboBox3.addItem(approver);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
        
        
    }
    
   
    
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Appcomment;
    private javax.swing.JTextField Appid;
    private javax.swing.JTextField Appname;
    private javax.swing.ButtonGroup Approval;
    private javax.swing.JTextField Appstatus;
    private javax.swing.JTextField Appstid;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

    private void generate_Sid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
