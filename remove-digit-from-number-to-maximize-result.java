class Solution {
    public String removeDigit(String number, char digit) {
        int count =0;
        ArrayList<Long> nums = new ArrayList<Long>();
        ArrayList<Integer> index = new ArrayList<Integer>();
        for(int i=0; i<number.length(); i++) {
            if(number.charAt(i)==(digit)) {
                count++;
                index.add(i); //Those are the indecies of occurences of the digit
            }
        }
        for(int i=0; i<count; i++) {    
            nums.add(Long.parseLong(number.substring(0,index.get(i)) + number.substring  (index.get(i)+1)));
        }
        Object[] arr = nums.toArray();
        Arrays.sort(arr);
        return arr[arr.length-1] + "";
    }
}
