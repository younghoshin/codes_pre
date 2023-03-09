package Stream;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q8 {
    public Integer findBiggestNumber(int[] arr) {
        //TODO..


       return arr.length==0 ? null :
               Arrays.stream(arr).max().getAsInt();

    }
}
