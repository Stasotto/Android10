package by.tms.lesson6homework.task1;

import java.util.Locale;

public class Task1 {

    public static void main(String[] args) {
        String str = null;
        try {
            str.toUpperCase(Locale.ROOT);
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
