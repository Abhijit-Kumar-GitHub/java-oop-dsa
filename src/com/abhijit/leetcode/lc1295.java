package com.abhijit.leetcode;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class lc1295 {
    public int findNumbers(int[] nums) {
        int ans = 0;

        for(int num : nums){
            if(check(num)) ans++;
        }

        return ans;
    }

    public static boolean check(int n){
//        int digits = 0;
//        while(n > 0){
//            n /= 10;
//            digits++;
//        }

        int digits = (int)(Math.log10(n)) + 1;

        return digits % 2 == 0;
    }
}
