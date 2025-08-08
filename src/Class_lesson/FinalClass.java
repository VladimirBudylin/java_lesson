package Class_lesson;

public final class FinalClass {
    private final int age;
    private final String name;


    public void FinalClass(int age, String name) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Возраст должен быть положительным");
        }
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("Введите корректное имя");
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void displayData() {
        System.out.println("Имя: "+name);
        System.out.println("Возраст: "+age);
        return;
    }
}
