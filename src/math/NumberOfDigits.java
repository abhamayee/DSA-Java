package math;

public class NumberOfDigits {
    public static void main(String[] args) {
        int n = 1526;
        int base = 10;
        int ans = (int)(Math.log(n)/Math.log(base))+1;
        System.out.println("Number of digits = " + ans);
    }
}
