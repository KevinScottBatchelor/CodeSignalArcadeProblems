package com.codeSignalAracdeProblems;

import java.util.Arrays;

public class AllLongestStrings {
    static String[] solution(String[] inputArray) {
        if (inputArray.length == 1) {
            return inputArray;
        } else {
            int maxWordLength = 0;
            int counter = 0;

            int index;
            for(int str = 0; str < inputArray.length; ++str) {
                index = inputArray[str].length();
                if (index > maxWordLength) {
                    maxWordLength = index;
                    counter = 1;
                } else if (maxWordLength == index) {
                    ++counter;
                }
            }

            String[] longestStringsArr = new String[counter];
            index = 0;

            for(int str = 0; str < inputArray.length; ++str) {
                int wordSize = inputArray[str].length();
                if (wordSize == maxWordLength) {
                    longestStringsArr[index] = inputArray[str];
                    ++index;
                }
            }

            return longestStringsArr;
        }
    }

    public static void main(String[] args) {
        String[] inputArray = new String[]{"aba", "aa", "ad", "vcd", "aba"};
        //Result should be [aba, vcd, aba]
        System.out.println(Arrays.toString(solution(inputArray)));
    }
}
