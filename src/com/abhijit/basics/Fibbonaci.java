package com.abhijit.basics;

import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the order of fibbonacci series reqd: ");
        Integer n = sc.nextInt();

        Integer first = 0;
        Integer second = 1;

        if(n <= 0 || n >= 49){
            System.out.println("Enter number greater than 0 and less than 49 as over 49 Integer class overflows");
        } else if (n == 1) {
            System.out.println(first);
        } else if (n == 2) {
            System.out.println(second);
        } else {
            Integer result = 0;
            for(int i = 2; i <= n; i++){
                result = first + second;
                first = second;
                second = result;

            }
            System.out.println(result);
        }


    }
}
