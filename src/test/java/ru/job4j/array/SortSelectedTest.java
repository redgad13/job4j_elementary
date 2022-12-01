package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    void when9Elements() {
        int[] data = new int[]{7, 8, 4, 56, 0, -4, 3, 1, 15};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{-4, 0, 1, 3, 4, 7, 8, 15, 56};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when5Elements() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when3Elements() {
        int[] data = new int[]{9, 11, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{4, 9, 11};
        assertThat(result).containsExactly(expected);
    }
}