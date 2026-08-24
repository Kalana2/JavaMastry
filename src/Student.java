public class Student {

    private String name;
    private int age;
    private String university;

    public Student(String name, int age, String university) {
        this.name = name;
        setAge(age);
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getUniversity() {
        return university;
    }

    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age.");
        }
    }

    public void setUniversity(String university) {
        if (university != null && !university.isBlank()) {
            this.university = university;
        }
    }

    public void introduce() {
        System.out.println(name + " is " + age + " years old.");
        System.out.println("University: " + university);
    }
}