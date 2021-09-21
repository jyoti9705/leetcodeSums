import java.util.Arrays;
import java.util.stream.IntStream;

public class ContainsDuplicateRunner {

    private static boolean containsDuplicate(int[] nums) {

        IntStream newStream = Arrays.stream(nums).distinct();

        return newStream.count() == nums.length ? false : true;
    }

    public static void main(String[] args) {

        int[] numList = new int[]{1,2,1,1,3,4};
        containsDuplicate(numList);

    }
}
