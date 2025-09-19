package org.design.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFast_FailSafe {
    public static void main(String []arg){

//        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
//
//        for (String s : list) {
//            System.out.println(s);
//            // Uncommenting the next line will cause ConcurrentModificationException
//             list.add("E");
//        }

        CopyOnWriteArrayList <String> list = new CopyOnWriteArrayList<>(Arrays.asList("A", "B", "C", "D"));
        for (String s : list) {
            System.out.println(s);
            list.add("E");
        }
        System.out.println("Final List: " + list);

    }
}
