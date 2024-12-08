package KUBSU.job3;

import java.util.ArrayList;
import java.util.Comparator;

public class GroupShow {
    // Поля
    private static int uniqueCounter = 1; // Для генерации уникального номера
    private final int groupId;                  // Уникальный номер группы
    private ArrayList<tvprogram> shows;   // Массив объектов телепередач

    // Конструктор по умолчанию
    public GroupShow() {
        this.groupId = uniqueCounter++;
        this.shows = new ArrayList<>();
    }

    // Конструктор с входным массивом
    public GroupShow(ArrayList<tvprogram> shows) {
        this.groupId = uniqueCounter++;
        this.shows = new ArrayList<>(shows);
    }

    // Геттеры и сеттеры
    public int getGroupId() {
        return groupId;
    }

    public ArrayList<tvprogram> getShows() {
        return shows;
    }

    public void setShows(ArrayList<tvprogram> shows) {
        this.shows = new ArrayList<>(shows);
    }

    public tvprogram getShow(int index) {
        if (index >= 0 && index < shows.size()) {
            return shows.get(index);
        } else {
            throw new IndexOutOfBoundsException("Индекс вне диапазона.");
        }
    }

    public void setShow(int index, tvprogram show) {
        if (index >= 0 && index < shows.size()) {
            shows.set(index, show);
        } else {
            throw new IndexOutOfBoundsException("Индекс вне диапазона.");
        }
    }

    // Добавление телепередачи
    public void addShow(tvprogram show) {
        shows.add(show);
    }

    // Удаление телепередачи по атрибуту (например, по названию)
    public void removeShowByName(String name) {
        shows.removeIf(show -> show.getName().equalsIgnoreCase(name));
    }

    // Сортировка по имени (можно выбрать другой критерий)
    public void sortByName() {
        shows.sort(Comparator.comparing(tvprogram::getName));
    }

    // Переопределение toString() для отображения информации о группе
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Group ID: ").append(groupId).append("\n");
        sb.append("Телепередачи:\n");
        for (tvprogram show : shows) {
            sb.append(show).append("\n");
        }
        return sb.toString();
    }

    // Главный метод для тестирования
    public static void main(String[] args) {
        // Создаем несколько телепередач
        tvprogram show1 = new tvprogram("Иван Иванов", "Утреннее шоу", "Развлекательная программа для всех.", 1);
        tvprogram show2 = new tvprogram("Анна Смирнова", "Новости", "Ежедневные новости.", 1);
        tvprogram show3 = new tvprogram("Петр Петров", "Вечерний эфир", "Интервью с гостями.", 2);

        // Создаем группу с телепередачами
        GroupShow group = new GroupShow();
        group.addShow(show1);
        group.addShow(show2);
        group.addShow(show3);

        // Выводим информацию о группе
        System.out.println("Исходная группа:");
        System.out.println(group);

        // Удаляем передачу по названию
        group.removeShowByName("Новости");

        // Сортируем по имени
        group.sortByName();

        // Выводим обновленную информацию
        System.out.println("\nОбновленная группа:");
        System.out.println(group);
    }
}

