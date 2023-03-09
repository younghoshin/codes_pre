package Collection;

import java.util.ArrayList;

public class addNth_05 {
    public ArrayList<Integer> addNth(ArrayList<Integer> arrayList, int index, int element) {
        //TODO..

        if(arrayList.size()<=index) return null;
        arrayList.add(index,element);
        return arrayList;
    }
}
