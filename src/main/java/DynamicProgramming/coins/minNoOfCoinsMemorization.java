package DynamicProgramming.coins;

import java.util.Arrays;

public class minNoOfCoinsMemorization {

    long funcMem(int index, int target,int[] a, long[][] dp){


        if( index== 0){
            if( target % a[index] == 0) return target/a[index];
            else return (long) 1e9;
        }

        if ( dp[index][target] != -1) return dp[index][target];

        long notTake = funcMem(index -1 , target, a, dp);

        long take = (long) 1e9;
        if ( a[index]<= target){
           take = 1+ funcMem(index, target - a[index], a, dp);
        }

        return dp[index][target]= Math.min(notTake, take);
    }

    public static void main(String[] args) {
        int[] a = new int[]{3,2,1};
        int n = a.length ;
        int target = 7;
        long[][] dp = new long[n][target+1];

        for(long[] arr : dp)
        {
            Arrays.fill(arr, -1);
        }

        minNoOfCoinsMemorization minNoOfCoins= new minNoOfCoinsMemorization();
        long  ans = minNoOfCoins.funcMem(n-1, target, a, dp);

        System.out.println("minNoOfCoinsMemorization.main" + ans);
    }
}
