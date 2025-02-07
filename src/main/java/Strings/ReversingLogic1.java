package Strings;

import java.util.Stack;
import java.util.Vector;

public class ReversingLogic1 {

    /* Reversing using stack*/
    public void reverseString(Vector<Character> s) {
        Stack<Character> stack = new Stack<>();

        //first push
        for (int i = 0; i < s.size() ; i++){
            stack.push(s.get(i));
        }

        //then pop
        for (int i = 0; i < s.size() ; i++){
            s.set(i, stack.pop());
        }


    }
}
