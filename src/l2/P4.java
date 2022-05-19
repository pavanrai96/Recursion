package l2;
//print 1 to N using backtracting
public class P4 {
    public static void main(String[] args) {
        int n=3;
        fun(n,n);

    }

    private static void fun(int i, int n) {

        if(i<1)
            return;
        fun(i-1,n);
        System.out.println(i);
    }
}
