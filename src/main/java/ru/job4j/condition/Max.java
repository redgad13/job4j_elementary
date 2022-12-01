package ru.job4j.condition;

public class Max {
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(Max.max(3, 5));
        System.out.println(Max.max(3, 3));
        System.out.println(Max.max(6, 5));
    }
}
