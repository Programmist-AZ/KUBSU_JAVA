package KUBSU.job2;

import java.util.Random;

public class MatrixDiagonalSum {

    public static void main(String[] args) {
        // Размер квадратной матрицы
        int n = 5; // Матрица размером n x n

        // Создаем и заполняем матрицу случайными значениями
        int[][] matrix = createRandomMatrix(n, -50, 50); // Значения от -50 до 50
        System.out.println("Матрица:");
        printMatrix(matrix);

        // Находим сумму индексов минимального и максимального элементов главной диагонали
        int sumOfIndices = findSumOfIndicesOnMainDiagonal(matrix);
        System.out.println("\nСумма номеров (индексов) минимального и максимального элементов главной диагонали: " + sumOfIndices);
    }

    // Метод для создания случайной квадратной матрицы
    public static int[][] createRandomMatrix(int size, int min, int max) {
        Random random = new Random();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        return matrix;
    }

    // Метод для нахождения суммы индексов минимального и максимального элементов главной диагонали
    public static int findSumOfIndicesOnMainDiagonal(int[][] matrix) {
        int minIndex = 0; // Индекс минимального элемента
        int maxIndex = 0; // Индекс максимального элемента
        int min = matrix[0][0]; // Предполагаем, что первый элемент минимальный
        int max = matrix[0][0]; // Предполагаем, что первый элемент максимальный

        for (int i = 0; i < matrix.length; i++) {
            int value = matrix[i][i]; // Элемент главной диагонали
            if (value < min) {
                min = value;
                minIndex = i;
            }
            if (value > max) {
                max = value;
                maxIndex = i;
            }
        }

        // Сумма индексов минимального и максимального элементов
        return minIndex + maxIndex;
    }

    // Метод для вывода матрицы
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }
    }
}

