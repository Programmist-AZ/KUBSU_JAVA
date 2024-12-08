package KUBSU.job2;

import java.util.Random;

public class ReciprocalArray {

    // Константа для сравнения
    private static final int THRESHOLD = 10;

    public static void main(String[] args) {
        // Создаем исходный массив
        int[] array = createRandomArray(20, -99, 99); // Массив длиной 20
        System.out.println("Исходный массив:");
        printArray(array);

        // Создаем массив обратных значений
        double[] reciprocalArray = createReciprocalFraction(array);
        System.out.println("\nМассив обратных значений:");
        printArray(reciprocalArray);

        // Создаем массивы для элементов меньше заданного значения
        int[] indicesBelowThreshold = getIndicesBelowThreshold(array, THRESHOLD);
        int[] valuesBelowThreshold = getValuesBelowThreshold(array, THRESHOLD);

        System.out.println("\nЭлементы меньше " + THRESHOLD + ":");
        printArray(valuesBelowThreshold);

        System.out.println("\nИх индексы:");
        printArray(indicesBelowThreshold);
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

    // Метод для создания массива обратных значений
    public static double[] createReciprocalFraction(int[] array) {
        double[] reciprocalArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            reciprocalArray[i] = (array[i] != 0) ? 1.0 / array[i] : 0; // Избегаем деления на 0
        }
        return reciprocalArray;
    }

    // Метод для получения индексов элементов, меньших заданного значения
    public static int[] getIndicesBelowThreshold(int[] array, int threshold) {
        int[] tempIndices = new int[array.length];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < threshold) {
                tempIndices[count++] = i;
            }
        }

        // Копируем только значимые элементы
        int[] indices = new int[count];
        System.arraycopy(tempIndices, 0, indices, 0, count);
        return indices;
    }

    // Метод для получения значений элементов, меньших заданного значения
    public static int[] getValuesBelowThreshold(int[] array, int threshold) {
        int[] tempValues = new int[array.length];
        int count = 0;

        for (int value : array) {
            if (value < threshold) {
                tempValues[count++] = value;
            }
        }

        // Копируем только значимые элементы
        int[] values = new int[count];
        System.arraycopy(tempValues, 0, values, 0, count);
        return values;
    }

    // Метод для вывода массива целых чисел
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Метод для вывода массива чисел с плавающей точкой
    public static void printArray(double[] array) {
        for (double value : array) {
            System.out.printf("%.4f ", value); // Форматируем до 4 знаков после запятой
        }
        System.out.println();
    }
}
