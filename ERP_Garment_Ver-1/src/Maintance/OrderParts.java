
package Maintance;


import MainSystem.AutoDB_Connect;
import MainSystem.AutoIdGenerator;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoSqlQuery;
import static MainSystem.MainWindow.validation;
import com.github.lgooddatepicker.components.DatePickerSettings;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import javax.swing.JTextField;


public class OrderParts extends javax.swing.JInternalFrame {
   //private String description;




    public  OrderParts() {
        initComponents();
        TableLoad1();
        TableLoad2();
        TextBoxClear1();
        TextBoxClear2();
        generate_Oder_ID();
        

        FillTextCombo1();
       // FillTextCombo2();
        FillTextCombo3();
        datePicker3.setDateToToday();
        datePicker2.setDateToToday();
       
  
       

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldDescription = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        DatePickerSettings dateSettings1 = new DatePickerSettings();
        dateSettings1.setFormatForDatesCommonEra("yyyy/MM/dd");
        dateSettings1.setFormatForDatesBeforeCommonEra("uuuu/MM/dd");
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker(dateSettings1);
        jButtonADD = new javax.swing.JButton();
        jButtonResetAll = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldAmount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanelcustomerSearch = new javax.swing.JPanel();
        jTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        ResetButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jTextFieldDescription1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        DatePickerSettings dateSettings = new DatePickerSettings();
        dateSettings.setFormatForDatesCommonEra("yyyy/MM/dd");
        dateSettings.setFormatForDatesBeforeCommonEra("uuuu/MM/dd");
        datePicker3 = new com.github.lgooddatepicker.components.DatePicker(dateSettings);
        jButtonADD1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldAmount1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jTextField3 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();

        setResizable(true);
        setTitle("OderParts");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Title Description", "Company Name", "Technician ID", "Technician Name", "Date"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 650, 370));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldDescription.setName("Description"); // NOI18N
        jPanel2.add(jTextFieldDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 130, -1));
        jTextFieldDescription.getAccessibleContext().setAccessibleName("");

        jLabel2.setText("Order ID");
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 52, -1, -1));

        jLabel3.setText("Description");
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel7.setText("Date");
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        datePicker2.setName("");
        jPanel2.add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        jButtonADD.setText("ADD ");
        jButtonADD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonADDActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, -1, -1));

        jButtonResetAll.setText("Reset All");
        jButtonResetAll.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonResetAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetAllActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonResetAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        jLabel4.setText("Company Name");
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel5.setText("Amount");
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jTextFieldAmount.setName("Amount"); // NOI18N
        jPanel2.add(jTextFieldAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 130, -1));
        jTextFieldAmount.getAccessibleContext().setAccessibleName("");

        jLabel6.setText("Technician ID(Recommend)");
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel12.setText("Technician Name");
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SINGER", "ABANS" }));
        jPanel2.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 130, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 130, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Technician ID" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 130, -1));

        jTextField2.setName("Technician Name"); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 130, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 510, 520));

        jTabbedPane1.addTab("Oder Add", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelcustomerSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelcustomerSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 120, -1));
        jPanelcustomerSearch.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jButton8.setText("View All");
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        Search.setText("Search");
        Search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel1.setText("Order ID");
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelcustomerSearch.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, -1));

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

        jPanelcustomerSearch.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        ResetButton1.setText("Reset All");
        ResetButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ResetButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButton1ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(ResetButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jPanel3.add(jPanelcustomerSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 520, 500));

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldDescription1.setName("Customer Name"); // NOI18N
        jPanel6.add(jTextFieldDescription1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 110, -1));

        jLabel11.setText("Description");
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel14.setText("Date");
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        datePicker3.setName(""); // NOI18N
        jPanel6.add(datePicker3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        jButtonADD1.setText("Delete");
        jButtonADD1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonADD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonADD1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonADD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, -1, -1));

        jLabel19.setText("Company Name");
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel20.setText("Amount");
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jTextFieldAmount1.setName("Phone number"); // NOI18N
        jPanel6.add(jTextFieldAmount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 110, -1));

        jLabel21.setText("Technician ID(Recommend)");
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel22.setText("Technician Name");
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jButton4.setText("Edit");
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        jPanel6.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 130, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ABANS", "SINGER" }));
        jPanel6.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 110, -1));
        jPanel6.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 130, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 510, 520));

        jTabbedPane1.addTab("Search & Edit || Delete", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Reports", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADDActionPerformed
    OrderAdd();
    TableLoad1();
    
    
    
    }//GEN-LAST:event_jButtonADDActionPerformed

    private void jButtonResetAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetAllActionPerformed
           TextBoxClear1();
                       
    }//GEN-LAST:event_jButtonResetAllActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
                
      
    }//GEN-LAST:event_jButton8ActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        TechSearch();
        
    }//GEN-LAST:event_SearchActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int row =jTable2.getSelectedRow();
        String o_id = jTable2.getValueAt(row,0).toString();
        String description = jTable2.getValueAt(row,1).toString();
        String c_name = jTable2.getValueAt(row,2).toString();
        String amount = jTable2.getValueAt(row,3).toString();
        String t_id = jTable2.getValueAt(row,4).toString();
        String t_name = jTable2.getValueAt(row,5).toString();
        String date = jTable2.getValueAt(row,6).toString();
    
        
      jTextField.setText(o_id);
      jTextFieldDescription1.setText(description);
      jComboBox5.setSelectedItem(c_name);
      jTextFieldAmount1.setText(amount);
      jComboBox3.setSelectedItem(t_id);
      jTextField3.setText(t_name);
      datePicker3.setText(date); 
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButtonADD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADD1ActionPerformed
        DeleteOder_Parts();
        TextBoxClear2();
    }//GEN-LAST:event_jButtonADD1ActionPerformed

    private void ResetButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButton1ActionPerformed
      TextBoxClear2();
   

    }//GEN-LAST:event_ResetButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       EditOder_Parts ();
        TableLoad2();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    int row =jTable1.getSelectedRow();
        String o_id = jTable1.getValueAt(row,0).toString();
        String description = jTable1.getValueAt(row,1).toString();
        String c_name = jTable1.getValueAt(row,2).toString();
        String amount = jTable1.getValueAt(row,3).toString();
        String t_id = jTable1.getValueAt(row,3).toString();
        String t_name = jTable1.getValueAt(row,3).toString();
        String date = jTable1.getValueAt(row,4).toString();
    
        
      jTextField1.setText(o_id);
      jTextFieldDescription.setText(description);
      jComboBox6.setSelectedItem(c_name);
      jTextFieldAmount.setText(amount);
      jComboBox1.setSelectedItem(t_id);
      jTextField2.setText(t_name);
      datePicker2.setText(date); 
   
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
         FillTextCombo1();
          
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
       FillTextCombo2();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

     private void generate_Oder_ID(){
    AutoIdGenerator o_id = new AutoIdGenerator();
    jTextField1.setText(o_id.generate("ACC",Integer.toString(MainWindow.userid)));
    }
    
    
     
     
    
      private void TableLoad1()
  {
      AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM `garmentsystem`.`Order_Part`");
      
      jTable1.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));

  }
    
       private void TableLoad2 ()
  {
      AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM `garmentsystem`.`Order_Part`");
      
      jTable2.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));

  }
      
    
public void OrderAdd(){
    
      if(validation.ValidationCheck(jTextField1, true, 0, '@')
              &&validation.ValidationCheck(jTextFieldDescription, true,0,'@')
              &&validation.ValidationCheck(jTextFieldAmount, true,0,'1')
              &&validation.ValidationCheck(jTextField2, true,0,'@'))
      {
      String o_id = jTextField1.getText();
      String description = jTextFieldDescription.getText();
      String c_name = jComboBox6.getSelectedItem().toString();
      float amount = Float.parseFloat(jTextFieldAmount.getText());
      String t_id = jComboBox1.getSelectedItem().toString();
      String t_name = jTextField2.getText();
      String date = datePicker2.getText();
      
      
     
    
      boolean x = autoSqlQuery.execute("INSERT INTO `garmentsystem`.`Order_Part`\n" +
"(`OrderID`,\n" +
"`Description`,\n" +
"`CompanyName`,\n" +
"`Amount`,\n" +
"`TechnicianID`,\n" +
"`TechnicianName`,\n" +
"`Date`)\n" +
"VALUES\n" +
"('"+o_id+"',\n" +
"'"+description+"',\n" +
"'"+c_name+"',\n" +
""+amount+",\n" +
"'"+t_id+"',\n" +
"'"+t_name+"',\n" +
"'"+date+"');");
    
         try
        {
            if(x==true)
            {
                TableLoad1();
               TextBoxClear1();
                JOptionPane.showMessageDialog(null,"Susseccfuly Added");
                
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        
        }
        }}


    private void DeleteOder_Parts()
    {
        String o_id = jTextField.getText();
        
        boolean x = autoSqlQuery.execute("DELETE FROM `garmentsystem`.`Order_Part`\n" +
"WHERE OrderID LIKE '"+o_id+"';");
        
        try
        {
            if (x==true)
            {
                TextBoxClear2();
                TableLoad2();
                JOptionPane.showMessageDialog(null,"Susseccfuly Deleted");
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }
    
    
    
    public void TechSearch()
    {
        {
            String t_id = jTextField.getText();
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.Order_Part WHERE TechnicianID LIKE '"+t_id+"'");
            jTable2.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
        }
                   
    }





private void EditOder_Parts(){

    if(validation.ValidationCheck(jTextField1, true, 0, 'a')&&validation.ValidationCheck(jTextFieldDescription, true,0,'1')&&validation.ValidationCheck(jTextFieldAmount, true,0,'1')&&validation.ValidationCheck(jTextField2, true,0,'1'))
      {
    
   String o_id = jTextField.getText();
   String description = jTextFieldDescription1.getText();
   String c_name = jComboBox5.getSelectedItem().toString();
   float amount = Float.parseFloat(jTextFieldAmount1.getText());
   String t_id = jComboBox3.getSelectedItem().toString();
   String t_name = jTextField3.getText();
   String date = datePicker3.getText();
      
    boolean x = autoSqlQuery.execute("UPDATE `garmentsystem`.`Order_Part`\n" +
"(`OrderID`,\n" +
"`Description`,\n" +
"`CompanyName`,\n" +
"`Amount`,\n" +
"`TechnicianID`,\n" +
"`TechnicianName`,\n" +
"`Date`)\n" +
"VALUES\n" +
"('"+o_id+"',\n" +
"'"+description+"',\n" +
"'"+c_name+"',\n" +
""+amount+",\n" +
"'"+t_id+"',\n" +
"'"+t_name+"',\n" +
"'"+date+"');");
          
      try
        {
            if(x==true)
            {
               TableLoad2();
               TextBoxClear2();
               JOptionPane.showMessageDialog(null,"Susseccfuly Update");
                
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
    
        }}
     
      
     
    
    
    
     private void TextBoxClear1(){
     
         jTextField1.setText("");
         jTextFieldDescription.setText("");
         //jComboBox6.setSelectedIndex(0);
         
         jTextFieldAmount.setText("");
         //jComboBox1.setSelectedIndex(0);
         jTextField2.setText("");
         datePicker2.setDateToToday();
     }
  
      private void TextBoxClear2(){
     
         jTextField.setText("");
         jTextFieldDescription1.setText("");
         //jComboBox5.setSelectedIndex(0);
         
         jTextFieldAmount1.setText("");
         //jComboBox1.setSelectedIndex(0);
         jTextField3.setText("");
         datePicker3.setDateToToday();
     }
     
          private void FillTextCombo1()
    {
        try
        {
            AutoDB_Connect.DB_ResultSet=autoSqlQuery.executeQuery("select * from emp_table  where position = 'Technician'");
            
            while(AutoDB_Connect.DB_ResultSet.next())
            {
                String t_id = AutoDB_Connect.DB_ResultSet.getString("emp_id");
                jComboBox1.addItem(t_id);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
        
        
    }
     
       private void FillTextCombo2()
    {
        try
        {
            String id=jComboBox1.getSelectedItem().toString();
            AutoDB_Connect.DB_ResultSet=autoSqlQuery.executeQuery("select * from emp_table  where emp_id = '"+id+"'");
            
           AutoDB_Connect.DB_ResultSet.next();
                String t_name = AutoDB_Connect.DB_ResultSet.getString("f_name");
                jTextField2.setText(t_name);
            
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
        
        
    }
       
        private void FillTextCombo3()
    {
        try
        {
            AutoDB_Connect.DB_ResultSet=autoSqlQuery.executeQuery("select * from emp_table  where position = 'Technician'");
            
            while(AutoDB_Connect.DB_ResultSet.next())
            {
                String t_id = AutoDB_Connect.DB_ResultSet.getString("emp_id");
                jComboBox3.addItem(t_id);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
        
        
    }
       
       
       
       
          


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ResetButton1;
    private javax.swing.JButton Search;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private com.github.lgooddatepicker.components.DatePicker datePicker3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButtonADD;
    private javax.swing.JButton jButtonADD1;
    private javax.swing.JButton jButtonResetAll;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JPanel jPanelcustomerSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextFieldAmount;
    private javax.swing.JTextField jTextFieldAmount1;
    private javax.swing.JTextField jTextFieldDescription;
    private javax.swing.JTextField jTextFieldDescription1;
    // End of variables declaration//GEN-END:variables

    
   

    

   
   

    
}
