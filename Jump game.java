class Solution {
    public boolean canJump(int[] nums) {
       int max = 0;
        boolean reachable = true;
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i]==0) {
                reachable = false;
                for(int j=i-1; j>=0; j--) {
                    if(nums[j] > i-j) {
                        reachable = true;
                    }
                }
            }
            if(!reachable) {
                return false;
            }
            max = Math.max(nums[i] + i, max);
        }
        if(max>=nums.length-1 && reachable) {
            return true;
        }
        return false;
    }
}
