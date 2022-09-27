package recursion.patterns;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        triangle2(4,0);
        System.out.println();
        System.out.println("==============");
        triangle(4,0);
        int[] arr = {5,2,8,7,9};
        bubbleSort(arr, arr.length-1, 0);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }

    static void triangle(int row, int col) {
        if(row == 0) return;
        if (col < row) {
            System.out.print("*");
            triangle(row, col+1);
        } else {
            System.out.println();
            triangle(row-1, 0);
        }
    }

    static void bubbleSort(int[] arr, int n, int curr) {
        if(n == 0) return;
        if (curr < n) {
            if (arr[curr] > arr[curr+1]) {
                int temp = arr[curr];
                arr[curr] = arr[curr+1];
                arr[curr+1] = temp;
            }
            bubbleSort(arr, n, curr+1);
        } else {
            bubbleSort(arr, n-1, 0);
        }
    }

    static void triangle2(int row, int col) {
        if(row == 0) return;
        if (col < row) {
            triangle2(row, col+1);
            System.out.print("*");
        } else {
            triangle2(row-1, 0);
            System.out.println();
        }
    }
}
