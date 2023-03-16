package retural;

import java.util.Arrays;

public class Q6 {
    public int arrProduct(int[] arr){
        // TODO:
        if(arr.length == 0){
            return 1;
        }
        int head = arr[0];
        int[] tail = Arrays.copyOfRange(arr, 1, arr.length);
        return head * arrProduct(tail);
    }

}

