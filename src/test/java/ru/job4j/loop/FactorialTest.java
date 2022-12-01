package ru.job4j.loop;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactorialTest {

    @Test
    public void when5Then120() {
        int a = 5;
        int expected = 120;
        int out = Factorial.calc(a);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void when1Then1() {
        int a = 1;
        int expected = 1;
        int out = Factorial.calc(a);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void when0Then1() {
        int a = 0;
        int expected = 1;
        int out = Factorial.calc(a);
        assertThat(out).isEqualTo(expected);
    }
}