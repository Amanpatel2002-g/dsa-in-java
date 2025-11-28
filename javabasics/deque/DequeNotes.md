Here’s a **clear and complete** guide to using **Deque / ArrayDeque** in Java, with examples so you can remember it easily.

---

# ✅ **1. How to create a Deque**

```java
Deque<Integer> dq = new ArrayDeque<>();
```

---

# ✅ **2. Add elements**

Deque supports adding at **both ends**.

### ➤ Add at front

```java
dq.addFirst(10);
dq.offerFirst(20);
```

### ➤ Add at back

```java
dq.addLast(30);
dq.offerLast(40);
```

### Or general add (adds at back)

```java
dq.add(50);
```

---

# ✅ **3. Remove elements**

### ➤ Remove from front

```java
dq.removeFirst();
dq.pollFirst(); // doesn't throw exception
```

### ➤ Remove from back

```java
dq.removeLast();
dq.pollLast();
```

---

# ✅ **4. Get/peek elements**

### ➤ Peek front

```java
dq.getFirst();   // throws exception if empty
dq.peekFirst();  // returns null if empty
```

### ➤ Peek back

```java
dq.getLast();
dq.peekLast();
```

---

# ✅ **5. Check size / empty**

```java
dq.size();
dq.isEmpty();
```

---

# ✅ **6. Iterate normally**

```java
for (int x : dq) {
    System.out.println(x);
}
```

---

# ⚡ Common Use-Cases (Very Important)

## ✔ **Use Deque as a Queue**

```java
dq.offerLast(10);   // push to back
dq.pollFirst();     // pop from front
```

## ✔ **Use Deque as a Stack**

```java
dq.push(10);  // same as addFirst
dq.pop();     // same as removeFirst
```

Equivalent:

```java
dq.addFirst(10);
dq.removeFirst();
```

---

# 🔥 Small Example Code

```java
Deque<Integer> dq = new ArrayDeque<>();

dq.addLast(1); // [1]
dq.addLast(2); // [1, 2]
dq.addFirst(3); // [3, 1, 2]

System.out.println(dq.peekFirst()); // 3
System.out.println(dq.peekLast());  // 2

dq.removeFirst(); // removes 3
dq.removeLast();  // removes 2

System.out.println(dq); // [1]
```

---

# 💡 Notes to Remember

* `ArrayDeque` is **faster than LinkedList**.
* Does **not** allow `null` elements.
* Best for:
  ✔ Sliding window problems
  ✔ Stack/Queue hybrid logic
  ✔ BFS traversal

---

If you want, I can also show:

* How to use **Deque for sliding window maximum**
* How to use **Deque as a monotonic queue**
* How to use **Deque as a stack**

Just tell me.
