class Solution {
    public int[] twoSum(int[] numbers, int target) {
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for(int i=0; i<numbers.length; i++) {
            for(int j = i+1; j<numbers.length; j++) {
                if(numbers[i] + numbers[j] == target) {
                    int[] ans = {i+1, j+1};
                    return ans;
                }
            }
        }
        return numbers;
    }
}
