package ru.job4j.condition;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenA3B5Then5() {
        int a = 3;
        int b = 5;
        int expected = 5;
        int out = Max.max(a, b);
        assertThat(out).isEqualTo(expected);
    }
    @Test
    public void whenA3B3Then3() {
        int a = 3;
        int b = 3;
        int expected = 3;
        int out = Max.max(a, b);
        assertThat(out).isEqualTo(expected);
    }
    @Test
    public void whenA6B5Then6() {
        int a = 6;
        int b = 5;
        int expected = 6;
        int out = Max.max(a, b);
        assertThat(out).isEqualTo(expected);
    }
}