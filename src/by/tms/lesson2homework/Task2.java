package by.tms.lesson2homework;

import java.util.Scanner;

public class Task2 {
    public static void main (String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int enteredNumber = scanner.nextInt();
        System.out.println(enteredNumber % 10 == 3 ? "true" : "false");
    }
}
