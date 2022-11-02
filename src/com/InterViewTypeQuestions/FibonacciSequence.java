package com.InterViewTypeQuestions;
//Write a function in Java to get the nth Fibonacci number code in Java using recursion with memoization
//The Fibonacci Sequence is the series of numbers:
//
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
//
//The next number is found by adding up the two numbers before it:
//
//the 2 is found by adding the two numbers before it (1+1),
//the 3 is found by adding the two numbers before it (1+2),
//the 5 is (2+3),
//and so on!
public class FibonacciSequence {
    //using recursion
    static int fib(int n)
    {
        // Base Case
        if (n < 2)
            return n;

        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }

    public static void main (String[] args) {
        int n = 3;
        System.out.println(fib(n));
    }
}
