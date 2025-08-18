package interfaceExample;

public class TriangleCount implements InterfaceShape, InterfaceColor {
    String color;
    double sideLenght;
    double triangleHigh;

    public TriangleCount(String color, double sideLength, double triangleHigh) {
        this.color = color;
        this.sideLenght = sideLength;
        this.triangleHigh = triangleHigh;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return 0.5 * triangleHigh * sideLenght;
    }

    @Override
    public double getPerimeter() {
        return sideLenght + sideLenght + sideLenght;
    }
}
