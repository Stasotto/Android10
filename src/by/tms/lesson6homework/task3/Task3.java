package by.tms.lesson6homework.task3;

public class Task3 {
    public static void main(String[] args) {
        try {
            throwException();
        }
        catch (MyException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static void throwException() throws MyException {
        int i = 7;
        if( i < 10) {
            throw new MyException();
        }
    }
}
