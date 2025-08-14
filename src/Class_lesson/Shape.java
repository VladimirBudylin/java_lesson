package Class_lesson;

public abstract class Shape {
    protected String figureName;

    protected Shape(String figureName) {
        this.figureName = figureName;
    }

    public abstract double getArea();

    public void printArea() {
        System.out.println("Площадь " + figureName + ": " + getArea());
    }

    public String getFigureName() {
        return figureName;
    }
}
