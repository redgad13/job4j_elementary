package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FitTest {

    @Test
    public void whenMan180Then92() {
        short height = 180;
        double expected = 92.0;
        double out = Fit.manWeight(height);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman180Then80dot5() {
        short height = 180;
        double expected = 80.5;
        double out = Fit.womanWeight(height);
        Assert.assertEquals(expected, out, 0.01);
    }
}