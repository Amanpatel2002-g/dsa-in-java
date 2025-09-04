package javabasics.priorityqueue;

import java.util.PriorityQueue;

public class MinHeap {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(1);
        pq.offer(3);
        pq.offer(-1);

        pq.offer(9);

        System.out.println(pq);

        // check if pq is empty: 
        System.out.println("Check if pq is empty: " + pq.isEmpty());

        System.out.println("Using peek to see the minimum  element of heap: " + pq.peek());

        System.out.println("Poping out the minimum element: " + pq.poll());

        System.out.println("Using peek to see the minimum  element of heap: " + pq.peek());

        System.out.println("check the size of min heap: " + pq.size());
    }
}
