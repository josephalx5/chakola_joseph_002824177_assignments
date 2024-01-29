/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.Address;

/**
 *
 * @author josephchakola
 */
public class CreateLocalAddress extends javax.swing.JPanel {

    /**
     * Creates new form createLocalAddress
     */
    private final Address address;
    public CreateLocalAddress(Address address) {
        initComponents();
        this.address = address;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        al1Label = new javax.swing.JLabel();
        al2Label = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        zipCodeLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        al1Field = new javax.swing.JTextField();
        al2Field = new javax.swing.JTextField();
        cityField = new javax.swing.JTextField();
        stateField = new javax.swing.JTextField();
        zipField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();

        mainLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel.setText("Create a Local Address");

        nameLabel.setText("Name:");

        al1Label.setText("Address Line 1:");

        al2Label.setText("Address Line 2:");

        cityLabel.setText("City:");

        stateLabel.setText("State:");

        zipCodeLabel.setText("zipCode:");

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        al1Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                al1FieldActionPerformed(evt);
            }
        });

        al2Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                al2FieldActionPerformed(evt);
            }
        });

        cityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityFieldActionPerformed(evt);
            }
        });

        stateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateFieldActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(zipCodeLabel)
                    .addComponent(stateLabel)
                    .addComponent(cityLabel)
                    .addComponent(al2Label)
                    .addComponent(al1Label)
                    .addComponent(nameLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(stateField)
                        .addComponent(nameField)
                        .addComponent(al1Field)
                        .addComponent(al2Field)
                        .addComponent(cityField)
                        .addComponent(zipField, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(mainLabel)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(al1Label)
                    .addComponent(al1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(al2Label)
                    .addComponent(al2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipCodeLabel))
                .addGap(46, 46, 46)
                .addComponent(saveButton)
                .addContainerGap(177, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void al1FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_al1FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_al1FieldActionPerformed

    private void al2FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_al2FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_al2FieldActionPerformed

    private void cityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityFieldActionPerformed

    private void stateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateFieldActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        if("".equals(nameField.getText()) || "".equals(al1Field.getText()) || "".equals(zipField.getText()) || "".equals(cityField.getText())){
            JOptionPane.showMessageDialog(this, "Please fill all fields");
        } else {
           JOptionPane.showMessageDialog(this, "Local Address Saved");
           address.setAddressLine1(al1Field.getText());
           address.setAddressLine2(al2Field.getText());
           address.setName(nameField.getText());
           address.setState(stateField.getText());
           address.setCity(cityField.getText());
           address.setZipCode(zipField.getText());
           
           //Reset Fields
           al1Field.setText("");
           al2Field.setText("");
           zipField.setText("");
           cityField.setText("");
           stateField.setText("");
           nameField.setText("");
        }
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField al1Field;
    private javax.swing.JLabel al1Label;
    private javax.swing.JTextField al2Field;
    private javax.swing.JLabel al2Label;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField stateField;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JLabel zipCodeLabel;
    private javax.swing.JTextField zipField;
    // End of variables declaration//GEN-END:variables
}
