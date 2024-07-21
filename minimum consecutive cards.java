class Solution {
    public static int minimumCardPickup(int[] cards) {
    boolean match = false;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < cards.length; i++) {
        for (int j = i + 1; j < cards.length; j++) {
            if (cards[i] == cards[j] && j - i < min) {
                min = j - i + 1;
                match = true;
            }
        }
    }
    return match ? min : -1;
}
}
