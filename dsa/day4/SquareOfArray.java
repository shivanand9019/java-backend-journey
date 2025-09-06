import java.util.Arrays;

public class SquareOfArray {

    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
        for(int i=0;i<n;i++){
            nums[i] = nums[i] * nums[i];

        }
        Arrays.sort(nums);
        return nums;
    }
    public static void main(String[] args) {
        SquareOfArray squareOfArray = new SquareOfArray();
        int arr[] = {-4,-1,0,3,10};
        int result[] = squareOfArray.sortedSquares(arr);
        System.out.println("Sorted Squares of the Array:");
        for(int num:result){
            System.out.print(num+" ");
        }
        
    }
    
}
