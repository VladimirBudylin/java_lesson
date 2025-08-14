package interfaceExample;

public class interfaceRealization implements interfaceShape, interfaceColor {
    String Color;
    double sideLenght;

    public interfaceRealization(String color) {
        this.Color = color;
        this.sideLenght = sideLenght;
    }

    @Override
    public static getColor() {
        return InterfaceColor;
    }

    @Override
    public static getArea() {
        return sideLenght * sideLenght;
    }

    @Override
    public static getPerimeter() {
        return 4 * sideLenght;
    }
}
