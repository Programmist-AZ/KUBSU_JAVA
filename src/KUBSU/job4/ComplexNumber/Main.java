package KUBSU.job4.ComplexNumber;

public class Main {
    public static void main(String[] args) {
        // Создаем два комплексных числа
        ComplexNumber num1 = new ComplexNumber(3, 2);  // 3 + 2i
        ComplexNumber num2 = new ComplexNumber(1, 4);  // 1 + 4i

        // Умножаем комплексные числа
        ComplexNumber result = num1.multiply(num2);

        // Выводим результат
        System.out.println("Результат умножения: " + result);
    }
}
