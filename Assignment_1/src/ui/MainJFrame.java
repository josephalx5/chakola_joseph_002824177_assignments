/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.Address;
import model.BankAccount;
import model.Person;

/**
 *
 * @author josephchakola
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private final Person person;
    private final BankAccount bankAccount;
    private final Address localAddress;
    private final Address homeAddress;
    public MainJFrame() {
        initComponents();
        this.person = new Person();
        this.bankAccount = new BankAccount();
        this.localAddress = new Address();
        this.homeAddress = new Address();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        cpBtn = new javax.swing.JButton();
        vpBtn = new javax.swing.JButton();
        chaBtn = new javax.swing.JButton();
        vhaBtn = new javax.swing.JButton();
        claBtn = new javax.swing.JButton();
        vlaBtn = new javax.swing.JButton();
        cbaBtn = new javax.swing.JButton();
        vbaBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cpBtn.setText("Create Person");
        cpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpBtnActionPerformed(evt);
            }
        });

        vpBtn.setText("View Person");
        vpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vpBtnActionPerformed(evt);
            }
        });

        chaBtn.setText("Create Home Address");
        chaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chaBtnActionPerformed(evt);
            }
        });

        vhaBtn.setText("View Home Address");
        vhaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vhaBtnActionPerformed(evt);
            }
        });

        claBtn.setText("Create Local Address");
        claBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claBtnActionPerformed(evt);
            }
        });

        vlaBtn.setText("View Local Address");
        vlaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vlaBtnActionPerformed(evt);
            }
        });

        cbaBtn.setText("Create Bank Account");
        cbaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbaBtnActionPerformed(evt);
            }
        });

        vbaBtn.setText("View Bank Account");
        vbaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vbaBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Person Profile");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpBtn)
                    .addComponent(vpBtn)
                    .addComponent(chaBtn)
                    .addComponent(vhaBtn)
                    .addComponent(claBtn)
                    .addComponent(vlaBtn)
                    .addComponent(cbaBtn)
                    .addComponent(vbaBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbaBtn, chaBtn, claBtn, cpBtn, vbaBtn, vhaBtn, vlaBtn, vpBtn});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(71, 71, 71)
                .addComponent(cpBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vpBtn)
                .addGap(33, 33, 33)
                .addComponent(chaBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vhaBtn)
                .addGap(32, 32, 32)
                .addComponent(claBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vlaBtn)
                .addGap(31, 31, 31)
                .addComponent(cbaBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vbaBtn)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vpBtnActionPerformed
        // TODO add your handling code here:
        ViewPersonPanel vpp = new ViewPersonPanel(person);
        splitPane.setRightComponent(vpp);
    }//GEN-LAST:event_vpBtnActionPerformed

    private void chaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chaBtnActionPerformed
        // TODO add your handling code here:
        CreateHomeAddress cha = new CreateHomeAddress(homeAddress);
        splitPane.setRightComponent(cha);
        
    }//GEN-LAST:event_chaBtnActionPerformed

    private void cpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpBtnActionPerformed
        // TODO add your handling code here:
        CreatePersonPanel cpp = new CreatePersonPanel(person);
        splitPane.setRightComponent(cpp);
    }//GEN-LAST:event_cpBtnActionPerformed

    private void cbaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbaBtnActionPerformed
        // TODO add your handling code here:
        CreateBankAccountPanel cbap = new CreateBankAccountPanel(bankAccount);
        splitPane.setRightComponent(cbap);
    }//GEN-LAST:event_cbaBtnActionPerformed

    private void vbaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vbaBtnActionPerformed
        // TODO add your handling code here:
        ViewBankAccount vba = new ViewBankAccount(bankAccount);
        splitPane.setRightComponent(vba);
    }//GEN-LAST:event_vbaBtnActionPerformed

    private void claBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claBtnActionPerformed
        // TODO add your handling code here:
        CreateLocalAddress cla = new CreateLocalAddress(localAddress);
        splitPane.setRightComponent(cla);
    }//GEN-LAST:event_claBtnActionPerformed

    private void vlaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vlaBtnActionPerformed
        // TODO add your handling code here:
        ViewLocalAddress vla =new ViewLocalAddress(localAddress);
        splitPane.setRightComponent(vla);
    }//GEN-LAST:event_vlaBtnActionPerformed

    private void vhaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vhaBtnActionPerformed
        // TODO add your handling code here:
        ViewHomeAddress vha = new ViewHomeAddress(homeAddress);
        splitPane.setRightComponent(vha);
        
    }//GEN-LAST:event_vhaBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cbaBtn;
    private javax.swing.JButton chaBtn;
    private javax.swing.JButton claBtn;
    private javax.swing.JButton cpBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JButton vbaBtn;
    private javax.swing.JButton vhaBtn;
    private javax.swing.JButton vlaBtn;
    private javax.swing.JButton vpBtn;
    // End of variables declaration//GEN-END:variables
}
