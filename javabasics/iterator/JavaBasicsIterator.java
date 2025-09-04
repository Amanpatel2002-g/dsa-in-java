package javabasics.iterator;

import java.util.ArrayList;
import java.util.Iterator;
// import java.uitl.List;
import java.util.List;

public class JavaBasicsIterator {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(List.of(12, 2,3,4 ,5, 67, 232));

        Iterator<Integer> iter = lst.iterator();

        while(iter.hasNext()){
            Integer num = iter.next();
            System.out.println(num.intValue());
        }
    }
}
