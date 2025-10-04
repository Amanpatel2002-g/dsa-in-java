package javabasics.innerclass;


class Outer1{


    public int x;

    public static int y = 10;

    public void method1(Inner1 Inner1){


        // private functions are accisble  inside the functions of the 
        Inner1.getX();
    }

    class Inner1{

        public  void execute(){
            System.out.println("The value of y is: " + y);
        }

        private void getX(){
            System.out.println("Inside Inner1 class | getX function" );
        }
    }
}


public class NonStaticInnerClass {
    public static void main(String[] args) {
        Outer1 Outer1 = new Outer1();
        Outer1.Inner1 Inner1 = Outer1.new Inner1();

        System.out.println("--------------------------------");

        Inner1.execute();
        Outer1.method1(Inner1);
    }
}
