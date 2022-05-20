package l4;

public class P2_palindrome {
    public static void main(String[] args) {
        String str = "madsm";
      boolean result =  palindrome(str,0);
      System.out.println(result);


    }
    // time -> n/2
    //space -> n/2

    private static boolean palindrome(String str, int i) {
        if(i>=str.length()/2)
            return true;
        if(str.charAt(i)!=str.charAt(str.length()-i-1))
        return false;
       return palindrome(str,i+1);
    }
}
