package com.abhijit.basics;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("this will print new line character after this line");

        System.out.print("this will not print new line");
        System.out.println("===============as evident here");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter integer to print it");
        System.out.println(sc.nextInt());

        System.out.println("enter a word to print it");
        System.out.println(sc.next());

        System.out.println("enter a sentence to print it");
        System.out.println(sc.nextLine());

        System.out.println("enter a float to print it");
        System.out.println(sc.nextFloat());

        System.out.println("enter a double to print it");
        System.out.println(sc.nextDouble());


    }
}
