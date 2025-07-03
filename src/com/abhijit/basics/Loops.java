package com.abhijit.basics;

public class Loops {
    public static void main(String[] args){
        // if else

        if (true) {
            System.out.println("true condition");
        } else if (false) {
            System.out.println("false condition");
        } else {
            System.out.println("if all other ifs false");
        }

        // while

        int i = 0;

        while(i != 5){
            System.out.println(i);
            i++;
        }

        // for

        for(int k = 0; k < 5; k++){
            System.out.println(k);
        }
    }
}
