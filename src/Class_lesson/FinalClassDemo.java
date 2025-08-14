package Class_lesson;

public class FinalClassDemo {
    public static void main(String[] args) {
        System.out.println("=== Демонстрация работы с FinalClass ===\n");
        
        // Тест 1: Корректные данные
        System.out.println("Тест 1: Корректные данные");
        FinalClass person1 = new FinalClass(25, "Иван");
        person1.displayData();
        
        System.out.println("\nТест 2: Отрицательный возраст");
        FinalClass person2 = new FinalClass(-5, "Мария");
        person2.displayData();
        
        System.out.println("\nТест 3: Null имя");
        FinalClass person3 = new FinalClass(30, null);
        person3.displayData();
        
        System.out.println("\nТест 4: Пустая строка");
        FinalClass person4 = new FinalClass(35, "");
        person4.displayData();
        
        System.out.println("\nТест 5: Пробелы в имени");
        FinalClass person5 = new FinalClass(40, "   ");
        person5.displayData();
        
        System.out.println("\n=== Демонстрация неизменяемости ===");
        System.out.println("Все поля final - их нельзя изменить после создания объекта");
        System.out.println("person1.getName(): " + person1.getName());
        System.out.println("person1.getAge(): " + person1.getAge());
        
        // Попытка изменить поля приведет к ошибке компиляции
        // person1.name = "Новое имя"; // Ошибка компиляции
        // person1.age = 30; // Ошибка компиляции
    }
}

