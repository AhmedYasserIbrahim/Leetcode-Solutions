class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> dupes = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++) {
            dupes.add(nums[i]);
        }
        ArrayList<Integer> arr = new ArrayList<Integer>(dupes);
        for(int i=0; i<nums.length; i++) {
            if(i>=arr.size()) {
                nums[i] = 9999+i;
            }
            else {
                nums[i] = arr.get(i);
            }
        }
        Arrays.sort(nums);
        return dupes.size();
    }
}
