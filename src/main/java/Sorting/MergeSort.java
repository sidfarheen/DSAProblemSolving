package Sorting;

import java.util.ArrayList;

public class MergeSort {

        public int[] mergeSortFinal(int[] nums) {
            int n = nums.length;

            // Perform Merge sort on the whole array
            mergeSortHelper(nums, 0, n - 1);

            return nums;
        }

        public void mergeSortHelper(int arr[], int low, int high) {
            // Base case: if the array has only one element
            if (low >= high) {
                return;
            }

            // Find the middle index
            int mid = (low + high) / 2;

            // Recursively sort the left half
            mergeSortHelper(arr, low, mid);
            // Recursively sort the right half
            mergeSortHelper(arr, mid + 1, high);
            // Merge the sorted halves
            merge(arr, low, high);
        }

        // Function to merge two sorted halves of the array
        public void merge(int[] arr, int low, int high) {

            // Temporary array to store merged elements
            ArrayList<Integer> temp = new ArrayList<>();

            int mid = (low + high) / 2;
            int left = low;
            int right = mid + 1;

            // Loop until subarrays are exhausted
            while (left <= mid && right <= high) {
                if (arr[left] <= arr[right]) {
                    temp.add(arr[left]);
                    left++;
                } else {
                    temp.add(arr[right]);
                    right++;
                }
            }

            // Adding the remaining elements of left half
            while (left <= mid) {
                temp.add(arr[left]);
                left++;
            }

            // Adding the remaining elements of right half
            while (right <= high) {
                temp.add(arr[right]);
                right++;
            }

            // Transferring the sorted elements to arr
            for (int i = low; i <= high; i++) {
                arr[i] = temp.get(i - low);
            }
        }


}
