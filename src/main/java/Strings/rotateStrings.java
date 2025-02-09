package Strings;

public class rotateStrings {

    public boolean rotateString(String s, String goal) {
        //your code goes here
        if (s.length() != goal.length()){
           return false;
        }

        for(int i = 0; i < s.length(); i++){
            String str = s.substring(i) + s.substring(0,i);
            if( str.equals(goal)){
                return true;
            }
        }

        return false;

    }
}
