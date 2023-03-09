package Stream;
import java.util.*;
import java.util.stream.Stream;

public class Q7 {
    public String[] filterName(List<String> names) {
        //TODO..

        return names.stream()
                .distinct()
                .filter(name -> name.startsWith("김"))
                .sorted()
                .toArray(String[]::new);
    }
}
