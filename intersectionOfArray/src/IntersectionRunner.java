import java.util.*;

public class IntersectionRunner {
    private static int[] intersectArray(int[] nums1, int[] nums2) {
        Map<Integer, Integer> mapOfNum1 = new HashMap<>();
        Map<Integer, Integer> mapOfNum2 = new HashMap<>();
        List<Integer> arrayListFinal = new ArrayList<>();

        Arrays.stream(nums1).forEach(a -> {
            mapOfNum1.put(a, mapOfNum1.getOrDefault(a, 0) + 1);
        });

        Arrays.stream(nums2).forEach(a -> {
            mapOfNum2.put(a, mapOfNum2.getOrDefault(a, 0) + 1);
        });

        for (Map.Entry<Integer, Integer> a : mapOfNum1.entrySet()
        ) {
            if (mapOfNum2.containsKey(a.getKey())) {
                if (a.getValue() < mapOfNum2.get(a.getKey())) {
                    for (int j = 0; j < a.getValue(); j++) {
                        arrayListFinal.add(a.getKey());
                    }
                } else {
                    for (int j = 0; j < mapOfNum2.get(a.getKey()); j++) {
                        arrayListFinal.add(a.getKey());
                    }
                }
            }

        }

        return arrayListFinal.stream().mapToInt(Integer::intValue).toArray();

    }

    public static void main(String[] args) {

        int[] nums1 = {2, 4, 5, 5};
        int[] nums2 = {2, 4, 5, 2};
        Arrays.stream(intersectArray(nums1, nums2)).forEach(System.out::println);

    }
}
