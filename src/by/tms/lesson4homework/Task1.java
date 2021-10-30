package by.tms.lesson4homework;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        String word = scanner.nextLine();
        check(word);
    }

    public static boolean isNotNull(String word) {
        if (word != null && !word.trim().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static String revers2(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }

    public static void check(String wordToCheck) {
        if (isNotNull(wordToCheck)) {
            System.out.println(wordToCheck.equalsIgnoreCase(revers2(wordToCheck)));
        } else {
            System.out.println("null");
        }
    }
}
