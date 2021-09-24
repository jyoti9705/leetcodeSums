import java.util.Arrays;

public class MaximumSubArrayRunner {
    private static int findMaximumSum(int[] nums) {

        int maxSum = 0;
        int sum = Integer.MIN_VALUE;
        int temp = 0;
        for (int i : nums) {
            temp += i;
            if (sum < temp) {
                sum = temp;
            }
            if (temp < 0) {
                temp = 0;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(findMaximumSum(nums));

    }
}
