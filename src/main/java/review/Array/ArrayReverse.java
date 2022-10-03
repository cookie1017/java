package review.Array;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66};
        //思路一共要交换3次=arr.length/2    arr[0]和arr[5]交换
        //每次交换时，对应的下标是arr[i]和arr[arr.length-1-i]y
        int temp=0;
        for (int i = 0; i < arr.length/2; i++) {
            temp=arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[i];
            arr[i]=temp;
        }
        System.out.println("==========");
        for (int i = 0; i < arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }

}
