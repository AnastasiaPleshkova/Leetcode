package ru.pleshkova.leetcode.may;

class Day1 {

    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);

        if (index == -1)
            return word;

        StringBuilder builder = new StringBuilder(word.substring(0, index+1));

        return builder.reverse().append(word.substring(index+1)).toString();
    }
}
