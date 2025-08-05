package Class_lesson;

public class Shape {
    public String figureName;
    public static final double PI = 3.141592653589793;
    private double radius;
    private double osnovanie;
    private double visota;
    private double sideA;
    private double sideB;


    public Shape(double radius) {
        this.radius = radius;
        figureName = "Circle";
    }

    public Shape(double osnovanie, double visota) {
        this.osnovanie = osnovanie;
        this.visota = visota;
        this.figureName = "Triangle";
    }

    public Shape(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.figureName = "Square";
    }

    public double circleArea() {
        return PI * radius * radius;
    }

    public double triangleArea() {
        return osnovanie * visota * 0.5;
    }

    public double squareArea() {
        return sideA * sideB;
    }


    public static void printArea() {
        switch (figureName) {
            case "Circle":
                System.out.println("Площадь круга: "+ circleArea);
                break;
            case "Triangle":
                System.out.println("Площадь треугольника: "+ triangleArea);
                break;
            case "Square":
                System.out.println("Площадь квадрата: "+ squareArea);
                break;
            default:
                System.out.println("Формулы для подсчёта пока нет, фигу неизвестна");

        };
    }
}