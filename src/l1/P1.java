package l1;

public class P1 {
    public static void main(String[] args) {
        System.out.println("p1");
        print(1);
    }

    private static void print(int i) {
        System.out.println(i);
        i++;
        print(i);
    }

}
