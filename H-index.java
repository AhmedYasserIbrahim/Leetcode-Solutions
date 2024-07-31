class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        for(int i=0; i<citations.length/2; i++) { //Sort array in descending order
            int tmp = citations[i];
            citations[i] = citations[citations.length-i-1];
            citations[citations.length-i-1] = tmp;
        }
        int h = 0;
        for(int i=0; i<citations.length; i++) {
            if(i+1>h && citations[i] > h) {
                h = i+1;
            }
        }
        return h;
    }
}
