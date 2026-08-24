public class Student extends User {

    private final String degree;

    public Student(
            String id,
            String name,
            String degree
    ) {
        super(id, name);

        if (degree == null || degree.isBlank()) {
            throw new IllegalArgumentException(
                    "Degree cannot be empty"
            );
        }

        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    @Override
    public String getRole() {
        return "Student";
    }

    public String getStudentSummary() {
        return super.getSummary() + " - " + degree;
    }
}