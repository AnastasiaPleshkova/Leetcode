package ru.pleshkova.leetcode.may;

import java.util.Arrays;

class Day2 {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;

        if (nums[end] < 0 || nums[start] > 0) {
            return -1;
        }

        while (start < end) {
            int left = nums[start] * (-1);
            int right = nums[end];
            if (left == right) {
                return right;
            }
            if (left < right) {
                --end;
            } else {
                ++start;
            }
        }

        return -1;


    }
}
