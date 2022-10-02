package review;

import java.util.Scanner;

public class BreakExercise {
    public static void main(String[] args) {
        //实现登录验证，有3次机会，如果用户名为“丁真”，密码为“666”提示登录成功
        //否则提示还有几次机会，使用forbreak完成
        //思路：1.创建scanner对象接收输入
        //2.定义 string name；string password；保存用户名和密码
        //3.最多循环3次，如果满足条件提前退出
        //4.int chance记录还有几次机会
        Scanner myscanner = new Scanner(System.in);
        String name = "";
        String password = "";

        int chance =3;
        for (int i = 1; i <=3;i++){
            System.out.println("请输入用户名");
            name=myscanner.next();
            System.out.println("请输入密码");
            password=myscanner.next();
            //比较输入的名字和密码是否正确
            //补充说明字符串的内容    比较  使用的方法equals
            //name.equals("丁真")&&password.equals("666")
            //"丁真".equals(name)&&"666".equals(password)推荐，可避免空指针异常
            if ("丁真".equals(name)&&"666".equals(password)){
                System.out.println("登录成功");
                break;
            }
            chance--;
            System.out.println("你还有"+chance+"次登录机会");
        }

    }


}
