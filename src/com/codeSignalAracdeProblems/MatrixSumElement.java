package com.codeSignalAracdeProblems;

public class MatrixSumElement {
    static int solution(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int sum = 0;

        for(int i = 0; i < columns; ++i) {
            for(int j = 0; j < rows && matrix[j][i] != 0; ++j) {
                sum += matrix[j][i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 1, 1, 0}, {0, 5, 0, 1}, {2, 1, 3, 10}};
        //should be 9
        System.out.println(solution(matrix));
    }
}
