class Solution {
    public int maxWidthRamp(int[] nums) {
        int max = 0;
        int minIterated = nums[0]; // Initialize with the first element directly

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > minIterated) { // Skip if there's a smaller element before it
                continue;
            }
            minIterated = nums[i]; // Update minIterated as we iterate

            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j] >= nums[i]) {
                    max = Math.max(max, j - i);
                    break; // Exit early since we found the maximum possible width for this i
                }
            }
        }

        return max;
    }
}
