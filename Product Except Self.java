class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p = 1;
        boolean z = false;
        boolean zz = false;
        for(int i=0; i<nums.length; i++) {
            if(z&&nums[i] == 0) {
                zz=true;
            }
            if(nums[i] == 0) {
                z = true;
                continue;
            }
            p*=nums[i];
        }
        for(int i=0; i<nums.length; i++) {
            if(nums[i] ==0 && !zz) {
                nums[i] = p;
                continue;
            }
            if(z) {
                nums[i] =0;
                continue;
            }
            nums[i] = p/nums[i];
        }
        return nums;
    }
}
