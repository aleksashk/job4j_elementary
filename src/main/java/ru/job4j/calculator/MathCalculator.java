package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractionAndDivision(double first, double second) {
        return subtraction(first, second)
                + division(first, second);
    }

    public static double sumAndMultiplyAndSubtractionAndDivision(double first, double second) {
        return sumAndMultiply(first, second)
                + subtractionAndDivision(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета суммы и умножения равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета разности и деления равен: " + subtractionAndDivision(10, 20));
        System.out.println("Результат расчета суммы и умножения и разности и деления равен: " + sumAndMultiplyAndSubtractionAndDivision(10, 20));
    }
}
