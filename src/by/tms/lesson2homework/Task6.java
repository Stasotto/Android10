package by.tms.lesson2homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        ArrayList<Integer> qwwr = new ArrayList();
        qwwr.add(1);
        qwwr.add(2);
        qwwr.add(3);
        qwwr.add(4);
        qwwr.add(5);
        qwwr.add(6);
        qwwr.add(7);
        qwwr.add(8);
        qwwr.add(9);
        qwwr.add(10);


        System.out.println(qwwr);
        System.out.println(reverse2(qwwr));
        System.out.println(qwwr);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму");
        int entredNumber = scanner.nextInt();
        System.out.println(sum(entredNumber));
        System.out.println(sum2(entredNumber));
        System.out.println(sum3(entredNumber));
        System.out.println(sum4(entredNumber, 0));

    }

    public static int sum(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sum(n / 10);

    }

    public static int sum2(int a) {
        int i = 1;
        int result = 0;
        while (true) {
            if (a < 10) {
                result += a;
                break;
            }
            result += a % 10;
            a /= 10;
        }
        return result;

    }

    public static int sum3(int b) {
        int result = 0;
        for (int i = 0; i <= b; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }

    public static int sum4(int b, int a) {
        if (a > b) {
            return 0;
        } else {
            if (a % 3 == 0 || a % 5 == 0) {
                return a + sum4(b, a + 1);
            } else {
                return sum4(b, a + 1);
            }
        }
    }
    public static ArrayList<Integer> reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
        return list;
    }
    
    public static ArrayList<Integer> reverse2(ArrayList<Integer> list) {
        for(int i = list.size() - 1; i >= 0; i--) {
            list.add(list.get(i));
            list.remove(i);
        }
        return list;
    }
}

