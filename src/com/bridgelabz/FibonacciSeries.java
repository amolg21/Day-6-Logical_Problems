package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Obtaining the Nth value from Fibonacci series.
        System.out.println("Enter the value N= ");
        int N = sc.nextInt();
        int a = 0, b = 1, c = 0, i=1;
        while( i<=N) {
            System.out.println(c);
            c = a + b;
            a = b;
            b = c;
            i++;
        }
        System.out.println("The Nth Value is= "+c);
    }
}