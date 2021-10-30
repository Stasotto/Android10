package by.tms.lesson9homework.task1.typeoffigures.typeofquadrangles;

import by.tms.lesson9homework.task1.typeoffigures.Quadrangle;

public class Trapezoid extends Quadrangle {

    private double heightLength;


    public Trapezoid(double sideA, double sideB, double sideC, double sideD, double heightLength) {
        super(sideA, sideB, sideC, sideD);
        this.heightLength = heightLength;
    }

    public Trapezoid() {
        super();
        setSideA(5);
        setSideB(6);
        setSideC(4);
        setSideD(7);
        this.heightLength = 4;
    }

    @Override
    public void findThePerimeter() {
        setPerimeter(getSideA() + getSideB() + getSideC() + getSideD());

    }

    @Override
    public void findTheArea() {
        setArea(((getSideB() + getSideD()) / 2) * this.heightLength);

    }
}
