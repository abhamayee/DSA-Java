package binarysearch;
/*
* Find the smallest element which is greater than or equal to target
*/
public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,5,8,10,20,50,66,70};
        int target = 49;
        System.out.println("findCeiling at index = " + findCeiling(arr, target));
    }
    static int findCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
