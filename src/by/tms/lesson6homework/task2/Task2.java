package by.tms.lesson6homework.task2;

public class Task2 {

    public static void main(String[] args) {
        int[] array = {1};
        try {
            int index1 = array[1];
            System.out.println(index1);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.getMessage();
        }
    }
}
