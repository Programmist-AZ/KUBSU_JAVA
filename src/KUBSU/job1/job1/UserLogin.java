package KUBSU.job1.job1;

public class UserLogin {
    public static void main(String[] args) {
        // Предопределенные значения логина и пароля
        final String predefinedUsername = "admin";
        final String predefinedPassword = "password123";

        // Проверяем, что переданы два параметра
        if (args.length == 2) {
            // Получаем введенные логин и пароль
            String enteredUsername = args[0];
            String enteredPassword = args[1];

            // Проверяем соответствие
            if (predefinedUsername.equals(enteredUsername) && predefinedPassword.equals(enteredPassword)) {
                System.out.println("Вас узнали. Добро пожаловать");
            } else {
                System.out.println("Логин и пароль не распознаны. Доступ запрещен");
            }
        } else {
            System.out.println("Неверное количество параметров. Необходимо ввести логин и пароль.");
        }
    }
}
