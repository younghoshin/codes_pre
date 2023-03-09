package Stream;
import java.util.*;
import java.util.stream.Collectors;

public class Q12 {
    public boolean isHot(int[] temperature) {
        //TODO..


     return temperature != null && temperature.length == 7
             && Arrays.stream(temperature)
             .filter(m -> m >= 30)
             .count() >= 3;


    }
}
