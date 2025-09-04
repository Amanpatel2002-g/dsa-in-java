package javabasics.set;

import java.util.HashSet;
import java.util.Set;

public class JavaBasicsHashSet {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println();
        for(Integer it: set){
            System.out.println(it.intValue());
        }

        // remvoing a value from set
        set.remove(1);
        System.out.println(set);

        // check size of it
        System.out.println("The size of set is: " + set.size());

        // check if the element exists
        System.out.println("check if 2 is there or not: " + set.contains(2));

    }
}