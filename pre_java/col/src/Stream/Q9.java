package Stream;
import java.util.*;

public class Q9 {
    public int findLongestLength(String[] strArr) {
        //TODO..

/*      솔루션 1
        return strArr.length == 0 ? 0 :
                 Arrays.stream(strArr)
                 .mapToInt(String::length)
                 .max()
                 .getAsInt();
 */


        return Arrays.stream(strArr)
                .mapToInt(String::length)
//              .reduce(0,(a, b)-> Math.max(a, b));
                .reduce(0, Math::max);


    }
}
