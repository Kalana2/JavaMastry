public class Instructor extends User {

    private final String department;

    public Instructor(
            String id,
            String name,
            String department
    ) {
        super(id, name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String getRole() {
        return "Instructor";
    }
}