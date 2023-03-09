package Stream;
import java.util.*;
import java.util.stream.*;

public class Q10 {
    public List<String> mergeTwoStream(List<String> list1, List<String> list2) {
        //TODO..
        return Stream.concat(list1.stream(),list2.stream())
                .collect(Collectors.toList());

    }
}
