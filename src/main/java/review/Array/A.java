package review.Array;

public class A {
    public static void main(String[] args) {
        int[] arr={26,35,89,566,789};
        int insertNum = 12;
        int index=-1;
        for (int i=0; i<arr.length; i++) {
            if(insertNum<=arr[i]){
                index=i;
                break;
            }
        }
        if(index==-1){
            index= arr.length;
        }
        int[] newarr = new int[arr.length +1];
        for(int i=0,j=0; i<newarr.length; i++){
            if (i!=index){
                newarr[i]=arr[j];
                j++;
            }
            else {
                newarr[i]=insertNum;
            }
        }
        arr=newarr;
        System.out.println("================");
        for (int i=0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
