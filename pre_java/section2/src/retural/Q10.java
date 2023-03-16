package retural;

import java.util.Arrays;

public class Q10 {
    public boolean and(boolean[] arr){
        // TODO:
        if(arr.length == 0){
            return true;
        }
        return arr[0] && and(Arrays.copyOfRange(arr, 1, arr.length));
        //and 연산은 모든 값이 true일때 true이기 때문에 배열 앞의 값을 다땐다음 앤드연산함
    }
}
