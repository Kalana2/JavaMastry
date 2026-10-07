import java.time.LocalDate;

public class Enrollment {

    private final Student student;
    private final Course course;
    private final LocalDate enrollmentDate;

    public Enrollment(Student student, Course course) {
        validateRequest(student, course);

        if (course.isFull()) {
            throw new CourseFullException(
                    "Course " + course.getCourseCode() + " is full."
            );
        }

        this.student = student;
        this.course = course;
        this.enrollmentDate = LocalDate.now();

        course.enrollStudent();
    }

    public String getDetails() {
        return student.getSummary()
                + " enrolled in "
                + course.getDetails()
                + " on "
                + enrollmentDate;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    private void validateRequest(Student student, Course course) {
        if (student == null) {
            throw new IllegalArgumentException("Student is required");
        }

        if (course == null) {
            throw new IllegalArgumentException("Course is required");
        }
    }
}