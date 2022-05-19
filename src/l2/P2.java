package l2;
//print 1 to N
public class P2 {
    public static void main(String[] args) {
        int n=3;
        fun(1,n);

    }

    private static void fun(int i, int n) {

        if(i>n)
            return;

        System.out.println(i);
        fun(i+1,n);
    }
}
