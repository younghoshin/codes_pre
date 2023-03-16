package retural;

import java.util.Arrays;

public class Q5 {
    public int arrSum(int[] arr){
        //TODO..
        if(arr.length == 0){
            return 0;
        }
        int head = arr[0];
        int[] tail = Arrays.copyOfRange(arr, 1, arr.length);
        return head + arrSum(tail);
    }
}
