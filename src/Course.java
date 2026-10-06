public class Course {
    private final String courseCode;
    private final String courseName;
    private final Instructor instructor;

    public   Course(String courseCode, String courseName, Instructor instructor) {

        if (instructor == null) throw new IllegalArgumentException("instructor cannot be null");
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;

    }
    public Instructor getInstructor() {
        return instructor;
    }

    public String getDetails() {
        return courseCode + " - " + courseName ;
    }

}
