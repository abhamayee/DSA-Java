package recursion.basic;

public class DigitsSum {
    public static void main(String[] args) {
        System.out.println("sumOfDigits(1234) = " + sumOfDigits(1234));
    }

    static int sumOfDigits(int n) {
        if (n==0) return 0;
        return (n%10) + sumOfDigits(n/10);
    }
}
