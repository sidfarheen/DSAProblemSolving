package Sorting;

public class SelectionSort {
    public  int[] selectionSort(int[] nums) {
        int n = nums.length;

        // loop till second last element
        //because there won't be anything to process when we are on the last element
        for(int sortedIndex= 0; sortedIndex< n-1 ; sortedIndex++){

            int minIndex = sortedIndex;

            // go till n because all the elements will be compared
            for(int i = sortedIndex+1 ; i < n ; i++){
                if(nums[i] < nums[minIndex]){
                    minIndex = i ;
                }

            }

            //if the very first element is the minimum, do not swap
            if( minIndex != sortedIndex){
                int temp = nums[sortedIndex];
                nums[sortedIndex] = nums[minIndex];
                nums[minIndex] = temp;
            }



        }
        return nums;
    }
}

