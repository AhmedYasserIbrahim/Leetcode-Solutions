class Solution {
    public static int minChanges(int n, int k) {
        String current = getBinary(n);
        String target = getBinary(k);
        while(current.length() < target.length()) {
            current = "0" + current;
        }
        while(target.length() < current.length()) {
            target = "0" + target;
        }
        int count =0;
        for(int i=0; i<target.length(); i++) {
            if(current.charAt(i)== '0' && target.charAt(i) =='1') {
                return -1;
            }
            if(current.charAt(i) != target.charAt(i)) {
                count++;
            }
        }
        return count;
    }


    public static String getBinary(int x) {
        int power =0;
        while(x>Math.pow(2, power)) {
            power++;
        }
        String num ="";
        while(power>=0) {
            if(x>=Math.pow(2, power)) {
                num+="1";
                x-=Math.pow(2, power);
            }
            else {
                num+="0";
            }
            power--;

        }
        return Integer.parseInt(num) + "";
    }
}
