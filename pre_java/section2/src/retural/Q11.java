package retural;

import java.util.Arrays;

public class Q11 {
    public boolean or(boolean[] arr){
        // TODO:
        if(arr.length == 0){
            return false;
        }
        return arr[0] || or(Arrays.copyOfRange(arr, 1, arr.length));
        //or연산은 하나라도 true이면 true 이기때문에 배열의 앞을 모두 때서 or연산함
    }

}

/*
* ex.)
* 만약 arr의 길이가 3이고 배열의 값이 {false,false,false} 라면
*
*        false     false     false
* return arr[0] && arr[0] && arr[0] && false;
*          2         1         0         0
* */
