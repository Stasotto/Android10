package by.tms.lesson9homework.task1.typeoffigures.typeofquadrangles;

import by.tms.lesson9homework.task1.typeoffigures.Quadrangle;

public class Rectangle extends Quadrangle {

    public Rectangle(double sideA, double sideB) {
        super(sideA, sideB);
    }

    public Rectangle() {
        super();
        setSideA(5);
        setSideB(7);
        setSideC(5);
        setSideD(7);

    }

    @Override
    public void findThePerimeter() {
        setPerimeter(2 * (getSideA() + getSideB() ));

    }

    @Override
    public void findTheArea() {
        setArea(getSideA() * getSideB());

    }
}
