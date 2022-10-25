package com.IntroSection;
/*
Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.

Example

For n = 1230, the output should be
solution(n) = true;
For n = 239017, the output should be
solution(n) = false.
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

A ticket number represented as a positive integer with an even number of digits.

Guaranteed constraints:
10 ≤ n < 106.

[output] boolean

true if n is a lucky ticket number, false otherwise.
*/
public class IsLucky {

    static boolean solution(int n) {

        boolean isLucky = true;

        //turn n into string
        String intToStr = String.valueOf(n);

        int median = (intToStr.length() / 2);
        int sumOfFirstHalf = 0;
        int sumOfSecondHalf = 0;

        //get sum of first half of elements from digitsOfN
        for (int i = 0; i < median; i++) {
            sumOfFirstHalf+= intToStr.charAt(i);
        }
        //get sum of second half of elements from digitsOfN
        for(int i = median; i < intToStr.length(); i++) {
            sumOfSecondHalf+= intToStr.charAt(i);
        }
        //if sum of first half != sum of second half then isLucky is false
        if (sumOfFirstHalf != sumOfSecondHalf) isLucky = false;

        return isLucky;
    }

    public static void main(String[] args) {
        int n = 1230;
        //Result should be true: 1+2 = 3+0
        System.out.println("Result is" + solution(n));
    }
}
