package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arrayToArrayList_10 {
    public List<String> arrayToArrayList(String[] arr) {
        //TODO..
//        if (arr == null){return  null;}
        ArrayList<String> arrs =new ArrayList<>();
        Collections.addAll(arrs, arr);
        return arr.length == 0 ? null : arrs;


    }
}
