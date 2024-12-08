package KUBSU.job2;

import java.util.Random;

public class MatrixMinimum {

    public static void main(String[] args) {
        // Размеры матрицы
        int rows = 5; // Количество строк
        int cols = 5; // Количество столбцов

        // Создаем и заполняем матрицу случайными значениями
        int[][] matrix = createRandomMatrix(rows, cols, -50, 50); // Значения от -50 до 50
        System.out.println("Матрица:");
        printMatrix(matrix);

        // Находим минимальные значения в каждой строке
        int[] minInRows = findMinInRows(matrix);
        System.out.println("\nМинимальные значения в каждой строке:");
        printArray(minInRows);
    }

    // Метод для создания случайной матрицы
    public static int[][] createRandomMatrix(int rows, int cols, int min, int max) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        return matrix;
    }

    // Метод для нахождения минимального значения в каждой строке
    public static int[] findMinInRows(int[][] matrix) {
        int[] minInRows = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0]; // Предполагаем, что первый элемент минимальный
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            minInRows[i] = min;
        }
        return minInRows;
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

    // Метод для вывода массива
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

