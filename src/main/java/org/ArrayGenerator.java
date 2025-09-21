package org;

public class ArrayGenerator {

    private ArrayGenerator() {
        // Приватный конструктор - утилитный класс
    }

    public static int[] generateIntArray(int size, int lowerBound, int upperBound) {
        if (size <= 0) {
            System.out.println("Ошибка: размер массива должен быть больше 0!");
            return null;
        }

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * (upperBound - lowerBound + 1)) + lowerBound;
        }
        return array;
    }

    public static double[] generateDoubleArray(int size, double lowerBound, double upperBound) {
        if (size <= 0) {
            System.out.println("Ошибка: размер массива должен быть больше 0!");
            return null;
        }

        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = Math.random() * (upperBound - lowerBound) + lowerBound;
        }
        return array;
    }
}
