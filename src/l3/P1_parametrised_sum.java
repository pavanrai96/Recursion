package l3;

public class P1_parametrised_sum {

    public static void main(String[] args) {
       int n =3;
       parametrisedSum(n,0);
    }

    private static void parametrisedSum(int i, int sum) {
        if(i<1)
        {
            System.out.println(sum);
            return;
        }
        parametrisedSum(i-1,sum+i);
    }
}
