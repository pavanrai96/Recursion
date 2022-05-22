package l7;

import java.util.ArrayList;
import java.util.List;
// printing all the subsequences whose sum is k
public class P1_printSubsequences_k_sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int k = 2;
        List<Integer> list = new ArrayList<>();
        subsequences(0, list, arr, k, 0);
    }

    private static void subsequences(int ind, List<Integer> list, int[] arr, int k, int sum) {
        if (ind == arr.length) {
            if (k == sum) {
                for (int x : list) {
                    System.out.print(x);
                }
                System.out.println();
            }
            return;
        }
        //take
        list.add(arr[ind]);
        sum = sum+arr[ind];
        subsequences(ind + 1, list, arr, k, sum);

        list.remove(new Integer(arr[ind]));
        sum =sum -arr[ind];
        //not take
        subsequences(ind + 1, list, arr, k, sum);
    }
}
