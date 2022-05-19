package l2;
//print N to 1
public class P3 {
    public static void main(String[] args) {
        int n = 3;
        fun(3, n);

    }

    private static void fun(int i, int n) {

        if (i < 1)
            return;
        System.out.println(i);
        fun(i - 1, n);
    }
}
