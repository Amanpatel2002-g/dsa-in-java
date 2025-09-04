package javabasics.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaBasicsTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> mp = new TreeMap<>();
        
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


        // extra functions to look for

         // 
         System.out.println("get the key greater than or equal to given value: " + mp.ceilingKey(1));
         System.out.println("get the mapping greater than or equal to given value: " + mp.ceilingEntry(1));

         System.out.println("get the key less than or equal to given value: " + mp.floorKey(4));
         System.out.println("get the mapping less than or equal to given value: " + mp.floorEntry(4));

         System.out.println("get the key greater than to given value: " + mp.higherKey(1));
         System.out.println("get the mapping greater than to given value: " + mp.higherEntry(1));

         System.out.println("get the key less than to given value: " + mp.lowerKey(4));
         System.out.println("get the mapping less than to given value: " + mp.lowerEntry(4));     
    }
}
