package Data_structure;
import java.util.*;
public class Q3 {
    public ArrayList<Stack> browserStack(String[] actions, String start) {
        Stack<String> prevStack = new Stack<>();
        Stack<String> nextStack = new Stack<>();
        Stack<String> current = new Stack<>();
        ArrayList<Stack> result = new ArrayList<>();
        // TODO:

        current.add(start);

        for (String el: actions) {
            if(el.equals("-1") && !prevStack.isEmpty()){
                nextStack.add(current.pop());
                current.add(prevStack.pop());
            }
            else if(el.equals("1") && !nextStack.isEmpty()){
                prevStack.add(current.pop());
                current.add(nextStack.pop());
            }
            else if((el.equals("-1") && prevStack.isEmpty()) ||(el.equals("1") && nextStack.isEmpty()) ){ }
            else{
                prevStack.add(current.pop());
                current.add(el);
                nextStack.clear();
            }
        }
        result.add(prevStack);
        result.add(current);
        result.add(nextStack);

        return result;



    }
}
