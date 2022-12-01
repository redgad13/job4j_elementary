package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean isExit = number > 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isExit = false;
                break;
            }
        }
        return isExit;
    }
}
