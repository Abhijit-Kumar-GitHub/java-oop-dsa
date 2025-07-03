package com.abhijit.basics;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().trim().charAt(0);

        System.out.println("the entered character: "+ ch);

        if(ch >= 'a' && ch < 'z'){
            System.out.println("the entered charcter is in lower case");
        }else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("the entered character is in upper case");
        }else{
            System.out.println("the entered character is not an alphabet");
        }
    }
}
