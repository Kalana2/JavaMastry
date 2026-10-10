package lesson9;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box<String> nameBox = new Box<>();
        nameBox.setValue("Kalana");
        String name = nameBox.getValue();
        System.out.println(name);
    }




    List<String> names = List.of("Kalana", "Sahan", "Seniru", "Bawwa");
    printItems(names);




}


