package by.tms.lesson5homework;

public final class UtilClassForTask1 {
    private static final String LINE = "1234567890";

    private UtilClassForTask1() {}

    public static void printSumOfNumber(String numberToSum) {
        int result = 0;
        if (isNotNull(numberToSum) && checkNumber(numberToSum)) {
            for (int i = numberToSum.length() - 1; i >= 0; i--) {
                result += Integer.parseInt(String.valueOf(numberToSum.charAt(i)));
            }
            System.out.println(result);
        } else {
            System.out.println("Неверный ввод данных");
        }
    }
    private static boolean isNotNull(String numberToCheck) {
        return numberToCheck != null && !numberToCheck.trim().isEmpty();
    }

    private static boolean checkNumber(String numberToCheck) {
        for (char element : numberToCheck.toCharArray()) {
            if (LINE.contains(String.valueOf(element))) {
            } else {
                return false;
            }
        }
        return true;
    }

}
