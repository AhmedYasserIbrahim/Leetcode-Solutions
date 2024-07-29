class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String, String> myMap = new HashMap<String, String>();
        String[] chars = pattern.split("");
        String[] words = s.split(" ");
        if(chars.length!=words.length) {
            return false;
        }
        ArrayList<String> included = new ArrayList<String>();
        for(int i=0; i<words.length; i++) {
            if(!myMap.containsKey(chars[i]) && included.contains(words[i])) { //If no mapping is done but the value is taken by another key return false
                return false;
            }
            if(!myMap.containsKey(chars[i])) { //If no mapping is done yet then create a new mapping
                myMap.put(chars[i], words[i]);
                included.add(words[i]);
            }
            else if(!myMap.get(chars[i]).equals(words[i])) { //If mapping is done and the values are different return false
                return false;
            }
        }
        return true;
    }
}
