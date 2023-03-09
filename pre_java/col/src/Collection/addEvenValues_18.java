package Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.*;


public class addEvenValues_18 {
    public int addOddValues(HashMap<Character, Integer> hashMap) {
        //TODO..
        Set<Character> addmap = hashMap.keySet();
        Iterator<Character> iterable = addmap.iterator();

/*      Collection<Integer> values = hashMap.values();
        Iterator<Integer> iterator = values.iterator();
 */



        int addValue = 0;

        while (iterable.hasNext()){
            char key = iterable.next();
            int check = hashMap.get(key);
            if (check%2==0){
                addValue += check;
            }
        }
        return addValue;


    }
}
