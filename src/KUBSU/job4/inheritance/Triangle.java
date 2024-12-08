package KUBSU.job4.inheritance;

public class Triangle extends Shape {
    private double base;
    private double height;

    // Конструктор
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Геттеры и Сеттеры
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Переопределение метода для вычисления площади
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    // Переопределение метода для вывода информации
    @Override
    public void printInfo() {
        System.out.println("Triangle: Base = " + base + ", Height = " + height + ", Area = " + getArea());
    }
}
