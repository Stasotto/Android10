package by.tms.lesson2homework;

import java.util.Scanner;

public class Task5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму");
        int entredNumber = scanner.nextInt();
        if(entredNumber % 10 == 1) {
            System.out.println(entredNumber + " рубль");
        } else if (entredNumber % 10 == 2 || entredNumber % 10 == 3 || entredNumber % 10 == 4) {
            System.out.println(entredNumber + " рубля");
        } else {
            System.out.println(entredNumber + " рублей");
        }


    }
}
