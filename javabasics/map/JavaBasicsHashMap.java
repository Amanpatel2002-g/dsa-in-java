package javabasics.map;

import java.util.HashMap;
import java.util.Map;

public class JavaBasicsHashMap {
    
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();
        
        mp.put(1, "Aman");
        mp.put(2, "Anurag");
        mp.put(4, "Ayush");

        System.out.println(mp);

        System.out.println("The value of roll number 2 is: " + mp.get(2));

        System.out.println("Size of map is: " + mp.size());

        System.out.println("In case the value doesn't exist, you want to get the something else: " + mp.getOrDefault(2, "-1"));
        
        System.out.println("Removing a key 2");
        mp.remove(2);
        System.out.println("printing after removing a key: " + mp);

        System.out.println("Check if the key exists or not: " + mp.containsKey(2));


    }
}
