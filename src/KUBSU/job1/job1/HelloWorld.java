package KUBSU.job1.job1;

public class HelloWorld {
    public static void main(String[] args) {
        // Проверяем, был ли передан аргумент
        if (args.length > 0) {
            // Если аргумент передан, выводим "Hello " + имя
            System.out.println("Hello " + args[0]);
        } else {
            // Если аргумент не передан, выводим "Hello world"
            System.out.println("Hello world");
        }
    }
}
