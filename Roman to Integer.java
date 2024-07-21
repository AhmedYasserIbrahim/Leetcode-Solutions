//This solution was marked as a great answer having a top 1% runtime and top 24% memory
class Solution {
    public int romanToInt(String s) {
        int num =0;
        char[] chars = s.toCharArray();
        for(int i=0; i<chars.length; i++) {
            switch(chars[i]) {
                case('I'): 
                    if(i!=chars.length-1) {
                        if(chars[i+1]==('V')) {
                            num+=4;
                            i++;
                        }
                        else if(chars[i+1]==('X')) {
                            num+=9;
                            i++;
                        }
                    
                        else {
                            num+=1; 
                        }
                    }
                    else {
                        num++;
                    }
                    break;
                case('V'): num+=5; break;
                case('X'): 
                if(i!=chars.length-1) {
                    if(chars[i+1]=='L') {
                        num+=40;
                        i++;
                    }
                    else if(chars[i+1]==('C')) {
                        num+=90;
                        i++;
                    }
                 
                    else {
                        num+=10; 
                    }
                }
                else {
                    num+=10;
                }
                break;
                case('L'): num+=50; break;
                case('C'):
                if(i!=chars.length-1) {
                    if(chars[i+1]=='D') {
                        num+=400;
                        i++;
                    }
                    else if(chars[i+1]=='M') {
                        num+=900;
                        i++;
                    }
                  
                    else {
                        num+=100; 
                    }
                }
                else {
                    num+=100;
                }
                    break;
                case('D'): num+=500; break;
                case('M'): num+=1000; break;

            }
        }
        return num;
    }
}
