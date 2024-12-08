package KUBSU.job1.Tasks;

public class Logicalbranches {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Неверное количество параметров. Введите одно число.");
            return;
        }

        try {
            // Преобразуем входной параметр в число
            double x = Double.parseDouble(args[0]);

            // Переменные для Y и F
            double Y, F;

            // Вычисляем Y
            if (x <= -3) {
                Y = Math.pow(x, 3) + 1;
            } else if (x > -3 && x <= 0) {
                Y = 1 + 2 * Math.log(1 + Math.abs(x)); // abs(x) для предотвращения ошибки при логарифме
            } else { // x > 0
                Y = 1 / Math.pow(Math.tan(x), 2); // ctg^2(x) = 1/tan^2(x)
            }

            // Вычисляем F
            if (x <= -3) {
                F = Math.pow(Math.E, x + 1); // e^(x+1)
            } else if (x > -3 && x <= 0) {
                F = Math.pow(x, 4);
            } else { // x > 0
                F = Math.cbrt(Math.sqrt(x)); // корень четвертой степени от x = √(x)^(1/2)
            }

            // Выводим результаты
            System.out.println("Y = " + Y);
            System.out.println("F = " + F);

        } catch (NumberFormatException e) {
            System.out.println("Параметр должен быть числом.");
        }
    }
}

