package sorting;

import java.util.Arrays;
// Apply when given numbers range from 1 to N
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,5,2,3,1};
        cyclic(arr);
        System.out.println(" = " + Arrays.toString(arr));
    }

    static void cyclic(int[] arr){
        int i = 0;
        while (i< arr.length) {
            int correctIdx = arr[i]-1;
            if(arr[i] != arr[correctIdx]) {
                int temp = arr[i];
                arr[i] = arr[correctIdx];
                arr[correctIdx] = temp;
            } else {
                i++;
            }
        }
    }
}
