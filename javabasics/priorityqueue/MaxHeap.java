package javabasics.priorityqueue;

import java.util.PriorityQueue;

public class MaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)-> b-a); // max heap declaration
        pq.offer(1);
        pq.offer(2);
        pq.offer(3);
        pq.offer(4);
        System.out.println();
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq.peek());

        System.out.println("pq size is: " + pq.size());
    }
}
