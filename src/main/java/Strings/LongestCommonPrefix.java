package Strings;

import java.util.Arrays;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] str) {
        //your code goes here

        StringBuilder prefixBuilder = new StringBuilder();


        Arrays.sort(str);


        String first = str[0];
        String last = str[str.length - 1];
        for( int i = 0; i< Math.min(first.length(), last.length()); i++)
        {
            if( first.charAt(i) == last.charAt(i) ){
                prefixBuilder.append(first.charAt(i));
            }
            else{
                break;
            }

        }

        return prefixBuilder.toString();



    }
}
