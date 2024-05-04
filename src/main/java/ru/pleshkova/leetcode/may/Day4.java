package ru.pleshkova.leetcode.may;

import java.util.Arrays;

class Day4 {
    public int numRescueBoats(int[] people, int limit) {

        int boats = 0;
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        while (left <= right) {
            if ((people[right] + people[left]) <= limit) {
                left++;
            }
            right--;
            boats++;
        }
        return boats;

    }
}
