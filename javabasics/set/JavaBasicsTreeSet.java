package javabasics.set;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * @author Aman Patel
 * This class specifies use of the Treeset
 * By Default Tree set uses the red black  Tree, so things are  always sorted.
 * Time complexity is: O(n)(worst)
 */

public class JavaBasicsTreeSet {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, -1, 6, 7, 5));
        System.out.println("The tree set is: " + treeSet);

        System.out.println(treeSet.floor(2));
        System.out.println(treeSet.ceiling(8));

        System.out.println(treeSet.higher(6));
        System.out.println(treeSet.lower(0));
    }
}
