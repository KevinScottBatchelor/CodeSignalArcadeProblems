package com.InterViewTypeQuestions;
/*
Special numbers are numbers that have digits with at most a difference of 1 between its immediate left and right
neighbors. Write a function that prints out all of special numbers from 10 to 9999. Make sure to print each special
number on a new line.

Example:

312 is not a special number because 3 - 1 = difference of 2.
101 is a special number because 1 - 0 = difference of 1 && 0 - 1 = difference of 1.
77 is a special number because 7 - 7 = difference of 0 which is <= 1
*/
public class PrintSpecialNums {

    public static void main (String[] args) {
        int beginning = 10;
        int ending = 9999;

        for (int i = beginning; i <= ending; i++) {
            boolean isSpecial = true;
            String number = String.valueOf(i);
            for (int j = 0; j < number.length() - 1; j++) {

                if (Math.abs(number.charAt(j) - number.charAt(j + 1)) > 1)
                    isSpecial = false;
            }
            if (isSpecial) System.out.println(number);
        }
    }
}
