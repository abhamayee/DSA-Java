package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] ans = mergeSort(arr);
        mergeSortInPlace(arr,0, arr.length);
        System.out.println("mergeSort = " + Arrays.toString(ans));
        System.out.println("mergeSortInPlace = " + Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length==1) return arr;

        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length+ second.length];

        int fiCounter = 0;
        int seCounter = 0;
        int mixCounter = 0;

        while (fiCounter<first.length && seCounter<second.length){
            if (first[fiCounter]<second[seCounter]){
                mix[mixCounter] = first[fiCounter];
                fiCounter++;
            } else {
                mix[mixCounter] = second[seCounter];
                seCounter++;
            }
            mixCounter++;
        }

        // It may be possible that one of the array is not complete
        // So copy the remaining elements
        while (fiCounter<first.length){
            mix[mixCounter] = first[fiCounter];
            fiCounter++;
            mixCounter++;
        }

        while (seCounter<second.length){
            mix[mixCounter] = second[seCounter];
            seCounter++;
            mixCounter++;
        }

        return mix;
    }

    static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e-s == 1) return;

        int mid = (s + e)/2;
        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = mid;
        int mixCounter = 0;

        while (i < mid && j < e){
            if (arr[i]<arr[j]){
                mix[mixCounter] = arr[i];
                i++;
            } else {
                mix[mixCounter] = arr[j];
                j++;
            }
            mixCounter++;
        }

        // It may be possible that one of the array is not complete
        // So copy the remaining elements
        while (i<mid){
            mix[mixCounter] = arr[i];
            i++;
            mixCounter++;
        }

        while (j<e){
            mix[mixCounter] = arr[j];
            j++;
            mixCounter++;
        }

        for (int k = 0; k < mix.length; k++) {
            arr[s+k] = mix[k];
        }
    }
}
