package Strings;

import java.util.HashMap;

public class anagramStrings {
    public boolean anagramStrings(String s, String t) {
        //your code goes here

        if( s.length()!= t.length()){
            return false;
        }


        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i< s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) +1);
        }

        for(int i=0; i< t.length(); i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0) -1);
        }

        char [] chArr = s.toCharArray();

        for(char ch: chArr){
            if(map.get(ch) != 0){
                return false;
            }
        }

        return true;
    }
}
