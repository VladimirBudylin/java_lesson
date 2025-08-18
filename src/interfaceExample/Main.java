package interfaceExample;

class Main {
    public static void main(String[] args) {
        TriangleCount shape = new TriangleCount("Green", 22, 12);
        System.out.println("Периметр: " + shape.getPerimeter());
        System.out.println("Площадь: " + shape.getArea());
        System.out.println("Цвет: " + shape.getColor());
        InterfaceShape.print1();
        InterfaceColor.print2();
    }
}
