package Sorting;

public class QuickSort {
    public int[] quick(int[] nums) {
        int n = nums.length;

        quickSortHelper(nums, 0, n - 1);

        return nums;
    }

    public void quickSortHelper(int[] arr, int low, int high) {
   /*  Base case: If the array has one or no
            elements, it's already sorted  */
        if (low < high) {
            // Get the partition index
            int pIndex = partition(arr, low, high);
            // Sort the left subarray
            quickSortHelper(arr, low, pIndex - 1);
            // Sort the right subarray
            quickSortHelper(arr, pIndex + 1, high);
        }
    }

    public int partition(int[] arr, int low, int high) {

        // Choosing the first element as pivot
        int pivot = arr[low];

        // Starting index for left subarray
        int i = low;
        // Starting index for right subarray
        int j = high;

   /*  Move i to the right until we find an
                element greater than the pivot  */
        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
  /*  Move j to the left until we find an
                element smaller than the pivot  */
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }

 /*  Swap elements at i and j if i is still
                less than j  */
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Pivot placed in correct position
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

}
