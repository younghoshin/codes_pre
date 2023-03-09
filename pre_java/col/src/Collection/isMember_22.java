package Collection;

import java.util.*;

public class isMember_22 {
    public boolean isMember(HashMap<String, String> member, String username, String password) {
        //TODO..

//        return  member.containsKey(username) ? member.get(username).equals(password) : false;

        boolean check_member = false;
        Set<Map.Entry<String, String>> set = member.entrySet();
        for(Map.Entry<String, String> check : set){
            if(check.getKey().equals(username)){
                check_member = check.getValue().equals(password);
            }
        }
        return check_member;
    }
}

//        Iterator<Map.Entry<String, String>> iterator = set.iterator();
