package KUBSU.job4.inheritance;

public class Main {
    public static void main(String[] args) {
        // Создаем фигуры
        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);
        Triangle triangle = new Triangle(3.0, 6.0);

        // Создаем объект Drawing и добавляем фигуры
        Drawing drawing = new Drawing();
        drawing.addShape(circle);
        drawing.addShape(square);
        drawing.addShape(triangle);

        // Выводим информацию о всех фигурах
        System.out.println("Figures in Drawing:");
        drawing.printAllShapes();

        // Выводим общую площадь всех фигур
        System.out.println("\nTotal Area: " + drawing.getTotalArea());
    }
}
