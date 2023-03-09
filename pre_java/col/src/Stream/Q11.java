package Stream;
import java.util.*;
import java.util.stream.*;

public class Q11 {
    public List<Integer> makeElementDouble(List<Integer> list) {
        //TODO..
       return list.stream()
                .map(d->d*2)
                .collect(Collectors.toList());
    }
}
