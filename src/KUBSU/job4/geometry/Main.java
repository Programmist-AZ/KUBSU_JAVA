package KUBSU.job4.geometry;

public class Main {
    public static void main(String[] args) {
        // Создаем 2D точку
        Point point2D = new Point(5, 10);
        System.out.println("2D Point: " + point2D);

        // Создаем 3D точку
        Point3D point3D = new Point3D(3, 4, 5);
        System.out.println("3D Point: " + point3D);

        // Вычисляем расстояние от начала координат
        System.out.println("Distance from origin (2D): " + point2D.distanceFromOrigin());
        System.out.println("Distance from origin (3D): " + point3D.distanceFromOrigin());

        // Проверка точки внутри прямоугольника (2D)
        Point topLeft = new Point(0, 0);
        Point bottomRight = new Point(10, 10);
        System.out.println("Point inside rectangle: " + point2D.isInRectangle(topLeft, bottomRight));

        // Проверка точки внутри сферы (3D)
        Point3D sphereCenter = new Point3D(0, 0, 0);
        System.out.println("Point inside sphere: " + point3D.isInSphere(sphereCenter, 10));

        // Проверка точки внутри параллелепипеда (3D)
        Point3D corner1 = new Point3D(0, 0, 0);
        Point3D corner2 = new Point3D(10, 10, 10);
        System.out.println("Point inside box: " + point3D.isInBox(corner1, corner2));
    }
}
