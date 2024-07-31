class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] == nums[j] && (j-i)<=k) {
                    return true;
                }
                if(j>k+i) {
                    break;
                }
            }
        }
        return false;
    }
}
