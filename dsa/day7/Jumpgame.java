public class Jumpgame{
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false; // Can't reach this position
            }
            maxReach = Math.max(maxReach, i + nums[i]);
        }
                return true; // Can reach the end
        
    
    }
    public static void main(String[] args) {
    
        Jumpgame obj = new Jumpgame();
        int[] nums = {2,3,1,1,4};
        System.out.println(obj.canJump(nums));
    }

}