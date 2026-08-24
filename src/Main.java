public class Main {

    public static void main(String[] args) {
        Student student = new Student(
                "Kalana",
                22,
                "UCSC"
        );

        System.out.println(student.getName());

        student.setAge(23);
        System.out.println("New age: " + student.getAge());

        student.setAge(-5); // Invalid age
    }
}