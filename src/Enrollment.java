import java.time.LocalDate;

public class Enrollment {

    private final Student student;
    private final Course course;
    private final LocalDate enrollmentDate;

    public Enrollment(Student student, Course course) {
        if (student == null || course == null) {
            throw new IllegalArgumentException(
                    "Student and course are required"
            );
        }

        this.student = student;
        this.course = course;
        this.enrollmentDate = LocalDate.now();
    }

    public String getDetails() {
        return student.getSummary()
                + " enrolled in "
                + course.getDetails()
                + " on "
                + enrollmentDate;
    }
}