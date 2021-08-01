package by.tms.lesson3homework;

public class Ractangle {
    Point leftAngle;
    Point rightAngle;
    private double sizeA;
    private double sizeB;


    public Ractangle(Point l, Point r) {
        leftAngle = l;
        rightAngle = r;
    }

    public Ractangle() {

    }

    public double getAreaOfRectangle() {
        double r = rightAngle.getY();
        rightAngle.setY(leftAngle.getY());
        sizeA = leftAngle.distance(rightAngle);
        rightAngle.setY(r);
        rightAngle.setX(leftAngle.getX());
        sizeB = leftAngle.distance(rightAngle);
        return sizeA * sizeB;
    }

    public double getPerimeter() {
        return (sizeA + sizeB) * 2;

    }

    public double getDiagonal() {
        return Math.sqrt(sizeA * sizeA + sizeB * sizeB);
    }

}
