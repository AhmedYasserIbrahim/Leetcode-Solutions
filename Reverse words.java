class Solution {
    public String reverseWords(String s) {
        s= s.trim();
        String[] words = s.split(" ");
        String ans = "";
        for(int i=words.length-1; i>=0; i--) {
            if(words[i].length()==0) {
                continue;
            }
            ans=ans+words[i].trim() + " ";
        }
        char[] letters = s.toCharArray();
        return ans.trim();
    }
}
