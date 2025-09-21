package org;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Ошибка: размер массива должен быть больше 0!");
            scanner.close();
            return;
        }

        System.out.print("Введите нижнюю границу генерации чисел: ");
        double lowerBound = scanner.nextDouble();

        System.out.print("Введите верхнюю границу генерации чисел: ");
        double upperBound = scanner.nextDouble();

        if (lowerBound >= upperBound) {
            System.out.println("Ошибка: нижняя граница должна быть меньше верхней!");
            scanner.close();
            return;
        }

        System.out.print("Выберите тип массива (1 - целые числа, 2 - дробные числа): ");
        int choice = scanner.nextInt();

        // Обработка в зависимости от выбора
        if (choice == 1) {
            processIntArray(size, (int)lowerBound, (int)upperBound);
        } else if (choice == 2) {
            processDoubleArray(size, lowerBound, upperBound);
        } else {
            System.out.println("Неверный выбор типа массива!");
        }

        scanner.close();
    }

    private static void processIntArray(int size, int lowerBound, int upperBound) {
        int[] array = ArrayGenerator.generateIntArray(size, lowerBound, upperBound);
        if (array == null) return;

        ArrayPrinter.printArray(array);
        System.out.println("Максимальное значение: " + ArrayCalculator.findMax(array));
        System.out.println("Минимальное значение: " + ArrayCalculator.findMin(array));
        System.out.println("Среднее значение: " + ArrayCalculator.findAverage(array));

        System.out.println("Отсортированный по возрастанию:");
        ArrayPrinter.printArray(ArraySorter.sortAscending(array));

        System.out.println("Отсортированный по убыванию:");
        ArrayPrinter.printArray(ArraySorter.sortDescending(array));
    }

    private static void processDoubleArray(int size, double lowerBound, double upperBound) {
        double[] array = ArrayGenerator.generateDoubleArray(size, lowerBound, upperBound);
        if (array == null) return;

        ArrayPrinter.printArray(array);
        System.out.println("Максимальное значение: " + ArrayCalculator.findMax(array));
        System.out.println("Минимальное значение: " + ArrayCalculator.findMin(array));
        System.out.println("Среднее значение: " + ArrayCalculator.findAverage(array));

        System.out.println("Отсортированный по возрастанию:");
        ArrayPrinter.printArray(ArraySorter.sortAscending(array));

        System.out.println("Отсортированный по убыванию:");
        ArrayPrinter.printArray(ArraySorter.sortDescending(array));
    }
}