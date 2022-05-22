package l6;

import java.util.ArrayList;
import java.util.List;

public class P1_printSubsequences {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        List<Integer> list = new ArrayList<>();
        subsequences(0, list, arr);
    }

    private static void subsequences(int ind, List<Integer> list, int[] arr) {
        if (ind == arr.length) {
            for (int x : list) {
                System.out.print(x);
            }
            if (list.isEmpty())
                System.out.print("{}");
            System.out.println();
            return;
        }

        //take
        list.add(arr[ind]);
        subsequences(ind + 1, list, arr);

        list.remove(new Integer(arr[ind]));
        //not take
        subsequences(ind + 1, list, arr);
    }
}
