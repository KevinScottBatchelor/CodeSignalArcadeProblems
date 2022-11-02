package com.IntroSection;
/*
Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example
For:

picture = ["abc",
           "ded"]
the output should be

solution(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]
Input/Output

[execution time limit] 3 seconds (java)

[input] array.string picture

A non-empty array of non-empty equal-length strings.

Guaranteed constraints:
1 ≤ picture.length ≤ 100,
1 ≤ picture[i].length ≤ 100.

[output] array.string

The same matrix of characters, framed with a border of asterisks of width 1.
*/
public class AddBorder {
    static String[] solution(String[] picture) {
        String asterisk = setAsterisk(picture[0].length());
        String[] answer = new String[picture.length + 2];
        int index = 0;
        answer[0] = asterisk;
        for (String word : picture) {
            index++;
            answer[index] = "*" + word + "*";
        }
        answer[index+1] = asterisk;
        return answer;
    }
    static String setAsterisk(int length) {
        String asterisk = "**";
        for (int count = 0; count < length; count++) {
            asterisk += "*";
        }
        return asterisk;
    }

    public static void main (String[] args) {
        String[] picture = {"abc", "ded"};
        //Output should be: ["*****",
        //                   "*abc*",
        //                   "*ded*",
        //                   "*****"]
    }
}
