package by.tms.lesson9homework.task1.typeoffigures;

import by.tms.lesson9homework.task1.Figure;

public abstract class Quadrangle  extends Figure {

    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;

    public Quadrangle(double sideA, double sideB, double sideC, double sideD) {
        super();
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    public Quadrangle(double sideA, double sideB) {
        super();
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideA;
        this.sideD = sideB;
    }
    public Quadrangle(double sideA) {
        super();
        this.sideA = sideA;
        this.sideB = sideA;
        this.sideC = sideA;
        this.sideD = sideA;
    }

    public Quadrangle() {
        super();

    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public void setSideD(double sideD) {
        this.sideD = sideD;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double getSideD() {
        return sideD;
    }
}
