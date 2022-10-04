package review.Array;

public class Tools {
    public int fib(int n){
        if(n>=1){
            if(n==1||n==2){
                return 1;
            }
            else {
               return fib(n-1)+fib(n-2);
            }

        }  else {
            System.out.println("输出有误");
            return -1;
        }

    }
}
