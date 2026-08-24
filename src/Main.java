public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(
                "Kalana",
                22,
                "University of Colombo School of Computing"
        );

        student1.introduce();
        System.out.println(student1.getStudyStatus());

        Student student2 = new Student(
                "Seniru",
                22,
                "University of Colombo School of Computing"
        );

        student2.introduce();
    }
}