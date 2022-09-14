package math;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 64;
        System.out.println("ans = " + checkPowOfTwo(n));
    }

    private static boolean checkPowOfTwo(int n) {
        if (n==0) return false;
        return  (n & (n -1)) == 0;
    }
}
