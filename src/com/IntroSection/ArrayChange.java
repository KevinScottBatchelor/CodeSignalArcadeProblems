package com.IntroSection;
/*
You are given an array of integers. On each move you are allowed to increase exactly one of its element by one.
Find the minimal number of moves required to obtain a strictly increasing sequence from the input.

Example

For inputArray = [1, 1, 1], the output should be
solution(inputArray) = 3.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer inputArray

Guaranteed constraints:
3 ≤ inputArray.length ≤ 105,
-105 ≤ inputArray[i] ≤ 105.

[output] integer

The minimal number of moves needed to obtain a strictly increasing sequence from inputArray.
It's guaranteed that for the given test cases the answer always fits signed 32-bit integer type.
*/
public class ArrayChange {

    static int solution(int[] inputArray) {
        int minimalAmountOfMoves = 0;

        for (int  index = 0; index < inputArray.length - 1; index++) {

            if (inputArray[index] >= inputArray[index + 1]) {
                int difference = inputArray[index] - inputArray[index + 1] + 1;
                minimalAmountOfMoves+= difference;
                inputArray[index + 1] += difference;
            }
        }
        return minimalAmountOfMoves;
    }
    public static void main (String[] args) {
        int[] inputArray = {1 , 1 , 1};
        //answer should be 3
        System.out.println(solution(inputArray));
    }
}
