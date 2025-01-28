package ArraysBasic;

public class SumOfAll {

    public  int sum(int arr[], int n) {

        int sum = 0;
        for(int i = 0 ; i < n; i++){
            sum = sum + arr[i];
        }

        return sum;

    }
}
