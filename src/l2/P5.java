package l2;
//print N to 1 using backtracting
public class P5 {
    public static void main(String[] args) {
        int n=3;
        fun(1,n);

    }

    private static void fun(int i, int n) {

        if(i>n)
            return;
        fun(i+1,n);
        System.out.println(i);
    }
}
