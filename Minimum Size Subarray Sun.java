class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int x = target;
        int count = 0;
        int start = 0;

        for (int i = 0; i < nums.length; i++) {
            x -= nums[i];
            count++;

            while (x <= 0) {
                min = Math.min(min, count);
                x += nums[start];
                count--;
                start++;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
