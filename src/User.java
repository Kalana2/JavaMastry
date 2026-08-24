public class User {

    private final String id;
    private String name;

    public User(String id, String name) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("ID cannot be empty");
        }

        this.id = id;
        setName(name);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        this.name = name;
    }

    public String getRole() {
        return "User";
    }

    public String getSummary() {
        return id + " - " + name + " - " + getRole();
    }
}