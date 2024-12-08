package KUBSU.job4.inheritance;

public class Circle extends Shape {
    private double radius;

    // Конструктор
    public Circle(double radius) {
        this.radius = radius;
    }

    // Геттер и Сеттер
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Переопределение метода для вычисления площади
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Переопределение метода для вывода информации
    @Override
    public void printInfo() {
        System.out.println("Circle: Radius = " + radius + ", Area = " + getArea());
    }
}

