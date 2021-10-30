package by.tms.lesson9homework.task1;

import by.tms.lesson9homework.task1.typeoffigures.Quadrangle;
import by.tms.lesson9homework.task1.typeoffigures.Triangle;

import java.util.logging.SocketHandler;

public final class ShapeUtils {

    private ShapeUtils() {
    }

    public static void isAQuadrangle(Figure figure) {
        if (figure instanceof Quadrangle) System.out.println("Данная фигура Прямоугольник");
        else System.out.println("Это что-то другое");
    }

    public static void isATriangle(Figure figure) {
        if (figure instanceof Triangle) System.out.println("Данная фигура Треугольник");
        else System.out.println("Это что-то другое");
    }
}
