package by.tms.lesson5homework.task2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        System.out.println(UtilClassForTask2.printFibonacci2(scanner.nextInt()));
    }
}
