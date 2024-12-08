package KUBSU.job4.Stereometry;

public class Point3D extends Point {
    private int z;

    // Конструктор для создания точки с координатами (x, y, z)
    public Point3D(int x, int y, int z) {
        super(x, y); // Вызов конструктора родительского класса
        this.z = z;
    }

    // Метод для получения координаты Z
    public int getZ() {
        return z;
    }

    // Метод для нахождения угла между двумя точками в 3D пространстве
    public static double angleBetween(Point3D p1, Point3D p2) {
        // Нахождение угла между точками по формулам для трехмерного пространства
        double angle1 = Math.atan2(p1.getY(), p1.getX()); // Угол первой точки в 2D (проекция на XY)
        double angle2 = Math.atan2(p2.getY(), p2.getX()); // Угол второй точки в 2D (проекция на XY)

        // Угол между точками в 3D
        double angleXY = Math.toDegrees(angle2 - angle1); // Разница углов по оси XY
        if (angleXY < 0) {
            angleXY += 360; // Если угол отрицательный, прибавляем 360 градусов
        }

        // Угол по оси Z, используем разницу координат Z
        double angleZ = Math.toDegrees(Math.atan2(p2.getZ(), p2.getX()));

        return angleXY; // Возвращаем угол в градусах по оси XY
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}
