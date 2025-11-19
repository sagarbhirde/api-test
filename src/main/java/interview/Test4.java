package interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test4 {

    public static void main(String[] args) {
        Integer[] numbers ={0,1,2,0,1,2};
        String name = "abcdefabcbb";

       // Set<Character> chars = new HashSet<>();

        int maxLength = 0;
        String longest = "";

        for(int i=0;i<name.length();i++){
            String current = "";
            for(int j=i;j<name.length();j++){
                char c =name.charAt(j);
                System.out.println("Character"+c);
                if(current.indexOf(c)!=-1){
                    break;
                }
                current+=c;
                if(current.length()>maxLength){
                    maxLength = current.length();
                    longest=current;
                }
            }
        }

        System.out.println("Longest Substring "+longest);
        System.out.println("Length"+maxLength);


//        IntStream.range(1,numbers.length-1).
//                filter(i-> numbers[i] > numbers[i-1] && numbers[i]< numbers[i+1]).forEach(i->System.out.println(
//                     numbers[i]+"is > "+numbers[i-1]+"And <"+numbers[i+1])
//                );

//        for (int i = 0; i < numbers.length-1; i++) {
//            for (int j = 0; j < numbers.length-1; j++) {
//                if(numbers[j]> numbers[j+1]){
//                    Integer temp = numbers[j];
//                    numbers[j]=numbers[j+1];
//                    numbers[j+1]=temp;
//                }
//            }
//        }
//
//        for (Integer number:numbers) {
//            System.out.println(number);
//        }

//        for (int i=0;int j=numbers.length -1;i<)



    }
}
