package interview;

import java.util.List;

public class Test5 {

    public static void main(String[] args) {


        List<Integer> numbers = List.of(1,2,3,4,5,6);

        // Sum of even numbers square

       Integer sum = numbers.stream().filter(i->i%2==0).map(n->n*n).reduce(0,Integer::sum);
       System.out.println(sum);

    }
}
