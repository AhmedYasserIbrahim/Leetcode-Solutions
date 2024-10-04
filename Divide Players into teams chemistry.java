class Solution {
    public long dividePlayers(int[] skill) {
        if(skill.length==2) {
            return skill[0] * skill[1];
        }
        Arrays.sort(skill);
        ArrayList<Integer> pairs = new ArrayList<Integer>();
        int sum = skill[0] + skill[skill.length-1];
        for(int i=0, j=skill.length-1; i<skill.length/2; i++, j--) {
            if(skill[i] + skill[j] != sum) {
                return -1;
            }
            pairs.add(skill[i]);
            pairs.add(skill[j]);
        }
        long product = 0;
        for(int i=0; i<pairs.size()-1; i+=2) {
            product+=pairs.get(i) * pairs.get(i+1);
        }
        return product;
    }
}
