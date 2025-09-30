package Leetcode365;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/description/
public class two_sum {
    public static void main(String[] args) {
        int[] arr = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    private static int[] twoSum(int[] arr, int target) {


        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i< arr.length;i++) {
            int sub = target - arr[i];
            if (map.containsKey(sub)) {
                return new int[]{i, map.get(sub)};
            }
            map.put(arr[i], i);

        }
        return new int[]{-1,-1};
    }
}
