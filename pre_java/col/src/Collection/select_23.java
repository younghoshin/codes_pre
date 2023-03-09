package Collection;
import java.util.*;
public class select_23 {
    public HashMap<String, Integer> select(String[] arr, HashMap<String, Integer> hashMap) {
        //TODO..
        HashMap<String, Integer> select = new HashMap<>();
        for (String str: arr) {
            if(hashMap.containsKey(str)) {
                select.put(str, hashMap.get(str));
            }
        }
        return select;
    }
}
