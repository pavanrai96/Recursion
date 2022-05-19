package l3;

public class P3_functional_factorial {
    public static void main(String[] args) {
        int n=5;
        int fact =functionalfact(n);
        System.out.println(fact);
    }

    private static int functionalfact(int n) {
        if(n==1)
            return 1;
        return n * functionalfact(n-1);
    }
}
