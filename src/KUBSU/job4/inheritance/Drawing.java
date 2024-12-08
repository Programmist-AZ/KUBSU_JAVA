package KUBSU.job4.inheritance;

import java.util.ArrayList;

public class Drawing {
    private final ArrayList<Shape> shapes;

    // Конструктор
    public Drawing() {
        shapes = new ArrayList<>();
    }

    // Метод для добавления фигуры в массив
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    // Метод для удаления фигуры из массива
    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    // Метод для подсчета общей площади всех фигур
    public double getTotalArea() {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }

    // Метод для вывода всех фигур
    public void printAllShapes() {
        for (Shape shape : shapes) {
            shape.printInfo();
        }
    }
}
