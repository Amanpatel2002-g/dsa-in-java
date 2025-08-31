Alright Aman, let’s write proper **notes for KMP (Knuth–Morris–Pratt) algorithm** using your code as the running explanation. I’ll structure it like algorithm notes + annotated code walkthrough.

---

# 📘 Notes on KMP Algorithm

## 1. Problem

Given a **text** `T` of length `n` and a **pattern** `P` of length `m`, find all occurrences of `P` in `T`.

A naive search takes **O(n·m)** time (checking from every position).
KMP improves this to **O(n + m)** by avoiding re-checks when mismatches occur.

---

## 2. Key Idea

Instead of restarting the pattern from scratch on mismatch, KMP uses **LPS (Longest Prefix Suffix) array** of the pattern to decide where to continue.

* **LPS\[i]** = the longest proper prefix of `pattern[0..i]` that is also a suffix of it.
* This tells us "how much of the prefix can we reuse after a mismatch?"

---

## 3. Code Walkthrough

### Step A: Compute LPS Array

```java
private int[] getLPSArray(String s) {
    int n = s.length();
    int[] lps = new int[n];
    lps[0] = 0;             // first char has no proper prefix-suffix
    int i = 1, len = 0;

    while (i < n) {
        if (s.charAt(len) == s.charAt(i)) {
            // we found a longer prefix-suffix
            len++;
            lps[i] = len;
            i++;
        } else {
            if (len > 0) {
                // fallback to shorter prefix
                len = lps[len - 1];
            } else {
                // no match possible
                lps[i] = 0;
                i++;
            }
        }
    }
    return lps;
}
```

* Complexity: **O(m)**
* Example: `pattern = "ababaca"` → `lps = [0,0,1,2,3,0,1]`

---

### Step B: Pattern Matching

```java
public List<Integer> findPatterns(String text, String pattern) {
    List<Integer> ans = new ArrayList<>();

    int[] lps = getLPSArray(pattern);

    int i = 0, j = 0;           // i → text index, j → pattern index
    int n = text.length(), m = pattern.length();

    while (i < n) {
        if (j == m) {
            // full pattern matched
            ans.add(i - m);     // store 0-based start index
            j = lps[j - 1];    // allow overlapping matches
        } else if (text.charAt(i) == pattern.charAt(j)) {
            // characters match → move both
            i++;
            j++;
        } else {
            // mismatch
            if (j > 0) {
                j = lps[j - 1]; // use lps to skip redundant checks
            } else {
                i++;            // restart from next text char
            }
        }
    }

    // handle case where pattern ends exactly at the end of text
    if (j == m) ans.add(i - m);

    return ans;
}
```

---

## 4. Example Run

```java
text    = "aaaaaxaaaaaaaaa"
pattern = "aaaa"
```

* LPS = `[0,1,2,3]`
* Matches found at indices:

  * **0, 1, 2, 3** (before the `x`)
  * **6, 7, 8, 9, 10, 11** (after the `x`)

👉 Final result = `[0, 1, 2, 3, 6, 7, 8, 9, 10, 11]` (0-based indices)

---

## 5. Time Complexity

* Preprocessing (LPS): **O(m)**
* Pattern search: **O(n)**
* Overall: **O(n + m)**

---

## 6. Why KMP is Efficient

* Never rechecks characters unnecessarily.
* Uses previously computed information (LPS).
* Especially useful when the pattern has self-overlaps (like `"aaaa"`).

---

⚡ In your code:

* `getLPSArray` builds the prefix table.
* `findPatterns` uses this LPS to avoid redundant backtracking.
* `ans.add(i - m)` ensures **0-based indexing** (standard in Java).

---
