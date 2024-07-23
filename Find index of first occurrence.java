class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.equalsIgnoreCase(needle)) {
            return 0;
        }
        for(int i=0; i<=haystack.length()-needle.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)) {
                if(haystack.substring(i, i+needle.length()).equalsIgnoreCase(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
