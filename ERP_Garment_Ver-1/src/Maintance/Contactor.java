
package Maintance;
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
public class Contactor extends javax.swing.JInternalFrame {






    /**
     * Creates new form SalesDesignInquiry
     */
    public Contactor() {
        
        initComponents();
        
        generate_mac_prtid();
       
        
        
       
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
        jPanel2 = new javax.swing.JPanel();
        jTextFieldContractorsID = new javax.swing.JTextField();
        jTextFieldContractorsName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        DatePickerSettings dateSettings1 = new DatePickerSettings();
        dateSettings1.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings1.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker(dateSettings1);
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanelcustomerSearch = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextFieldSearchCustomerName = new javax.swing.JTextField();
        jTextFieldSearchCustomerId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jTextFieldCustomerId1 = new javax.swing.JTextField();
        jTextFieldCustomerName1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldCompanyName1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldPhone1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldEmail1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldAddress1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setResizable(true);
        setTitle("Machine Parts");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldContractorsID.setEditable(false);
        jTextFieldContractorsID.setName("Customer ID"); // NOI18N
        jTextFieldContractorsID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContractorsIDActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldContractorsID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 110, -1));

        jTextFieldContractorsName.setName("Customer Name"); // NOI18N
        jPanel2.add(jTextFieldContractorsName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 110, -1));

        jLabel7.setText("Date");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        datePicker2.setName(""); // NOI18N
        jPanel2.add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        jButtonADD.setText("ADD ");
        jButtonADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonADDActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));

        jButtonResetAll.setText("Reset All");
        jButtonResetAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetAllActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonResetAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel5.setText("Phone");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jTextFieldPhone.setName("Phone number"); // NOI18N
        jPanel2.add(jTextFieldPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 110, -1));

        jLabel6.setText("E-Mail");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jTextFieldEmail.setName("Email"); // NOI18N
        jPanel2.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 110, -1));

        jLabel12.setText("Address");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jTextFieldAddress.setName("Address"); // NOI18N
        jPanel2.add(jTextFieldAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 210, -1));

        jLabel1.setText("Contractors ID");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel11.setText("Contactors Name");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

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
        jScrollPane3.setViewportView(jTable3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 640, 90));

        jTabbedPane1.addTab("ADD ", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelcustomerSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelcustomerSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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

        jPanelcustomerSearch.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 770, 330));

        jTextFieldSearchCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchCustomerNameActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jTextFieldSearchCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 60, -1));
        jPanelcustomerSearch.add(jTextFieldSearchCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 60, -1));

        jLabel9.setText("Customer ID");
        jPanelcustomerSearch.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel10.setText("Customer name");
        jPanelcustomerSearch.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jButton8.setText("View All");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jButton9.setText("Reset All");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jButton10.setText("Search");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jPanel3.add(jPanelcustomerSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 830, 510));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldCustomerId1.setEditable(false);
        jTextFieldCustomerId1.setName("Customer ID"); // NOI18N
        jTextFieldCustomerId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCustomerId1ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextFieldCustomerId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 110, -1));

        jTextFieldCustomerName1.setName("Customer Name"); // NOI18N
        jPanel5.add(jTextFieldCustomerName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 110, -1));

        jLabel8.setText("Customer ID");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 52, -1, -1));

        jLabel13.setText("Customer Name");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jButton7.setText("Reset All");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        jLabel15.setText("Company Name");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jTextFieldCompanyName1.setName("Company name"); // NOI18N
        jPanel5.add(jTextFieldCompanyName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 110, -1));

        jLabel16.setText("Phone");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jTextFieldPhone1.setName("Phone number"); // NOI18N
        jPanel5.add(jTextFieldPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 110, -1));

        jLabel17.setText("E-Mail");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jTextFieldEmail1.setName("Email"); // NOI18N
        jPanel5.add(jTextFieldEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 110, -1));

        jLabel18.setText("Address");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jTextFieldAddress1.setName("Address"); // NOI18N
        jPanel5.add(jTextFieldAddress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 210, -1));

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));

        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 410, 520));

        jTabbedPane1.addTab("Search & Edit || Delete", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Reports", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldContractorsIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContractorsIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContractorsIDActionPerformed

    private void jButtonADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADDActionPerformed

        Add(); 
        
    }//GEN-LAST:event_jButtonADDActionPerformed

    private void jButtonResetAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetAllActionPerformed

    }//GEN-LAST:event_jButtonResetAllActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

    }//GEN-LAST:event_jTable2MouseClicked

    private void jTextFieldSearchCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchCustomerNameActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextFieldCustomerId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCustomerId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCustomerId1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed


    
    private void TableLoad()
    {

    DB_Connect.DB_ResultSet = db_con.executeQuery("SELECT `Contactor`.`Contactor_ID`,\n" +
"    `Contactor`.`Contactor_Name`,\n" +
"    `Contactor`.`Phone`,\n" +
"    `Contactor`.`Email`,\n" +
"    `Contactor`.`Address`,\n" +
"    `Contactor`.`Date`\n" +
"FROM `garmentsystem`.`Contactor`;");
     jTable3.setModel(DbUtils.resultSetToTableModel(DB_Connect.DB_ResultSet));

    }
  
    private void TextBoxClear(){
            
            jTextFieldContractorsID.setText("");
            jTextFieldContractorsName.setText("");
            jTextFieldPhone.setText("");
            jTextFieldEmail.setText("");
            jTextFieldAddress.setText("");
            datePicker2.setDateToToday();
    }
    
    
    
    public void Add()
    {
        String id = jTextFieldContractorsID.getText();
        String name = jTextFieldContractorsName.getText();
        String phone = jTextFieldPhone.getText();
        String email = jTextFieldEmail.getText();
        String address= jTextFieldAddress.getText();
        String date = datePicker2.getText();
        
        
        
 boolean x = db_con.execute("INSERT INTO `garmentsystem`.`Contactor`\n" +
"(`Contactor_ID`,\n" +
"`Contactor_Name`,\n" +
"`Phone`,\n" +
"`Email`,\n" +
"`Address`,\n" +
"`Date`)\n" +
"VALUES\n" +
"('"+id+"',\n" +
"'"+name+"',\n" +
"'"+phone+"',\n" +
"'"+email+"',\n" +
"'"+address+"',\n" +
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
    
    private void generate_mac_prtid()
    {
        AutoIdGenerator aid = new AutoIdGenerator();
        jTextFieldContractorsID.setText(aid.generate("CONT",Integer.toString(MainWindow.userid)));
    }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonADD;
    private javax.swing.JButton jButtonResetAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JPanel jPanelcustomerSearch;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldAddress1;
    private javax.swing.JTextField jTextFieldCompanyName1;
    private javax.swing.JTextField jTextFieldContractorsID;
    private javax.swing.JTextField jTextFieldContractorsName;
    private javax.swing.JTextField jTextFieldCustomerId1;
    private javax.swing.JTextField jTextFieldCustomerName1;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEmail1;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldPhone1;
    private javax.swing.JTextField jTextFieldSearchCustomerId;
    private javax.swing.JTextField jTextFieldSearchCustomerName;
    // End of variables declaration//GEN-END:variables
}
