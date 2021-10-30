package by.tms.lesson9homework.task1.typeoffigures.typeoftriangles;

import by.tms.lesson9homework.task1.typeoffigures.Triangle;

public class Versatile extends Triangle {

    public Versatile(double sideA, double sideB, double sideC, double height) {
        super(sideA, sideB, sideC, height);
    }

    public Versatile() {
        super();
        setSideA(6);
        setSideB(5);
        setSideC(7);
        setHeight(4.5);
    }

    @Override
    public void findThePerimeter() {
        setPerimeter(getSideA() + getSideB() + getSideC());
    }

    @Override
    public void findTheArea() {
        setArea(0.5 * getSideC() * getHeight());
    }
}
