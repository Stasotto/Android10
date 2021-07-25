package by.tms.lesson2homework;

import java.util.Scanner;

public class Task6 {
    private static int con;
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму");
        int entredNumber = scanner.nextInt();
        sum(entredNumber);
        System.out.println(con);
    }
   public static int sum(int n) {
        if(n < 10) {
            return n;
        }
    return con = n % 10 * sum(n/10);

    }
}

