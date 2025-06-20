package com.abhijit.basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the first integer to sum: ");
        int a = sc.nextInt();

        System.out.print("enter the second integer to sum: ");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println("the sum of the numbers is: " + sum);
    }
}
