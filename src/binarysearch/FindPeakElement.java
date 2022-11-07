package binarysearch;
/*
* https://leetcode.com/problems/find-peak-element/description/
 Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2,
 or index number 5 where the peak element is 6.*/
public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr = {2,5,8,10,20,50,80,70};
        System.out.println("target found at index = " + findPeakElement(arr));
    }

    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start < end) {
            int mid = start + (end-start)/2;
            if(nums[mid] > nums[mid+1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
