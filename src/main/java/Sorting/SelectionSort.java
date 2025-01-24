package Sorting;

public class SelectionSort {
    public
    int[] selectionSort(int[] nums) {
        int n = nums.length;

        //Iterate to find the min element
        // (n-1) because last element is not considered as 1st ever
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // to n because all the elements has to be compared
            for (int j = i + 1; j < n; j++) {
                // compare
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            //Swap the min element with 1st element
            if (minIndex != i) {
                int temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }
}
}
