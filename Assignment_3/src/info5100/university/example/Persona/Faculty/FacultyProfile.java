/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.Faculty;

import info5100.university.example.Persona.*;
import info5100.university.example.CourseSchedule.CourseOffer;

import java.util.ArrayList;

/**
 * @author kal bugrara
 */
public class FacultyProfile {

    Person person;
    ArrayList<FacultyAssignment> facultyassignments;

    public FacultyProfile(Person p) {

        person = p;
        facultyassignments = new ArrayList<>();
    }

    public double getProfAverageOverallRating() {

        double sum = 0.0;
        //for each facultyassignment extract class rating
        //add them up and divide by the number of teaching assignmnet;
        for (FacultyAssignment fa : facultyassignments) {

            sum = sum + fa.getRating();

        }
        //divide by the total number of faculty assignments

        return sum / (facultyassignments.size() * 1.0); //this ensure we have double/double

    }

    public FacultyAssignment AssignAsTeacher(CourseOffer co) {

        FacultyAssignment fa = new FacultyAssignment(this, co);
        facultyassignments.add(fa);
        return fa;
    }

    public FacultyProfile getCourseOffer(String courseid) {
        for (FacultyAssignment fa : facultyassignments) {
            if (fa.getCourseoffer().getCourseNumber().equals(courseid)) {
                return fa.getFacultyProfile();
            }
        }
        return null;
    }
    public Person getFacultyId() {
        return person;
    }

    public boolean isMatch(String id) {
        return person.getPersonId().equals(id);
    }

}
