package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number= ");
        int n = sc.nextInt();
        int i, sum = 0;

        System.out.println("The divisors of the entered number are: ");
        for (i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println("The sum of the divisors is= "+sum);

        if (sum == n) {
            System.out.println("The entered number is a perfect number");
        } else {
            System.out.println("The entered number is not a Perfect number hence check for other number.");
        }
    }
}