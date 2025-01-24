package Sorting;

public class BubbleSort {
    int[] bubbleSort(int[] nums) {
        int n = nums.length;
        // Traverse through the array
        for (int i = n - 1; i >= 0; i--) {
            // Track if swaps are made
            boolean didSwap = false;

            for (int j = 0; j <= i - 1; j++) {
                // Swap if next element is smaller
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    didSwap = true;
                }
            }
            /* Break out of loop
            if no swaps done*/
            if (!didSwap) {
                break;
            }
        }

        return nums;
    }
}
