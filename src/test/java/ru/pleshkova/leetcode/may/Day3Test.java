package ru.pleshkova.leetcode.may;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day3Test {

    @Test
    void testCase1() {
        String version1 = "1.01";
        String version2 = "1.001";
        assertEquals(0, new Day3().compareVersion(version1, version2));

    }

    @Test
    void testCase2() {
        String version1 = "0.1";
        String version2 = "1.1";
        assertEquals(new Day3().compareVersion(version1, version2), -1);

    }

    @Test
    void testCase3() {
        String version1 = "1.3";
        String version2 = "1.5.0";
        assertEquals(new Day3().compareVersion(version1, version2), -1);

    }


}
