class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        for(int i=s.length(); i>=0; i--) {
            count+=i; //Get the number of inputs
        }
        int num =0;
        for(int i=0; i<s.length(); i++) {
            for(int j=i+1; j<=s.length(); j++) {
                if(isDominant(s.substring(i, j))) {
                    num++;
                }
            }
        }
        return num;
    }

    public static boolean isDominant(String s) {
        ArrayList<String> chars = new ArrayList<String>();
        for(int i=0; i<s.length(); i++) {
            chars.add(s.charAt(i)+"");
        }
        int freq = Collections.frequency(chars, "1");
        if(freq>=Math.pow(s.length()-freq, 2)) {
            return true;
        }
        return false;
    }
}
