package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int minimum = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, minimum, 0, data.length - 1);
            SwitchArray.swap(data, i, index);
        }
        return data;
    }
}