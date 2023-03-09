package Collection;
import java.util.*;
public class countAllCharacters_24 {
    public HashMap<Character, Integer> countAllCharacter(String str) {
        //TODO..
//      if (str.isEmpty()) return null;

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i<str.length(); i++){
            if (hashMap.containsKey(str.charAt(i))) {
                hashMap.put(str.charAt(i),hashMap.get(str.charAt(i))+1);
            }
            else hashMap.put(str.charAt(i),1);
        }

        return str.isEmpty() ? null : hashMap;
    }
}
