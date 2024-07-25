class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pre = "";
        String shortest = "";
        int length = Integer.MAX_VALUE;
        for(int i=0; i<strs.length; i++) {
            if(strs[i].length() < length) {
                length = strs[i].length();
                shortest = strs[i];
            }
        }   
        boolean included = true;
        for(int i=0; i<shortest.length(); i++) {
            for(int j =0; j<strs.length; j++) {
                if(strs[j].charAt(i) != shortest.charAt(i)) {
                    included = false;
                    break;
                }
            }
            if(included) {
                pre+=shortest.charAt(i);
            }
            else {
                break;
            }
        }
        return pre;
    }
}
