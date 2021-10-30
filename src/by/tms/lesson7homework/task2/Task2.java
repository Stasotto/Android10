package by.tms.lesson7homework.task2;

import java.io.File;
import java.io.IOException;

public class Task2 {

    public static void main(String[] args) throws IOException {
        File file = new File("Resources/text.txt");
        UtilClassForTask2.createAndFillFile(file);
    }


}
