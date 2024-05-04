package ru.pleshkova.leetcode.may;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Day1Test {

    @Test
    void testCase() {
        String word = "abcdefd";
        char ch = 'd';
        assertEquals( "dcbaefd", new Day1().reversePrefix(word, ch));

    }

    @Test
    void testCaseEnd() {
        String word = "abcd";
        char ch = 'd';
        assertEquals( "dcba", new Day1().reversePrefix(word, ch));

    }

}
