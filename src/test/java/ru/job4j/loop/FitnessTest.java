package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FitnessTest {
    @Test
    void whenIvan90Nik100Then3() {
        int ivan = 90;
        int nik = 100;
        int out = Fitness.calc(ivan, nik);
        int expected = 1;
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenIvan30Nik95Then3() {
        int ivan = 30;
        int nik = 95;
        int out = Fitness.calc(ivan, nik);
        int expected = 3;
        assertThat(out).isEqualTo(expected);
    }
}