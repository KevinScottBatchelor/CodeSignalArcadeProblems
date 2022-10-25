package com.IntroSection;
/*
Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by
removing no more than one element from the array.

Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an. Sequence containing only
one element is also considered to be strictly increasing.

Example

For sequence = [1, 3, 2, 1], the output should be
solution(sequence) = false.

There is no one element in this array that can be removed in order to get a strictly increasing sequence.

For sequence = [1, 3, 2], the output should be
solution(sequence) = true.

You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get the
strictly increasing sequence [1, 3].

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer sequence

Guaranteed constraints:
2 ≤ sequence.length ≤ 105,
-105 ≤ sequence[i] ≤ 105.

[output] boolean

Return true if it is possible to remove one element from the array in order to get a strictly increasing sequence,
otherwise return false.

*/
public class AlmostIncreasingSequence {
    static boolean solution(int[] sequence) {
        int n = sequence.length;
        int count = 0;
        int index = -1;

        for(int i = 1; i < n; ++i) {
            if (sequence[i - 1] >= sequence[i]) {
                ++count;
                index = i;
            }
        }

        if (count > 1) {
            return false;
        } else if (count == 0) {
            return true;
        } else if (index != n - 1 && index != 1) {
            if (sequence[index - 1] < sequence[index + 1]) {
                return true;
            } else if (index - 2 >= 0 && sequence[index - 2] < sequence[index]) {
                return true;
            } else if (index < 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int[] sequence = new int[]{1, 3, 2, 1};
        //should be false
        System.out.println(solution(sequence));
    }
}
