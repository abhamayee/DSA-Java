package math;

public class EvenOdd {
    public static void main(String[] args) {
        int n = 60;
        System.out.println("isOdd " +n+" = " + isOdd(n));
    }

    static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
