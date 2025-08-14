package Class_lesson;

public final class FinalClass {
    private final int age;
    private final String name;

    // Конструктор без типа возврата
    public FinalClass(int age, String name) {
        // Валидация и инициализация age
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Возраст должен быть положительным, установлено значение по умолчанию: 0");
            this.age = 0;
        }
        
        // Валидация и инициализация name
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Введите корректное имя, установлено значение по умолчанию: 'Неизвестно'");
            this.name = "Неизвестно";
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void displayData() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}
