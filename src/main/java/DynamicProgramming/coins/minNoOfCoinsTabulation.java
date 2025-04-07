package DynamicProgramming.coins;

import java.util.Arrays;

public class minNoOfCoinsTabulation {

    long funcTab( int t, int[] a, long[][] dp){


        int n = a.length;

        for( int i = 0; i <= t; i++) {
                if( i % a[0] == 0)  dp[0][i] = i/a[0];
                else dp[0][i] = (long) 1e9;
            }

        for(int ind = 1 ; ind < a.length ; ind++){
            for( int target = 0 ; target<= t ; target++){
                long notTaken = dp[ind - 1][target];
                 long take = (long) 1e9;

                 if( a[ind]<= target)
                     take = 1+ dp[ind][target- a[ind]];

                 dp[ind][target] = Math.min(notTaken, take);

            }

        }

        long ans = dp[n-1][t];
        if( ans >= (long) 1e9){
            return  -1;
        }
        return ans;

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



        minNoOfCoinsTabulation minNoOfCoins= new minNoOfCoinsTabulation();
        long  ans = minNoOfCoins.funcTab( target, a, dp);

        System.out.println("minNoOfCoinsMemorization.main" + ans);
    }
}
