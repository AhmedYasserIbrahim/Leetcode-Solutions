class Solution {
    public boolean isHappy(int n) {
        int newNum =0;
        String number = n+"";
        for(int i=0; i<20; i++) {
            newNum=0;
            for(int j=0; j<number.length(); j++) {
                newNum+=Math.pow(Integer.parseInt(number.charAt(j) + ""), 2);
            }
            if(newNum==1) {
                return true;
            }
            number = newNum + "";
        }
        return false;
    }
}
