// UniversitySystem.java
public class UniversitySystem {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("S12345", "John Doe", 20);

        // Create a course
        Course course = new Course("CSE101", "Introduction to Computer Science");

        // Enroll the student in the course
        Registration.enrollStudent(student, course);
    }
}
