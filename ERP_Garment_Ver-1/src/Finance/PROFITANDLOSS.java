
package Finance;




/**
 *
 * @author Dinushka
 */
public class PROFITANDLOSS extends javax.swing.JInternalFrame {



    /**
     * Creates new form SalesDesignInquiry
     */
    public PROFITANDLOSS() {
        initComponents();
      
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
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker();

        setResizable(true);
        setTitle("Bank Details");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Sales");
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, -1));

        jLabel5.setText("(-)Sales Returns");
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, -1));

        jLabel6.setText("Date");
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 40, -1));

        jLabel8.setText("To");
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 30, -1));
        jPanel6.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 130, -1));
        jPanel6.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 130, -1));

        jLabel9.setText("Cost Of Sales");
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 140, -1));

        jLabel10.setText("Opening Stock");
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 150, -1));

        jLabel11.setText("Cost Of Goods Available For Sale ");
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 210, -1));

        jLabel13.setText("Purchase Returns");
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 110, -1));

        jLabel16.setText("(+)Purchases");
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 90, -1));

        jLabel17.setText("(-)Closing Stock");
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 110, -1));
        jPanel6.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 130, -1));

        jButton1.setText("ADD");
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 70, -1));
        jPanel6.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 130, -1));
        jPanel6.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 130, -1));
        jPanel6.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 130, -1));
        jPanel6.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 130, -1));
        jPanel6.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 130, -1));

        jLabel19.setText("Cost Of Sales");
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 100, -1));
        jPanel6.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 130, -1));

        jLabel20.setText("Gross Profit/Loss");
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 140, -1));
        jPanel6.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 130, -1));

        jLabel21.setText("Expences");
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 80, -1));
        jPanel6.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 130, -1));

        jLabel22.setText("Net Profit/Loss");
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 100, -1));
        jPanel6.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 130, -1));

        jLabel23.setText("Shipping Cost");
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 100, -1));
        jPanel6.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 130, -1));

        jLabel24.setText("10% of IncomeTax");
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 120, -1));
        jPanel6.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 130, -1));

        jLabel26.setText("Net Profit/Loss Per Year");
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 180, -1));
        jPanel6.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 130, -1));

        jButton11.setText("Genarate a Report");
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 150, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Demo");
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, -1, -1));
        jPanel6.add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 0, 150, 30));
        jPanel6.add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 0, 150, 30));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 650, 550));

        jTabbedPane1.addTab("PROFIT AND LOSS", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 580));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
 
 
  
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

   
  

  

   
}
