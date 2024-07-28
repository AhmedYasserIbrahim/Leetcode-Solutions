class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<String, String> m = new HashMap<String, String>();
        if(s.length()!=t.length()) {
            return false;
        }
        ArrayList<String> inc = new ArrayList<String>();
        for(int i=0; i<s.length(); i++) {
            if(m.containsKey(s.charAt(i) + "")) { //If they are already mapped
                if(!m.get(s.charAt(i)+"").equalsIgnoreCase(t.charAt(i) + "" )) { //And the mapping is incorrect
                    return false; //Return false
                }
                continue;
            }
            else {
                if(inc.contains(t.charAt(i) + "")) {
                    return false;
                }
            }
            m.put(s.charAt(i) + "", t.charAt(i) + "");
            inc.add(t.charAt(i)+ ""); //Something is already mapped to the target char
        }
        return true;
    } //The problem yet to be solved is that no two letters can be mapped to the same letter
}
