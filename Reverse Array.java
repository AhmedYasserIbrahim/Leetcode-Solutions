class Solution {
    public void rotate(int[] nums, int k) {
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i=nums.length-1; i>=0; i--) {
            q.offer(nums[i]); //Fill the queue with the array items
        }
        for(int i=0; i<k; i++) {
            q.offer(q.poll());
        }
        for(int i=nums.length-1; i>=0; i--) {
            nums[i] = q.poll();
        }
    }

}
