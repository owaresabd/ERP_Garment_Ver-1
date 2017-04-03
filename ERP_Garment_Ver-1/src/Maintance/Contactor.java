
package Maintance;
import com.github.lgooddatepicker.components.DatePickerSettings;
import MainSystem.AutoIdGenerator;
import MainSystem.AutoDB_Connect;
import net.proteanit.sql.DbUtils;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoSqlQuery;
import static MainSystem.MainWindow.validation;
import javax.swing.JOptionPane;


public class Contactor extends javax.swing.JInternalFrame {


    public Contactor() {
        initComponents();
        TextBoxClear1();
        TableLoad1();
        //FillTextCombo1();
        TableLoad2();
        TextBoxClear2();
       // FillTextCombo2()
        generate_Contractor_ID();
       
        datePicker2.setDateToToday();
        datePicker3.setDateToToday();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        DatePickerSettings dateSettings2 = new DatePickerSettings();
        dateSettings2.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings2.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker(dateSettings2);
        jButtonADD = new javax.swing.JButton();
        jButtonResetAll = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldAddress = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanelcustomerSearch = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ResetButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        DatePickerSettings dateSettings1 = new DatePickerSettings();
        dateSettings1.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings1.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker3 = new com.github.lgooddatepicker.components.DatePicker(dateSettings1);
        jButtonADD1 = new javax.swing.JButton();
        jButtonResetAll1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldPhone2 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldEmail2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldAddress2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();

        setResizable(true);
        setTitle("Contactor");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Date");
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        datePicker2.setName(""); // NOI18N
        jPanel2.add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        jButtonADD.setText("ADD ");
        jButtonADD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonADDActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        jButtonResetAll.setText("Reset All");
        jButtonResetAll.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonResetAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetAllActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonResetAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel5.setText("Phone");
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jTextFieldPhone.setName("Phone number"); // NOI18N
        jPanel2.add(jTextFieldPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 110, -1));

        jLabel6.setText("E-Mail");
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jTextFieldEmail.setName("Email"); // NOI18N
        jPanel2.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 110, -1));

        jLabel12.setText("Address");
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jTextFieldAddress.setName("Address"); // NOI18N
        jPanel2.add(jTextFieldAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 210, -1));

        jLabel1.setText("Contractors ID");
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel11.setText("Contactors Name");
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 140, -1));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 140, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 510, 520));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Contactor ID", "Contactor Name", "Phone", "Email", "Address", "Date"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 640, 330));

        jTabbedPane1.addTab("ADD Contactor", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelcustomerSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelcustomerSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setText("View All");
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        jButton5.setText("Search");
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Contractors ID");
        jPanelcustomerSearch.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        ResetButton1.setText("Reset All");
        ResetButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ResetButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButton1ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(ResetButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

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

        jPanelcustomerSearch.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));
        jPanelcustomerSearch.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 110, -1));

        jPanel3.add(jPanelcustomerSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 580, 510));

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Date");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        datePicker3.setName(""); // NOI18N
        jPanel6.add(datePicker3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jButtonADD1.setText("Delete");
        jButtonADD1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonADD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonADD1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonADD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        jButtonResetAll1.setText("Edit");
        jButtonResetAll1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonResetAll1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetAll1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonResetAll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Phone");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jTextFieldPhone2.setName("Phone number"); // NOI18N
        jPanel6.add(jTextFieldPhone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 110, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("E-Mail");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jTextFieldEmail2.setName("Email"); // NOI18N
        jPanel6.add(jTextFieldEmail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 110, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Address");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jTextFieldAddress2.setName("Address"); // NOI18N
        jPanel6.add(jTextFieldAddress2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 210, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Contactors Name");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));
        jPanel6.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 160, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 510, 520));

        jTabbedPane1.addTab("Search & Edit || Delete", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Reports", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADDActionPerformed
 ADDContactor();
 TableLoad1();  
 EditContactor ();
 generate_Contractor_ID();
  
    }//GEN-LAST:event_jButtonADDActionPerformed

    private void jButtonResetAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetAllActionPerformed
    TextBoxClear1();
    }//GEN-LAST:event_jButtonResetAllActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        TableLoad2();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ConSearch();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void ResetButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButton1ActionPerformed
         TextBoxClear2();
        
    }//GEN-LAST:event_ResetButton1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
   int row =jTable2.getSelectedRow();
        String c_id = jTable2.getValueAt(row,0).toString();
        String c_name = jTable2.getValueAt(row,1).toString();
        String phone = jTable2.getValueAt(row,2).toString();
        String em = jTable2.getValueAt(row,3).toString();
        String add = jTable2.getValueAt(row,4).toString();
        String date = jTable2.getValueAt(row,5).toString();
    
        
      jTextField3.setText(c_id);
      jTextField2.setText(c_name);
      jTextFieldPhone2.setText(phone);
      jTextFieldEmail2.setText(em);
      jTextFieldAddress2.setText(add);
      datePicker3.setText(date);       
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButtonADD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADD1ActionPerformed
        DeleteContractor();
        TextBoxClear2();
    }//GEN-LAST:event_jButtonADD1ActionPerformed

    private void jButtonResetAll1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetAll1ActionPerformed
        EditContactor();
        TableLoad2();
    }//GEN-LAST:event_jButtonResetAll1ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
       int row =jTable3.getSelectedRow();
        String c_id = jTable3.getValueAt(row,0).toString();
        String c_name = jTable3.getValueAt(row,1).toString();
        String phone = jTable3.getValueAt(row,2).toString();
        String em = jTable3.getValueAt(row,3).toString();
        String add = jTable3.getValueAt(row,3).toString();
        String date = jTable3.getValueAt(row,4).toString();
    
        
      jTextField4.setText(c_id);
      jTextField1.setText(c_name);
      jTextFieldPhone.setText(phone);
      jTextFieldEmail.setText(em);
      jTextFieldAddress2.setText(add);
      datePicker3.setText(date); 
    }//GEN-LAST:event_jTable3MouseClicked

     private void generate_Contractor_ID(){
    AutoIdGenerator c_id = new AutoIdGenerator();
    jTextField4.setText(c_id.generate("ACC",Integer.toString(MainWindow.userid)));
    }
    
    
    
    
    
        private void TableLoad1()
  {
      AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM `garmentsystem`.`Contactor`");
      
      jTable3.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));

  }
        
        
        private void TableLoad2()
  {
      AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM `garmentsystem`.`Contactor`");
      
      jTable2.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));

  }
        
        
          private void DeleteContractor()
    {
        String c_id = jTextField3.getText();
        
        boolean x = autoSqlQuery.execute("DELETE FROM `garmentsystem`.`Contactor`\n" +
"WHERE Contactor_ID = '"+c_id+"';");
        
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
        
        
        
          
      
              
        public void ADDContactor(){
            
         
   
    
      String c_id = jTextField4.getText();
      String c_name = jTextField1.getText();
      String phone = jTextFieldPhone.getText();
      String em =  jTextFieldEmail.getText();
      String add = jTextFieldAddress.getText();
      String date = datePicker2.getText();

       
   
              
    boolean x = autoSqlQuery.execute("INSERT INTO `garmentsystem`.`Contactor`\n"+
"(`Contactor_ID`,\n" +
"`Contactor_Name`,\n" +
"`Phone`,\n" +
"`Email`,\n" +
"`Address`,\n" +
"`Date`)\n" +
"VALUES\n" +
"('"+c_id+"',\n" + 
"'"+c_name+"',\n" +
"'"+phone+"',\n" +
"'"+em+"',\n" +
"'"+add+"',\n" +
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
        
        
        }}


          public void EditContactor(){
    
      String c_id = jTextField3.getText();
      String c_name = jTextField2.getText();
      String phone = jTextFieldPhone2.getText();
      String em =  jTextFieldEmail2.getText();
      String add = jTextFieldAddress2.getText();
      String date = datePicker3.getText();

       boolean x = autoSqlQuery.execute("UPDATE `garmentsystem`.`Contactor`\n"
                + "SET \n"
       
            
                + "`Contactor_Name` = '" + c_name + "',\n"
                + "`Phone` = '" + phone + "',\n"
                + "`Email` = '" + em + "',\n"
                + "`Address` = '" + add + "',\n"
                + "`Date` = '" + date + "' \n"
                + "WHERE `Contactor_ID` = '" + c_id + "';");
      
              
    
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
        
    
        }}
        
        
           public void ConSearch() {
        {
            String c_id= jTextField3.getText();
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.Contactor WHERE Contactor_ID = '" + c_id + "'");
            jTable2.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
        }

    }
          
          
          
          
           private void TextBoxClear1(){
     
         //jComboBox1.setSelectedIndex(0);
         jTextField1.setText("");
         jTextFieldPhone.setText("");
         
         jTextFieldEmail.setText("");
         jTextFieldAddress.setText("");
         datePicker2.setDateToToday();
     }
         
           
   //       private void FillTextCombo1()
    //{
      //  try
        //{
          //  AutoDB_Connect.DB_ResultSet=autoSqlQuery.executeQuery("select * from Contactor");
            
            //while(AutoDB_Connect.DB_ResultSet.next())
            //{
              //  String c_id = AutoDB_Connect.DB_ResultSet.getString("Contactor_ID");
                //jComboBox1.addItem(c_id);
            //}
        //}
        //catch(Exception ex)
        //{
          //  System.out.println(ex);
        //}
    //}
                 
                 
         private void TextBoxClear2(){
     
         jTextField3.setText("");
         jTextField2.setText("");
         jTextFieldPhone2.setText("");
         
         jTextFieldEmail2.setText("");
         jTextFieldAddress2.setText("");
         datePicker3.setDateToToday();
     }
         
           
 //                private void FillTextCombo2()
  //  {
    //    try
      //  {
        //    AutoDB_Connect.DB_ResultSet=autoSqlQuery.executeQuery("select * from Contactor");
            
          //  while(AutoDB_Connect.DB_ResultSet.next())
            //{
              //  String c_id = AutoDB_Connect.DB_ResultSet.getString("Contactor_ID");
                //jTextField3.addText(c_id);
            //}
        //}
        //catch(Exception ex)
        //{
          //  System.out.println(ex);
        //}
   // }
                 
                 
                 
    

      
    
    
  
    
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ResetButton1;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private com.github.lgooddatepicker.components.DatePicker datePicker3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButtonADD;
    private javax.swing.JButton jButtonADD1;
    private javax.swing.JButton jButtonResetAll;
    private javax.swing.JButton jButtonResetAll1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldAddress2;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEmail2;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldPhone2;
    // End of variables declaration//GEN-END:variables

    

    

   

    

 
}
