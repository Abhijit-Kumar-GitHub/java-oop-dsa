package com.abhijit.arrays_linearDS;

import java.util.Arrays;
import java.util.Scanner;

public class Reverser {
    public static void rev(int[] a){
        if(a == null || a.length == 0) return;

        for(int i =0; i < a.length / 2; i++){
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        rev(arr);

        System.out.println(Arrays.toString(arr));
    }
}
