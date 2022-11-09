package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {
    @Test
    void whenArrayHas5Then3() {
        int[] data = new int[]{0, 3, 4, 5, 8};
        int element = 5;
        int expected = 3;
        int out = FindLoop.indexOf(data, element);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot5ThenMinus1() {
        int[] data = new int[]{0, 3, 4, 9, 8};
        int element = 5;
        int expected = -1;
        int out = FindLoop.indexOf(data, element);
        assertThat(out).isEqualTo(expected);
    }
}