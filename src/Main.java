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
    }
}