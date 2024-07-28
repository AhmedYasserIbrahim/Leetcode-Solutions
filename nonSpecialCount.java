class Solution {
    public int nonSpecialCount(int l, int r) {
        int count =0;
        while(l<=r) {
            int divisors =0;
            for(int i=1; i<=l/2; i++) {
                if(l%i ==0) {
                    divisors++;
                    if(divisors>2) {
                        break;
                    }
                }
            }
            if(divisors!=2) {
                count++;
            }
            l+=2;
        }
        return count;
    }
}
