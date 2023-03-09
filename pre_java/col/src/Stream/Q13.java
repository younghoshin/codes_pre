package Stream;
import java.util.*;
import java.util.stream.*;
public class Q13 {
    public List<String> findPeople(List<String> male, List<String> female, String lastName) {
        //TODO..


//        솔루션 1
//        return Stream.concat(male.stream(),female.stream())
//                .distinct()
//                .filter(name -> name.startsWith(lastName))
//                .sorted()
//                .collect(Collectors.toList());


        Map<Boolean,List<String>> find_people = Stream.concat(male.stream(),female.stream()).
                distinct().
                sorted().
                collect(Collectors.partitioningBy(s -> s.startsWith(lastName)));

        return find_people.get(true);



    }
}
