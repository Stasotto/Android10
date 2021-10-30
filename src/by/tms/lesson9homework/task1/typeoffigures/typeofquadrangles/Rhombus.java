package by.tms.lesson9homework.task1.typeoffigures.typeofquadrangles;

import by.tms.lesson9homework.task1.typeoffigures.Quadrangle;

public class Rhombus extends Quadrangle {

    private double heightLength;


    public Rhombus(double sideA, double heightLength) {
        super(sideA);
        this.heightLength = heightLength;
    }
    public Rhombus() {
        super();
        setSideA(5);
        this.heightLength = 7;
    }

    @Override
    public void findThePerimeter() {
        setPerimeter(4 * getSideA());

    }

    @Override
    public void findTheArea() {
        setArea(getSideA() * heightLength);

    }
}
