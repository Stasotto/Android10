package by.tms.lesson6homework.task5;

import by.tms.lesson6homework.task3.MyException;

public class Task5 {

    public static void main(String[] args) {
        try {
            throwException();
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            try {
                throw new MyException3();
            } catch (MyException3 myException3) {
                myException3.printStackTrace();
            }
        }
    }

    public static void throwException() throws ArithmeticException{
        int b = 7 /0;
        }
}
