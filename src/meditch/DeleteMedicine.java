/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meditch;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ravi
 */
public class DeleteMedicine extends javax.swing.JFrame {

    /**
     * Creates new form DeleteMedicine
     */
    public DeleteMedicine() {
        initComponents();
        getContentPane().setBackground(Color.BLACK);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        batch = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        comp = new javax.swing.JTextField();
        purprice = new javax.swing.JTextField();
        purdate = new javax.swing.JTextField();
        qnty = new javax.swing.JTextField();
        expdate = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        rack = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        name1 = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Delete Medicine");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Medicine Batch No. :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Medicine Name :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Medicine Company :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Medicine Quantity :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Med.Expire Date :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Med. Purchase Date :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Medicine Type :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Med.purchase Price :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Medicine Rack No. :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Supplier Name :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Supplier Id:");

        batch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batchActionPerformed(evt);
            }
        });

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        comp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compActionPerformed(evt);
            }
        });

        purprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purpriceActionPerformed(evt);
            }
        });

        purdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purdateActionPerformed(evt);
            }
        });

        qnty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qntyActionPerformed(evt);
            }
        });

        expdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expdateActionPerformed(evt);
            }
        });

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        rack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rackActionPerformed(evt);
            }
        });

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name1ActionPerformed(evt);
            }
        });

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select:-", "Tablate", "Capsule", "Syrup", "Insulin", "Cream", "Balm", "Drop", "Granul", "Oil", "Powder" }));
        jComboBox1.setToolTipText("");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/meditch/open.png"))); // NOI18N
        jButton1.setText("Open");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/meditch/delete.png"))); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/meditch/clear.png"))); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/meditch/all.png"))); // NOI18N
        jButton4.setText("ALL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M_BNo.", "M_Name", "M_Company", "M_Quantity", "M_EXP.Date", "M_Purch.Date", "M_Type", "M_purch.Price", "M_Rack No.", "Supplier Name", "Supplier Id No."
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(391, 391, 391)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(batch, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(comp, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel6))
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(qnty, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(expdate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(purdate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel11))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(purprice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(rack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(name1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(batch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(purprice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(comp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rack, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(qnty, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)))
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(expdate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(purdate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addGap(46, 46, 46))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void batchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_batchActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void compActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compActionPerformed

    private void purpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_purpriceActionPerformed

    private void purdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_purdateActionPerformed

    private void qntyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qntyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qntyActionPerformed

    private void expdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expdateActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void rackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rackActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name1ActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        try{
           
            ConnectionClss c=new ConnectionClss();
            Connection con=c.connect();
             PreparedStatement ps=con.prepareStatement("select* from medicine1");
           ResultSet rs=ps.executeQuery();
           DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
           if(!(jTable1.getRowCount()==rs.getRow())){}
           else{
           
           while(rs.next()){
           
           
           model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11)});
           
           
           }
           
           
           
           
           }
           
             
        
        
        }catch(Exception ex){
        
        
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
         Menu mn=new Menu();
        mn.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        
        model.setRowCount(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Delete opration
        int row =jTable1.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        String selected=jTable1.getModel().getValueAt(row, 0).toString();
        int i=jTable1.getSelectedRow();
        
        
        if(i>=0){
            
                   model.removeRow(i);
        try{
            ConnectionClss c=new ConnectionClss();
            Connection con=c.connect();
              PreparedStatement ps=con.prepareStatement("DELETE FROM medicine1 WHERE mbatch='"+selected+"'");
        
              ps.executeUpdate();
               
                         JOptionPane.showMessageDialog(null, "Medicine Deleted");
        
        
        }catch(Exception ex){ ex.printStackTrace();}
        
        }else{} 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try{
            ConnectionClss c=new ConnectionClss();
            Connection con=c.connect();
                        PreparedStatement ps = null;
                         
                         if(batch.getText().equals("")&&name.getText().equals("")&&comp.getText().equals("")&&qnty.getText().equals("")&&expdate.getText().equals("")&&purdate.getText().equals("")&&jComboBox1.getSelectedItem().equals("")&&purprice.getText().equals("")&&rack.getText().equals("")&&name1.getText().equals("")&&id.getText().equals("")){
                         
                                JOptionPane.showMessageDialog(null, "should be fill any one feild ");
                         }
                         
                         
                          
                         else{
                        if(batch.getText()!=""&&name.getText().equals("")&&comp.getText().equals("")&&qnty.getText().equals("")&&expdate.getText().equals("")&&purdate.getText().equals("")&&purprice.getText().equals("")&&rack.getText().equals("")&&name1.getText().equals("")&&id.getText().equals("")){
                             ps=con.prepareStatement( "select mbatch,mname,mcompany,mquantity,mdateofexp,mprdate,medtype,mpurprice,mrack,sname,sid from medicine1 where mbatch='"+batch.getText()+"'");}
                        
                        if(name.getText()!=""&&batch.getText().equals("")&&comp.getText().equals("")&&qnty.getText().equals("")&&expdate.getText().equals("")&&purdate.getText().equals("")&&purprice.getText().equals("")&&rack.getText().equals("")&&name1.getText().equals("")&&id.getText().equals("")){
                             ps=con.prepareStatement( "select mbatch,mname,mcompany,mquantity,mdateofexp,mprdate,medtype,mpurprice,mrack,sname,sid from medicine1 where mname='"+name.getText()+"'");}
                         
                        if(comp.getText()!=""&&batch.getText().equals("")&&name.getText().equals("")&&qnty.getText().equals("")&&expdate.getText().equals("")&&purdate.getText().equals("")&&purprice.getText().equals("")&&rack.getText().equals("")&&name1.getText().equals("")&&id.getText().equals("")){
                             ps=con.prepareStatement( "select mbatch,mname,mcompany,mquantity,mdateofexp,mprdate,medtype,mpurprice,mrack,sname,sid from medicine1 where mcompany='"+comp.getText()+"'");}
                          
                        if(qnty.getText()!=""&&batch.getText().equals("")&&name.getText().equals("")&&comp.getText().equals("")&&expdate.getText().equals("")&&purdate.getText().equals("")&&purprice.getText().equals("")&&rack.getText().equals("")&&name1.getText().equals("")&&id.getText().equals("")){
                             ps=con.prepareStatement( "select mbatch,mname,mcompany,mquantity,mdateofexp,mprdate,medtype,mpurprice,mrack,sname,sid from medicine1 where mquantity='"+qnty.getText()+"'");}
                           
                        if(expdate.getText()!=""&&batch.getText().equals("")&&name.getText().equals("")&&comp.getText().equals("")&&qnty.getText().equals("")&&purdate.getText().equals("")&&purprice.getText().equals("")&&rack.getText().equals("")&&name1.getText().equals("")&&id.getText().equals("")){
                             ps=con.prepareStatement( "select mbatch,mname,mcompany,mquantity,mdateofexp,mprdate,medtype,mpurprice,mrack,sname,sid from medicine1 where mdateofexp='"+expdate.getText()+"'");}
                            
                        if(purdate.getText()!=""&&batch.getText().equals("")&&name.getText().equals("")&&comp.getText().equals("")&&qnty.getText().equals("")&&expdate.getText().equals("")&&purprice.getText().equals("")&&rack.getText().equals("")&&name1.getText().equals("")&&id.getText().equals("")){
                             ps=con.prepareStatement( "select mbatch,mname,mcompany,mquantity,mdateofexp,mprdate,medtype,mpurprice,mrack,sname,sid from medicine1 where mprdate='"+purdate.getText()+"'");}
                             
                        
                              
                        if(purprice.getText()!=""&&batch.getText().equals("")&&name.getText().equals("")&&comp.getText().equals("")&&qnty.getText().equals("")&&expdate.getText().equals("")&&purdate.getText().equals("")&&rack.getText().equals("")&&name1.getText().equals("")&&id.getText().equals("")){
                             ps=con.prepareStatement( "select mbatch,mname,mcompany,mquantity,mdateofexp,mprdate,medtype,mpurprice,mrack,sname,sid from medicine1 where mpurprice='"+purprice.getText()+"'");}
                               
                        
                        if(rack.getText()!=""&&batch.getText().equals("")&&name.getText().equals("")&&comp.getText().equals("")&&qnty.getText().equals("")&&expdate.getText().equals("")&&purdate.getText().equals("")&&purprice.getText().equals("")&&name1.getText().equals("")&&id.getText().equals("")){
                             ps=con.prepareStatement( "select mbatch,mname,mcompany,mquantity,mdateofexp,mprdate,medtype,mpurprice,mrack,sname,sid from medicine1 where mrack='"+rack.getText()+"'");}
                                 
                        if(name1.getText()!=""&&batch.getText().equals("")&&name.getText().equals("")&&comp.getText().equals("")&&qnty.getText().equals("")&&expdate.getText().equals("")&&purdate.getText().equals("")&&purprice.getText().equals("")&&rack.getText().equals("")&&id.getText().equals("")){
                             ps=con.prepareStatement( "select mbatch,mname,mcompany,mquantity,mdateofexp,mprdate,medtype,mpurprice,mrack,sname,sid from medicine1 where sname='"+name1.getText()+"'");}
                                  
                        if(id.getText()!=""&&batch.getText().equals("")&&name.getText().equals("")&&comp.getText().equals("")&&qnty.getText().equals("")&&expdate.getText().equals("")&&purdate.getText().equals("")&&purprice.getText().equals("")&&rack.getText().equals("")&&name1.getText().equals("")){
                             ps=con.prepareStatement( "select mbatch,mname,mcompany,mquantity,mdateofexp,mprdate,medtype,mpurprice,mrack,sname,sid from medicine1 where sid='"+id.getText()+"'");}
                                   
                                                        
                         }
        
        
                         
        
             
                               ResultSet rs = ps.executeQuery();
                               DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
                           
                               if(!(jTable1.getRowCount()==rs.getRow())){}
                             
                               else{ while(rs.next()){
                                 
                                   model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11)});}
                         
                                                            }   
                                  
                                          name.setText("");
                                          comp.setText("");
                                          qnty.setText("");
                                          expdate.setText("");
                                           purdate.setText("");
                                            purprice.setText("");
                                            rack.setText("");
                                             name1.setText("");
                                             id.setText("");
        
                               
                                }catch(Exception ex){}
        
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
        
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        
        int Row = jTable1.getSelectedRow();
        
        batch.setText(model.getValueAt(Row, 0).toString());
        name.setText(model.getValueAt(Row, 1).toString());
        comp.setText(model.getValueAt(Row, 2).toString());
        qnty.setText(model.getValueAt(Row, 3).toString());
        expdate.setText(model.getValueAt(Row, 4).toString());
        purdate.setText(model.getValueAt(Row, 5).toString());
        jComboBox1.setSelectedItem(model.getValueAt(Row, 6).toString());
        purprice.setText(model.getValueAt(Row, 7).toString());
        rack.setText(model.getValueAt(Row, 8).toString());
        name1.setText(model.getValueAt(Row, 9).toString());
        id.setText(model.getValueAt(Row, 10).toString());
        
       
       
        
       
       
        
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DeleteMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField batch;
    private javax.swing.JTextField comp;
    private javax.swing.JTextField expdate;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField purdate;
    private javax.swing.JTextField purprice;
    private javax.swing.JTextField qnty;
    private javax.swing.JTextField rack;
    // End of variables declaration//GEN-END:variables
}
