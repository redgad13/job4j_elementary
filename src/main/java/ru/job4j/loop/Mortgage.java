package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year;
        for (year = 0; amount > 0; year++) {
            amount += amount * percent;
            amount -= salary;
        }
        return year;
    }
}
