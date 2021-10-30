package by.tms.lesson9homework.task1.typeoffigures;

import by.tms.lesson9homework.task1.Figure;

public class Circle extends Figure implements PiInterface {

    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    public Circle() {
        super();
        this.radius = 5;
    }
    @Override
    public void findThePerimeter() {
        setPerimeter(2 * radius * PI);

    }

    @Override
    public void findTheArea() {
        setArea(PI * (radius *radius));

    }
}
