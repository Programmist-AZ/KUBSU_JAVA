package KUBSU.job1.job1;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        // Проверяем, что передано ровно два параметра
        if (args.length == 2) {
            try {
                // Преобразуем параметры в целые числа
                int num1 = Integer.parseInt(args[0]);
                int num2 = Integer.parseInt(args[1]);

                // Выводим значения и их сумму
                int sum = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + sum);
            } catch (NumberFormatException e) {
                // Сообщаем об ошибке, если переданы не числа
                System.out.println("Оба параметра должны быть целыми числами.");
            }
        } else {
            // Сообщаем, что количество параметров неверное
            System.out.println("Неверное количество параметров. Нужно передать 2 целых числа.");
        }
    }
}
