package by.tms.lesson6homework.task6;

public class Task6Test {

    public static void main(String[] args) {

        try {
            Task6.throwException();
        }
        catch (NullPointerException e) {
            e.getMessage();
            System.out.println("NullPointerException");
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            ex.getMessage();
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (ArithmeticException exception) {
            exception.getMessage();
            System.out.println("ArithmeticException");
        }
    }
}
