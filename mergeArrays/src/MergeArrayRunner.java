import java.util.Arrays;

public class MergeArrayRunner {
    private static void merger(int[] nums1, int m, int[] nums2, int n) {
        //faster and optimal
        for (int i = 0; i < nums2.length; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);

        //or

        /*List<Integer> nums1List = new ArrayList<>();
        int i = 0;
        while (m > 0) {
            nums1List.add(nums1[i]);
            i++;
            m--;
        }
        Arrays.stream(nums2).boxed().forEach(e -> nums1List.add(e));
        Collections.sort(nums1List);
        for (int i = 0; i < nums1List.size(); i++) {
            nums1[i] = nums1List.get(i);
        }*/

    }

    public static void main(String[] args) {


    }
}
