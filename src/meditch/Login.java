
package meditch;

import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



/**
 *
 * @author Ravi
 */
public class Login extends javax.swing.JFrame {
   

    /**
     * Creates new form Login
     */
     String pass=null;
        
    public Login() throws FileNotFoundException,IOException,ClassNotFoundException {
          initComponents();
   
          this.getContentPane().setBackground(Color.black);
         File f=new File("Pass.txt");
       if(f.exists()){
        
            FileInputStream fs=new FileInputStream(f);
            DataInputStream ds=new DataInputStream(fs);
            BufferedReader rd=new   BufferedReader(new InputStreamReader(ds));
           
           String pass = rd.readLine();
            System.out.println(""+pass);
        
       } 
       else{
             String pass=JOptionPane.showInputDialog(rootPane,"Enter your sql password");    
         try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root",""+pass);
              Statement ps=con.createStatement();
            ps.execute("create database  if not exists std");
           ps.execute("create table if not exists std.sup(sid int(11) primary key  auto_increment,sname varchar(50),sadd varchar(50),smobile varchar(12) ,semail varchar(50),sadhaar varchar(12))");
           
           ps.execute("create table if not exists std.medicine1(mbatch int(11) primary key auto_increment,mname varchar(50),mcompany varchar(50),mquantity int(11),mdateofexp date,mprdate date,medtype varchar(50),mpurprice int(11),mrack int(11),sname varchar (50),sid int(11))");
           
             ps.execute("create table if not exists std.store(medname varchar(50),medqnty varchar(50),saledate varchar(20),medprice varchar(11),tprice varchar(11))");
             
             f.createNewFile();
             char c[]=pass.toCharArray();
             FileOutputStream out=new FileOutputStream(f);
             for(int i=0; i<c.length;i++)
             out.write(c[i]);
            this.pass=pass;
            
           }
         catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane,""+ex);
             System.exit(0);
         }
       }
       
                 
    }
             @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        pwrd = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 153, 0));
        setForeground(new java.awt.Color(255, 153, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADMINISTRATOR");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/meditch/users.png"))); // NOI18N
        jLabel1.setText("Username :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/meditch/pass.png"))); // NOI18N
        jLabel3.setText("Passward :");

        uname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        uname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                unameKeyPressed(evt);
            }
        });

        pwrd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwrdKeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/meditch/pass.png"))); // NOI18N
        jButton1.setText("Login");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MEDITECH");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(144, 144, 144)
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(128, 128, 128)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(pwrd, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(pwrd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
       
        
        
        
        
      String s="Admin";
      String u="admin123";
     
  
      if (pwrd.getText().equals(u)&&uname.getText().equals(s)) { 
            
            
                 JOptionPane.showMessageDialog(null," Welcome to Meditech");
                   
                 Menu m=new Menu();
                  m.setVisible(true);
                  setVisible(false);
                 
     
            }else{
                
                JOptionPane.showMessageDialog(null,"Enter your Username And Password");  
      }
      
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
     
    }//GEN-LAST:event_jButton1KeyPressed

    private void pwrdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwrdKeyPressed
  if(evt.getKeyCode()==KeyEvent.VK_ENTER)
       {
              String s="Admin";
      String u="admin123";
     
  
      if (pwrd.getText().equals(u)&&uname.getText().equals(s)) { 
            
            
                 JOptionPane.showMessageDialog(null," Welcome to Meditech");
                   
                 Menu m=new Menu();
                  m.setVisible(true);
                  setVisible(false);
                 
     
            }else
                
                JOptionPane.showMessageDialog(null,"Enter your Username And Password"); 
       }        // TODO add your handling code here:
    }//GEN-LAST:event_pwrdKeyPressed

    private void unameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unameKeyPressed
  if(evt.getKeyCode()==KeyEvent.VK_ENTER)
       {
              String s="Admin";
      String u="admin123";
     
  
      if (pwrd.getText().equals(u)&&uname.getText().equals(s)) { 
            
            
                 JOptionPane.showMessageDialog(null," Welcome to Meditech");
                   
                 Menu m=new Menu();
                  m.setVisible(true);
                  setVisible(false);
                 
     
            }else
                
                JOptionPane.showMessageDialog(null,"Enter your Username And Password"); 
       }        // TODO add your handling code here:
    }//GEN-LAST:event_unameKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Login().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pwrd;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}


