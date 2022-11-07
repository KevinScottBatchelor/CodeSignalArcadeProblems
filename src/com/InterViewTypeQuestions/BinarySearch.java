package com.InterViewTypeQuestions;
/*
Given a sorted array of positive, increasing integers:
- return the index location of a target integer.
- return -1 if the target is not found.

nums = [2, 3, 5, 7, 8, 10, 12, 15, 18, 20]
target = 7

assumptions:

array only has positive ints
array is sorted
memory is not an issue

*want index not element value

array can be empty
target will always be a positive and valid int within reasonable

*/
public class BinarySearch {
        static int IndexOfTargetInt(int[] nums, int target) {
            int lowIndex = nums[0];
            int highIndex = nums.length-1;

            while (lowIndex <= highIndex) {

                int midIndex = (lowIndex + highIndex) / 2;
                int guess = nums[midIndex];

                if (guess == target) return midIndex;

                if (guess > target) {
                    highIndex = midIndex - 1;
                } else lowIndex = midIndex + 1;
            }
            return -1;
        }
        //driver code to show results
        public static void main (String[] args) {
            int[] nums = {2, 3, 5, 7, 8, 10, 12, 15, 18, 20};
            int target = 5;
            //expected result 2
            System.out.println(IndexOfTargetInt(nums, target));
        }
}
