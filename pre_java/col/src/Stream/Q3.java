package Stream;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Q3 {
    public List<Integer> filterOddNumbers(List<Integer> list){
        //TODO..
        return list.stream()
                .filter( f -> f%2 ==0 )
                .collect(Collectors.toList());
    }
}
