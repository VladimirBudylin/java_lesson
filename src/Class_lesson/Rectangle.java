package Class_lesson;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String figureName, double width, double height) {
        super(figureName);
        if (width > 0 && height > 0) {
            this.width = width;
            this.height = height;
        } else {
            System.out.println("Ширина и высота должны быть положительными");
        }
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Ширина должна быть положительной");
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
