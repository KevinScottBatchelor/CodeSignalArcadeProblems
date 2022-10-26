package com.IntroSection;

import java.util.Arrays;

/*
Several people are standing in a row and need to be divided into two teams. The first person goes into team 1, the
second goes into team 2, the third goes into team 1 again, the fourth into team 2, and so on.

You are given an array of positive integers - the weights of the people. Return an array of two integers, where the
first element is the total weight of team 1, and the second element is the total weight of team 2 after the division
is complete.

Example

For a = [50, 60, 60, 45, 70], the output should be
solution(a) = [180, 105].

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

Guaranteed constraints:
1 ≤ a.length ≤ 105,
45 ≤ a[i] ≤ 100.

[output] array.integer
*/
public class alternatingSums {

    static int[] solution(int[] a) {
        int[] answer = new int[]{0,0};
        int teamOne = 0;
        int teamTwo = 0;

        //iterate over even indices starting at 0 of a for team 1 and get sum
        for (int i = 0; i < a.length; i+=2) {
            teamOne+= a[i];
        }
        //iterate over odd indices starting at 0 of a for team 2 and get sum
        for (int i = 1; i < a.length; i+=2) {
            teamTwo+= a[i];
        }
        //update answer[] with sums from team1 (a[o]) and team 2 (a[1])
        answer[0] = teamOne;
        answer[1] = teamTwo;
        return answer;
    }

    public static void main(String[] args) {
        int[] a = new int[]{50, 60, 60, 45, 70};
        //Output should be [810, 105]
        System.out.println(Arrays.toString(solution(a)));
    }
}
