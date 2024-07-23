class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if(nums.length<3) {
            return nums.length;
        }
        for(int i=2; i<length; i++) {
            if(nums[i]==nums[i-1] && nums[i-1]==nums[i-2]) {
                i--;
                length--; //Reduce the size of the array with every element removed
                nums[i] = Integer.MAX_VALUE;
                Arrays.sort(nums);
            }
        }
        Arrays.sort(nums);
        return length;
    }
}
