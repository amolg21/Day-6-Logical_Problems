package com.bridgelabz;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number= ");
        int n = sc.nextInt();
        int rem, rev=0, num;
        for (int i=0; i<n; ) {
            rem = n%10;
            n = n/10;
            rev = rev*10 + rem;
        }
        System.out.println("The reversed number is: "+rev);
    }
}

