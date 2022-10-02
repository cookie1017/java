package review;

public class stars {
    public static void main(String[] args) {
        int total = 5;
        for(int i=1; i<=total;i++){//i表示层数
            //在输出*之前，还有输出对应的空格=总层数-当前层
            for (int k=1;k<=total-i;k++) {
                System.out.print(" ");
            }
            //打印每层的*个数
                for (int j = 1; j <= 2 * i - 1; j++) {
                    //当前行的第一个位置是*，最后一个位置也是*，最后一层全是*
                    if (j == 1 || j == 2 * i - 1||i==total) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            System.out.println(" ");
        }
    }

}
