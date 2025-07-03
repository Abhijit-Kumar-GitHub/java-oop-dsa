package com.abhijit.basics;

import java.util.Scanner;

public class CountOccurenceNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number to count occurrence in: ");
        int num = sc.nextInt();

        System.out.print("enter the target to count in number: ");
        int target = sc.nextInt();

        sc.close();

        countOccurrence(num, target);

    }

    private static void countOccurrence(int num, int target){
        int count = 0;
        while(num > 0){
            if(num%10 == target){
                count++;
            }

            num /= 10;
        }
        System.out.println("the target has occured " + count + " times.");

        return;
    }
}
