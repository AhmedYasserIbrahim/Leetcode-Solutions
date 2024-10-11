class Solution { //32 out of 65 cases
    public int smallestChair(int[][] times, int targetFriend) {
        int[] realTarget = times[targetFriend];
        int[] machines = new int[times.length];
        Arrays.sort(times, Comparator.comparingInt(a -> a[0]));
        for(int i=0; i<times.length; i++) {
            if(times[i][0] == realTarget[0] && times[i][1] == realTarget[1]) {
                targetFriend = i;
                break;
            }
        }
        for(int i =0; i<times.length; i++) {
            int dep = times[i][1];
            for(int j=0; j<machines.length; j++) {
                if(machines[j]==0 || machines[j]<=times[i][0]) {
                    if(i==targetFriend) {
                        return j;
                    }
                    machines[j] = dep;
                }
            }
        }
        return -1;
    }
}
