package by.tms.lesson3homework;

public class Start {
    public static void main(String[] args) {
        Ractangle rc = new Ractangle(new Point(2.0, 6.0), new Point(9.0, 2.0));
        System.out.println("Площадь прямоугольника " + rc.getAreaOfRectangle());
        System.out.println("Периметр прямоугольника " + rc.getPerimeter());
        System.out.println("Диагональ прямоугольника " + rc.getDiagonal());
    }
}
