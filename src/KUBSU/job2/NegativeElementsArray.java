package KUBSU.job2;

import java.util.Random;

public class NegativeElementsArray {

    public static void main(String[] args) {
        // Создаем исходный массив x
        int[] x = createRandomArray(20, -50, 50); // Массив длиной 20, значения от -50 до 50
        System.out.println("Исходный массив x:");
        printArray(x);

        // Переписываем отрицательные элементы из x в y с умножением на 2
        int[] y = getNegativeElementsMultipliedByTwo(x);
        System.out.println("\nМассив y (отрицательные элементы массива x умноженные на 2):");
        printArray(y);

        // Сортируем массив y методом выбора
        selectionSort(y);
        System.out.println("\nМассив y после сортировки по возрастанию:");
        printArray(y);
    }

    // Метод для создания случайного массива
    public static int[] createRandomArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    // Метод для получения отрицательных элементов, умноженных на 2
    public static int[] getNegativeElementsMultipliedByTwo(int[] array) {
        int count = 0;
        for (int value : array) {
            if (value < 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int value : array) {
            if (value < 0) {
                result[index++] = value * 2;
            }
        }
        return result;
    }

    // Метод сортировки выбором
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Меняем местами текущий элемент и минимальный элемент
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Метод для вывода массива
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
