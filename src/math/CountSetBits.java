package math;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 45;
        System.out.println("Binary value = " + Integer.toBinaryString(n));
        System.out.println("Total set bits = " + setBits(n));
    }

    private static int setBits(int n) {
        int count = 0;
        /*while (n > 0){
            count++;
            n -= (n & -n);
        }  OR */
        while (n > 0){
            count++;
            n &= (n-1);
        }
        return count;
    }
}
