package Leetcode365;

public class CheckArrSorted {
    public static void main(String[] args) {

        int arr[] = {2,1,3,4};
        System.out.println(checkIfSortedRotated(arr));
    }

    private static boolean checkIfSortedRotated(int[] arr) {
        int count = 0;
        for (int i = 0;i <= arr.length - 1; i++) {
            if (arr[i] > arr[(i+1) % arr.length]) {
                count++;
            }
        }
        return count <= 1;
    }
    }
