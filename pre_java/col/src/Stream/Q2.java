package Stream;
import java.util.*;

public class Q2 {
    public double computeAverageOfNumbers(List<Integer> list) {
        //TODO..
/* 솔루션 1
      if (list.size() == 0) return 0;
      return list.stream()
               .mapToDouble(m ->m)
               .average().getAsDouble();
*/
        return list.stream()
                .mapToInt(el -> el)
                .average()
                .orElse(0);

    }
}
