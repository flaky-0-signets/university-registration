// Registration.java
public class Registration {
    public static void enrollStudent(Student student, Course course) {
        System.out.println("Enrolling student in the following course:");
        course.displayInfo();
        System.out.println("Student Information:");
        student.displayInfo();
        System.out.println("Enrollment successful!");
    }
}
