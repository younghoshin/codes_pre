package Data_structure;
import java.util.*;
public class Q1_Stack {
    private ArrayList<Integer> listStack = new ArrayList<Integer>();

    public void push(Integer data) {
       listStack.add(data);
    }

    public Integer pop() {
        if(listStack.size()==0) {
            return null;
        }else {
            return listStack.remove(listStack.size()-1);
        }
    }

    public int size() {
        return listStack.size();
    }

    public Integer peek() {
        if(listStack.size()==0) {
            return null;
        }else {
            return listStack.get(listStack.size()-1);
        }
    }

    public String show() {
        return listStack.toString();
    }
    public void clear() { listStack.clear(); }
}
