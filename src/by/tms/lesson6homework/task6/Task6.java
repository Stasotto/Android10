package by.tms.lesson6homework.task6;

import java.util.Arrays;
import java.util.Locale;

public final class Task6 {

    private Task6() {}

    public static void throwException() throws NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException{
        int i = (int) (Math.random() * 3);
        System.out.println(i);
        switch (i) {
            case 0:
                System.out.println( 8 / 0);
                break;
            case 1:
                String str = null;
                str.toUpperCase(Locale.ROOT);

                break;
            case 2:
                int[] newInt2 = {1};
                System.out.println(newInt2[1]);
                break;
        }
    }
}


