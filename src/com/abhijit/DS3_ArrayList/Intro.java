package com.abhijit.DS3_ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class Intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> vector = new ArrayList<Integer>();
//
//        // OR
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        // OR
//
//        ArrayList<Integer> arr = new ArrayList<>(10);
//
//        // Also we can directly print ArrayList as it already internally calls its own toString function.
//
//        for(int i = 0; i < 12; i++){
//            arr.add(i);                 // but we still can't to list or vector yet... why?
//        }
//
//        System.out.println(arr);
//

        // for 2d vector i.e matrix
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<> ();              // we have declared the 2d vector matrix here

        for(int i = 0; i < 3; i++){                                             // initializing 3 arraylists i.e. row in our matrix here
            matrix.add(new ArrayList<>());
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matrix.get(i).add(sc.nextInt());
            }
        }

        System.out.println(matrix);
    }
}
