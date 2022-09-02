package binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,5,8,10,20,50,66,70};
        int target = 66;
        System.out.println("target found at index = " + search(arr, target));
    }

    static int search(int[] arr, int target) {
        int start=0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(target<arr[mid]) {
                end = mid - 1;
            } else if (target>arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
