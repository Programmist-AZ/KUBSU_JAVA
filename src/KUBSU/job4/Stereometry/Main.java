package KUBSU.job4.Stereometry;

public class Main {
    public static void main(String[] args) {
        // Создаем две точки в 2D пространстве
        Point p1 = new Point(3, 4);
        Point p2 = new Point(5, 6);
        System.out.println("Angle between points (2D): " + Point.angleBetween(p1, p2) + " degrees");

        // Создаем две точки в 3D пространстве
        Point3D p3D1 = new Point3D(3, 4, 5);
        Point3D p3D2 = new Point3D(5, 6, 7);
        System.out.println("Angle between points (3D): " + Point3D.angleBetween(p3D1, p3D2) + " degrees");
    }
}
