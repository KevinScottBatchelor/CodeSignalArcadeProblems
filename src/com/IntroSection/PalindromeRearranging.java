package com.IntroSection;

import java.util.HashMap;
/*
Given a string, find out if its characters can be rearranged to form a palindrome.

Example:

For inputString = "aabb", the output should be
solution(inputString) = true.

We can rearrange "aabb" to make "abba", which is a palindrome.

Input/Output

[execution time limit] 3 seconds (java)

[input] string inputString

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 50.

[output] boolean

true if the characters of the inputString can be rearranged to form a palindrome, false otherwise.
*/
public class PalindromeRearranging {
    static boolean solution(String inputString) {
        boolean isPalindrome = true;
        //char in str //count
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : inputString.toCharArray()) {

            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }
        int unpairedChars = 0;

        for (Character c : map.keySet()) {
            //odd length strings can only have one unpaired char (the middle char i.e the 'z' in "aza")
            if (map.get(c) % 2 == 1) {
                unpairedChars++;
                if (unpairedChars > 1) isPalindrome = false;
            }
        }

        return isPalindrome;
    }
    public static void main (String[] args) {
        //expected true
        System.out.println(solution("aabbaa"));
    }
}
