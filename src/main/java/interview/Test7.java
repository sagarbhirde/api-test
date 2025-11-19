package interview;

import java.util.List;
import java.util.stream.Stream;

public class Test7 {

    public static void main(String[] args) {

        // We have 2 A.L 1,2,3,4,5 3,4,5,6,7 stream using give
        List<Integer> firstList = List.of(1,2,3,4,5);
        List<Integer> secondList = List.of(3,4,5,6,7);
        List<Integer> resultList = Stream.concat(firstList.stream(),secondList.stream()).distinct().toList();
        System.out.println(resultList);

    }
}
