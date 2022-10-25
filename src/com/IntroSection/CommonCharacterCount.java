package com.IntroSection;
/*
Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
solution(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".

Input/Output

[execution time limit] 3 seconds (java)

[input] string s1

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ s1.length < 15.

[input] string s2

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ s2.length < 15.

[output] integer

*/
public class CommonCharacterCount {
    static int solution(String s1, String s2) {
        if (s1.length() == 1 && s2.length() == 1) {
            return s1.equals(s2) ? 1 : 0;
        } else {
            int count = 0;
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();

            for(int i = 0; i < c1.length; ++i) {
                for(int j = 0; j < c2.length; ++j) {
                    if (c2[j] != ' ' && c1[i] == c2[j]) {
                        ++count;
                        c2[j] = ' ';
                        break;
                    }
                }
            }

            return count;
        }
    }

    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "aaa";
        //should be 1
        System.out.println(solution(s1, s2));
    }
}