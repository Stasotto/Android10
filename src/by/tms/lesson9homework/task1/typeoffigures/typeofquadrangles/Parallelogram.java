package by.tms.lesson9homework.task1.typeoffigures.typeofquadrangles;

import by.tms.lesson9homework.task1.typeoffigures.Quadrangle;

public class Parallelogram extends Quadrangle {

    private double heightLength;

    public Parallelogram(double sideA, double sideB, double heightLength) {
        super(sideA, sideB);
        this.heightLength = heightLength;
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "heightLength= " + heightLength +
                ", sideA= " + getSideA() +
                ", sideB= " + getSideB() +
                ", sideC= " + getSideC() +
                ", sideD= " + getSideD() +
                '}';
    }

    public Parallelogram() {
        super();
        setSideA(5);
        setSideB(7);
        setSideC(5);
        setSideD(7);
        this.heightLength = 4;
    }

    @Override
    public void findThePerimeter() {
        setPerimeter(2 * (getSideA() + getSideB()));
    }

    @Override
    public void findTheArea() {
        setArea(getSideD() * heightLength);
    }
}
