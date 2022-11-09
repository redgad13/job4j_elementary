package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean isExit = true;
        for (int i = 2; i < number; i++) {
            isExit = number % i != 0;
            if (!isExit) {
                break;
            }
        }
        return isExit;
    }
}
