import java.util.HashMap;

class Solution {
    public int maxFrequencyElements(int[] nums) {

        // Stores: Number -> Frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the frequency of every number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find the maximum frequency
        int maxFrequency = 0;

        for (int frequency : map.values()) {
            maxFrequency = Math.max(maxFrequency, frequency);
        }

        // Count how many elements have the maximum frequency
        int answer = 0;

        for (int frequency : map.values()) {
            if (frequency == maxFrequency) {
                answer += frequency;
            }
        }

        return answer;
    }
}