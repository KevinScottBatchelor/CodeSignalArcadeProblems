package com.IntroSection;
import java.util.Arrays;

/*
Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
solution(inputArray) = ["aba", "vcd", "aba"].

Input/Output

[execution time limit] 3 seconds (java)

[input] array.string inputArray

A non-empty array.

Guaranteed constraints:
1 ≤ inputArray.length ≤ 10,
1 ≤ inputArray[i].length ≤ 10.

[output] array.string

Array of the longest strings, stored in the same order as in the inputArray.

*/

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
