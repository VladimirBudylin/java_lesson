package Class_lesson;

public class Circle extends Shape {
    private double radius;
    public static final double PI = 3.141592653589793;

    public Circle(String figureName, double radius) {
        super(figureName);
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Радиус должен быть положительным");
            this.radius = 1.0;
        }
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Радиус должен быть положительным");
        }
    }
}
