package Sorting;

public class BubbleSort {
    public
    int[] bubbleSort(int[] nums) {
        int n = nums.length;

        //pass from 0 to n-1
        // because last element will not have anything to be compared
        for(int pass=0; pass< n-1; pass++){

            boolean swapped = false;

            //number of elements to be compared is reduced every time
            for(int j = 0; j < n-1 - pass; j++ ){
                if( nums[j]> nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }


            // i fno comparisons happened then break
            if(!swapped){
                break;
            }
        }


        return nums;

    }
}
