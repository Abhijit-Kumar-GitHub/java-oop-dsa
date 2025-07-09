package com.abhijit.search;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,24,534,63,6};

        System.out.println(Arrays.toString(arr));
        System.out.println(linSearch(arr, 63));
    }

    // Linear search : here we'll go through array and if we find it return the index;

    public static int linSearch(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
