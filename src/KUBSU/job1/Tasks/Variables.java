package KUBSU.job1.Tasks;

public class Variables {
    public static void main(String[] args) {
        // Проверяем, что переданы два параметра
        if (args.length == 2) {
            try {
                // Преобразуем параметры в числа
                double x = Double.parseDouble(args[0]);
                double y = Double.parseDouble(args[1]);

                // Вычисляем произведение
                double product = x * y;

                if (product > 100) {
                    // Вычисляем удвоенный куб первого числа
                    double result = 2 * Math.pow(x, 3);
                    System.out.println("Произведение больше 100. Удвоенный куб первого числа: " + result);
                } else {
                    System.out.println("Произведение не больше 100. Никаких вычислений не требуется.");
                }
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

