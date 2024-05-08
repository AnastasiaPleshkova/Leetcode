package ru.pleshkova.leetcode.may;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Day8Test {

    @Test
    void test1() {
        int[] input = {10, 3, 8, 9, 4};
        String[] output = {"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"};
        assertArrayEquals(output, new Day8().findRelativeRanks(input));
    }
}
