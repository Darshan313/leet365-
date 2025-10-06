package Leetcode365;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2, 0, 1};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortColors(int[] arr) {
        int one = 0, zero = 0, twos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            } else if (arr[i] == 1) {
                one++;
            } else {
                twos++;
            }
        }
        int i = 0;
        while (zero > 0) {
            arr[i++] = 0;
            zero--;
        }
        while (one > 0) {
            arr[i++] = 1;
            one--;
        }
        while (twos > 0) {
            arr[i++] = 2;
            twos--;
        }
    }
}
