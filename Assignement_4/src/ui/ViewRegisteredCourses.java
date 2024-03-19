/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.StudentProfile;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josephchakola
 */
public class ViewRegisteredCourses extends javax.swing.JPanel {

    /**
     * Creates new form ViewRegisteredCourses
     */
      JSplitPane splitpane;
    Department computerScience;
    CourseSchedule schedule;
    Person p;
    private StudentProfile sp;
    public ViewRegisteredCourses(JSplitPane splitpane, Department department, Person p) {
        initComponents();
         this.splitpane = splitpane;
        this.computerScience = department;
        this.schedule = computerScience.getCourseSchedule("Fall 2024");
        this.p = p;
        this.sp = computerScience.getStudentDirectory().findStudent(p.getPersonId());
        populateTable();
    }
    private void populateTable(){
    DefaultTableModel dtm = (DefaultTableModel) crTable.getModel();
        dtm.setRowCount(0);
        Object[] obj = new Object[4];

        for (SeatAssignment sa : sp.getCourseList()) {
            CourseOffer co = schedule.getCourseOfferByNumber(sa.getAssociatedCourse().getCourseNumber());
            obj[0] = sa.getAssociatedCourse().getCourseNumber();
            obj[1] = sa.getAssociatedCourse().getName();
            obj[2] = computerScience.getDegree().courseType(sa.getAssociatedCourse().getCourseNumber()) ? "Core" : "Elective";
            obj[3] = co.getFacultyProfile() == null ? "TBD" : co.getFacultyProfile().getFacultyId().getName();
            dtm.addRow(obj);
        }
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
        crTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        crTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Course Name", "Type", "Faculty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(crTable);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        StudentPanel sps  = new StudentPanel(splitpane,  computerScience, p);
        splitpane.setRightComponent(sps);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable crTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
