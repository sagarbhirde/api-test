package interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test8 {

    public static void main(String[] args) {

//        String s1 = "Java";
//        String s2 = s1;
//
//        System.out.println("Before Modification");
//        System.out.println("s1 = :-"+s1);
//        System.out.println("s2 = :-"+ s2);
//
//        // Modify String
//        s1 = s1.concat("World");
//
//        System.out.println("After Modification");
//        System.out.println("s1 = :-"+s1);
//        System.out.println("s2 = :-"+s2);
// I want most frequent characters in string to be printed
//        String input = "success";
//
//        char output = input.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
//                entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse('\0');
//
//        System.out.println("Most Freq Character:-"+ output);
        List<String> words = Arrays.asList("radar", "level", "java", "stream");

        Map<Boolean,List<String>> finalOutput = words.stream().collect(
                Collectors.partitioningBy(w-> w.equalsIgnoreCase(new StringBuffer(w).reverse().toString())));


      System.out.println(finalOutput);
    }
}
