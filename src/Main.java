import com.model.Course;
import com.model.Instructor;
import com.model.Student;
import com.exception.CourseFullException;
import com.service.Enrollment;

public class Main {

    public static void main(String[] args) {
        Student student = new Student(
                "2023/CS/082",
                "Kalana",
                "Computer Science"
        );

        Instructor instructor = new Instructor(
                "INS001",
                "Mr. Welgama",
                "Computer Science"
        );

        System.out.println(student.getSummary());
        System.out.println(instructor.getSummary());

        Course course = new Course("CSC3203", "Literature Review", 100,instructor);

        String courseDetails = course.getDetails();
        System.out.println(courseDetails);



        try {
            Enrollment enrollment = new Enrollment(student,course);
            System.out.println("successfully enrolled");
        }catch (CourseFullException exception) {
            System.out.println("course is full enrollment rejected" + exception.getMessage());
        }
    }
}