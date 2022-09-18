package recursion.basic;

import java.util.ArrayList;
import java.util.List;

public class FindElements {
    public static void main(String[] args) {
        int[] arr = {3,5,1,8,9,44,8};
        System.out.println("isPresent(arr, 44, 0) = " + isPresent(arr, 44, 0));
        List<Integer> list = new ArrayList<>();
        findAllIndex(arr, 8, 0, list);
        System.out.println(list);
        List list2 = findAllIndex2(arr,8, 0);
        System.out.println("list2 = " + list2);
    }

    static boolean isPresent(int[] arr, int target, int index) {
        if (index == arr.length) return false;
        return (arr[index] == target) || isPresent(arr, target, index+1);
    }

    static List<Integer> findAllIndex(int[] arr, int target, int index, List<Integer> list) {
        if (index == arr.length) return list;
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);
    }

    static List<Integer> findAllIndex2(int[] arr, int target, int index) {
        List<Integer> list = new ArrayList<>();
        if (index == arr.length) return list;
        if (arr[index] == target) {
            list.add(index);
        }
        List<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
