package interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test10 {

    public static void main(String[] args) {
        int[] arr1 = {1,1,2,2,2,3,3,3,3};
        int[] arr2 ={1,1,2,2,3,3,3};
        System.out.println("Output:-"+hasUniqueOccurencesNos(arr1));
        System.out.println("Output"+hasUniqueOccurencesNos(arr2));
    }

    public static boolean hasUniqueOccurencesNos(int[] array){
        Map<Integer,Integer> nos = new HashMap<>();
        for (int n:array){
            nos.put(n,nos.getOrDefault(n,0)+1);
        }
        Set<Integer> setNos = new HashSet<>(nos.values());

        return nos.size() == setNos.size();
    }
}
