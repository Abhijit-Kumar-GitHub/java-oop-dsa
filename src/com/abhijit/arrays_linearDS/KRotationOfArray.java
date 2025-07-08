package com.abhijit.arrays_linearDS;

import java.util.Arrays;
import java.util.Scanner;

public class KRotationOfArray {

    public static void rev(int[] a, int start, int end){
        if(a == null || a.length == 0) return;

        for(int i = start; i <= end / 2; i++){
            Swapping.swapper(a[i], a[end-1-i]);
        }
    }

    private static void KRotator(int[] array, int k){
        rev(array,0, array.length);
//        rev(array,0,k);
        rev(array, k+1,array.length);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,5};

        int k = sc.nextInt();

        KRotator(arr, k);

        System.out.println(Arrays.toString(arr));

    }
}
