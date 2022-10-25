package com.codeSignalAracdeProblems;

public class IsLucky {

    static boolean kevSolution(int n) {

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
        System.out.println("Kevin's result: " + kevSolution(n));
    }
}
