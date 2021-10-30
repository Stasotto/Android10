package by.tms.lesson9homework.task1.typeoffigures.typeofquadrangles;

import by.tms.lesson9homework.task1.typeoffigures.Quadrangle;

public class Square extends Quadrangle {

    public Square(double sideB) {
        super(sideB);
    }

    public Square() {
        super();
        setSideA(5);
    }

    @Override
    public void findThePerimeter() {
        setPerimeter(4 * getSideA());
    }

    @Override
    public void findTheArea() {
        setArea(getSideA() * getSideA());
    }
}
