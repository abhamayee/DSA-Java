package recursion.basic;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("reverse(1548) = " + reverse(1548));
        System.out.println("isPalindrome(12321) = " + isPalindrome(12321));
    }

    static int reverse(int n) {
        int digits = (int) Math.log10(n)+1;
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if (n %10 == n) return n;
        int rm = n%10;
        return rm * (int)Math.pow(10, digits-1) + helper(n/10, digits-1);
    }
    
    static boolean isPalindrome(int n){
        return n == reverse(n);
    }
}
