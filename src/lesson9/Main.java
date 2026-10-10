package lesson9;

public class Main {
    public static void main(String[] args) {
        Box<String> nameBox = new Box<>();
        nameBox.setValue("Kalana");
        String name = nameBox.getValue();
        System.out.println(name);
    }
}
