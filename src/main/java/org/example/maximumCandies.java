package org.example;

import java.util. *;
public class maximumCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);
        int max = Integer.MIN_VALUE;
        //find max
        for(int i= 0; i< candies.length ; i++){
            if(max < candies[i]){
                max = candies[i];
            }
        }

        for(int i = 0; i< candies.length ; i++){
            if( (candies[i]+extraCandies) >=  max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }

}
