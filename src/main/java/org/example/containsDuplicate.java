package org.example;

import java.util.HashSet;

public class containsDuplicate {
    public boolean containsDuplicateNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num: nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
