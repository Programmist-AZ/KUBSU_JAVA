package KUBSU.job3;


public class Main {
    public static void main(String[] args) {
        // Создаем несколько телепередач
        tvprogram show1 = new tvprogram("Иван Иванов", "Утреннее шоу", "Развлекательная программа для всех.", 1);
        tvprogram show2 = new tvprogram("Анна Смирнова", "Новости", "Ежедневные новости.", 1);
        tvprogram show3 = new tvprogram("Петр Петров", "Вечерний эфир", "Интервью с гостями.", 2);
        tvprogram show4 = new tvprogram("Екатерина Орлова", "Кулинария с любовью", "Рецепты на каждый день.", 2);

        // Создаем группу телепередач
        GroupShow group = new GroupShow();

        // Добавляем передачи в группу
        group.addShow(show1);
        group.addShow(show2);
        group.addShow(show3);
        group.addShow(show4);

        // Выводим информацию о группе
        System.out.println("Исходная группа телепередач:");
        System.out.println(group);

        // Удаляем телепередачу по названию
        System.out.println("Удаление передачи с названием 'Новости'...");
        group.removeShowByName("Новости");

        // Сортируем телепередачи по названию
        System.out.println("Сортировка передач по названию...");
        group.sortByName();

        // Выводим обновленную информацию о группе
        System.out.println("\nОбновленная группа телепередач:");
        System.out.println(group);
    }
}
