package com.abhijit.arrays_linearDS;

import java.util.Scanner;
import java.util.Arrays;

public class BasicArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        int[] array = new int[5];
//
//        int[] array2 = {1,2,3,4,5,6};
//
//        for(int i =0 ; i < 5; i++){
//            array[i] = sc.nextInt();
//        }
//
//        for (int j : array) {
//            System.out.print(j + " ");
//        }
//
//        System.out.println(Arrays.toString(array2));

        // // for 2D array or matrix we just have to declare the no or rows ie the number of arrays in master array in advance

        int[][] matrix = new int[3][];

        int [][] matrix2 = {
                {1,2},
                {3,4}
        };

        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j < 2; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i =0; i<matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
