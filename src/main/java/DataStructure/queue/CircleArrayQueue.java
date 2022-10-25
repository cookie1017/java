package DataStructure.queue;

import java.util.Scanner;

public class CircleArrayQueue {
    public static void main(String[] args) {
        CircleArray circleArray = new CircleArray(4);
        char key =' ';//接收用户输入
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop){//输出一个菜单
            System.out.println("s(show)显示数据");
            System.out.println("e(exit)退出");
            System.out.println("a(add)添加数据");
            System.out.println("g(get)取出数据");
            System.out.println("h(head)队列头数据");
            key=scanner.next().charAt(0);//接收一个字符
            switch(key){
                case 's':
                    circleArray.showQueue();
                    break;
                case 'a':
                    System.out.println("请输入一个数");
                    int value = scanner.nextInt();
                    circleArray.addQueue(value);
                    break;
                case 'g':
                    try {
                        int res = circleArray.getQueue();
                        System.out.printf("取出的数据是%d\n",res);
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try {
                        int res = circleArray.headQueue();
                        System.out.printf("队列头的数据是%d\n",res);
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    scanner.close();
                    loop=false;
                    break;
                default:
                    break;
            }

        }
        System.out.println("程序退出");
    }
}
class CircleArray{
    private int maxSize;//表示数组最大容量
    private int front;//表示头指针,指向队列第一个元素，初始值0
    private int rear;//表示尾指针，指向队列最后一个元素的后一个位置，初始值0
    private int arr[];//存放数据，模拟数组
    public CircleArray(int arrMaxSize){
        maxSize=arrMaxSize;
        front=0;
        rear=0;
        arr= new int[maxSize];
    }
    //判断队列是否满
    public boolean isFull(){
        return (rear+1)%maxSize==front;
    }
    //判断队列是否为空
    public boolean isEmpty(){
        return rear==front;
    }
    //添加数据
    public void addQueue(int n){
        //判断队列是否是满
        if (isFull()){
            System.out.println("队列已满");
            return;
        }
        arr[rear]=n;
        rear=(rear+1)%maxSize;//rear后移
    }
    //获取队列数据
    public int getQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列空，不能取数据");
        }
        //1.先把front保存在一个临时变量
        //2.将front后移，考虑取模
        //3.将临时变量返回
        int value = arr[front];
        front=(front+1)%maxSize;
        return value;
    }
    //显示队列数据
    public void showQueue(){
        if (isEmpty()){
            System.out.println("队列空，没有数据");
            return;
        }
        for (int i=front; i<front+size(); i++){
            System.out.printf("arr[%d]=%d\n",i%maxSize,arr[i%maxSize]);
        }
    }
    //求出当前队列有效数据的个数
    public int size(){
        return (rear+maxSize-front)%maxSize;
    }
    //显示头数据
    public int headQueue(){
        if (isEmpty()){
            throw new RuntimeException("没有数据");
        }
        return arr[front];
    }
}