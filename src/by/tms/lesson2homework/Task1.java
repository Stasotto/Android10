package by.tms.lesson2homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main (String[] args) {



        int[] array = {4,7,3,0,6,9};
        System.out.println(Arrays.toString(array));
        boolean sorted = false;
        while(!sorted) {
            sorted =true;
            for( int i = 0; i < array.length -1; i++) {
                if (array[i] > array[i + 1]) {
                    int j = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = j;
                    sorted = false;
                }
            }
            System.out.println(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));




        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int entredNumber = scanner.nextInt();
        int result = entredNumber*entredNumber*entredNumber;
        System.out.println("Число " + entredNumber + " в кубе = " + result);
    }


}
