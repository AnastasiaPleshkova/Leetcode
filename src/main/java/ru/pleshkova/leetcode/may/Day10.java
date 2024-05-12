package ru.pleshkova.leetcode.may;


/*
Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
* */
public class Day10 {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int m;

        if (nums[r] < target) {
            return nums.length;
        }

        if (nums[l] >= target) {
            return 0;
        }

        while (l < r) {
            m = (l + r) / 2;
            if (nums[m] >= target) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }
}
