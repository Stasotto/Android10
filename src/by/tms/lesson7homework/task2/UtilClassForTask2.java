package by.tms.lesson7homework.task2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public final class UtilClassForTask2 {

    private UtilClassForTask2() {
    }

    public static void createAndFillFile(File file) {
        String[] arrayNumbers = {"1 ", "28 ", "4 ", "68 ", "8 ", "9 ", "23 ", "65 ", "24 ", "88 ", "96 ", "54"};
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            for (String element : arrayNumbers) {
                fileOutputStream.write(element.getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        sortAndFillAnotherFile(file);
    }

    private static void sortAndFillAnotherFile(File file) {
        int[] inputNum = new int[12];
        if (file.exists() && file.isFile()) {
            try (Scanner scanner = new Scanner(file); FileWriter writer = new FileWriter("Resources/text2.txt")) {
                int counter = 0;
                while (scanner.hasNextInt()) {
                    inputNum[counter] = scanner.nextInt();
                    counter++;
                }
                Arrays.sort(inputNum);
                StringBuilder builder = new StringBuilder();
                for (int element : inputNum) {
                    builder.append(element).append(" ");
                }
                for (int i = 0; i < builder.length(); i++) {
                    writer.write(builder.charAt(i));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
