/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.BankAccount;
import model.BankAccountHistory;

/**
 *
 * @author josephchakola
 */
public class ViewBankAccount extends javax.swing.JPanel {

    /**
     * Creates new form ViewBankAccount
     */
    private final BankAccountHistory bankAccountHistory;
    public ViewBankAccount(BankAccountHistory bankAccountHistory) {
        initComponents();
        this.bankAccountHistory = bankAccountHistory;
        populate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        daField = new javax.swing.JTextField();
        atLabel = new javax.swing.JLabel();
        phField = new javax.swing.JTextField();
        fnField = new javax.swing.JTextField();
        daLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        atField = new javax.swing.JTextField();
        mainLabel = new javax.swing.JLabel();
        caLabel = new javax.swing.JLabel();
        phLabel = new javax.swing.JLabel();
        caField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        vbaTable = new javax.swing.JTable();
        ViewButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();

        daField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daFieldActionPerformed(evt);
            }
        });

        atLabel.setText("Account Type:");

        daLabel.setText("Debit Amount:");

        nameLabel.setText("Full Name:");

        atField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atFieldActionPerformed(evt);
            }
        });

        mainLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel.setText("View Bank Account");

        caLabel.setText("Credit Amount:");

        phLabel.setText("Phone Number:");

        caField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caFieldActionPerformed(evt);
            }
        });

        vbaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Debit Amount", "Credit Amount", "Account Type", "Phone Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vbaTable);

        ViewButton.setText("View");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(atLabel)
                    .addComponent(caLabel)
                    .addComponent(daLabel)
                    .addComponent(nameLabel)
                    .addComponent(phLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fnField)
                    .addComponent(atField)
                    .addComponent(daField)
                    .addComponent(caField)
                    .addComponent(phField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127))
            .addComponent(mainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(mainLabel)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewButton)
                    .addComponent(DeleteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(fnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(atLabel)
                            .addComponent(atField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(daLabel)
                            .addComponent(daField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(caField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caLabel))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(phLabel)
                        .addComponent(phField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void daFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daFieldActionPerformed

    private void atFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atFieldActionPerformed

    private void caFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caFieldActionPerformed

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
        // TODO add your handling code here:
        int selected = vbaTable.getSelectedRow();
        if(selected == -1){
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
        } else{
            BankAccount bankAccount = bankAccountHistory.getBankAccount(selected);
                   fnField.setText(bankAccount.getName());
                    atField.setText(bankAccount.getAccountType());
                    caField.setText(bankAccount.getCreditAmount());
                    daField.setText(bankAccount.getDebitAmount());
                    phField.setText(bankAccount.getPhoneNumber());
        }
    }//GEN-LAST:event_ViewButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        int selected = vbaTable.getSelectedRow();
        if(selected == -1){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        } else{
           bankAccountHistory.deleteBankAccount(selected);
            populate();
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void populate(){
        DefaultTableModel dtm = (DefaultTableModel)vbaTable.getModel();
        dtm.setRowCount(0);
        for(BankAccount b: bankAccountHistory.getBankAccounts()){
            Object []obj= new Object[5];
            obj[0]= b.getName();
            obj[2] = b.getCreditAmount();
            obj[1] = b.getDebitAmount();
            obj[3] = b.getAccountType();
            obj[4] = b.getPhoneNumber();
            dtm.addRow(obj);
        }
            fnField.setText("");
            atField.setText("");
            daField.setText("");
            caField.setText("");
            phField.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton ViewButton;
    private javax.swing.JTextField atField;
    private javax.swing.JLabel atLabel;
    private javax.swing.JTextField caField;
    private javax.swing.JLabel caLabel;
    private javax.swing.JTextField daField;
    private javax.swing.JLabel daLabel;
    private javax.swing.JTextField fnField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField phField;
    private javax.swing.JLabel phLabel;
    private javax.swing.JTable vbaTable;
    // End of variables declaration//GEN-END:variables
}
