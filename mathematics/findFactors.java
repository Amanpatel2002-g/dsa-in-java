package mathematics;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class findFactors {
    public static void main(String[] args) {
        Set<Integer> st = new TreeSet<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                int d = n / i;
                if (d == i) {
                    st.add(i);
                } else {
                    st.add(i);
                    st.add(d);
                }
            }
        }
        System.out.println(st);

    }
}
