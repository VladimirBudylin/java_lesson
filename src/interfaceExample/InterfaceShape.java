package interfaceExample;

public interface InterfaceShape {

    public static final String text = "Текст как из примера, для вывода текста из интерфейса подсчёта";

    double getPerimeter();

    double getArea();

    public static void print1() {
        System.out.println(text);
    }
}
