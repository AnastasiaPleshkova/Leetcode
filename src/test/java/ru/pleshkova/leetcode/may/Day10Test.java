package ru.pleshkova.leetcode.may;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day10Test {
    @ParameterizedTest
    @CsvSource({"7,4", "5,2", "2,1"})
    void case0(int target, int answer) {
        int[] input = {1, 3, 5, 6};
        assertEquals(answer, new Day10().searchInsert(input, target));
    }

    @Test
    void case4() {
        int[] input = {1};
        int target = 1;
        int answer = 0;
        assertEquals(answer, new Day10().searchInsert(input, target));
    }
}
