package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class CheckPrimeNumberTest {
    @Test
    public void when3() {
        int num = 3;
        boolean out = CheckPrimeNumber.check(num);
        assertThat(out).isTrue();
    }

    @Test
    public void when4() {
        int num = 4;
        boolean out = CheckPrimeNumber.check(num);
        assertThat(out).isFalse();
    }

    @Test
    public void when1() {
        int num = 1;
        boolean out = CheckPrimeNumber.check(num);
        assertThat(out).isTrue();
    }

    @Test
    public void when44() {
        int num = 44;
        boolean out = CheckPrimeNumber.check(num);
        assertThat(out).isFalse();
    }
}