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

    public int peach(int day){
        if(day==10){
            return 1;
        }
        else if (day>=1&&day<=9){
            return (peach(day+1)+1)*2;
        }
        else {
            System.out.println("day在1-10");
        }
        return -1;
    }
}
