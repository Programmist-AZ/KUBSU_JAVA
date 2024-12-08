package KUBSU.job4.geometry;

public class Point {
    private int x, y;

    // Конструктор по умолчанию (точка (0, 0))
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Конструктор с координатами (x, y)
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Установка новых координат
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Получение координаты X
    public int getX() {
        return x;
    }

    // Получение координаты Y
    public int getY() {
        return y;
    }

    // Метод для вычисления расстояния от начала координат
    public int distanceFromOrigin() {
        return (int) Math.sqrt(x * x + y * y);
    }

    // Проверка, находится ли точка внутри прямоугольника
    public boolean isInRectangle(Point topLeft, Point bottomRight) {
        return (this.x >= topLeft.getX() && this.x <= bottomRight.getX() &&
                this.y >= topLeft.getY() && this.y <= bottomRight.getY());
    }

    // Проверка, находится ли точка внутри окружности
    public boolean isInCircle(Point center, int radius) {
        int dx = this.x - center.getX();
        int dy = this.y - center.getY();
        return dx * dx + dy * dy <= radius * radius;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

