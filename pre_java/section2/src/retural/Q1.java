package retural;

public class Q1 {
    public int sumTo(int num){
        //TODO..
        if (num == 0){
            return 0;
        }

        return num+(sumTo(num-1));
    }
}
