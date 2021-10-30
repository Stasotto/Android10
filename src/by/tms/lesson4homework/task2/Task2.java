package by.tms.lesson4homework.task2;

import java.util.Locale;
import java.util.Scanner;

public class Task2 {

    public static final String LINE = "MDCLXVI";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число в римском формате");
        System.out.println("Соответствие: \n M = 1000 \n D = 500 \n C = 100 \n L = 50 \n X = 10 \n V = 5 \n I = 1");
        printConverseNumber(scanner.nextLine().toUpperCase(Locale.ROOT));
    }

    public static void printConverseNumber(String number) {
        if (isNotNUll(number) && checkNumber(number)) {
            if (converseNumber(number) >= 1 || converseNumber(number) <= 3999) {
                System.out.println(converseNumber(number));
            } else {
                System.out.println("Введенное число меньше 1 или больше 3999");
            }
        } else {
            System.out.println("Таких соответсвий нет");
        }
    }

    public static boolean isNotNUll(String number) {
        if (number != null && !number.trim().isEmpty()) {
            return true;
        }
        return false;
    }

    public static int converseNumber(String number) {
        int index = 0;
        int numOfCase = 0;
        int convertNumber = 0;
        char[] numberArray = number.toCharArray();
        for (char element : numberArray) {
            index++;
            if (numOfCase == 1) {
                numOfCase = 0;
                continue;
            }
            switch (element) {
                case 'M':
                    convertNumber += 1000;
                    break;
                case 'D':
                    if (numberArray[index] == 'M') {
                        convertNumber += 1000 - 500;
                        numOfCase++;
                        break;
                    }
                    convertNumber += 500;
                    break;
                case 'C':
                    if (numberArray[index] == 'M') {
                        convertNumber += 1000 - 100;
                        numOfCase++;
                        break;
                    } else if (numberArray[index] == 'D') {
                        convertNumber += 500 - 100;
                        numOfCase++;
                        break;
                    }
                    convertNumber += 100;
                    break;
                case 'L':
                    if (numberArray[index] == 'M') {
                        convertNumber += 1000 - 50;
                        numOfCase++;
                        break;
                    } else if (numberArray[index] == 'D') {
                        convertNumber += 500 - 50;
                        numOfCase++;
                        break;
                    } else if (numberArray[index] == 'c') {
                        convertNumber += 100 - 50;
                        numOfCase++;
                        break;
                    }
                    convertNumber += 50;
                    break;
                case 'X':
                    if (numberArray[index] == 'M') {
                        convertNumber += 1000 - 10;
                        numOfCase++;
                        break;
                    } else if (numberArray[index] == 'D') {
                        convertNumber += 500 - 10;
                        numOfCase++;
                        break;
                    } else if (numberArray[index] == 'C') {
                        convertNumber += 100 - 10;
                        numOfCase++;
                        break;
                    } else if (numberArray[index] == 'L') {
                        convertNumber += 50 - 10;
                        numOfCase++;
                        break;
                    }
                    convertNumber += 10;
                    break;
                case 'V':
                    if (numberArray[index] == 'M') {
                        convertNumber += 1000 - 5;
                        numOfCase++;
                        break;
                    } else if (numberArray[index] == 'D') {
                        convertNumber += 500 - 5;
                        numOfCase++;
                        break;
                    } else if (numberArray[index] == 'C') {
                        convertNumber += 100 - 5;
                        numOfCase++;
                        break;
                    } else if (numberArray[index] == 'L') {
                        convertNumber += 50 - 5;
                        numOfCase++;
                        break;
                    } else if (numberArray[index] == 'X') {
                        convertNumber += 10 - 5;
                        numOfCase++;
                        break;
                    }
                    convertNumber += 5;
                    break;
                case 'I':
                    if (numberArray[index] == 'M') {
                        convertNumber += 1000 - 1;
                        numOfCase++;
                        break;
                    } else if (numberArray[index] == 'D') {
                        convertNumber += 500 - 1;
                        numOfCase++;
                        break;
                    } else if (numberArray[index] == 'C') {
                        convertNumber += 100 - 1;
                        numOfCase++;
                        break;
                    } else if (numberArray[index] == 'L') {
                        convertNumber += 50 - 1;
                        numOfCase++;
                        break;
                    } else if (numberArray[index] == 'X') {
                        convertNumber += 10 - 1;
                        numOfCase++;
                        break;
                    } else if (numberArray[index] == 'V') {
                        convertNumber += 5 - 1;
                        numOfCase++;
                        break;
                    }
                    convertNumber += 1;
                    break;
            }
        }
        return convertNumber;
    }

    public static boolean checkNumber(String number) {
        for (char elemet : number.toCharArray()) {
            if (LINE.contains(String.valueOf(elemet))) {
            } else {
                return false;
            }
        }
        return true;
    }
}