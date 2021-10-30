package by.tms.lesson5homework.task2;

import java.util.Arrays;

public final class UtilClassForTask2 {

    private UtilClassForTask2() {
    }

    /*public static void printFibonacci(int number) {
        int[] arrayFib = new int[number];
        arrayFib[0] = 0;
        arrayFib[1] = 1;
        for (int i = 2; i < arrayFib.length; ++i) {
            arrayFib[i] = arrayFib[i - 1] + arrayFib[i - 2];
        }
        System.out.println(Arrays.toString(arrayFib));
    }*/

    public static int printFibonacci2(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return printFibonacci2(n - 1) + printFibonacci2(n - 2);
        }
    }
}
