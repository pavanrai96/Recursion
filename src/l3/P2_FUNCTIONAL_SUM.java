package l3;

public class P2_FUNCTIONAL_SUM {
    public static void main(String[] args) {
        int n = 3;
        int sum = functionalSum(n);
        System.out.println(sum);
    }

    private static int functionalSum(int n) {
        if (n == 1)
            return 1;
        return n + functionalSum(n - 1);
    }
}
