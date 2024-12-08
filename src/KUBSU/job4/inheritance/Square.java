package KUBSU.job4.inheritance;

public class Square extends Shape {
    private double side;

    // Конструктор
    public Square(double side) {
        this.side = side;
    }

    // Геттер и Сеттер
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    // Переопределение метода для вычисления площади
    @Override
    public double getArea() {
        return side * side;
    }

    // Переопределение метода для вывода информации
    @Override
    public void printInfo() {
        System.out.println("Square: Side = " + side + ", Area = " + getArea());
    }
}

