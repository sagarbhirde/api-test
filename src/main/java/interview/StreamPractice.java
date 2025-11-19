package interview;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class StreamPractice {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,4,5,6,4,2,4,7,8,9,0,10,32);
// print only positive numbers
        System.out.println("**************find the positive number from list*********************");
        List<Integer> positiveNumbers = numbers.stream().filter(n -> n %2 == 0).
                toList();

        System.out.println("Positive Numbers:-"+positiveNumbers);
        // print numbers start with 1
        System.out.println("**************Find the Numbers starts with 1 from given List****************");
        numbers.stream().map(n -> n + "").filter(n -> n.startsWith("1")).forEach(System.out::println);

        // using array print starts with 1
        System.out.println("**************Find the Numbers starts with 1 from given Array****************");
        int[] arr = {10,15,8,49,23,23,25,98,32};
        List<String> numberByArray  = Arrays.stream(arr).boxed().map(n-> n + "").filter(n-> n.startsWith("1")).toList();
        System.out.println("Using Array Stream :- "+numberByArray);

        // Find the duplicates form List
        System.out.println("****************Find the Duplicates from Given Array*******************");
        Set<Integer> nonDuplicateNumbers = new HashSet<>();
        Arrays.stream(arr).boxed().filter(n -> !nonDuplicateNumbers.add(n)).forEach(n-> System.out.println("Duplicate Numbers:- "+n));
    }
}
