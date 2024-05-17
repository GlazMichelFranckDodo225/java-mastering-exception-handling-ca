package com.dgmf;

public class Example1 {
    public static void main(String[] args) {
        int a, b, c = 0;
        a = 20;
        // b = 5;
        b = 0;
        // ArithmeticException: / by zero
        c = a / b;

        System.out.println(c);
    }
}