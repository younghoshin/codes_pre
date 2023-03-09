package Collection;

import java.util.ArrayList;

public class removeFromNth_08 {
    public String removeFromNth(ArrayList<String> arrayList, int index) {
        //TODO..
        if (arrayList.size() <=index || 0 > index){
            return null;
        }
        String str=arrayList.get(index);
        arrayList.remove(index);
        return str;
    }
}
