package Stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q1 {
    public int computeSumOfAllElements(List<Integer> list){
        //TODO..
//        IntStream intStream = list.stream().
//                mapToInt(num->num);
//        return  intStream.sum();


            int sum =  list.stream()
                .mapToInt(num -> num)
                .sum();
            return list.isEmpty() ?  0 : sum;

//            return list.stream()
//                    .reduce(0,(a,b)->a+b);

    }
}
