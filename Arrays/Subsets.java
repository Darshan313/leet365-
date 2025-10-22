package AdvArr;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2};
        System.out.println(findAllSubsets(arr));
    }

    private static List<List<Integer>> findAllSubsets(int[] arr) {
        List<List<Integer>> lst = new ArrayList<>();
        for (int i = 0; i < (1 << arr.length); i++) {

            lst.add(filter(i, arr));

        }
        return lst;

    }

    private static List<Integer> filter(int no, int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int j = arr.length - 1;
        while (no > 0) {

            int lastBit = no & 1;
            if (lastBit == 1) {
                arrayList.add(arr[j]);
            }
            j--;
            no = no >> 1;
        }
        return arrayList;
    }
}
