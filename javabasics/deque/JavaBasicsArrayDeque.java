package javabasics.deque;

import java.util.ArrayDeque;



public class JavaBasicsArrayDeque {

    public static void main(String[] args) {
        ArrayDeque<Integer> arr = new ArrayDeque<>();

        arr.offer(1);
        arr.offer(2);
        arr.offer(3);

        System.out.println("The value of arr is: " + arr);
        

        arr.poll();

        System.out.println("Value after poping is: " + arr);

        
        System.out.println("using the peek function: which always watches the topmost element in the queue: " + arr.peek());

        // the Array Deque implementation of this can also be used as the Deque as well.
        
        System.out.println("the ArrayDeque can also be used as the Deque as well.");

        // The Array Deque
        arr.offerFirst(1); // to add 1 at the starting, similar to offer
        arr.offerLast(2); // to add 2 at the end
        
        System.out.println("Added the value with offerfirst and offer last function: " + arr);

        System.out.println("To see the first value and last value, similar to peek: " + arr.peekFirst() + " " + arr.peekLast());


        // to get the size of the queue
        System.out.println("Get the size of queue: " + arr.size());

        // remove the first and last element
        arr.pollFirst();
        arr.pollLast();

        System.out.println("removed the first and last element from the queue " + arr);

        // also check if the queue is empty or not

        System.out.println("Check if queue is empty or not: "  + arr.isEmpty());
        
    }
}