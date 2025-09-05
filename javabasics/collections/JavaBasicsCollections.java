package javabasics.collections;

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Collection;
// import java.uitl.Collections;
import java.util.Collections;
import java.util.Comparator;

class SortingDescendingOrder implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
        // throw new UnsupportedOperationException("Unimplemented method 'compare'");
    }
    
}


public class JavaBasicsCollections {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3,4 ,5 ,6, 7));
        // Collection.reverse(arr);
        Collections.reverse(arr);
        Collections.sort(arr);
        int maxi = Collections.max(arr);
        int mini = Collections.min(arr);
        System.out.println(arr);
        System.out.println("The maxi and mini of arr are: " + maxi + " " + mini);
        System.out.println("Get the frequency of the element 1 in the arr: " + Collections.frequency(arr, 1));
        Collections.sort(arr);
        // binary search
        System.out.println("Doing the binary search in the array: " + Collections.binarySearch(arr, 17));

        System.out.println("value of the x to power of 2: " + Math.pow(arr.get(3), 2));

        // Collections.sort(arr , new Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer o1, Integer o2) {
        //         return o2 - o1;
        //     }
        // });

        Collections.sort(arr, new SortingDescendingOrder());

        System.out.println("Array after sorted using the comparator fucntion: " + arr);


    }
}