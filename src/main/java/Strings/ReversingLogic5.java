package Strings;

public class ReversingLogic5 {

    /* using two pointers */
    public void reverseString(String s) {
        int left = 0, right = s.length() - 1;
        char[]  arr = s.toCharArray();

        while( left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right ] = temp;
            left ++ ;
            right -- ;
        }

        String str = new String(arr);
    }

}
