package retural;

import java.util.Arrays;

public class Q9 {
    public int[] take(int num, int[] arr){
        // TODO:
        if( num >= arr.length){
            return arr;
        }
        return take(num, Arrays.copyOf(arr, arr.length-1));

    }

}
