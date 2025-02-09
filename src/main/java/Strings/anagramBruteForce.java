package Strings;

import java.util.Arrays;

public class anagramBruteForce {

    public boolean anagramStrings(String s, String t) {
        //your code goes here

        if( s.length()!= t.length()){
            return false;
        }

        char[] c1 = s.toCharArray();
        char[] c2  = t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return  Arrays.equals( c1, c2);
    }
}
