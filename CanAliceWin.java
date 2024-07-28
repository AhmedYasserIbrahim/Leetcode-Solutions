class Solution {
    public boolean canAliceWin(int[] nums) {
        int a = 0;
        int b =0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]>9) {
                b+=nums[i];
            }
            else {
                a+=nums[i];
            }
        }
        if(a!=b) {
            return true;
        }
        else {
            return false;
        }
    }
}
