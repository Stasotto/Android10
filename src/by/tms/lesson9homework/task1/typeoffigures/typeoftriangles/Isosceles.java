package by.tms.lesson9homework.task1.typeoffigures.typeoftriangles;

import by.tms.lesson9homework.task1.typeoffigures.Triangle;

public class Isosceles extends Triangle {

    public Isosceles(double sideA, double sideC, double height) {
        super(sideA, sideC, height);
    }

    public Isosceles() {
        super();
        setSideA(5);
        setSideB(5);
        setSideC(6);
        setHeight(4);
    }

    @Override
    public void findThePerimeter() {
        setPerimeter(2* getSideA() + getSideC());

    }

    @Override
    public void findTheArea() {
        setArea(0.5 * getSideC() * getHeight());

    }
}
