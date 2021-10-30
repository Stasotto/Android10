package by.tms.lesson9homework.task1;

public abstract class Figure {

    public static int counterOfFigure = 0;
    private int numberOfFigure;
    private double area;
    private double perimeter;

    public Figure() {
        numberOfFigure = ++counterOfFigure;
    }

    public int getNumberOfFigure() {
        return numberOfFigure;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public abstract void findThePerimeter();

    public abstract void findTheArea();

    public void compareTheAreas(Figure figure) {
        if (this.area == figure.getArea()) {
            System.out.println("Площади равны");
            System.out.println(this.area + " " + figure.area);
        } else {
            System.out.println("Площади неравны");
            System.out.println(this.area + " " + figure.area);

        }
    }
}
