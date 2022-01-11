package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int a = 0;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the number(n)= ");
        int n = sc.nextInt();
        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                arr[a] = i;
                //System.out.println(arr[a]);
                a++;
            }
        }
        //System.out.println(arr.length);
        if (arr[0] != 0) {
            System.out.println("The entered number is not prime");
        }
        else
            System.out.println("The entered number is prime");
    }
}
