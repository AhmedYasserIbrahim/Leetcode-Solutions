class Solution {
    public boolean canConstruct(String s, String t) {
        ArrayList<String> c = new ArrayList<>();
        if(s.length()>t.length()) {
            return false;
        }
        for(int i=0; i<t.length(); i++) {
            c.add(t.charAt(i)+"");
        }
        for(int i=0; i<s.length(); i++) {
            if(c.contains(s.charAt(i)+"")) {
                c.remove(s.charAt(i)+"");
            }
            else {
                return false;
            }
        }
        return true;
    }
}
