package lesson9;

import com.model.User;

import java.util.List;

public class GenericMethod {
    public static <T> void printItems(List<T> items) {
        for (T item : items) {
            System.out.println(item);
        }
    }

    public static  <T extends User> void printUsers(T user){ // User or thire own chlid class
        System.out.println(user.getSummary());

    }

    public static void displaySize(List<?> Items) {
        System.out.println(Items.size());
    }
}
