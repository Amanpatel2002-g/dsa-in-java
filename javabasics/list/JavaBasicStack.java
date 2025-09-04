package javabasics.list;

import java.util.Stack;

public class JavaBasicStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println("printing stack at line 11: " + st);
        System.out.println("The first element: " + st.peek());
        st.pop();
        System.out.println("after poping the top element, list looks like this: "+ st.peek());

        // check if stack is empty
        System.out.println("Check if stack is empty: " + st.isEmpty());

        // check if size of the array
        System.out.println("check the size of array:  " + st.size());
    }
}
