package mathematics;

public class FindPrimeFactors{
    public static void main(String[] args) {
        int n = 45;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }
        if (n > 0) {
            System.out.println(n);
        }
    }
}
