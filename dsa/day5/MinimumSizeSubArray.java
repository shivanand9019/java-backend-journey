

public class MinimumSizeSubArray {
    public int minSubArrayLen(int target, int[] nums) {
        int left =0, right =0,currentSum = 0;
        int result = Integer.MAX_VALUE;

        for(right=0;right<nums.length;right++){
            currentSum += nums[right];

            while(currentSum>=target){
                result = Math.min(result,right -left +1);
                currentSum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 :result;
    
    }
    public static void main(String[] args) {
        MinimumSizeSubArray obj = new MinimumSizeSubArray();
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        int result = obj.minSubArrayLen(target, nums);
        System.out.println("Minimum size subarray length: " + result);
        
    }
    
}
