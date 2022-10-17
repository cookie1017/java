package review.debug;

import java.util.Arrays;

public class DeBug03 {
    public static void main(String[] args) {
        int arr[]={100,654,-9546,546};
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
