package javabasics.innerclass;

/**
 * 
 * Local variable localInner is required to be final or effectively final based on its usage
 * 
 * LocalVariable made inside the class should be made with the LocalVariable
 */

class OuterClass{
    public void execute(){
        
        int localInner = 10;

        class InnerClass{
            public void innerFunction(){
                System.out.println("value of x is : " + this.getClass().getName().toString());
            }
        }
        
        localInner+=10;

        InnerClass inner = new InnerClass();
        inner.innerFunction();
        
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.execute();
    }
}
