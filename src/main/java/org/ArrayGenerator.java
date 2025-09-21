package org;

import java.util.Random;

public class ArrayGenerator {

    private static final Random random = new Random();

    private ArrayGenerator() {
        // Приватный конструктор - утилитный класс
    }

    public static int[] generateIntArray(int size, int lowerBound, int upperBound) {
        if (size <= 0) {
            System.out.println("Ошибка: размер массива должен быть больше 0!");
            return null;
        }

        if (lowerBound >= upperBound) {
            System.out.println("Ошибка: нижняя граница должна быть меньше верхней!");
            return null;
        }

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        }
        return array;
    }

    public static double[] generateDoubleArray(int size, double lowerBound, double upperBound) {
        if (size <= 0) {
            System.out.println("Ошибка: размер массива должен быть больше 0!");
            return null;
        }

        if (lowerBound >= upperBound) {
            System.out.println("Ошибка: нижняя граница должна быть меньше верхней!");
            return null;
        }

        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = lowerBound + (upperBound - lowerBound) * random.nextDouble();
        }
        return array;
    }

    // Дополнительные методы генерации
    public static int[] generateIntArrayWithStep(int size, int start, int step) {
        if (size <= 0) return null;

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = start + i * step;
        }
        return array;
    }
}
