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



Got it 👍
Here’s the **markdown version** of your `findFactors` program with **notes and corrections**:

---

# Find All Factors of a Number in Java

The following code finds **all factors** of a given number `n` using a **`TreeSet`** (to keep them sorted).

```java
import java.util.*;

public class findFactors {
    public static void main(String[] args) {
        Set<Integer> st = new TreeSet<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // Read input number
        sc.close();

        // Loop till sqrt(n)
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                int d = n / i;

                // If both divisors are the same (perfect square case), add once
                if (d == i) {
                    st.add(i);
                } else {
                    st.add(i);  // smaller factor
                    st.add(d);  // corresponding larger factor
                }
            }
        }

        System.out.println(st);  // Prints factors in ascending order
    }
}
```

---

## 🔎 Notes on the Code

1. **Use of `TreeSet`**

   * A `TreeSet` is used to store factors because:

     * It automatically removes duplicates.
     * It keeps numbers sorted in ascending order.

2. **Input Handling**

   * `Scanner` is used to take integer input `n`.

3. **Loop till √n**

   * The loop runs `i * i <= n`.
   * This is efficient because every factor `i` has a complementary factor `d = n / i`.
   * Thus, we only need to check up to √n.

4. **Perfect Square Case**

   * If `i == d` (like for `n = 36`, where `i = 6` and `d = 6`), we add it only once.

5. **Output**

   * The final set of factors is printed in sorted order.

---

## ✅ Example Run

**Input:**

```
36
```

**Output:**

```
[1, 2, 3, 4, 6, 9, 12, 18, 36]
```

---

## ⚡ Improvements

* Instead of printing the whole set, you can print them line by line:

```java
for (int factor : st) {
    System.out.println(factor);
}
```

* This makes the output clearer when factors are many.

---

Do you also want me to add a **time complexity & space complexity analysis** for this program in markdown?


This is correct because
**45 = 3 × 3 × 5**

---

Do you want me to also make a **step-by-step dry run (tracing)** of how this works for `n = 45` in markdown?
