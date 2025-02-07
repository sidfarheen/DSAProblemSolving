package Strings;

import java.util.Vector;

public class ReversingLogic4 {

    /* using string builder */
    public void reverseString(String s) {

        StringBuilder sb = new StringBuilder(s).reverse();
        String rev = sb.toString();
    }

}
