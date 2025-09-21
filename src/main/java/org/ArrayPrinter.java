package org;

public class ArrayPrinter {

    private ArrayPrinter() {
        // Приватный конструктор - утилитный класс
    }

    public static void printArray(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Массив пуст или равен null");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        System.out.println(sb.toString());
    }

    public static void printArray(double[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Массив пуст или равен null");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(String.format("%.2f", array[i]));
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        System.out.println(sb.toString());
    }
}
