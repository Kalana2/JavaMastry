public class Student {

    String name;
    int age;
    String university;

    public Student(String name, int age, String university) {
        this.name = name;
        this.age = age;
        this.university = university;
    }

    public void introduce() {
        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("I study at " + university);
    }

    public String getStudyStatus() {
        return name + " is studying at " + university;
    }
}