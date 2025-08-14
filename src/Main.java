import Class_lesson.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Расчёт площади геометрических фигур");
        
        // Создаем объекты различных геометрических фигур
        Circle circle = new Circle("Круг", 5.0);
        Rectangle rectangle = new Rectangle("Прямоугольник", 4.0, 6.0);
        Triangle triangle = new Triangle("Треугольник", 3.0, 4.0);
        
        // Выводим площади фигур
        circle.printArea();
        rectangle.printArea();
        triangle.printArea();
        
        System.out.println("\n=== Дополнительная информация ===");
        System.out.println("Круг с радиусом " + circle.getRadius() + " имеет площадь " + circle.getArea());
        System.out.println("Прямоугольник " + rectangle.getWidth() + "x" + rectangle.getHeight() + " имеет площадь " + rectangle.getArea());
        System.out.println("Треугольник с основанием " + triangle.getBase() + " и высотой " + triangle.getHeight() + " имеет площадь " + triangle.getArea());
        
        System.out.println("\n=== Демонстрация изменения параметров ===");
        circle.setRadius(7.0);
        rectangle.setWidth(8.0);
        triangle.setHeight(6.0);
        
        System.out.println("После изменения параметров:");
        circle.printArea();
        rectangle.printArea();
        triangle.printArea();
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("ДЕМОНСТРАЦИЯ FINAL CLASS");
        System.out.println("=".repeat(50));
        
        // Демонстрация FinalClass
        FinalClass person1 = new FinalClass(25, "Анна");
        FinalClass person2 = new FinalClass(-3, null);
        
        System.out.println("\nОбъект 1 (корректные данные):");
        person1.displayData();
        
        System.out.println("\nОбъект 2 (некорректные данные):");
        person2.displayData();
        
        System.out.println("\nДоступ к данным через геттеры:");
        System.out.println("person1.getName(): " + person1.getName());
        System.out.println("person1.getAge(): " + person1.getAge());
    }
}