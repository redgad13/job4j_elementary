package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        int p = 6;
        double k = 2.0;
        double expected = 2.0;
        double out = SqArea.square(6, 2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K3dot3Then4dot46() {
        int p = 10;
        double k = 3.3;
        double expected = 4.46;
        double out = SqArea.square(10, 3.3);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K11Then0dot68() {
        int p = 6;
        double k = 11;
        double expected = 0.68;
        double out = SqArea.square(6, 11);
        Assert.assertEquals(expected, out, 0.01);
    }
}