/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CourseSchedule {

    CourseCatalog coursecatalog;

    ArrayList<CourseOffer> schedule;
    String semester;

    public CourseSchedule(String s, CourseCatalog cc) {
        semester = s;
        coursecatalog = cc;
        schedule = new ArrayList<>();

    }

    public CourseOffer newCourseOffer(String  n) {

        Course c = coursecatalog.getCourseByNumber(n);
        if(c==null) {
            return null;
        }

        CourseOffer co;
        co = new CourseOffer(c);
        schedule.add(co);
        return co;
    }

    public CourseOffer getCourseOfferByNumber(String n) {

        for (CourseOffer co : schedule) {

            if (co.getCourseNumber().equals(n)) {
                return co;
            }
        }
        return null;
    }

    public int calculateTotalRevenues() {
        int sum = 0;
        for (CourseOffer co : schedule) {

            sum = sum + co.getTotalCourseRevenues();

        }
        return sum;
    }
    public CourseOffer deleteCourseOffer(int n){
        return schedule.remove(n);
    }
    
    public void removeFacultyAssignment(String id){
        for(CourseOffer co: schedule){
            if(co.getFacultyProfile()!= null && co.getFacultyProfile().getFacultyId().getPersonId().equals(id)){
                co.removeFacultyAssignment();
            }
        }
    }
    public ArrayList<CourseOffer> getSchedule(){
        return schedule;
    }

    public void printCourseSchedule() {
        System.out.println("Semester: " + semester);
        System.out.println("--------------------------------------------------------");
        System.out.println("---------Course Schedule--------------");
        for (CourseOffer courseOffer : schedule) {
            Course subjectCourse = courseOffer.getSubjectCourse();
            System.out.println("Course ID: " + subjectCourse.getCourseNumber()+"| Name: "+subjectCourse.getName()+"| credits: "+subjectCourse.getCredits()+"| Number of Seats: "+courseOffer.getNumOfSeats()+"|No of Students Enrolled: "+(courseOffer.getNumOfSeats()-courseOffer.getEmptySeats())+"| Empty Seats: "+courseOffer.getEmptySeats()+"| ID: "+courseOffer.getFacultyProfile().getFacultyId().getPersonId());
        }
        System.out.println("---------Total Revenues: $" + calculateTotalRevenues());
        System.out.println("---------------Split Up--------------");
        for (CourseOffer courseOffer : schedule) {
            Course subjectCourse = courseOffer.getSubjectCourse();
            System.out.println("Course Name: "+ subjectCourse.getName()+"|No of Students: "+ (courseOffer.getNumOfSeats()-courseOffer.getEmptySeats()) +" | Revenue: $"+(subjectCourse.getCoursePrice()*(courseOffer.getNumOfSeats()-courseOffer.getEmptySeats())));
        }

    }
}
