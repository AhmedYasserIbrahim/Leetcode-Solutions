class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> ans = new ArrayList<String>();
        boolean added = false;
        for(int i=0; i<nums.length; i++) {
            added = false;
            for(int j=nums.length-1; j>i; j--) {
                if(nums[j] == nums[i]+j-i) {
                    ans.add(nums[i] +"->" + nums[j]);
                    i=j;
                    added = true;
                    break;
                }
            }
            if(!added) {
                ans.add(nums[i]+"");
            }
        }
        return ans;
    }
}
