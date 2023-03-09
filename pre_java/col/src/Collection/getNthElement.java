package Collection;

import java.util.ArrayList;

public class getNthElement {
    public Integer getNthElement(ArrayList<Integer> arrayList, int index) {
        //TODO..
        if (arrayList.isEmpty() || arrayList.size()<index){
            return null;
        }
        else{
            return arrayList.get(index);
        }
    }
}
