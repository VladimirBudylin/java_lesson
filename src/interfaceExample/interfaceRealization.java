package interfaceExample;

public class interfaceRealization implements interfaceShape, InterfaceColor {
    String Color;
    double sideLenght;

    public interfaceRealization(String color, double sideLength) {
        this.Color = color;
        this.sideLenght = sideLength;
    }

    @Override
    public String getColor() {
        return Color;
    }

    @Override
    public double getArea() {
        return sideLenght * sideLenght;
    }

    @Override
    public double getPerimeter() {
        return 4 * sideLenght;
    }
}
