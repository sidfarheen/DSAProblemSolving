package Strings;

public class rotateStringLogic2 {

    public boolean rotateString(String s, String goal) {
        // your code goes here

        if (s.length() != goal.length()) {
            return false;
        }

        String str = s + s;

        return str.contains(goal);
    }
}
