package org;

public class ArraySorter {

    private ArraySorter() {
        // Приватный конструктор - утилитный класс
    }

    public static int[] sortAscending(int[] array) {
        if (array == null) return null;

        int[] sorted = array.clone();
        // Сортировка пузырьком
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - i - 1; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    swap(sorted, j, j + 1);
                }
            }
        }
        return sorted;
    }

    public static int[] sortDescending(int[] array) {
        if (array == null) return null;

        int[] sorted = array.clone();
        // Сортировка пузырьком
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - i - 1; j++) {
                if (sorted[j] < sorted[j + 1]) {
                    swap(sorted, j, j + 1);
                }
            }
        }
        return sorted;
    }

    public static double[] sortAscending(double[] array) {
        if (array == null) return null;

        double[] sorted = array.clone();
        // Сортировка пузырьком
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - i - 1; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    swap(sorted, j, j + 1);
                }
            }
        }
        return sorted;
    }

    public static double[] sortDescending(double[] array) {
        if (array == null) return null;

        double[] sorted = array.clone();
        // Сортировка пузырьком
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - i - 1; j++) {
                if (sorted[j] < sorted[j + 1]) {
                    swap(sorted, j, j + 1);
                }
            }
        }
        return sorted;
    }

    // Вспомогательные методы для обмена элементов
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void swap(double[] array, int i, int j) {
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
