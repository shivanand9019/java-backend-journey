public class SearchInRotatedSortedArray{
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Check if the left half is sorted
            if (nums[left] <= nums[mid]) {
                // Target is in the left half
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else { // Target is in the right half
                    left = mid + 1;
                }
            } else { // Right half is sorted
                // Target is in the right half
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else { // Target is in the left half
                    right = mid - 1;
                }
            }
        }

        return -1; // Target not found
    }
    public static void main(String[] args) {
        
        SearchInRotatedSortedArray obj = new SearchInRotatedSortedArray();
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int result = obj.search(nums, target);
        System.out.println("Target found at index: " + result); // Output: Target found at index: 4
    }

    
}