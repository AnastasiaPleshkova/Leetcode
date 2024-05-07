package ru.pleshkova.leetcode.may;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* You are given a 0-indexed integer array nums.
* You have to find the maximum sum of a pair of numbers from nums such that the maximum digit in both numbers are equal.

Return the maximum sum or -1 if no such pair exists.
*
* */
public class Day7 {

    public int maxSum(int[] nums) {
        int max = -1;
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(0, new ArrayList<>());
        map.put(1, new ArrayList<>());
        map.put(2, new ArrayList<>());
        map.put(3, new ArrayList<>());
        map.put(4, new ArrayList<>());
        map.put(5, new ArrayList<>());
        map.put(6, new ArrayList<>());
        map.put(7, new ArrayList<>());
        map.put(8, new ArrayList<>());
        map.put(9, new ArrayList<>());

        for (int number : nums) {
            int maxDigit = Collections.max(Arrays.stream(String.valueOf(number).split("")).map(Integer::valueOf).toList());
            List<Integer> integers = map.get(maxDigit);
            integers.add(number);
            map.put(maxDigit, integers);
        }

        for (var list : map.values()) {
            if (list.size() >= 2) {
                Integer max1 = Collections.max(list);
                list.remove(max1);
                Integer max2 = Collections.max(list);
                max = Math.max(max, max1 + max2);
            }
        }

        return max;
    }
}