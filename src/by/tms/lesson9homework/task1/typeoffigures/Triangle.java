package by.tms.lesson9homework.task1.typeoffigures;

import by.tms.lesson9homework.task1.Figure;

public abstract class Triangle extends Figure {

    private double sideA;
    private double sideB;
    private double sideC;
    private double height;

    public Triangle(double sideA, double sideB, double sideC, double height) {
        super();
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    public Triangle(double sideA, double sideC, double height) {
        super();
        this.sideA = sideA;
        this.sideB = sideA;
        this.sideC = sideC;
        this.height = height;
    }

    public Triangle(double sideA, double height) {
        super();
        this.sideA = sideA;
        this.sideC = sideA;
        this.sideB = sideA;
        this.height = height;
    }

    public Triangle() {
        super();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
}
