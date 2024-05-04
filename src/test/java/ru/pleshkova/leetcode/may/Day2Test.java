package ru.pleshkova.leetcode.may;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day2Test {

    @Test
    void testCase1() {
        int[] array = {-1, 2, -3, 3};
        assertEquals(3, new Day2().findMaxK(array));

    }

    @Test
    void testCase2() {
        int[] array = {-1, 10, 6, 7, -7, 1};
        assertEquals(7, new Day2().findMaxK(array));

    }

    @Test
    void testCase3() {
        int[] array = {-10, 8, 6, 7, -2, -3};
        assertEquals(-1, new Day2().findMaxK(array));

    }


}
