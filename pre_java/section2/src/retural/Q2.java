package retural;

public class Q2 {
    public boolean isOdd(int num) {
        //TODO..

        if (num < 0 ){
            num = (-num);
        }

         if (num == 0){
            return false;
        }
        else if(num == 1){
            return true;
        }
        return isOdd(num-2);
    }
}
