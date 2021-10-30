package by.tms.lesson9homework.task1.typeoffigures;

import by.tms.lesson9homework.task1.Figure;

public class Ellipse extends Figure implements PiInterface {

    private int semiaxisLengthA;
    private int semiaxisLengthB;

    public Ellipse(int semiaxisLengthA, int semiaxisLengthB) {
        super();
        this.semiaxisLengthA = semiaxisLengthA;
        this.semiaxisLengthB = semiaxisLengthB;
    }

    public Ellipse() {
        super();
        this.semiaxisLengthA = 5;
        this.semiaxisLengthB = 8;
    }

    @Override
    public void findThePerimeter() {
        setPerimeter(2 * PI * Math.sqrt(((semiaxisLengthA * semiaxisLengthA) + (semiaxisLengthB * semiaxisLengthB)) / 2.0));
    }

    @Override
    public void findTheArea() {
        setArea(PI * semiaxisLengthA * semiaxisLengthB);
    }

    public int getSemiaxisLengthA() {
        return semiaxisLengthA;
    }

    public int getSemiaxisLengthB() {
        return semiaxisLengthB;
    }
}