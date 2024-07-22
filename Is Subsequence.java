class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals("")) {
            return true;
        }
        if(s.length()>t.length()) {
            return false;
        }
        boolean[] available = new boolean[s.length()];
        int index =0;
        for(int i=0;i<t.length(); i++) {
            if(t.charAt(i)==s.charAt(index)) {
                available[index] = true;
                index++;
                if(index>=s.length()) {
                    break;
                }
            }
        }
        return available[available.length-1];
    }
}
