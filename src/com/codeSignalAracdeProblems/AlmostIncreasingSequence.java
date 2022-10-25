package com.codeSignalAracdeProblems;

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
