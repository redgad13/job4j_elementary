package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int end = 10;
        int expected = 30;
        int out = Counter.sumByEven(1, 10);
        assertThat(out).isEqualTo(expected);

    }
}