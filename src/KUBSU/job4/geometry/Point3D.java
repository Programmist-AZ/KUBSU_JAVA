package KUBSU.job4.geometry;

public class Point3D extends Point {
    private int z;

    // Конструктор по умолчанию (точка (0, 0, 0))
    public Point3D() {
        super();
        this.z = 0;
    }

    // Конструктор с координатами (x, y, z)
    public Point3D(int x, int y, int z) {
        super(x, y); // вызываем конструктор родительского класса
        this.z = z;
    }

    // Установка новых координат (x, y, z)
    public void setLocation(int x, int y, int z) {
        super.setLocation(x, y); // вызываем метод из родительского класса
        this.z = z;
    }

    // Установка новых координат (x, y) с автоматической установкой z в 0
    @Override
    public void setLocation(int x, int y) {
        super.setLocation(x, y); // вызываем метод из родительского класса
        this.z = 0; // z по умолчанию будет 0
    }

    // Получение координаты Z
    public int getZ() {
        return z;
    }

    // Метод для вычисления расстояния от начала координат (0, 0, 0)
    @Override
    public int distanceFromOrigin() {
        return (int) Math.sqrt(getX() * getX() + getY() * getY() + z * z);
    }

    // Проверка, находится ли точка внутри параллелепипеда (3D)
    public boolean isInBox(Point3D corner1, Point3D corner2) {
        return (this.getX() >= corner1.getX() && this.getX() <= corner2.getX() &&
                this.getY() >= corner1.getY() && this.getY() <= corner2.getY() &&
                this.z >= corner1.getZ() && this.z <= corner2.getZ());
    }

    // Проверка, находится ли точка внутри сферы
    public boolean isInSphere(Point3D center, int radius) {
        int dx = this.getX() - center.getX();
        int dy = this.getY() - center.getY();
        int dz = this.z - center.getZ();
        return dx * dx + dy * dy + dz * dz <= radius * radius;
    }

    // Переопределение метода toString для 3D точки
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}
