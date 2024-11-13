package org.example;

public class singleMissingNumber {
    public int singleNumber(int[] nums) {

        int ans = 0;
        for(int num:nums){
            ans ^= num;
        }
        return ans;
    }
}
