package Class_lesson;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String figureName, double base, double height) {
        super(figureName);
        if (base > 0 && height > 0) {
            this.base = base;
            this.height = height;
        } else {
            System.out.println("Основание и высота должны быть положительными");
        }
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        } else {
            System.out.println("Основание должно быть положительным");
        }
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Высота должна быть положительной");
        }
    }
}
