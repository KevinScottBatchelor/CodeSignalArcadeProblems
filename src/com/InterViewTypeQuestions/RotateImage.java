package com.InterViewTypeQuestions;

import java.util.Arrays;

/*
Note: Try to solve this task in-place (with O(1) additional memory), since this is what you'll be asked to do during an interview.

You are given an n x n 2D matrix that represents an image. Rotate the image by 90 degrees (clockwise).

Example

For

a = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]
the output should be

solution(a) =
    [[7, 4, 1],
     [8, 5, 2],
     [9, 6, 3]]
Input/Output

[execution time limit] 3 seconds (java)

[input] array.array.integer a

Guaranteed constraints:
1 ≤ a.length ≤ 100,
a[i].length = a.length,
1 ≤ a[i][j] ≤ 104.

[output] array.array.integer
*/
public class RotateImage {
    static int[][] solution(int[][] a) {
        int n = a.length;

        //swap rows with columns
        //i.e. transpose the matrix
        //first row becomes first column and so on
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                //standard swap formula
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        //now swap columns to match 90-degree rotation
        //i.e. first row swaps with last row and work
        //inward towards center columns
        for (int i = 0; i < n; i++) {
            //only go to halfway point
            for (int j = 0; j < (n/2); j++) {
                //standard swap formula
                int temp = a[i][j];
                //swap outermost columns
                //and work inward
                a[i][j] = a[i][n-1-j];
                a[i][n-1-j] = temp;
            }
        }
        return a;
    }
    public static void main (String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        //expected [[7,4,1],
        //          [8,5,2],
        //          [9,6,3]]
        System.out.println(Arrays.deepToString(solution(a)));
    }
}