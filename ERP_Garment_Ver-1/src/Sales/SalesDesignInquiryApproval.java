/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sales;

import static MainSystem.AutoSQLQuery.db_con;
import Sales.*;
import MainSystem.DB_Connect;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Dinushka
 */
public class SalesDesignInquiryApproval extends javax.swing.JInternalFrame {
DefaultTableModel model;
DefaultTableModel model2;
DefaultTableModel model3;
int RowCountjTable1;
String CustomerId;
String CustomerName;
String SalesDesignInquiryId;
String statusApprovalName;
String statusApproval;
String statusApprovalDate;
SalesDesignInquiryApprovalModel salesdesigninquiryapprovalmodel;
    /**
     * Creates new form SalesDesignInquiry
     */
    public SalesDesignInquiryApproval() {
        initComponents();
        
        
        
        salesdesigninquiryapprovalmodel=new SalesDesignInquiryApprovalModel();
        ViewAllSDI();
        
       

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
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSalesDesignInquiryId = new javax.swing.JTextField();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setTitle("Sales Design Inquiry Approval Management");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 800, 360));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 80, -1));

        jLabel11.setText("Sales Design ID");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jButton8.setText("Search");
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jButton1.setText("View All");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Update Approval");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, -1, -1));

        jLabel2.setText("Sales Design Inquiry ID");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jTextFieldSalesDesignInquiryId.setEditable(false);
        jTextFieldSalesDesignInquiryId.setName("Sales Design Inquiry ID"); // NOI18N
        jTextFieldSalesDesignInquiryId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalesDesignInquiryIdActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldSalesDesignInquiryId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 110, -1));

        datePicker1.setEnabled(false);
        jPanel3.add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Approved", "NOT Approved" }));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, -1, -1));
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 80, -1));

        jLabel1.setText("Approved Name");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 960, 60));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable4);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 360, 150));

        jLabel21.setText("Skech Preview");
        jLabel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 210, 310, 150));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1310, 520));

        jTabbedPane1.addTab("Sales Design Inquiry Approval", jPanel1);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Reports", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSalesDesignInquiryIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSalesDesignInquiryIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSalesDesignInquiryIdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           ViewAllSDI();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        int x=jTable5.getSelectedRow();
    String y=(String) jTable5.getValueAt(x,1);
    DB_Connect.DB_ResultSet = db_con.executeQuery("SELECT * FROM garmentsystem.designinquiry_table where SalesDesignInquiryId = '"+y+"'");
    try {
        DB_Connect.DB_ResultSet.next();
        SalesDesignInquiryId=DB_Connect.DB_ResultSet.getString("SalesDesignInquiryId");
        
        jTextFieldSalesDesignInquiryId.setText(SalesDesignInquiryId);
        
       
    } catch (SQLException ex) {
        Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
    }    
    
    }//GEN-LAST:event_jTable5MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       salesdesigninquiryapprovalmodel.Update(jTextFieldSalesDesignInquiryId.getText());
    }//GEN-LAST:event_jButton2ActionPerformed
    
      private  void ViewAllSDI(){
    
    jTable5.setModel(DbUtils.resultSetToTableModel(salesdesigninquiryapprovalmodel.ViewAllSDI()));
    jTable5.setDefaultRenderer(Object.class, new MyCellRenderer());
   
    }
      
    
 
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldSalesDesignInquiryId;
    // End of variables declaration//GEN-END:variables


public class MyCellRenderer extends javax.swing.table.DefaultTableCellRenderer {
    @Override
    public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, java.lang.Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        final java.awt.Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
     { 
         System.out.println(jTable5.getModel().getValueAt(row,6));
         if((jTable5.getModel().getValueAt(row,6).equals("true"))&&(jTable5.getModel().getValueAt(row,8).equals("false")))
         {
          cellComponent.setBackground(Color.CYAN);
          cellComponent.setForeground(Color.black);  
         }
         else if ((jTable5.getModel().getValueAt(row,6).equals("false"))&&(jTable5.getModel().getValueAt(row,8).equals("false")))
         {
         cellComponent.setBackground(Color.red);
         cellComponent.setForeground(Color.black);
         }
          else if ((jTable5.getModel().getValueAt(row,6).equals("pending"))&&(jTable5.getModel().getValueAt(row,8).equals("false")))
         {
         cellComponent.setBackground(Color.ORANGE);
         cellComponent.setForeground(Color.black);
         }   
           else if ((jTable5.getModel().getValueAt(row,6).equals("true"))&&(jTable5.getModel().getValueAt(row,8).equals("true")))
         {
         cellComponent.setBackground(Color.GREEN);
         cellComponent.setForeground(Color.black);
         }  
     }
        return cellComponent;
}
}




}
