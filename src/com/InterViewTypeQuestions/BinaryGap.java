package com.InterViewTypeQuestions;
//The problem is to find the longest sequence of zeros in a binary representation of an integer.

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {
    static int solution(int n) {

        String binaryString = Integer.toBinaryString(n);

        int longestBinaryGap = 0;
        List onesList = new ArrayList();

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '0') continue;
            onesList.add(i);
        }

        for (int i = 0; i < onesList.size() - 1; i++) {

            int diffOfIndices = (int) onesList.get(i + 1) - (int) onesList.get(i) - 1;

            longestBinaryGap = Math.max(longestBinaryGap, diffOfIndices);
        }

        return longestBinaryGap;
    }

    public static void main (String[] args) {
        int n = 9;
        //should be 2
        System.out.println(solution(9));
        System.out.println(solution(15));
    }
}
