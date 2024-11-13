package org.example;

public class palindromeNumber {
    public boolean isPalindrome(int x) {
        int old_number = x;
        if( x < 0) {
            return false;
        }
        int new_num = 0 ;


        while (x  != 0){
            int rem = x % 10 ;
            x = x / 10;
            new_num = new_num * 10 + rem ;
        }

        return new_num == old_number;
    }
}
