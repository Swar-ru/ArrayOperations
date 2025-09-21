package org;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            printMenu();
            int choice = getIntInput(scanner, "Выберите действие: ");

            switch (choice) {
                case 1:
                    processArray(scanner, true); // Целые числа
                    break;
                case 2:
                    processArray(scanner, false); // Дробные числа
                    break;
                case 3:
                    System.out.println("Выход из программы...");
                    running = false;
                    break;
                default:
                    System.out.println("Неверный выбор! Попробуйте снова.");
            }

            if (running) {
                System.out.println("\n" + createSeparator(50, "="));
            }
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n=== МЕНЮ ОПЕРАЦИЙ С МАССИВАМИ ===");
        System.out.println("1. Работа с целыми числами");
        System.out.println("2. Работа с дробными числами");
        System.out.println("3. Выход");
    }

    private static String createSeparator(int length, String character) {
        StringBuilder separator = new StringBuilder();
        for (int i = 0; i < length; i++) {
            separator.append(character);
        }
        return separator.toString();
    }

    private static void processArray(Scanner scanner, boolean isInt) {
        // Ввод размера массива
        int size = getPositiveIntInput(scanner, "Введите размер массива: ");
        if (size <= 0) return;

        // Ввод границ генерации
        double lowerBound = getDoubleInput(scanner, "Введите нижнюю границу генерации чисел: ");
        double upperBound = getDoubleInput(scanner, "Введите верхнюю границу генерации чисел: ");

        if (lowerBound >= upperBound) {
            System.out.println("Ошибка: нижняя граница должна быть меньше верхней!");
            return;
        }

        if (isInt) {
            processIntArray(size, (int)lowerBound, (int)upperBound);
        } else {
            processDoubleArray(size, lowerBound, upperBound);
        }
    }

    private static void processIntArray(int size, int lowerBound, int upperBound) {
        int[] array = ArrayGenerator.generateIntArray(size, lowerBound, upperBound);
        if (array == null) return;

        System.out.println("\n=== РЕЗУЛЬТАТЫ ===");
        ArrayPrinter.printArray(array);
        System.out.println("Максимальное значение: " + ArrayCalculator.findMax(array));
        System.out.println("Минимальное значение: " + ArrayCalculator.findMin(array));
        System.out.println("Среднее значение: " + ArrayCalculator.findAverage(array));

        System.out.println("\nОтсортированный по возрастанию:");
        ArrayPrinter.printArray(ArraySorter.sortAscending(array));

        System.out.println("Отсортированный по убыванию:");
        ArrayPrinter.printArray(ArraySorter.sortDescending(array));
    }

    private static void processDoubleArray(int size, double lowerBound, double upperBound) {
        double[] array = ArrayGenerator.generateDoubleArray(size, lowerBound, upperBound);
        if (array == null) return;

        System.out.println("\n=== РЕЗУЛЬТАТЫ ===");
        ArrayPrinter.printArray(array);
        System.out.println("Максимальное значение: " + ArrayCalculator.findMax(array));
        System.out.println("Минимальное значение: " + ArrayCalculator.findMin(array));
        System.out.println("Среднее значение: " + ArrayCalculator.findAverage(array));

        System.out.println("\nОтсортированный по возрастанию:");
        ArrayPrinter.printArray(ArraySorter.sortAscending(array));

        System.out.println("Отсортированный по убыванию:");
        ArrayPrinter.printArray(ArraySorter.sortDescending(array));
    }

    // Вспомогательные методы для безопасного ввода
    private static int getIntInput(Scanner scanner, String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Ошибка: введите целое число!");
                scanner.nextLine(); // Очистка буфера
            }
        }
    }

    private static int getPositiveIntInput(Scanner scanner, String message) {
        while (true) {
            int input = getIntInput(scanner, message);
            if (input > 0) {
                return input;
            }
            System.out.println("Ошибка: размер должен быть больше 0!");
        }
    }

    private static double getDoubleInput(Scanner scanner, String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Ошибка: введите число!");
                scanner.nextLine(); // Очистка буфера
            }
        }
    }
}