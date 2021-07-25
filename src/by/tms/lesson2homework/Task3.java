package by.tms.lesson2homework;

import java.util.Scanner;
//Немного изменил условие
//Сделал возможность ввода длины и ширины

public class Task3 {
    public static void main (String[] args ) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите ширину прямоугольника");
        int width = scanner.nextInt();
        System.out.println("Введите длину прямоугольника");
        int length = scanner2.nextInt();
        int areaOfTheRectangle = width * length;
        int perimeter = (width + length) * 2;
        System.out.println("Площадь прямоугольника = " + areaOfTheRectangle + " Периметр прямоугольника = " + perimeter);

    }

}
