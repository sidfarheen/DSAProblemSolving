package Strings;

import java.util.Vector;

public class ReversingLogic3 {

    /* using char array */
    public void reverseString(String s) {
            char[] ch = new char[s.length()];
            int n = s.length() - 1;
            for (int i = 0; i< s.length(); i++){
                ch[i] = s.charAt(n - i);
            }

            String rev = new String(ch);
    }
}
