package l2;

public class P1 {
    public static void main(String[] args) {
        int n=3;
        fun(1,n);

    }

    private static void fun(int i, int n) {

        if(i>n)
            return;

        System.out.println("pavan");
        fun(i+1,n);
    }
}
