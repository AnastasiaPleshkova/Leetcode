package ru.pleshkova.leetcode.may;

class Day3 {
    public int compareVersion(String version1, String version2) {
        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");

        for (int i = 0; i < Math.max(ver1.length, ver2.length); i++) {
            int first = i < (ver1.length) ? Integer.parseInt(ver1[i]) : 0;
            int second = i < (ver2.length) ? Integer.parseInt(ver2[i]) : 0;
            if (first > second) {
                return 1;
            } else if (first < second) {
                return -1;
            }
        }
        return 0;
    }
}
