package by.tms.lesson2homework;

import java.util.Scanner;

public class Task1 {
    public static void main (String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int entredNumber = scanner.nextInt();
        int result = entredNumber*entredNumber*entredNumber;
        System.out.println("Число " + entredNumber + " в кубе = " + result);


    }

}
