package l5;

public class P1_fibboncci {
    public static void main(String[] args) {
        int n =6;
        System.out.println(fibbonacci(n));
    }

    private static int fibbonacci(int n) {
        if(n<=1)
            return n;
        return fibbonacci(n-1)+fibbonacci(n-2);
    }
}
