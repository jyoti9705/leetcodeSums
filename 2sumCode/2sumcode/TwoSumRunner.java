import java.util.Arrays;

public class TwoSumRunner {

    private static int[] getSumEqualsTargetIndices(int[] nums , int target){
        //two sums equal target
        for (int i = 0 ; i < nums.length ; i++){
            for (int j = i+ i ; j < nums.length ; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main (String [] args){
        int [] nums = new int[]{2 , 7, 11, 15};
        int target = 9;
        int[] result = getSumEqualsTargetIndices(nums,target);
        Arrays.stream(result).forEach(a ->
            System.out.println("Indices that add upto target are: "+ a)
        );
    }
}
