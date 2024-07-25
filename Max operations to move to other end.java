class Solution {
    public int maxOperations(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder(s);
        while (true) {
            boolean changed = false;
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) == '1' && sb.charAt(i + 1) == '0') {
                    int index = shiftAndFind(sb, i + 1);
                    char temp = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(index));
                    sb.setCharAt(index, temp);
                    count++;
                    changed = true;
                    break;
                }
            }
            if (!changed) {
                break;
            }
        }
        return count;
    }

    private int shiftAndFind(StringBuilder sb, int x) {
        int index = 0;
        for (int i = x; i < sb.length(); i++) {
            if (sb.charAt(i) == '0') {
                index = i;
            } else {
                break;
            }
        }
        return index;
    }
}
