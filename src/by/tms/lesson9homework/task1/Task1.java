package by.tms.lesson9homework.task1;

import by.tms.lesson9homework.task1.typeoffigures.Ellipse;
import by.tms.lesson9homework.task1.typeoffigures.PiInterface;

public class Task1 {

    public static void main(String[] args) {

        Ellipse ellipse = new Ellipse();
        ellipse.findThePerimeter();
        ellipse.findThePerimeter();
        System.out.println(ellipse.getPerimeter());
        System.out.println(ellipse.getArea());
        System.out.println(ellipse.toString());
        ellipse.compareTheAreas(new Ellipse());
    }
}
