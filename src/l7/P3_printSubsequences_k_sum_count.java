package l7;

public class P3_printSubsequences_k_sum_count {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int k = 2;
        int count = subsequences(0, arr, k, 0);
        System.out.println(count  );
    }

    private static int subsequences(int ind, int[] arr, int k, int sum) {
        //strictly when arr has only positive elements
        if(sum>k)return 0;
        if (ind == arr.length) {
            //condition satisfied
            if (k == sum) {
                return 1;
            }
            //condition not satisfied
            return 0;
        }
        //take
        sum = sum + arr[ind];
        int l = subsequences(ind + 1, arr, k, sum);

        sum = sum - arr[ind];
        //not take
        int r = subsequences(ind + 1, arr, k, sum);
        return l + r;
    }
}
