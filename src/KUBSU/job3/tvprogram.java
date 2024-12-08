package KUBSU.job3;

public class tvprogram {
    // Свойства
    private String author;        // Ведущий
    private String name;          // Название
    private String description;   // Описание
    private int periodType;       // Периодичность (1 - ежедневно, 2 - еженедельно, 3 - ежемесячно)

    // Конструктор
    public tvprogram(String author, String name, String description, int periodType) {
        this.author = author;
        this.name = name;
        this.description = description;
        setPeriodType(periodType); // Устанавливаем через сеттер для проверки значений
    }

    // Геттеры и сеттеры
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPeriodType() {
        return periodType;
    }

    public void setPeriodType(int periodType) {
        if (periodType < 1 || periodType > 3) {
            throw new IllegalArgumentException("Периодичность должна быть 1 (ежедневно), 2 (еженедельно) или 3 (ежемесячно).");
        }
        this.periodType = periodType;
    }

    // Метод для получения текстового представления периодичности
    private String getPeriodTypeDescription() {
        return switch (periodType) {
            case 1 -> "ежедневно";
            case 2 -> "еженедельно";
            case 3 -> "ежемесячно";
            default -> "неизвестно";
        };
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return String.format(
                """
                        Телепрограмма:
                        Ведущий: %s
                        Название: %s
                        Описание: %s
                        Периодичность: %s""",
                author, name, description, getPeriodTypeDescription()
        );
    }
}
