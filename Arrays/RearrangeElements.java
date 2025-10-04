package Leetcode365;

import java.util.Arrays;

public class RearrangeElements {
    public static void main(String[] args) {

        int[] arr = {-1,1};
        System.out.println(Arrays.toString(rearrangeEle(arr)));
    }

    private static int[] rearrangeEle(int[] arr) {
        int[] positive = new int[arr.length / 2];
        int[] negative = new int[arr.length / 2];
        int l = 0;
        int h = 0;
        int k = 0;

        while (l < arr.length && h < arr.length) {
            if (arr[l] > 0) {
                positive[k++] = arr[l];
            } else {
                negative[h++] = arr[l];
            }
            l++;
        }


        return mergeArr(positive, negative);

    }

    private static int[] mergeArr(int[] pos, int[] neg) {
        int i= 0,j = 0;
        int[] num = new int[pos.length + neg.length];
        for (int k = 0;k< num.length; k++) {
            if (k%2==0) {
                num[k] = pos[i++];
            } else {
                num[k] = neg[j++];
            }
        }
        return num;
    }
}
