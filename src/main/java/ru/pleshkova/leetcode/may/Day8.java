package ru.pleshkova.leetcode.may;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.

The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:

The 1st place athlete's rank is "Gold Medal".
The 2nd place athlete's rank is "Silver Medal".
The 3rd place athlete's rank is "Bronze Medal".
For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
Return an array answer of size n where answer[i] is the rank of the ith athlete.
 * */
public class Day8 {
    public String[] findRelativeRanks(int[] score) {

        List<Integer> placement = new ArrayList<>(Arrays.stream(score).boxed().toList());
        Collections.sort(placement);

        String[] result = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            int place = placement.indexOf(score[i]);
            result[i] = switch (score.length - place) {
                case 1 -> "Gold Medal";
                case 2 -> "Silver Medal";
                case 3 -> "Bronze Medal";
                default -> String.valueOf(score.length - place);
            };
        }

        return result;
    }
}