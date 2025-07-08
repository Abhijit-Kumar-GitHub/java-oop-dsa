package com.abhijit.arrays_linearDS;

import java.util.Arrays;
import java.util.Scanner;

public class Swapping {
    public static void swapper(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};

        swapper(arr[1],arr[2]);

        System.out.println(Arrays.toString(arr));
    }

}
