package retural;

public class Q4 {
    public int fibonacci(int num){
        //TODO..
        if(num <= 1){
            return num;
        }
        return fibonacci(num-1) + fibonacci(num-2);


    }

}
