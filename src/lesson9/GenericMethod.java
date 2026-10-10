package lesson9;

import java.util.List;

public class GenericMethod {
    public static <T> void printItems(List<T> items) {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
