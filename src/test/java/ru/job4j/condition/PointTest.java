package ru.job4j.condition;

import junit.framework.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    public void when0020Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2.0;
        double result = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void when4265Then3dot6() {
        int x1 = 4;
        int y1 = 2;
        int x2 = 6;
        int y2 = 5;
        double expected = 3.6;
        double result = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void when14x2y36y15Then25dot55() {
        int x1 = 14;
        int y1 = 2;
        int x2 = 36;
        int y2 = 15;
        double expected = 25.55;
        double result = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, result, 0.01);
    }
}