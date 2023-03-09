package Collection;

import java.util.ArrayList;

public class modifyNthElement_06 {
    public ArrayList<String> modifyNthElement(ArrayList<String> arrayList, int index, String str) {
        //TODO..
        if(arrayList.size() <= index || index<0) return null;
        arrayList.set(index,str);
        return arrayList;
//      return arrayList.size() <=index || 0>index ? null : arrayList;
    }
}
