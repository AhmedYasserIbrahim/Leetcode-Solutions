import java.util.Arrays;

class Solution {
    public int minDifference(int[] nums) {
        if (nums.length <= 4) {
            return 0; // If 4 or fewer elements, we can make them all equal
        }

        Arrays.sort(nums); // Sort the array
        int n = nums.length;
        int minDiff = Integer.MAX_VALUE;

        minDiff = Math.min(minDiff, nums[n - 1] - nums[3]); // Remove 3 smallest
        minDiff = Math.min(minDiff, nums[n - 2] - nums[2]); // Remove 2 smallest, 1 largest
        minDiff = Math.min(minDiff, nums[n - 3] - nums[1]); // Remove 1 smallest, 2 largest
        minDiff = Math.min(minDiff, nums[n - 4] - nums[0]); // Remove 3 largest

        return minDiff; 
    }
}
