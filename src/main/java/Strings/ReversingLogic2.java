package Strings;

import java.util.Vector;

public class ReversingLogic2 {

    /* using 2 pointer */
    public void reverseString(Vector<Character> s) {
        int left = 0, right = s.size()-1;

        /* swap left and right */
        while (left < right){
            char temp = s.get(left);
            s.set(left, s.get(right));
            s.set(right, temp );
            left ++;
            right--;
        }
    }
}
