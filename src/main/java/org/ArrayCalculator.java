package org;

public class ArrayCalculator {

    private ArrayCalculator() {
        // Приватный конструктор - утилитный класс
    }

    // Методы для целых чисел
    public static int findMax(int[] array) {
        validateArray(array);
        int max = array[0];
        for (int num : array) {
            if (num > max) max = num;
        }
        return max;
    }

    public static int findMin(int[] array) {
        validateArray(array);
        int min = array[0];
        for (int num : array) {
            if (num < min) min = num;
        }
        return min;
    }

    public static double findAverage(int[] array) {
        validateArray(array);
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    // Методы для дробных чисел (перегрузки)
    public static double findMax(double[] array) {
        validateArray(array);
        double max = array[0];
        for (double num : array) {
            if (num > max) max = num;
        }
        return max;
    }

    public static double findMin(double[] array) {
        validateArray(array);
        double min = array[0];
        for (double num : array) {
            if (num < min) min = num;
        }
        return min;
    }

    public static double findAverage(double[] array) {
        validateArray(array);
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Валидация массива
    private static void validateArray(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не может быть null или пустым");
        }
    }

    private static void validateArray(double[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не может быть null или пустым");
        }
    }
}
