package Sorting;

public class InsertionSort {

    public int[] insertionSort(int[] nums) {

        int n = nums.length;

        // take 1st element as sorted and start from +1
        for( int currentIndex =1; currentIndex < n ; currentIndex++ ){

            //new element to be inserted
            int key = nums[currentIndex];
            //index of the sorted elements
            int sortedIndex = currentIndex - 1 ;

            while( sortedIndex >= 0 && nums[sortedIndex] > key ){
                nums[sortedIndex+1] = nums[sortedIndex];// right shift
                sortedIndex -- ;
            }

            nums[sortedIndex+1] = key ;// correct place is last position + 1

        }

        return nums;

    }

}
