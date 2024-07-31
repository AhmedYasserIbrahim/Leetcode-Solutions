class Solution {
    public int[][] merge(int[][] intervals) {
    List<int[]> ans = new ArrayList<>();
    boolean[] accounted = new boolean[intervals.length];

    // Sort the intervals by their start time
    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

    for (int i = 0; i < intervals.length; i++) {
        if (accounted[i]) {
            continue;
        }

        int start = intervals[i][0];
        int end = intervals[i][1];

        for (int j = i; j < intervals.length; j++) {
            if (intervals[j][0] <= end) {
                end = Math.max(end, intervals[j][1]);
                accounted[j] = true;
            }
        }

        ans.add(new int[]{start, end});
    }

    return ans.toArray(new int[ans.size()][]);
}
}
