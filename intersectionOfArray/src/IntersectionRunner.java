import java.util.*;
import java.util.stream.Collectors;

public class IntersectionRunner {
    private static int[] intersectArray(int[] nums1, int[] nums2) {
        Map<Integer, Integer> mapOfNum1 = new HashMap<>();
        Map<Integer, Integer> mapOfNum2 = new HashMap<>();
        List<Integer> arrayListFinal = new ArrayList<>();


        Arrays.stream(nums1).forEach(a -> {
            int countOfNumber = (mapOfNum1.containsKey(a)) ? mapOfNum1.get(a) + 1 : 1;
            mapOfNum1.put(a, countOfNumber);
        });

        Arrays.stream(nums2).filter(e -> mapOfNum1.containsKey(e) ? true : false).boxed().collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet().stream().forEach(m -> {
            if (m.getValue() < mapOfNum1.get(m.getKey())) {
                for (int j = 0; j < m.getValue(); j++) {
                    arrayListFinal.add(m.getKey());
                }
            } else {
                for (int j = 0; j < mapOfNum1.get(m.getKey()); j++) {
                    arrayListFinal.add(m.getKey());
                }
            }
        });

        int[] arrayToReturn = new int[arrayListFinal.size()];
        for (int i = 0; i < arrayListFinal.size(); i++) {
            arrayToReturn[i] = arrayListFinal.get(i);
        }
        return arrayToReturn;

    }

    public static void main(String[] args) {

        int[] nums1 = {2, 4, 5, 5};
        int[] nums2 = {2, 4, 5, 2};
        Arrays.stream(intersectArray(nums1, nums2)).forEach(System.out::println);

    }
}
