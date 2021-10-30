package by.tms.lesson6homework.task7;

public class Task7 {

    public static void main(String[] args) {
        try {
            randomNUmber();
        }
        catch (RuntimeException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Блок finally");
        }
    }

    public static void randomNUmber() {
        int i = (int) (Math.random() * 2);
        switch (i) {
            case 0:
                System.out.println(8 / 0);
                break;
            case 1:
                System.out.println(8 / 2);
                break;
        }
    }
}
