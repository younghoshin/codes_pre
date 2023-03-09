package Collection;
import java.util.*;
public class getLastElement_03 {
    public String getLastElement(ArrayList<String> arrayList) {
        //TODO..
        int index = arrayList.size();
        return arrayList.isEmpty() ? null : arrayList.get(index-1);
    }

}
