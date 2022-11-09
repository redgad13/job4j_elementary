package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class PrimeNumberTest {
    @Test
    void when5() {
        int num = 5;
        int out = PrimeNumber.count(num);
        int expected = 3;
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void when11() {
        int num = 11;
        int out = PrimeNumber.count(num);
        int expected = 5;
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void when2() {
        int num = 2;
        int out = PrimeNumber.count(num);
        int expected = 1;
        assertThat(out).isEqualTo(expected);
    }
}