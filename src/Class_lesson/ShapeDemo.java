package Class_lesson;

public class ShapeDemo {
    public static void main(String[] args) {
        System.out.println("=== Демонстрация полиморфизма ===\n");
        
        // Создаем массив фигур (полиморфизм)
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Круг 1", 3.0);
        shapes[1] = new Rectangle("Прямоугольник 1", 5.0, 3.0);
        shapes[2] = new Triangle("Треугольник 1", 4.0, 5.0);
        shapes[3] = new Circle("Круг 2", 2.5);
        
        // Выводим информацию о всех фигурах
        for (Shape shape : shapes) {
            shape.printArea();
        }
        
        System.out.println("\n=== Общая площадь всех фигур ===");
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        System.out.println("Общая площадь: " + totalArea);
        
        System.out.println("\n=== Поиск фигуры с максимальной площадью ===");
        Shape maxShape = shapes[0];
        for (Shape shape : shapes) {
            if (shape.getArea() > maxShape.getArea()) {
                maxShape = shape;
            }
        }
        System.out.println("Фигура с максимальной площадью: " + maxShape.getFigureName() + " (" + maxShape.getArea() + ")");
    }
}
