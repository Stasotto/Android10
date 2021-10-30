package by.tms.lesson6homework.task4;

import by.tms.lesson6homework.task3.MyException;

public class Task4 {

    public static void main(String[] args) {
        try {
            throwException();
        }
        catch (MyException2 e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static void throwException() throws MyException2 {
        int i = 7;
        if( i < 10) {
            throw new MyException2("Это мое исключение");
        }
    }
}
