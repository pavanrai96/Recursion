package l1;

public class P2 {
    public static void main(String[] args) {
        int count = 0;
        print(count);
    }

    private static void print(int count) {
        if (count == 3)
            return;
        System.out.println(count);
        count++;
        print(count);
    }
}