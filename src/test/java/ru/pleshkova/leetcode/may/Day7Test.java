package ru.pleshkova.leetcode.may;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day7Test {

    @Test
    void test(){
        int[] nums = {51,71,17,24,42};
        assertEquals(88, new Day7().maxSum(nums));
    }
}
