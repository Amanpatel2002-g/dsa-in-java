package javabasics.list;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;


public class JavaBasicsLinkedList {
    public static void main(String[] args) {
        List<Integer> arr = new LinkedList<>();
        arr.add(1);
        arr.add(2);
        System.out.println();
        System.out.println("The value of the arr is in line 12 : " + arr);

        // Adding the line
        arr.addFirst(3);
        arr.addLast(4);

        System.out.println("The value of the arr is in line 18: " + arr);

        // removing the element
        arr.remove(1);
        System.out.println("Printing the array after the removing the element at index 1: " + arr);

        arr.removeFirst();
        arr.removeLast();
        System.out.println("printing the array after removing the first element and last element: "+ arr);

        // size and contains and all other list functions work the same;

        // converting it as the arraylist

        ArrayList<Integer> arr2 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        arr.addAll(arr2);

        // get the size of LinkedList
        System.out.println("printing the size of the array after adding the element from the arrayList: " + arr);
        System.out.println("The size of array is: "+ arr.size());

        // contains
        System.out.println("contains 17 or not:  " + arr.contains(17));

        // remvoing the element at the particular index
        arr.remove(4);
        System.out.println("Removing the element at a particular index 4: " + arr);
    }
}
