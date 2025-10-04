package javabasics.innerclass;

/**
 * 
 * static class are only loaded when you create the objects of it.
 * if you don't create the objects of it
 */

class Outer {

    public int x;

    public static int y = 10;

    public void method1(Inner inner) {

        // private functions are accisble inside the functions of the
        inner.getX();
    }

    static class Inner {

        public void execute() {
            System.out.println("The value of y is: " + y);
        }

        private void getX() {
            System.out.println("Inside inner class | getX function");
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {

        Outer outer = new Outer();
        Outer.Inner inner = new Outer.Inner();
        // inner.execute();

        outer.method1(inner);
    }
}
