
package Distribution;

import MainSystem.AutoDB_Connect;
import MainSystem.AutoIdGenerator;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoSqlQuery;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Dinushka
 */
public class Vehicle1 extends javax.swing.JInternalFrame {
DefaultTableModel model;



    /**
     * Creates new form SalesDesignInquiry
     */
    public Vehicle1() {
        initComponents();
        generate_vehicleID();
        FillComboMaterial();
        TabelLoad();
        
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.C_Vehiclel");
        jTable1.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
        
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.C_Vehiclel");
        jTable2.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
        

  
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanelcustomerSearch2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setResizable(true);
        setTitle("Vehicle Management");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 13, 750, 360));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 800, 420));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 170, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Vehicle ID");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 100, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Type");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 90, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("License No");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 100, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Milage");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 80, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Driver ID");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Driver's name");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 110, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Engine no");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 100, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Servise Duration");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 130, -1));
        jPanel5.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 170, -1));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 170, -1));
        jPanel5.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 170, 20));
        jPanel5.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 170, 20));
        jPanel5.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 170, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Clear All");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "van", "Bike", "Lorry", "Truck" }));
        jPanel5.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 170, -1));

        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jPanel5.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 170, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 500, 420));

        jTabbedPane1.addTab("ADD Vehicle", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelcustomerSearch2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelcustomerSearch2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Vehical ID");
        jPanelcustomerSearch2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setText("View All");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jButton5.setText("Search");
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

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

        jPanelcustomerSearch2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 800, 330));

        jPanelcustomerSearch2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 90, -1));

        jPanel3.add(jPanelcustomerSearch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 840, 460));

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Vehicle ID");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 100, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Type");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 90, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Lyson No");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 90, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Milage");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 80, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Driver ID");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 90, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Driver's name");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 110, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Engine no");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 100, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Servise Duration");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 130, -1));
        jPanel6.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 170, -1));

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 170, -1));
        jPanel6.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 170, 20));
        jPanel6.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 170, -1));
        jPanel6.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 170, 20));
        jPanel6.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 170, -1));
        jPanel6.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 170, -1));

        jTextField16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 170, -1));

        jButton2.setText("Update");
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 460, 460));

        jTabbedPane1.addTab("Search & Update|| Delete", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Reports", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1350, 590));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AddVehicle();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        tableLoad();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
           search();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         TextBoxClear();
        generate_vehicleID();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        try{
            int r=jTable2.getSelectedRow();
            String Vid= jTable2.getValueAt(r, 0).toString();
             String Type= jTable2.getValueAt(r, 1).toString();
            String lysonNum =jTable2.getValueAt(r, 2).toString();
            String Milage=jTable2.getValueAt(r, 3).toString();
            String DID=jTable2.getValueAt(r, 4).toString();
            String Dname=jTable2.getValueAt(r, 5).toString();
            String engNum=jTable2.getValueAt(r, 6).toString();
            String serDueration=jTable2.getValueAt(r, 7).toString();
            boolean type = false;
            
            System.err.print(type);
            
            jTextField16.setText(Vid);
              jTextField15.setText(Type);
              jTextField14.setText(lysonNum);
              jTextField13.setText(Milage);
              jTextField12.setText(DID);
              jTextField11.setText(Dname);
              jTextField10.setText(engNum);
              jTextField9.setText(serDueration);
        
        }
         catch(Exception ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         DeleteDesigns();
        tableLoad();
        clearDeleteDesign();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          UpdateAddedVehicle();
        clearUpdateVehicle();
        tableLoad();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
          try
        {
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.C_Vehiclel");
            
            while(AutoDB_Connect.DB_ResultSet.next())
            {
                String DID = AutoDB_Connect.DB_ResultSet.getString("Vehical_ID");
                jComboBox2.addItem(DID);
                                       
             
            }
        }
        catch (SQLException ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jComboBox2ItemStateChanged
     private void generate_vehicleID() {
       
       AutoIdGenerator aid = new AutoIdGenerator();
       jTextField1.setText(aid.generate("VEH",Integer.toString(MainWindow.userid)));
    }

    private void TabelLoad() {
         AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.C_Vehiclel");
        jTable1.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
       
    }
    
        private void TextBoxClear()
    {
        jTextField1.setText("");
        //jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        //jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
       
       
        
    }
         private void AddVehicle()
    {
        String Vid = jTextField1.getText();
        String Type = jComboBox1.getSelectedItem().toString();
        String lysonNum = jTextField3.getText();
        String Milage = jTextField4.getText();
        String DID = jComboBox2.getSelectedItem().toString();
        String Dname = jTextField6.getText();
        String engNum = jTextField7.getText();
        String serDueration = jTextField8.getText();
        
          
        
        boolean x =autoSqlQuery.execute("INSERT INTO `garmentsystem`.`C_Vehiclel`\n" +
                "(`VehicalID`,\n" +
                "`Type`,\n" +
                "`LysonNum`,\n" +
                "`Milage`,\n" +
                "`DriverID`,\n" +
                "`DriverName`,\n" +
                "`Engine_num`,\n" +
                "`Service_duration`)\n" +
                "VALUES\n" +
                "('"+Vid+"',\n" +
                "'"+Type+"',\n" +
                "'"+lysonNum+"',\n" +
                "'"+Milage+"',\n" +
                "'"+DID+"',\n" +
                "'"+Dname+"',\n" +
                "'"+engNum+"',\n" +
                "'"+serDueration+"');");   
            try
            {
                if(x==true)
                {
                    JOptionPane.showMessageDialog(null,"SUCCESSFULLY ADDED");
                    TabelLoad();
                    TextBoxClear();
                }
            }
            catch(Exception ex)
            {
                System.out.println(ex);
            }
        }
         private void search()
         {
         String Vid=jComboBox3.getSelectedItem().toString();
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.C_Vehiclel WHERE VehicalID='"+Vid+"'");
        jTable2.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
     
     }
      private void tableLoad(){
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery
        ("SELECT * FROM garmentsystem.C_Vehiclel");
            jTable2.setModel(DbUtils.resultSetToTableModel
        (AutoDB_Connect.DB_ResultSet));

        
    }
      /*private void tabelLoad(){
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery
        ("SELECT * FROM garmentsystem.C_Vehiclel");
            jTable2.setModel(DbUtils.resultSetToTableModel
        (AutoDB_Connect.DB_ResultSet));

        
    }*/
       private void FillComboMaterial()
    {
         try
        {
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.C_Vehiclel");
            
            while(AutoDB_Connect.DB_ResultSet.next())
            {
                String VID = AutoDB_Connect.DB_ResultSet.getString("VehicalId");
                jComboBox2.addItem(VID);
                                       
             
            }
            
             AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.C_Vehiclel");
            
            while(AutoDB_Connect.DB_ResultSet.next())
            {
                String VID = AutoDB_Connect.DB_ResultSet.getString("VehicalId");
                jComboBox3.addItem(VID);
                                       
             
            }
         
        }
        catch (SQLException ex)
        {
            System.out.println(ex);
        }
    }
      
     private void DeleteDesigns()
    {
                int reply = JOptionPane.showConfirmDialog(null, 
                "Are you sure you want to Delete?", "Delete?", 
                            JOptionPane.YES_NO_OPTION);
        
          if (reply == JOptionPane.YES_OPTION){
        String Vid =jTextField16.getText();
        
        boolean x = autoSqlQuery.execute
        ("DELETE FROM `garmentsystem`.`C_Vehiclel` WHERE VehicalID = '"+Vid+"';");
        
        try
        {
            if (x==true)
            {
                clearDeleteDesign();
                tableLoad();
                JOptionPane.showMessageDialog(null,"Successfully Deleted");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    }
     public void clearDeleteDesign(){
        
        jTextField16.setText("");
        jTextField15.setText("");
        jTextField14.setText("");
        jTextField13.setText("");
        jTextField12.setText("");
        jTextField11.setText("");
        jTextField10.setText("");
        jTextField9.setText("");
       
        
    }

    public void UpdateAddedVehicle(){
          
            
        String Vid,Type,lysonNum,Milage,DID,Dname,engNum,serDueration;
        Vid = jTextField16.getText();
        Type = jTextField15.getText();
        lysonNum = jTextField14.getText();
        Milage = jTextField13.getText();
        DID = jTextField12.getText();
        Dname = jTextField11.getText();
        engNum = jTextField10.getText();
        serDueration = jTextField9.getText();
        
        
        if(Vid.isEmpty()||Type.isEmpty()||lysonNum.isEmpty()||Milage.
        isEmpty()||DID.isEmpty()||Dname.isEmpty()||engNum.isEmpty()||serDueration.isEmpty())
        {
       JOptionPane.showMessageDialog(null, "WARNING FIELDS ARE EMPTY");
        }
        
        else{
            
            if(validation.isDigit(Milage)&&validation.isDigit(serDueration)&&validation.isLetter(Dname)&&validation.isLetter(Type))
               {
            
            try{
            
        
        
         int reply = JOptionPane.showConfirmDialog(null, 
                 "Are you sure you want to Update?", "Update?", 
                            JOptionPane.YES_NO_OPTION);
        
          if (reply == JOptionPane.YES_OPTION){
              

                boolean x = autoSqlQuery.execute
        ("UPDATE `garmentsystem`.`C_Vehiclel`\n" +
            "SET\n" +
            "`VehicalID` = '"+Vid+"',\n" +
            "`Type` = '"+Type+"',\n" +
            "`LysonNum` = '"+lysonNum+"',\n" +
            "`Milage` = '"+Milage+"',\n" +
            "`DriverID` = '"+DID+"',\n" +
            "`DriverName` = '"+Dname+"',\n" +
            "`Engine_num` = '"+engNum+"',\n" +
            "`Service_duration` = '"+serDueration+"'\n" +
             "WHERE `VehicalID` = '"+Vid+"';");
              
       
            if(x==true){
               clearUpdateVehicle();
               JOptionPane.showMessageDialog(null,"SUCCESSFULLY UPDATED");
             }
             else
             {
              
              
             }
        }
            }
        
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
         
       
    }
    }
        }
    public void clearUpdateVehicle(){
        
         jTextField16.setText("");
        jTextField15.setText("");
        jTextField14.setText("");
        jTextField13.setText("");
        jTextField12.setText("");
        jTextField11.setText("");
        jTextField10.setText("");
        jTextField9.setText("");
        
        
    }
     
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JPanel jPanelcustomerSearch2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
       
}

