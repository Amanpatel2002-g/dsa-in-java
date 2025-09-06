
---

# 🌀 Lifecycle of Garbage Collection in Java

---

## **1. Object Creation**

* When you do:

  ```java
  Person p = new Person();
  ```
* **Reference `p`** is stored in **Stack**.
* **Object `new Person()`** is stored in **Heap → Young Generation → Eden Space**.

---

## **2. Allocation in Young Generation**

* All **new objects start in Eden**.
* Eden is small and designed for fast allocation.
* If Eden fills up, a **Minor GC** is triggered.

---

## **3. Minor GC – First Cleanup**

* Minor GC checks which objects in Eden are still **reachable** (referenced from stack/heap roots).
* Live objects → moved to **Survivor Space (S0 or S1)**.
* Dead objects → memory freed.

📌 Survivor spaces work like a **ping-pong**:

* First time, objects move from Eden → S0.
* Next GC, Eden → S1 (and surviving objects in S0 move to S1).
* They swap roles after each GC.

---

## **4. Promotion to Old Generation**

* Each object has an **age counter** (how many GCs it has survived).
* If an object **survives multiple Minor GCs**, it’s considered "long-lived".
* Then it is **promoted to Old Generation (Tenured space)**.

📌 Example:

* Strings used throughout the program, cached objects, session data, etc.

---

## **5. Major GC (Old Generation Cleanup)**

* When Old Generation fills up → **Major GC (Full GC)** is triggered.
* Takes longer than Minor GC because objects here are usually large and long-lived.
* Unreachable objects in Old Generation are collected.
* Surviving ones remain in Old Generation.

---

## **6. Metaspace (Class Metadata)**

* **Metaspace (Java 8+)** stores:

  * Class definitions
  * Methods, fields
  * Runtime constant pool
* Not part of the heap (unlike old **PermGen**).
* Grows dynamically (limited by OS memory).
* Cleaned up when:

  * A **ClassLoader is unloaded**
  * All classes loaded by it are no longer referenced

📌 Example:

```java
ClassLoader loader = new URLClassLoader(new URL[]{...});
Class<?> clazz = loader.loadClass("com.example.MyClass");
loader = null; // when GC happens, class metadata can be freed
```

---

## **7. Object Death & Finalization**

* When an object has **no reachable references**, GC marks it for removal.
* Before actual removal, if the object has a `finalize()` method, JVM may call it once.
  (⚠️ Deprecated in Java 9+, don’t use in production).
* After finalization, GC reclaims memory.

---

## **8. Entire Lifecycle Recap**

1. Object created → **Eden (Young Gen)**.
2. Eden fills → **Minor GC** → survivors moved to **S0/S1**.
3. Survive multiple GCs → promoted to **Old Gen**.
4. Old Gen fills → **Major GC (Full GC)** cleans it.
5. **Metaspace** handles class-level metadata, unloaded when class is not used anymore.
6. Object becomes unreachable → GC reclaims memory → space is free for new objects.

---

# 🔄 Visual Flow

```
Stack Reference  →  Eden Space  →  Survivor (S0 ↔ S1)  →  Old Generation  →  Collected
Class Metadata   →  Metaspace   →  Freed when classloader is GC’d
```

---

# ✅ Example Walkthrough

```java
public class LifecycleDemo {
    public static void main(String[] args) {
        // Step 1: Eden allocation
        byte[] obj1 = new byte[1024 * 1024]; // 1MB

        // Step 2: Trigger Minor GC
        for (int i = 0; i < 10; i++) {
            byte[] temp = new byte[1024 * 1024]; // new objects in Eden
        }

        // Step 3: Long-living reference
        byte[] longLived = new byte[5 * 1024 * 1024]; // survives multiple GCs

        System.gc(); // Step 4: Major GC request
    }
}
```

* `obj1` → Eden → Survivor → eventually Old Gen (if referenced long enough).
* Temporary arrays die in Eden (collected in Minor GC).
* `longLived` → promoted to Old Gen.
* `System.gc()` → may trigger Major GC to clean Old Gen.

---

⚡ That’s the **full lifecycle of an object** in Java memory management.

👉 Do you want me to also **map this lifecycle to different Garbage Collectors (Serial, Parallel, CMS, G1)** so you see how each GC handles the same object differently?
