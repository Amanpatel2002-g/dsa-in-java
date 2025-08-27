Here’s the **markdown version** of your Java code along with **explanatory notes**:

---

# Prime Factorization in Java

The following code finds the **prime factors** of a given number (`n = 45` in this case).

Here’s the **fixed prime factorization code**:

```java
package mathematics;

public class FindPrimeFactors {
    public static void main(String[] args) {
        int n = 45;

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }

        // If n is still greater than 1, it's a prime number
        if (n > 1) {
            System.out.println(n);
        }
    }
}
```

---

## 📌 Output for `n = 45`

```
3
3
5
```

This is correct because
**45 = 3 × 3 × 5**

---

Do you want me to also make a **step-by-step dry run (tracing)** of how this works for `n = 45` in markdown?
