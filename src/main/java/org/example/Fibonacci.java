package org.example;

public class Fibonacci {

    public static void main(String[] args) {
        fib(3);  // 0 1 1
        fib(5);  // 0 1 1 2 3
        fib(6);  // 0 1 1 2 3 5
        fib(10); // 0 1 1 2 3 5 8 13 21 34
        System.out.println();
    }

    public static void fib(int n) {
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }

}

