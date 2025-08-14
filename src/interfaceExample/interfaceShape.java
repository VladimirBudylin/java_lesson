package interfaceExample;

public interface interfaceShape {

    public static final String text = "Я интерфейс подсчёта";

    double getPerimeter();

    double getArea();

    public static void print1() {
        System.out.println(text);
    }
}
