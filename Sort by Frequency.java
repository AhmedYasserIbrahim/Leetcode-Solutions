class Solution {
    public int[] frequencySort(int[] nums) {
    // Create a HashMap to store the frequency of each number
    Map<Integer, Integer> frequencyMap = new HashMap<>();
    for (int num : nums) {
        frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }

    // Create a list of pairs (number, frequency) and sort it based on the frequency
    List<Pair<Integer, Integer>> sortedList = frequencyMap.entrySet().stream()
            .map(e -> new Pair<>(e.getKey(), e.getValue()))
            .sorted((p1, p2) -> {
                int freqComparison = p1.getValue().compareTo(p2.getValue());
                if (freqComparison == 0) {
                    return p2.getKey().compareTo(p1.getKey());
                }
                return freqComparison;
            })
            .collect(Collectors.toList());

    // Construct the result array
    int[] result = new int[nums.length];
    int index = 0;
    for (Pair<Integer, Integer> pair : sortedList) {
        for (int i = 0; i < pair.getValue(); i++) {
            result[index++] = pair.getKey();
        }
    }
    return result;
}

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
}
