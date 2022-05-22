package l7;

import java.util.ArrayList;
import java.util.List;

public class P2_printSubsequences_k_sum_any_one {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int k = 2;
        List<Integer> list = new ArrayList<>();
        subsequences(0, list, arr, k, 0);
    }

    private static boolean subsequences(int ind, List<Integer> list, int[] arr, int k, int sum) {
        if (ind == arr.length) {
            //condition satisfied
            if (k == sum) {
                for (int x : list) {
                    System.out.print(x);
                }
             return true;
            }
            //condition not satisfied
            return false;
        }
        //take
        list.add(arr[ind]);
        sum = sum+arr[ind];
        if(subsequences(ind + 1, list, arr, k, sum))
            return true;

        list.remove(new Integer(arr[ind]));
        sum =sum -arr[ind];
        //not take
        if(subsequences(ind + 1, list, arr, k, sum))
            return true;

        return false;
    }
}
