class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        // Initialize a 2D array to store the minimum costs of character conversions. Create an entry for each character
        long[][] mat = new long[26][26];

        // Set the cost of converting each character to itself as 0, and all others as Long.MAX_VALUE (infinity)
        for (int i = 0; i < 26; i++) {
            Arrays.fill(mat[i], Long.MAX_VALUE);
            mat[i][i] = 0;
        }

        // Fill the matrix with the given costs for specific character conversions to take into account if the conversion is direct
        for (int i = 0; i < original.length; i++) {
            mat[original[i] - 'a'][changed[i] - 'a'] = Math.min(mat[original[i] - 'a'][changed[i] - 'a'], cost[i]);
        }

        // Apply the Floyd-Warshall algorithm to find the shortest paths between all pairs of characters. This assumes that there is at most two coversions between any two characters
        for (int via = 0; via < 26; via++) {
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < 26; j++) {
                    if (mat[i][via] == Long.MAX_VALUE || mat[via][j] == Long.MAX_VALUE) continue; //If b is unreachable from a
                    mat[i][j] = Math.min(mat[i][j], mat[i][via] + mat[via][j]);
                }
            }
        }

        long totalCost = 0;

        // Calculate the total cost to convert the source string to the target string
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == target.charAt(i)) continue;

            // If conversion is impossible, return -1
            if (mat[source.charAt(i) - 'a'][target.charAt(i) - 'a'] == Long.MAX_VALUE) return -1;

            // Add the minimum conversion cost for each character
            totalCost += mat[source.charAt(i) - 'a'][target.charAt(i) - 'a'];
        }

        return totalCost;
    }
}
