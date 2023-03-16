package retural;

import java.util.Arrays;

public class Q8 {
    public int[] drop(int num, int[] arr){
        // TODO:
        if(num==0 || arr.length == 0){
            return arr;
        }
        // num의 수만큼 재귀함수를 돌면되기 때문에 num이 0일때까지 1을 빼줌
        // 만약 배열길이보다 num의 값이 클경우 arr은 빈배열이 되기때문에 빈배열이 리턴됨
        // 넘의 값을 1을빼준뒤 값으로 주고 배열역시 앞에서 하나의 값을 지운뒤 전달함.
        return drop(num-1, Arrays.copyOfRange(arr, 1, arr.length));
    }
}
