class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max =0;
        int start = 0;
        int end = 0;
        if(nums.length==0) {
            return 0;
        }
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]+1) {
                end++;
            }
            else if (nums[i]==nums[i-1]) {
                continue;
            }
            else {
                start = i;
                end = i;
            }
            max = Math.max(max, end-start);
        }
        return max+1;
    }
}
