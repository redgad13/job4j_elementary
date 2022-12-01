package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumOfMinusAndDivision(double a, double b) {
        return minus(a, b) + division(a, b);
    }

    public static double superSum(double a, double b) {
        return minus(a, b) + division(a, b) + sum(a, b) + multiply(a, b);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Первый метод выдаст: " + sumOfMinusAndDivision(10, 20));
        System.out.println("Второй метод выдаст: " + superSum(30, 40));
    }
}
