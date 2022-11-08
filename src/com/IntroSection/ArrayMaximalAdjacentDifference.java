package com.IntroSection;
/*
Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.

Example

For inputArray = [2, 4, 1, 0], the output should be
solution(inputArray) = 3.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer inputArray

Guaranteed constraints:
3 ≤ inputArray.length ≤ 10,
-15 ≤ inputArray[i] ≤ 15.

[output] integer

The maximal absolute difference.
*/
public class ArrayMaximalAdjacentDifference {
    static int solution(int[] inputArray) {
        int maxDiff = 0;
        for (int i = 0; i < inputArray.length-1; i++) {
            if (maxDiff < Math.abs(inputArray[i] - inputArray[i+1])) {
                maxDiff = Math.abs(inputArray[i] - inputArray[i+1]);
            }
        }
        return maxDiff;
    }
    public static void main (String[] args) {
        int[] inputArray = {10, 11, 13};
        //expected 2
        System.out.println(solution(inputArray));
    }
}