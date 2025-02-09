package Strings;

public class anagramArrays {
    public boolean anagramStrings(String s, String t) {
        //your code goes here

        int count[] = new int[26];

        for(int i = 0; i< s.length(); i++){
            count[s.charAt(i) - 'a']  ++;
        }


        for(int i = 0; i< t.length(); i++){
            count[t.charAt(i) - 'a']  --;
        }

        for(int c : count){
            if(c != 0){
                return false;
            }
        }
        return true;
    }

}
