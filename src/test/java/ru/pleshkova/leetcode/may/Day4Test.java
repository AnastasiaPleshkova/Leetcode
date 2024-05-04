package ru.pleshkova.leetcode.may;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day4Test {


    @Test
    void testCase1() {
        int[] people = {1,2};
        int limit = 3;
        assertEquals(1, new Day4().numRescueBoats(people, limit));

    }

    @Test
    void testCase2() {
        int[] people = {3,2,2,1};
        int limit = 3;
        assertEquals(3, new Day4().numRescueBoats(people, limit));

    }

    @Test
    void testCase3() {
        int[] people = {3,1,7};
        int limit = 7;
        assertEquals(2, new Day4().numRescueBoats(people, limit));

    }

    @Test
    void testCase4() {
        int[] people = {2,2};
        int limit = 6;
        assertEquals(1, new Day4().numRescueBoats(people, limit));

    }
}
