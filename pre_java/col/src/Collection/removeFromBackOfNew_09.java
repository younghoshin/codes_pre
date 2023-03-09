package Collection;

import java.util.ArrayList;

public class removeFromBackOfNew_09 {
    public ArrayList<Integer> removeFromBackOfNew(ArrayList<Integer> arrayList) {
        //TODO..
        if (arrayList.isEmpty()){return null;}
        arrayList.remove(arrayList.size()-1);
        return new ArrayList<Integer>(arrayList);
    }
}

//    ArrayList<Integer> arr =
