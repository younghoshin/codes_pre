package Stream;



import java.util.*;
import java.util.stream.Collectors;

public class Q4 {
    public long computeCountOfFemaleMember(List<Member> members) {
        //구현된 Member 클래스의 getName(), getGender() 메소드로 해당 Member 클래스의 name, gender를 확인할 수 있습니다.
        //TODO..

        // return members.stream()
        //             .filter( gender -> gender.getGender() == "Female")
        //             .collect(Collectors.toList())
        //             .size();


        return members.stream()
                .filter(gender -> gender.getGender().equals("Female"))
                .count();
                

    }

    // 아래 코드는 변경하지 마세요.
    static class Member {
        String name;
        String gender;

        public Member(String name, String gender) {
            this.name = name;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }
    }
}
