package KUBSU.job1.Tasks;

public class Complexmathematicalfunctions {
    public static void main(String[] args) {
        // Проверяем, что передано два параметра
        if (args.length == 2) {
            try {
                // Преобразуем параметры в числа
                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[1]);

                // Находим минимальное значение
                double min = Math.min(a, b);

                // Вычисляем d = (min(a, b))^8
                double d = Math.pow(min, 8);

                // Выводим результат
                System.out.println("Минимальное значение: " + min);
                System.out.println("Результат d = (min(a, b))^8: " + d);
            } catch (NumberFormatException e) {
                // Если переданы некорректные значения
                System.out.println("Оба параметра должны быть числами.");
            }
        } else {
            // Если параметров недостаточно или их больше двух
            System.out.println("Неверное количество параметров. Необходимо ввести два числа.");
        }
    }
}
