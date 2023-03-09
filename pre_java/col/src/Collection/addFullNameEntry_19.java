package Collection;

import java.util.HashMap;

public class addFullNameEntry_19 {
    public HashMap<String, String> addFullNameEntry(HashMap<String, String> hashMap) {
        //TODO..
        String str= hashMap.get("firstName") + hashMap.get("lastName");
        hashMap.put("fullName",str);
        return hashMap;


    }
}
