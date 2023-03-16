package retural;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q12 {

    public int[] reverseArr(int[] arr){
        // 만약 배열이 {1,2,3}이면
        // TODO:

        if(arr.length == 0){
            return new int[]{};
        }
        int arr_tail = arr[arr.length-1];
        // 마지막 요소를 담기위한 배열
        int[] revsersArr ={arr_tail};

        //배열의 길이를 줄여 마지막 재귀호출시 빈배열을 인자로 가지게 됨

        //빈 배열이 올경우 빈배열의 값과 제일 처음의arr배열의
        // 요소가(재귀함수로 인해 배열을 잘라냈기 때문에 빈배열 호출이후에 만나는 재귀함수에는 재귀호출전 처음arr[0]의 값이 마지막 인자로 저장되어있기때문)
        // 합쳐져서 리턴으로 반환됨
        int[] removeArr= reverseArr(Arrays.copyOfRange(arr,0,arr.length-1));
        //반환된 마지막 arr요소와 이전에 호출된 마지막 배열값인 revserArr의 값을 더하여 리턴함
        //배열의 길이기 2인 배열을 리턴받고 이 값을 다시 이전의 호출된 배열의 값과 다시더하는 행위를 반복함


        //revsersArr같은 경우 마지막 배열의 값 하나만을 저장하기 때문에 concatArr은 removeArr길이의 +1만 해주면된다.
        int[] concatArr =new int[removeArr.length+1];

        // concatArr에는 마지막 배열요소를 먼저 넣은뒤 그다음 재귀호출로 받은 배열을 삽입해주면 거꾸로된 함수가 저장된다.
        System.arraycopy(revsersArr,0,concatArr,0,revsersArr.length);
        System.arraycopy(removeArr,0,concatArr,revsersArr.length,removeArr.length);

        //이후 합허진 배열을 리턴하여 재귀 호출한 배열의 값에 인자를 전달해주게 된다.
        return concatArr;

    }

}
