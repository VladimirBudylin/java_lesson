package interfaceExample;

public interface InterfaceColor {
    public final String text = "Текст как из примера, для вывода текста из интерфейса цвета";

    String getColor();

    public static void print2() {
        System.out.println(text);
    }
}
