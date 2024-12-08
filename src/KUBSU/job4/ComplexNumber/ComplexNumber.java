package KUBSU.job4.ComplexNumber;

public class ComplexNumber {
    // Поля для действительной и мнимой части
    private double real; // Действительная часть
    private double imaginary; // Мнимая часть

    // Конструктор для инициализации комплексного числа
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Геттеры и сеттеры
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    // Метод для умножения двух комплексных чисел
    public ComplexNumber multiply(ComplexNumber other) {
        // Формула умножения комплексных чисел:
        // (a + bi) * (c + di) = (ac - bd) + (ad + bc)i
        double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);

        return new ComplexNumber(newReal, newImaginary);
    }

    // Переопределение метода toString() для красивого вывода комплексного числа
    @Override
    public String toString() {
        if (imaginary < 0) {
            return real + " - " + Math.abs(imaginary) + "i";
        } else {
            return real + " + " + imaginary + "i";
        }
    }
}
