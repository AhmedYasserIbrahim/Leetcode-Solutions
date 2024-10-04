import java.util.HashSet;

class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        HashSet<String> words = new HashSet<>();
        for (String word : dictionary) {
            words.add(word);
        }

        int n = s.length();
        int[] dp = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + 1; // Start with the case where the current character is extra
            
            // Check all possible substrings ending at i
            for (int j = 0; j < i; j++) {
                String substring = s.substring(j, i);
                if (words.contains(substring)) {
                    dp[i] = Math.min(dp[i], dp[j]); // If substring is in dictionary, update dp[i]
                }
            }
        }

        return dp[n]; // The minimum extra characters
    }
}
