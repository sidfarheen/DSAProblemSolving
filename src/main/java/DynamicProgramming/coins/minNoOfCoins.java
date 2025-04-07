package DynamicProgramming.coins;

public class minNoOfCoins {

    long func(int index, int target, int[] a){

        if(index == 0){
            if( target % a[index] == 0) return target / a[index];
            return (long) 1e9 ;
        }


        long notTake = func((index - 1), target, a);

        long take = (long) 1e9;
        if(a[index] <= target) {
             take = 1 + func(index, target - a[index], a);
        }

        return Math.min(take, notTake);
    }

    public static void main(String[] args) {

        int[] a = new int[]{3,2,1};
        int n = a.length;
        int target = 7;

        minNoOfCoins minNoOfCoins= new minNoOfCoins();

        long ans = minNoOfCoins.func(n-1, target, a);
        System.out.printf(Long.toString(ans));


    }
}
