class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = new char[26];
            for (char c : s.toCharArray()) {
                chars[c - 'a']++;
            }
            String key = new String(chars);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        ans.addAll(map.values());
        return ans;
    }
}
