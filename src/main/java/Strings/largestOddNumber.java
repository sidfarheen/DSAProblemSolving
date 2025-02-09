package Strings;

public class largestOddNumber {

    public String largeOddNum(String s) {
        //your code goes here
        int i ;
        int right = -1;
        for (i = s.length() - 1; i >= 0; i--) {
            if( (s.charAt(i) - '0') % 2 == 1){
                right = i;
                break;
            }
        }

        if( right == -1)  return "";

        i= 0;
        while(i <= right && (s.charAt(i) - '0') == 0 ){
            i++;
        }
        return s.substring(i, right+1);
    }
}
