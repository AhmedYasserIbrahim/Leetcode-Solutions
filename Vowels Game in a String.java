class Solution {
    public boolean doesAliceWin(String s) {
        int count = countVowels(s);
        if(count>0) {
            return true;
        }
        return false;
    }

    public static int countVowels(String s){
        int count =0;
        ArrayList<Character> vowels = new ArrayList<>(List.of('a', 'e', 'i', 'o', 'u'));
        for(int i=0; i<s.length(); i++){
            if(vowels.contains(Character.toLowerCase(s.charAt(i)))) {
                count++;
            }
        }
        return count;

    }
}
