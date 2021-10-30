package by.tms.lesson9homework.task1.typeoffigures.typeoftriangles;

import by.tms.lesson9homework.task1.typeoffigures.Triangle;

public class Equilateral extends Triangle {

    public Equilateral(double sideA, double height) {
        super(sideA, height);
    }

    public Equilateral() {
        super();
        setSideA(5);
        setSideB(5);
        setSideC(5);
        setHeight(4);
    }

    @Override
    public void findThePerimeter() {
        setPerimeter(3 * getSideA());
    }

    @Override
    public void findTheArea() {
        setArea(0.5 * getSideA() * getHeight());
    }
}