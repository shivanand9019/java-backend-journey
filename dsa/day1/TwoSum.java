import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static int [] twoSum(int nums[],int target ){

        HashMap<Integer,Integer> numMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int compl = target - nums[i];
            if(numMap.containsKey(compl)){
                return new int[]{numMap.get(compl),i};
            }
            numMap.put(nums[i], i);
        }
        
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the no of elements:");
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }

        System.out.println("Enter the target:");
        int target = sc.nextInt();
        int [] res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));
        sc.close();
    }
    
}
