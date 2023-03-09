package Collection;

import java.util.ArrayList;

public class removeFromFront_07 {
    public Integer removeFromFront(ArrayList<Integer> arrayList) {
        //TODO..
        if(arrayList.isEmpty()) return null;
        int arrs =  arrayList.get(0);
        arrayList.remove(0);
        return arrs;

    }
}
