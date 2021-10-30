
package by.tms.lesson9homework;

import by.tms.lesson9homework.task1.Figure;
import by.tms.lesson9homework.task1.ShapeUtils;
import by.tms.lesson9homework.task1.typeoffigures.Circle;
import by.tms.lesson9homework.task1.typeoffigures.typeofquadrangles.Parallelogram;
import by.tms.lesson9homework.task1.typeoffigures.typeofquadrangles.Rectangle;
import by.tms.lesson9homework.task1.typeoffigures.typeoftriangles.Versatile;

public class mainFor9 {

    public static void main(String[] args) {

        Figure rectangle = new Rectangle(5, 6);
        Rectangle rectangle1 = new Rectangle(5, 6);
        Versatile versatile = new Versatile(6, 7, 8, 7);

        versatile.setArea(15);
        rectangle.findTheArea();
        rectangle1.findTheArea();
        System.out.println("Площаль прямоугольника = " + rectangle.getArea());
        System.out.println("Площаль прямоугольника 2 = " + rectangle1.getArea());

        System.out.println("Площаль разностороннего треугольника = " + versatile.getArea());
        Circle circle = new Circle(5);

        versatile.compareTheAreas(rectangle);
        rectangle1.compareTheAreas(rectangle);
        ShapeUtils.isAQuadrangle(rectangle);
        ShapeUtils.isAQuadrangle(circle);
        ShapeUtils.isATriangle(versatile);
        Parallelogram parallelogram = new Parallelogram(5, 6, 4);
        System.out.println(parallelogram);
        System.out.println(rectangle);


    }
}
