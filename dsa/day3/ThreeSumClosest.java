
import java.util.Arrays;


public class ThreeSumClosest {
public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;

        Arrays.sort(nums);
        int resultSum = nums[0]+ nums[1]+nums[2];
        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int j =i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==target)
                    return target;
                if(sum<target)
                    j++;
                
                else
                 k--;
                
            
            int diffTotarget = Math.abs(sum-target);
            if(diffTotarget<minDiff){
                resultSum = sum;
                minDiff = diffTotarget;
            }
            }
        }
        return resultSum;

    }
    public static void main(String[] args) {
        ThreeSumClosest obj = new ThreeSumClosest();
        int[] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(obj.threeSumClosest(nums, target));
    }
}