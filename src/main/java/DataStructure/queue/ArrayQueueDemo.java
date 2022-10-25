package DataStructure.queue;

import java.util.Scanner;

public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
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
                    arrayQueue.showQueue();
                    break;
                case 'a':
                    System.out.println("请输入一个数");
                    int value = scanner.nextInt();
                    arrayQueue.addQueue(value);
                    break;
                case 'g':
                    try {
                        int res = arrayQueue.getQueue();
                        System.out.printf("取出的数据是%d\n",res);
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try {
                        int res = arrayQueue.headQueue();
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
class ArrayQueue{
    private int maxSize;//表示数组最大容量
    private int front;//表示头指针
    private int rear;//表示尾指针
    private int arr[];//存放数据，模拟数组
    //创建队列构造器
    public ArrayQueue(int arrMaxSize) {
        maxSize=arrMaxSize;
        front=-1;//指向队列头部，是队列头前一个位置
        rear=-1;//指向队列尾部，就是队列最后一个数据
       arr=new int[maxSize];
    }
    //判断队列是否满
    public boolean isFull(){
        return rear==maxSize-1;
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
        rear++;//rear后移
        arr[rear]=n;
    }
    //获取队列数据
    public int getQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列空，不能取数据");
        }
        front++;
        return arr[front];
    }
    //显示队列数据
    public void showQueue(){
        if (isEmpty()){
            System.out.println("队列空，没有数据");
            return;
        }
        for (int i=0; i<arr.length; i++){
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }
    }
    //显示头数据
    public int headQueue(){
        if (isEmpty()){
            throw new RuntimeException("没有数据");
        }
        return arr[front+1];
    }
}
