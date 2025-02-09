package Strings;

public class IsomorphicString {

    public boolean isomorphicString(String s, String t) {
        //your code goes here

        int m1[] = new int[256];
        int m2[] = new int[256];

        for(int i = 0; i< s.length() ; i++){
            if(m1[s.charAt(i)] != m2[t.charAt(i)]){
                return false;
            }

            m1[s.charAt(i)] = i+1;
            m2[t.charAt(i)] = i+1;
        }

        return true;
    }
}
