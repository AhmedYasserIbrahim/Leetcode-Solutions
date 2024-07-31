class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalGas = 0;
        int totalCost = 0;
        int start = 0;
        int tank = 0;

        for (int i = 0; i < n; i++) {
            int diff = gas[i] - cost[i];
            totalGas += diff;
            tank += diff;

            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        return totalGas < 0 ? -1 : start;
    }
}
