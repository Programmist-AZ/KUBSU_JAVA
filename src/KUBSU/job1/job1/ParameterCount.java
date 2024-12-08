package KUBSU.job1.job1;

public class ParameterCount {
    public static void main(String[] args) {
        // Проверяем, есть ли параметры
        if (args.length > 0) {
            // Выводим количество переданных параметров
            System.out.println("Вы ввели " + args.length + " параметров.");
        } else {
            // Сообщаем, что параметры не переданы
            System.out.println("Вы не передавали параметров.");
        }
    }
}
