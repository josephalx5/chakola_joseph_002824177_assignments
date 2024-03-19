import info5100.university.example.College.College;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.RoleManager;
import info5100.university.example.Persona.StudentDirectory;

public class UniversityMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Northeastern University");
        System.out.println(Art.husky);
        System.out.println(Art.art);
        College college_of_engineering = new College("College of Engineering");
        Department computerScience = new Department("Computer Science");

        PersonDirectory personDirectory = computerScience.getPersonDirectory();
        FacultyDirectory facultyDirectory = computerScience.getFacultydirectory();
        StudentDirectory studentDirectory = computerScience.getStudentDirectory();

        // Create 10 Faculty members
        for (int i = 0; i < 10; i++) {
            facultyDirectory.newFacultyProfile(personDirectory.newPerson("Faculty" + i));
        }

        // Create 30 Students
        for (int i = 1; i <= 30; i++) {
            studentDirectory.newStudentProfile(personDirectory.newPerson("Student" + i));
        }

        // Add 7 courses to the course catalog
        computerScience.newCourse("Introduction to Computer Science", "CS101", 4);
        computerScience.newCourse("Data Structures", "CS102", 4);
        computerScience.newCourse("Algorithms", "CS103", 4);
        computerScience.newCourse("Database Systems", "CS104", 4);
        computerScience.newCourse("Operating Systems", "CS105", 4);
        computerScience.newCourse("Computer Networks", "CS106", 4);
        computerScience.newCourse("Software Engineering", "CS107", 4);

        // Add two core courses
        computerScience.addCoreCourse(computerScience.getCourseCatalog().getCourseByNumber("CS101"));
        computerScience.addCoreCourse(computerScience.getCourseCatalog().getCourseByNumber("CS102"));

        // Add 5 elective courses
        computerScience.addElectiveCourse(computerScience.getCourseCatalog().getCourseByNumber("CS103"));
        computerScience.addElectiveCourse(computerScience.getCourseCatalog().getCourseByNumber("CS104"));
        computerScience.addElectiveCourse(computerScience.getCourseCatalog().getCourseByNumber("CS105"));
        computerScience.addElectiveCourse(computerScience.getCourseCatalog().getCourseByNumber("CS106"));
        computerScience.addElectiveCourse(computerScience.getCourseCatalog().getCourseByNumber("CS107"));

        // Create a course schedule for the Fall 2021 semester
        CourseSchedule schedule = computerScience.newCourseSchedule("Fall 2021");
        CourseOffer courseOffer1 = schedule.newCourseOffer("CS101");
        CourseOffer courseOffer2 = schedule.newCourseOffer("CS102");
        CourseOffer courseOffer3 = schedule.newCourseOffer("CS103");
        CourseOffer courseOffer4 = schedule.newCourseOffer("CS104");
        CourseOffer courseOffer5 = schedule.newCourseOffer("CS105");
        CourseOffer courseOffer6 = schedule.newCourseOffer("CS106");
        CourseOffer courseOffer7 = schedule.newCourseOffer("CS107");

        // Generate 20 seats for each course
        courseOffer1.generatSeats(20);
        courseOffer2.generatSeats(20);
        courseOffer3.generatSeats(20);
        courseOffer4.generatSeats(20);
        courseOffer5.generatSeats(20);
        courseOffer6.generatSeats(20);
        courseOffer7.generatSeats(20);

        // Assign new courseLoad to each student
        for (int i = 1; i <= 30; i++) {
            studentDirectory.findStudent("Student" + i).newCourseLoad("Fall 2021");
        }
        // Enroll faculty members to teach the courses
        courseOffer1.AssignAsTeacher(facultyDirectory.findTeachingFaculty("Faculty1"));
        courseOffer2.AssignAsTeacher(facultyDirectory.findTeachingFaculty("Faculty2"));
        courseOffer3.AssignAsTeacher(facultyDirectory.findTeachingFaculty("Faculty3"));
        courseOffer4.AssignAsTeacher(facultyDirectory.findTeachingFaculty("Faculty4"));
        courseOffer5.AssignAsTeacher(facultyDirectory.findTeachingFaculty("Faculty5"));
        courseOffer6.AssignAsTeacher(facultyDirectory.findTeachingFaculty("Faculty6"));
        courseOffer7.AssignAsTeacher(facultyDirectory.findTeachingFaculty("Faculty7"));

        // Enroll 20 students to each course
        courseOffer1.assignEmptySeat(studentDirectory.findStudent("Student1").getCurrentCourseLoad()).setGrade(4.0f);
        courseOffer1.assignEmptySeat(studentDirectory.findStudent("Student2").getCurrentCourseLoad()).setGrade(3.7f);
        courseOffer1.assignEmptySeat(studentDirectory.findStudent("Student3").getCurrentCourseLoad()).setGrade(3.3f);
        courseOffer1.assignEmptySeat(studentDirectory.findStudent("Student4").getCurrentCourseLoad()).setGrade(3.0f);
        courseOffer1.assignEmptySeat(studentDirectory.findStudent("Student5").getCurrentCourseLoad()).setGrade(2.7f);
        courseOffer1.assignEmptySeat(studentDirectory.findStudent("Student6").getCurrentCourseLoad()).setGrade(2.3f);
        courseOffer1.assignEmptySeat(studentDirectory.findStudent("Student7").getCurrentCourseLoad()).setGrade(2.0f);
        courseOffer1.assignEmptySeat(studentDirectory.findStudent("Student8").getCurrentCourseLoad()).setGrade(1.7f);
        courseOffer1.assignEmptySeat(studentDirectory.findStudent("Student9").getCurrentCourseLoad()).setGrade(1.3f);
        courseOffer1.assignEmptySeat(studentDirectory.findStudent("Student10").getCurrentCourseLoad()).setGrade(1.0f);

        courseOffer2.assignEmptySeat(studentDirectory.findStudent("Student11").getCurrentCourseLoad()).setGrade(4.0f);
        courseOffer2.assignEmptySeat(studentDirectory.findStudent("Student12").getCurrentCourseLoad()).setGrade(3.7f);
        courseOffer2.assignEmptySeat(studentDirectory.findStudent("Student13").getCurrentCourseLoad()).setGrade(3.3f);
        courseOffer2.assignEmptySeat(studentDirectory.findStudent("Student14").getCurrentCourseLoad()).setGrade(3.0f);
        courseOffer2.assignEmptySeat(studentDirectory.findStudent("Student15").getCurrentCourseLoad()).setGrade(2.7f);
        courseOffer2.assignEmptySeat(studentDirectory.findStudent("Student16").getCurrentCourseLoad()).setGrade(2.3f);
        courseOffer2.assignEmptySeat(studentDirectory.findStudent("Student17").getCurrentCourseLoad()).setGrade(2.0f);
        courseOffer2.assignEmptySeat(studentDirectory.findStudent("Student18").getCurrentCourseLoad()).setGrade(1.7f);
        courseOffer2.assignEmptySeat(studentDirectory.findStudent("Student19").getCurrentCourseLoad()).setGrade(1.3f);
        courseOffer2.assignEmptySeat(studentDirectory.findStudent("Student20").getCurrentCourseLoad()).setGrade(1.0f);

        courseOffer3.assignEmptySeat(studentDirectory.findStudent("Student21").getCurrentCourseLoad()).setGrade(4.0f);
        courseOffer3.assignEmptySeat(studentDirectory.findStudent("Student22").getCurrentCourseLoad()).setGrade(3.7f);
        courseOffer3.assignEmptySeat(studentDirectory.findStudent("Student23").getCurrentCourseLoad()).setGrade(3.3f);
        courseOffer3.assignEmptySeat(studentDirectory.findStudent("Student24").getCurrentCourseLoad()).setGrade(3.0f);
        courseOffer3.assignEmptySeat(studentDirectory.findStudent("Student25").getCurrentCourseLoad()).setGrade(2.7f);
        courseOffer3.assignEmptySeat(studentDirectory.findStudent("Student26").getCurrentCourseLoad()).setGrade(2.3f);
        courseOffer3.assignEmptySeat(studentDirectory.findStudent("Student27").getCurrentCourseLoad()).setGrade(2.0f);
        courseOffer3.assignEmptySeat(studentDirectory.findStudent("Student28").getCurrentCourseLoad()).setGrade(1.7f);
        courseOffer3.assignEmptySeat(studentDirectory.findStudent("Student29").getCurrentCourseLoad()).setGrade(1.3f);
        courseOffer3.assignEmptySeat(studentDirectory.findStudent("Student30").getCurrentCourseLoad()).setGrade(1.0f);

        courseOffer4.assignEmptySeat(studentDirectory.findStudent("Student1").getCurrentCourseLoad()).setGrade(4.0f);
        courseOffer4.assignEmptySeat(studentDirectory.findStudent("Student2").getCurrentCourseLoad()).setGrade(3.7f);
        courseOffer4.assignEmptySeat(studentDirectory.findStudent("Student3").getCurrentCourseLoad()).setGrade(3.3f);
        courseOffer4.assignEmptySeat(studentDirectory.findStudent("Student4").getCurrentCourseLoad()).setGrade(3.0f);
        courseOffer4.assignEmptySeat(studentDirectory.findStudent("Student5").getCurrentCourseLoad()).setGrade(2.7f);
        courseOffer4.assignEmptySeat(studentDirectory.findStudent("Student6").getCurrentCourseLoad()).setGrade(2.3f);
        courseOffer4.assignEmptySeat(studentDirectory.findStudent("Student7").getCurrentCourseLoad()).setGrade(2.0f);
        courseOffer4.assignEmptySeat(studentDirectory.findStudent("Student8").getCurrentCourseLoad()).setGrade(1.7f);
        courseOffer4.assignEmptySeat(studentDirectory.findStudent("Student9").getCurrentCourseLoad()).setGrade(1.3f);
        courseOffer4.assignEmptySeat(studentDirectory.findStudent("Student10").getCurrentCourseLoad()).setGrade(1.0f);

        courseOffer5.assignEmptySeat(studentDirectory.findStudent("Student11").getCurrentCourseLoad()).setGrade(4.0f);
        courseOffer5.assignEmptySeat(studentDirectory.findStudent("Student12").getCurrentCourseLoad()).setGrade(3.7f);
        courseOffer5.assignEmptySeat(studentDirectory.findStudent("Student13").getCurrentCourseLoad()).setGrade(3.3f);
        courseOffer5.assignEmptySeat(studentDirectory.findStudent("Student14").getCurrentCourseLoad()).setGrade(3.0f);
        courseOffer5.assignEmptySeat(studentDirectory.findStudent("Student15").getCurrentCourseLoad()).setGrade(2.7f);
        courseOffer5.assignEmptySeat(studentDirectory.findStudent("Student16").getCurrentCourseLoad()).setGrade(2.3f);
        courseOffer5.assignEmptySeat(studentDirectory.findStudent("Student17").getCurrentCourseLoad()).setGrade(2.0f);
        courseOffer5.assignEmptySeat(studentDirectory.findStudent("Student18").getCurrentCourseLoad()).setGrade(1.7f);
        courseOffer5.assignEmptySeat(studentDirectory.findStudent("Student19").getCurrentCourseLoad()).setGrade(1.3f);
        courseOffer5.assignEmptySeat(studentDirectory.findStudent("Student20").getCurrentCourseLoad()).setGrade(1.0f);

        courseOffer6.assignEmptySeat(studentDirectory.findStudent("Student21").getCurrentCourseLoad()).setGrade(4.0f);
        courseOffer6.assignEmptySeat(studentDirectory.findStudent("Student22").getCurrentCourseLoad()).setGrade(3.7f);
        courseOffer6.assignEmptySeat(studentDirectory.findStudent("Student23").getCurrentCourseLoad()).setGrade(3.3f);
        courseOffer6.assignEmptySeat(studentDirectory.findStudent("Student24").getCurrentCourseLoad()).setGrade(3.0f);
        courseOffer6.assignEmptySeat(studentDirectory.findStudent("Student25").getCurrentCourseLoad()).setGrade(2.7f);
        courseOffer6.assignEmptySeat(studentDirectory.findStudent("Student26").getCurrentCourseLoad()).setGrade(2.3f);
        courseOffer6.assignEmptySeat(studentDirectory.findStudent("Student27").getCurrentCourseLoad()).setGrade(2.0f);
        courseOffer6.assignEmptySeat(studentDirectory.findStudent("Student28").getCurrentCourseLoad()).setGrade(1.7f);
        courseOffer6.assignEmptySeat(studentDirectory.findStudent("Student29").getCurrentCourseLoad()).setGrade(1.3f);
        courseOffer6.assignEmptySeat(studentDirectory.findStudent("Student30").getCurrentCourseLoad()).setGrade(1.0f);

        courseOffer7.assignEmptySeat(studentDirectory.findStudent("Student1").getCurrentCourseLoad()).setGrade(4.0f);
        courseOffer7.assignEmptySeat(studentDirectory.findStudent("Student2").getCurrentCourseLoad()).setGrade(3.7f);
        courseOffer7.assignEmptySeat(studentDirectory.findStudent("Student3").getCurrentCourseLoad()).setGrade(3.3f);
        courseOffer7.assignEmptySeat(studentDirectory.findStudent("Student4").getCurrentCourseLoad()).setGrade(3.0f);
        courseOffer7.assignEmptySeat(studentDirectory.findStudent("Student5").getCurrentCourseLoad()).setGrade(2.7f);
        courseOffer7.assignEmptySeat(studentDirectory.findStudent("Student6").getCurrentCourseLoad()).setGrade(2.3f);
        courseOffer7.assignEmptySeat(studentDirectory.findStudent("Student7").getCurrentCourseLoad()).setGrade(2.0f);
        courseOffer7.assignEmptySeat(studentDirectory.findStudent("Student8").getCurrentCourseLoad()).setGrade(1.7f);
        courseOffer7.assignEmptySeat(studentDirectory.findStudent("Student9").getCurrentCourseLoad()).setGrade(1.3f);
        courseOffer7.assignEmptySeat(studentDirectory.findStudent("Student10").getCurrentCourseLoad()).setGrade(1.0f);


        schedule.printCourseSchedule();

        System.out.println("--------------Transcripts of all students----------------");
        for (int i = 1; i <= 30; i++) {
            studentDirectory.findStudent("Student" + i).printTranscript();
        }

        college_of_engineering.newDepartment(computerScience);
    }
}
