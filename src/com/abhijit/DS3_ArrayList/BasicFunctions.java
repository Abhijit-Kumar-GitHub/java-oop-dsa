package com.abhijit.DS3_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class BasicFunctions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 8; i++){
            list.add(i);
        }

        System.out.println("original list" + list);

        System.out.println("swapped list " + swap(list,0,1));

        System.out.println("max element: " + max(list));
    }

    public static ArrayList<Integer> swap(ArrayList<Integer> list, int a, int b){
        int temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);

        return list;
    }

    public static int max(ArrayList<Integer> list){
        int max = -9999;

        for(int i = 0; i< list.size(); i++){
            if(max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }




}
