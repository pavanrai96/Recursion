package l3;

public class P4_parametrised_factorial {
    public static void main(String[] args) {
        int n =5;
        parametrisedFact(n,1);
    }

    private static void parametrisedFact(int i, int fact) {
        if(i==1)
        {
            System.out.println(fact);
            return;
        }
        parametrisedFact(i-1,fact*i);
    }
}
