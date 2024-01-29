/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.Person;

/**
 *
 * @author josephchakola
 */
public class CreatePersonPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePersonPanels
     */
    private Person person;
    public CreatePersonPanel(Person person) {
        initComponents();
        this.person = person;
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
        ageLabel = new javax.swing.JLabel();
        phLabel = new javax.swing.JLabel();
        genLabel = new javax.swing.JLabel();
        lnLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        fnField = new javax.swing.JTextField();
        lnField = new javax.swing.JTextField();
        agField = new javax.swing.JTextField();
        phField = new javax.swing.JTextField();
        gnField = new javax.swing.JTextField();

        mainLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel.setText("Create a Person");

        nameLabel.setText("First Name:");

        ageLabel.setText("Age:");

        phLabel.setText("Phone Number:");

        genLabel.setText("Gender:");

        lnLabel.setText("Last Name:");

        saveButton.setText("Save Person");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        lnField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnFieldActionPerformed(evt);
            }
        });

        agField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(saveButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lnLabel)
                            .addComponent(phLabel)
                            .addComponent(ageLabel)
                            .addComponent(nameLabel)
                            .addComponent(genLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fnField, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(lnField)
                            .addComponent(agField)
                            .addComponent(phField)
                            .addComponent(gnField))))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(mainLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(fnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lnLabel)
                            .addComponent(lnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageLabel)
                            .addComponent(agField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(genLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(70, 70, 70)
                .addComponent(saveButton)
                .addGap(205, 205, 205))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
   
        if("".equals(fnField.getText()) && "".equals(lnField.getText())){
          JOptionPane.showMessageDialog(this, "Please complete the form and press save");
        } else if("".equals(phField.getText()) && "".equals(agField.getText())){
            JOptionPane.showMessageDialog(this, "Please complete the form and press save");
        }
        else {
            person.setFirstName(fnField.getText());
            person.setLastName(lnField.getText());
            person.setGender(gnField.getText());
            person.setPhoneNumber(phField.getText());
            person.setAge(agField.getText());
            
            JOptionPane.showMessageDialog(this, "Person Saved");
            fnField.setText("");
            lnField.setText("");
            agField.setText("");
            phField.setText("");
            gnField.setText("");
            
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void lnFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnFieldActionPerformed

    private void agFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField fnField;
    private javax.swing.JLabel genLabel;
    private javax.swing.JTextField gnField;
    private javax.swing.JTextField lnField;
    private javax.swing.JLabel lnLabel;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField phField;
    private javax.swing.JLabel phLabel;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}