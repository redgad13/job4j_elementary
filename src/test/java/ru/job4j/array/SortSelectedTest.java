package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    void when8Elements() {
        int[] source = new int[] {7, 8, 4, 56, 0, -4, 3, 1};
        int[] result = SortSelected.sort(source);
        int[] expected = new int[] {-4, 0, 1, 3, 4, 7, 8, 56};
        assertThat(result).containsExactly(expected);
    }
}