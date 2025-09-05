package javabasics.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaBasicsList {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println();
        System.out.println("The value of arr at line 16 is: " + arr);

        // The size function of he arr;
        System.out.println("The size of arr is at line 19: " + arr.size());

        // The add command at a particular index.
        arr.add(1, 9);
        System.out.println("adding a element in arr in line 22 and printing it " + arr);

        // remvoing the elemnt added in the line 22
        arr.remove(1);
        System.out.println("Removing element in arr in line 26 added in the line 22 and printing it: " + arr);

        // check if it contains the element
        boolean does1Exist = arr.contains(1);
        System.out.println("Does 1 Exist: " + does1Exist);


        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.err.println("Initialized from the array.aslist arr2: "+ arr2);


        ArrayList<Integer> arr3 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        System.err.println("Initialized from the List.of arr3: "+ arr3);


        // seting a method.

        arr.set(1, 42);
        System.out.println("Set a value in a index using the arr.set(: " + arr);
    }
}