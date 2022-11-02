package com.IntroSection;

import java.util.Arrays;
import java.util.Stack;

/*
Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in
one of the arrays.

Given two arrays a and b, check whether they are similar.

Example

For a = [1, 2, 3] and b = [1, 2, 3], the output should be
solution(a, b) = true.

The arrays are equal, no need to swap any elements.

For a = [1, 2, 3] and b = [2, 1, 3], the output should be
solution(a, b) = true.

We can obtain b from a by swapping 2 and 1 in b.

For a = [1, 2, 2] and b = [2, 1, 1], the output should be
solution(a, b) = false.

Any swap of any two elements either in a or in b won't make a and b equal.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

Array of integers.

Guaranteed constraints:
3 ≤ a.length ≤ 105,
1 ≤ a[i] ≤ 1000.

[input] array.integer b

Array of integers of the same length as a.

Guaranteed constraints:
b.length = a.length,
1 ≤ b[i] ≤ 1000.

[output] boolean

true if a and b are similar, false otherwise.
*/
public class AreSimilar {

    private static boolean kevinSolution(int[] a, int[] b) {
        //variable to count non-matching index values
        //for this problem we can have max 2 differences because only allowed one pair swap (pair = 2)
        int differences = 0;
        int maxDifferences = 2;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) differences++;
        }
        //to make sure each array has matching element values, otherwise false
        Arrays.sort(a);
        Arrays.sort(b);
        //arrays must contain all the same element values && no more than 2 difference (1 pair swap)
        return Arrays.equals(a, b) && differences <= maxDifferences;
    }
    static boolean stackSolution(int[] a, int[] b) {

        int swap = 0;
        Stack<Integer> stack = new Stack<>();
        for (int index = 0; index < a.length; index++) {
            if (a[index] != b[index]) {
                if (stack.isEmpty()) {
                    stack.add(index);
                    swap++;
                } else if (a[index] == b[stack.peek()] && b[index] == a[stack.peek()]) {
                    stack.pop();
                }
            }
            if (swap > 1) return false;
        }
        return stack.isEmpty();
    }
    public static void main (String[] args) {
        int[] a = {832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
        int[] b = {832, 570, 148, 998, 533, 561, 455, 147, 894, 279};
        System.out.println(stackSolution(a, b));
        System.out.println(kevinSolution(a, b));
    }
}
