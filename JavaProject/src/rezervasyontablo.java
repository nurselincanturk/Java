
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class rezervasyontablo extends javax.swing.JFrame {

    /**
     * Creates new form rezervasyontablo
     */
    public rezervasyontablo() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        displaytable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        nereden = new javax.swing.JLabel();
        nereye = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        koltuknolar = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        rezarvasyonyap = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        check3 = new javax.swing.JCheckBox();
        check1 = new javax.swing.JCheckBox();
        check9 = new javax.swing.JCheckBox();
        check7 = new javax.swing.JCheckBox();
        check5 = new javax.swing.JCheckBox();
        check2 = new javax.swing.JCheckBox();
        check4 = new javax.swing.JCheckBox();
        check6 = new javax.swing.JCheckBox();
        check8 = new javax.swing.JCheckBox();
        check10 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(234, 187, 118));
        jLabel3.setText("Seferler");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 60, 210, 17);

        displaytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "nerden", "nereye", "havalimanı", "havalimanı", "sefer no", "gun", "ay", "saat", "koltuklar"
            }
        ));
        displaytable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displaytableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(displaytable);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(70, 90, 960, 140);

        nereden.setText("Bos koltuk numaraları    :");

        nereye.setText("email giriniz");

        jLabel4.setText("fiyat secenekleri   :");

        koltuknolar.setText("koltuk");

        jRadioButton1.setText("business");

        jRadioButton2.setText("economic");

        rezarvasyonyap.setText("rezervasyon yap");
        rezarvasyonyap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rezarvasyonyapMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nereden, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nereye, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(koltuknolar, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(emailtxt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addGap(101, 101, 101))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rezarvasyonyap, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nereden)
                    .addComponent(koltuknolar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton1))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nereye)
                            .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jRadioButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rezarvasyonyap, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(90, 410, 910, 260);

        check3.setText("3");
        check3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check3ActionPerformed(evt);
            }
        });

        check1.setText("1");

        check9.setText("9");
        check9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check9ActionPerformed(evt);
            }
        });

        check7.setText("7");
        check7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check7ActionPerformed(evt);
            }
        });

        check5.setText("5");

        check2.setText("2");

        check4.setText("4");

        check6.setText("6");

        check8.setText("8");

        check10.setText("10");
        check10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check7)
                            .addComponent(check9))
                        .addGap(67, 67, 67))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(check5)
                            .addComponent(check3)
                            .addComponent(check1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(check8)
                        .addComponent(check10))
                    .addComponent(check6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check1)
                    .addComponent(check2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check4)
                    .addComponent(check3))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check5)
                    .addComponent(check6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check7)
                    .addComponent(check8))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check10)
                    .addComponent(check9))
                .addGap(118, 118, 118))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(1160, 60, 200, 260);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\ucak-bileti.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(1, -4, 1590, 800);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\ucak-bileti.jpg")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, -10, 1390, 840);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
     public void reservation(){
    
     DefaultTableModel model=(DefaultTableModel)displaytable.getModel();
        int scilensatiriindeks2=displaytable.getSelectedRow();
    
       String a=model.getValueAt(scilensatiriindeks2, 4).toString();
       String b=model.getValueAt(scilensatiriindeks2, 8).toString();
       String c=emailtxt.getText();
       StringBuffer d=new StringBuffer(b);
       int koltuk=0;
       
         if (check1.isSelected()) {
             koltuk=1;
             d.insert(0, "  ");
             d.delete(2,3);
             
            
         }if (check2.isSelected()) {
             d.insert(2, "  ");
             d.delete(4,5);
           koltuk=2;
         }if (check3.isSelected()) {
             koltuk=3;
             d.insert(4, "  ");
               d.delete(6,7);
         }if (check4.isSelected()) {
            koltuk=4;
             d.insert(6, "  ");
              d.delete(8,9);
         }if (check5.isSelected()) {
             koltuk=5;
             d.insert(8, "  ");
             d.delete(10,11);
         }if (check6.isSelected()) {
             koltuk=6;
             d.insert(10, "  ");
              d.delete(12,13);
         }if (check7.isSelected()) {
            koltuk=7;
             d.insert(12, "  ");
             d.delete(14,15);
         }if (check8.isSelected()) {
             koltuk=8;
             d.insert(14, "  ");
              d.delete(16,17);
         }if (check9.isSelected()) {
             koltuk=9;
             d.insert(16, "  ");
              d.delete(18,19);
         }if (check10.isSelected()) {
            koltuk=10;
             d.insert(18, "  ");
             d.delete(20,21);
         }
       
       
            Connection con=proje.getConnection();
            PreparedStatement ps;
             Statement st =null;
            try {
                
            ps=con.prepareStatement("update ucak set koltuklar='"+d+"' where seferNo ='"+a+"' ");
            String url="update ucak set koltuklar='"+d+"' where seferNo ='"+a+"' ";
            st=con.createStatement();
             st.executeUpdate(url);
                JOptionPane.showMessageDialog(null," gerçekleştirildi.");
        } catch (Exception ex) {
             JOptionPane.showConfirmDialog(null, ex.getMessage());
        }
            
            
            
            
            
        int scilensatiriindeks3=displaytable.getSelectedRow();
       
       String sehirKalkis=model.getValueAt(scilensatiriindeks3, 0).toString();
       String sehirGidis=model.getValueAt(scilensatiriindeks3, 1).toString();
         
       String havalimaniKalkis=model.getValueAt(scilensatiriindeks3, 2).toString();
       String havalimaniGidis=model.getValueAt(scilensatiriindeks3, 3).toString();
       String seferNo=model.getValueAt(scilensatiriindeks3, 4).toString();
       String gun=model.getValueAt(scilensatiriindeks3, 5).toString();
       String ay=model.getValueAt(scilensatiriindeks3, 6).toString();
       String saat=model.getValueAt(scilensatiriindeks3, 7).toString();
       
         
    
            PreparedStatement ps1;
             Statement st1 =null;
            try {
                
            ps1=con.prepareStatement("insert into rezervasyonlar (email,sehirKalkis,sehirGidis,havalimaniKalkis,havalimaniGidis,seferNo,gun,ay,saat,koltukNo) values ('"+emailtxt.getText()+"','"+sehirKalkis+"','"+sehirGidis+"','"+havalimaniKalkis+"','"+havalimaniGidis+"','"+seferNo+"','"+gun+"','"+ay+"','"+saat+"','"+koltuk+"')");

            String url="insert into rezervasyonlar (email,sehirKalkis,sehirGidis,havalimaniKalkis,havalimaniGidis,seferNo,gun,ay,saat,koltukNo) values ('"+emailtxt.getText()+"','"+sehirKalkis+"','"+sehirGidis+"','"+havalimaniKalkis+"','"+havalimaniGidis+"','"+seferNo+"','"+gun+"','"+ay+"','"+saat+"','"+koltuk+"')";
            st1=con.createStatement();
             st1.executeUpdate(url);
                JOptionPane.showMessageDialog(null," gerçekleştirildi.");
        } catch (Exception ex) {
             JOptionPane.showConfirmDialog(null, ex.getMessage());
        }
            
            
            
            
    
    
    }
   
    
    
    
    private void displaytableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displaytableMouseClicked
        DefaultTableModel model=(DefaultTableModel)displaytable.getModel();
        int scilensatiriindeks=displaytable.getSelectedRow();

        koltuknolar.setText(model.getValueAt(scilensatiriindeks, 8).toString());

    }//GEN-LAST:event_displaytableMouseClicked

    private void rezarvasyonyapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rezarvasyonyapMouseClicked

        reservation();

    }//GEN-LAST:event_rezarvasyonyapMouseClicked

    private void check3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check3ActionPerformed

    private void check9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check9ActionPerformed

    private void check7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check7ActionPerformed

    private void check10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check10ActionPerformed

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
            java.util.logging.Logger.getLogger(rezervasyontablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rezervasyontablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rezervasyontablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rezervasyontablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rezervasyontablo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox check1;
    private javax.swing.JCheckBox check10;
    private javax.swing.JCheckBox check2;
    private javax.swing.JCheckBox check3;
    private javax.swing.JCheckBox check4;
    private javax.swing.JCheckBox check5;
    private javax.swing.JCheckBox check6;
    private javax.swing.JCheckBox check7;
    private javax.swing.JCheckBox check8;
    private javax.swing.JCheckBox check9;
    public javax.swing.JTable displaytable;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel koltuknolar;
    private javax.swing.JLabel nereden;
    private javax.swing.JLabel nereye;
    private javax.swing.JButton rezarvasyonyap;
    // End of variables declaration//GEN-END:variables
}
