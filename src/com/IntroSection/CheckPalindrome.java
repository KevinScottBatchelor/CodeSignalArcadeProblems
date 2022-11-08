package com.IntroSection;
/*
Given the string, check if it is a palindrome.

Example

For inputString = "aabaa", the output should be
solution(inputString) = true;
For inputString = "abac", the output should be
solution(inputString) = false;
For inputString = "a", the output should be
solution(inputString) = true.
Input/Output

[execution time limit] 3 seconds (java)

[input] string inputString

A non-empty string consisting of lowercase characters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 105.

[output] boolean

true if inputString is a palindrome, false otherwise.
*/
public class CheckPalindrome {

    static boolean solution(String inputString) {
        boolean result = false;
        String reverse = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reverse += inputString.charAt(i);
        }
        if (inputString.equals(reverse)) {
            result = true;
        }
        return result;
    }

    static boolean improvedSolution(String inputString) {
        return inputString.equals(new StringBuilder(inputString).reverse().toString());
    }

    public static void main (String[] args) {
        String inputString = "racecar";
        //expected true
        System.out.println(solution(inputString));
        //expected true
        System.out.println(improvedSolution(inputString));
    }
}
