class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int[][] maps = new int[nums.length][2];
        for(int i=0; i<nums.length; i++) {
            String num = nums[i]+"";
            String newNum ="";
            for(int j=0; j<num.length(); j++) {
                newNum += mapping[num.charAt(j) - '0'];
            }
            maps[i][0] = nums[i];
            maps[i][1] = Integer.parseInt(newNum);
        }
        Arrays.sort(maps, (a, b) -> a[1] - b[1]);
        for(int i=0; i<nums.length; i++) {
            nums[i] = maps[i][0];
        }
        return nums;
    }
}
