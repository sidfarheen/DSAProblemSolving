package Strings;

public class palindromeLogic {

    public boolean palindromeCheck(String s) {
        //your code goes here


        int left = 0, right = s.length() - 1;

        while(left< right){
            if( s.charAt(left) != s.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }

        return true;
    }
}
