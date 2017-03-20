/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HumanResource;

import HumanResource.Util.DBObject;
import MainSystem.AutoDB_Connect;
import java.awt.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Vihangi
 */
public class Salary extends javax.swing.JInternalFrame {

    /**
     * Creates new form vihplk_SalaryForm
     */
    
    Connection con;
    Calendar cals = Calendar.getInstance();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    AutoDB_Connect conn = new AutoDB_Connect();
    
    public Salary() {
        initComponents();
        con = AutoDB_Connect.DB_connection;
        ClearAll();
        Populate();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtBasicSal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSalId = new javax.swing.JTextField();
        txtETF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtAllowance = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEmpId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtOTHours = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEPF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNetSal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtOTRate = new javax.swing.JTextField();

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

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel7.setText("Net Salary:");

        jLabel8.setText("OT rate:");

        jLabel9.setText("Basic Salary:");

        txtSalId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalIdActionPerformed(evt);
            }
        });

        jLabel1.setText("Salary ID:");

        jLabel2.setText("ETF:");

        jLabel3.setText("Allowenace:");

        jLabel4.setText("Employee ID:");

        jLabel5.setText("OT hours:");

        jLabel6.setText("EPF:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSalId, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtETF, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEPF, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(txtOTHours, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6)
                        .addComponent(jLabel4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGap(196, 196, 196)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtBasicSal, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNetSal, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                .addComponent(txtOTRate, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))))
                    .addContainerGap(22, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSalId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(txtETF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOTHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel7)
                        .addComponent(txtNetSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel8)
                        .addComponent(txtOTRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel9)
                        .addComponent(txtBasicSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(25, 25, 25)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel6)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInsert)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsert)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(287, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Populate() {
        try {
            jTable1.setModel(DBObject.GetTable(con, DBObject.GetAll(con, "leaves_table")));
        } catch (SQLException ex) {
            Logger.getLogger(Leave.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void Save()
    {
        try {
            Statement stmnt = con.createStatement();
            String sql = 
                    "UPDATE salary_table " +
                    "SET sal_id = '" + txtSalId.getText() + "'" +
                    ",basic_sal = '" + txtBasicSal.getText() + "' " +
                    ",ot_rate = '" + txtOTRate.getText()+ "' " +
                    ",net_sal = '" + txtNetSal.getText() + "' " +
                    ",etf = '" + txtETF.getText() + "' " +
                    ",allowence = '" + txtAllowance.getText() + "' " +
                    ",emp_id = '" + txtEmpId.getText() + "' " +
                    ",ot_hours = '" + txtOTHours.getText() + "' " +
                    ",epf = '" + txtEPF.getText() + "' " +
                    "where sal_id = " + txtSalId.getText();
            stmnt.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Updated Successfully");
            Populate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    private void Remove()
    {
        try {
            Statement stmnt = con.createStatement();
            String sql = "DELETE FROM salary_table WHERE sal_id = '" + txtSalId.getText() + "'";
            stmnt.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Record Deleted");
            Populate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void Insert()
    {
        try {
            Statement stmnt = con.createStatement();
            
            String sql = 
                    "INSERT INTO salary_table (sal_id,basic_sal,ot_rate,net_sal,etf,allowence,emp_id,ot_hours,epf) "
                    + "VALUES ("
                    + "'" + txtSalId.getText() + "',"
                    + "'" + txtBasicSal.getText() + "',"
                    + "'" + txtOTRate.getText() + "',"
                    + "'" + txtNetSal.getText()+ "',"
                    + "'" + txtETF.getText() + "',"
                    + "'" + txtAllowance.getText() + "',"
                    + "'" + txtEmpId.getText() + "',"
                    + "'" + txtOTHours.getText() + "',"
                    + "'" + txtEPF.getText() + "'"
                    
                    + ")"
                    ;
            
            stmnt.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Record Inserted");
            Populate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    void ClearAll() {
        for(Component c : jPanel1.getComponents()) {
            if(c instanceof JTextField){
                JTextField f = (JTextField) c;
                f.setText("");
            }
        }
    }
    
    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        Insert();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Save();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Remove();
    }//GEN-LAST:event_btnDeleteActionPerformed
    
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int row = jTable2.getSelectedRow();
        String salId = jTable2.getValueAt(row, 0).toString();
        String basicSal = jTable2.getValueAt(row, 1).toString();
        String otRate = jTable2.getValueAt(row, 2).toString();
        String netSal = jTable2.getValueAt(row, 3).toString();
        String etf = jTable2.getValueAt(row, 4).toString();
        String allowance = jTable2.getValueAt(row, 5).toString();
        String empId = jTable2.getValueAt(row, 6).toString();
        String otHours = jTable2.getValueAt(row, 7).toString();
        String epf = jTable2.getValueAt(row, 8).toString();
        
        ClearAll();
        
        if(!salId.isEmpty()) {
            txtSalId.setText(salId);
        }
        if(!basicSal.isEmpty()) {
            txtBasicSal.setText(basicSal);
        }
        if(!otRate.isEmpty()) {
            txtOTRate.setText(otRate);
        }
        if(!netSal.isEmpty()) {
            txtNetSal.setText(netSal);
        }
        if(!etf.isEmpty()) {
            txtETF.setText(etf);
        }
        if(!allowance.isEmpty()) {
            txtAllowance.setText(allowance);
        }
        if(!empId.isEmpty()) {
            txtEmpId.setText(empId);
        }
        if(!otHours.isEmpty()) {
            txtOTHours.setText(otHours);
        }
        if(!epf.isEmpty()) {
            txtEPF.setText(epf);
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void txtSalIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalIdActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtAllowance;
    private javax.swing.JTextField txtBasicSal;
    private javax.swing.JTextField txtEPF;
    private javax.swing.JTextField txtETF;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtNetSal;
    private javax.swing.JTextField txtOTHours;
    private javax.swing.JTextField txtOTRate;
    private javax.swing.JTextField txtSalId;
    // End of variables declaration//GEN-END:variables
}
