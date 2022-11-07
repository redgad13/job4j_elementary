package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 10.0;
        double bc = 8.0;
        double ac = 17.0;
        boolean result = Triangle.exist(ab, bc, ac);
        assertThat(result).isTrue();
    }
    @Test
    public void whenNotExist() {
        double ab = 10.0;
        double bc = 8.0;
        double ac = 19.0;
        boolean result = Triangle.exist(ab, bc, ac);
        assertThat(result).isFalse();
    }
}