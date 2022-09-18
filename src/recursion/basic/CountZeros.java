package recursion.basic;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println("count Zeros (1057080) = " + count(105708));
    }

    static int count(int n){
        return helper(n,0);
    }

    private static int helper(int n, int count) {
        if (n == 0) return count;
        if (n%10 == 0) count++;
        return helper(n/10, count);
    }
}
