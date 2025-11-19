package interview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {

    public static void main(String[] args) {
      //  Array [1,2,4,2,1]
Integer[] numbers = {1,2,4,2,1};
List<Integer> listNos = Arrays.asList(numbers);
Set<Integer> uniqueNos = new HashSet<>();
List<Integer> resultNos=listNos.stream().filter(n->!uniqueNos.add(n)).collect(Collectors.toList());
        Stream<String> st = Stream.iterate("", (str) -> str + "x");

        System.out.println(st.limit(3).map(str -> str + "y"));

//    Set<Integer> result = Arrays.stream(numbers).collect(Collectors.groupingBy(n->n,Collectors.counting())).
//                entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).
//                collect(Collectors.toSet());
//
//            System.out.println("Duplicates:-"+ result);
       // System.out.println("Duplicates:-"+ resultNos);
    }

    @FunctionalInterface
    interface Student{
        void run();

        default void thisIsDefault(){
            System.out.println("this is defaultMethod");
        }
    }
}
