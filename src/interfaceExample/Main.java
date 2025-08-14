package interfaceExample;

public class Main {
    public static void main(String[] args) {
        interfaceRealization shape = new interfaceRealization("Orange", 21);
        System.out.println("Периметр: " + shape.getPerimeter());
        System.out.println("Площадь: " + shape.getArea());
        System.out.println("Цвет: " + shape.getColor());
        interfaceShape.print1();
        InterfaceColor.print2();
    }
}
