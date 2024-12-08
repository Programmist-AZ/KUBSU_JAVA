package KUBSU.job4.Stereometry;

public class Point {
    private final int x;
    private final int y;

    // Конструктор для создания точки с координатами (x, y)
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Метод для получения координаты X
    public int getX() {
        return x;
    }

    // Метод для получения координаты Y
    public int getY() {
        return y;
    }

    // Метод для нахождения угла между двумя точками относительно начала координат
    public static double angleBetween(Point p1, Point p2) {
        // Используем арктангенс для нахождения угла между двумя точками
        double angle1 = Math.atan2(p1.getY(), p1.getX()); // Угол первой точки
        double angle2 = Math.atan2(p2.getY(), p2.getX()); // Угол второй точки

        // Разница углов между точками
        double angle = Math.toDegrees(angle2 - angle1); // Переводим в градусы
        if (angle < 0) {
            angle += 360; // Если угол отрицательный, прибавляем 360 градусов
        }
        return angle;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

