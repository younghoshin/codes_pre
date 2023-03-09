package Collection;
import java.util.*;
public class getElementOfListEntry_21 {
    public String getElementOfListEntry(HashMap<String, List<String>> hashMap, String key, int index) {
        //TODO..
        if(index < hashMap.size() || index>0) {
            return null;
        }
            Set<Map.Entry<String, List<String>>> set = hashMap.entrySet();
            List<String> str = new ArrayList<>();
            for (Map.Entry<String, List<String>> check_value : set) {
                if (check_value.getKey().equals(key)) {
                    str = check_value.getValue();
                    return str.get(index);
                }

            }
        return null;


    }
}

// return hashMap.get(key).get(index);
// 위의 리턴문 하나만 있으면 엔트리 맵없이도 리스트에 접근가능
// 해쉬맵의 키에 있는 밸류를 가져옴 그 벨류는 리스트 타입임
// 가져온 리스트를 또 get을 이용해 인덱스 값에 접근함.
