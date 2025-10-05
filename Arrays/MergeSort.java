package Leetcode365;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {5,2,3,1};
        System.out.println(Arrays.toString(mergeSort(arr, 0 ,arr.length - 1)));
    }

    private static int[] mergeSort(int[] arr, int start, int end) {

        if (start >= end) {
            return new int[]{arr[start]};
        }
        int mid = (end + start) / 2;
        int[] left = mergeSort(arr, start , mid);
        int[] right = mergeSort(arr, mid+1, end);

        return merge(left, right);

    }

    private static int[] merge(int[] left, int[] right) {
        int i = 0; int j = 0;
        int k = 0;
        int[] num = new int[left.length + right.length];

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                num[k++] = left[i];
                i++;
            } else {
                num[k++] = right[j];
                j++;
            }
        }
        while (i < left.length) {
            num[k++] = left[i];
            i++;
        }
        while (j < right.length) {
            num[k++] = right[j];
            j++;
        }

        return num;
    }
}
