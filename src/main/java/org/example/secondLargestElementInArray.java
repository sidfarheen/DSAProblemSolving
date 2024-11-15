package org.example;

public class secondLargestElementInArray {
    public int getSecondLargest(int[] arr) {

        int largest = -1;
        int second_largest = -1;
        // Code Here
        for(int num:arr){
            if(num > largest){
                second_largest = largest;
                largest = num;

            }
            else{
                if(num < largest && num > second_largest){
                    second_largest = num ;
                }
            }
        }
        return second_largest;
    }
}
