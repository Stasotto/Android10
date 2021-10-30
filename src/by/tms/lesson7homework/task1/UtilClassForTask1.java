package by.tms.lesson7homework.task1;

import java.io.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public final class UtilClassForTask1 {

    private UtilClassForTask1() {
    }

    public static void determineTHeFrequencyABC(File file) {
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        int[] numbers = new int[33];
        if (file.exists() && file.isFile()) {
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNext()) {
                    String str = scanner.nextLine().toLowerCase();
                    char[] arrayChar = str.toCharArray();
                    for (char element : arrayChar) {
                        if (Character.isAlphabetic(element)) {
                            for (int i = 0; i < alphabet.length(); i++) {
                                if (alphabet.charAt(i) == element) {
                                    numbers[i]++;
                                }
                            }
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < alphabet.length(); i++) {
                System.out.println(alphabet.charAt(i) + " - " + numbers[i]);
            }
        }
    }
}
