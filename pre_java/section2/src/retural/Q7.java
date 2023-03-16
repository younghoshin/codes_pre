package retural;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q7 {
    public int arrLength(int[] arr){
        // TODO:
        if(arr.length == 0){
            return 0;
        }
        return  1+arrLength(Arrays.copyOfRange(arr,1,arr.length));


    }
}
