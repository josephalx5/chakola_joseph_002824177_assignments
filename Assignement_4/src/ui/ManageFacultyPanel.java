/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.RoleManager;
import info5100.university.example.Persona.StudentProfile;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josephchakola
 */
public class ManageFacultyPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageFacultyPanel
     */
    JSplitPane splitpane;
    Department computerScience;

    public ManageFacultyPanel(JSplitPane splitpane, Department department) {
        initComponents();
        this.splitpane = splitpane;
        this.computerScience = department;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        facultyManagementTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        idField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addFaculty = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();

        facultyManagementTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "ID", "Number of Courses"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(facultyManagementTable);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Faculty Management");

        jButton1.setText("delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        jLabel3.setText("ID");

        addFaculty.setText("Add Faculty");
        addFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFacultyActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addFaculty)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nameField)
                        .addComponent(idField, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)))
                .addGap(145, 145, 145))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackButton)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addComponent(addFaculty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(BackButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFacultyActionPerformed
        // TODO add your handling code here:
        if (nameField.getText().isBlank() || idField.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields");
        } else if (computerScience.getFacultydirectory().findTeachingFaculty(idField.getText()) != null) {
            JOptionPane.showMessageDialog(this, "Person with the same ID exists!!");
        } else {
            Person p = computerScience.getPersonDirectory().newPerson(idField.getText(), RoleManager.FACULTY);
            p.setName(nameField.getText());
            computerScience.getFacultydirectory().newFacultyProfile(p);
            populate();
            idField.setText("");
            nameField.setText("");
        }
    }//GEN-LAST:event_addFacultyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (facultyManagementTable.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
        } else {
            FacultyProfile sp = computerScience.getFacultydirectory().removeFaculty(facultyManagementTable.getSelectedRow());
            computerScience.getPersonDirectory().removePerson(sp.getFacultyId().getPersonId());
            populate();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        AdminPanel ad = new AdminPanel(splitpane, computerScience);
        splitpane.setRightComponent(ad);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void populate() {
        DefaultTableModel dtm = (DefaultTableModel) facultyManagementTable.getModel();
        dtm.setRowCount(0);
        Object[] obj = new Object[3];
        for (FacultyProfile s : computerScience.getFacultydirectory().getTeacherlist()) {
            obj[0] = s.getFacultyId().getName();
            obj[1] = s.getFacultyId().getPersonId();
            obj[2] = 0;
            dtm.addRow(obj);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton addFaculty;
    private javax.swing.JTable facultyManagementTable;
    private javax.swing.JTextField idField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    // End of variables declaration//GEN-END:variables
}
