package Phase2;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Kalana");
        Student s2 = new Student(1, "Kalana");
        Student s3 = new Student(2, "Sahan");


        System.out.println(s1.toString());
        System.out.println(s1);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1.getClass());
        System.out.println(s1.getClass().getName());
    }
}
