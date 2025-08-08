package Class_lesson;

public abstract class Shape {
    public String figureName;

    protected Shape(String figureName) {
        this.figureName = figureName;
    }

    public abstract double getArea();

    public void printArea() {
        System.out.println("Площадь " + figureName + ": " + getArea());
    }
}

class Circle {
    private double radius;
    public static final double PI =3.141592653589793;

    public double getArea() {
        return PI * radius*radius;
    }
    public double getRadius() {
        return radius;
    }
}

class Retrangle
