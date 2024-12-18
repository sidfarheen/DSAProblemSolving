package org.example;

public class squareRoot {
    public int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        }

        int low = 0;
        int high = x;
        int mid = -1;
        while(low <= high){
            mid = low +  (high - low) / 2;

            if(mid == x/mid){
                return mid;
            }
            else{
                if(mid < x / mid ){
                    low = mid + 1;
                }
                else{
                    high = mid - 1 ;
                }
            }

        }

        return high;
    }
}
