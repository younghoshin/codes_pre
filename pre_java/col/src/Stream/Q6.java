package Stream;
import java.util.*;
import java.util.stream.Collectors;

public class Q6 {
    public String[] makeUniqueNameArray(List<String> names) {
        //TODO..
        return names.stream()
                .distinct()
                .sorted()
                .toArray(String[]::new);

    }
}
