package review.Array;

public class RecursionExercise {
    public static void main(String[] args) {
    Tools tools = new Tools();
        System.out.println(tools.fib(7));

        int day=1;
        int peachNum=tools.peach(day);
        if (peachNum!=-1){
            System.out.println("第"+day+"天有"+peachNum+"个桃子");
        }
    }

}

