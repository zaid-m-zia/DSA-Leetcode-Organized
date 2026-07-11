import java.util.HashMap;

class Solution {
    public int maxFrequencyElements(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find the maximum frequency
        int maxFrequency = 0;

        for (int frequency : map.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        // Sum all frequencies that are equal to the maximum frequency
        int answer = 0;

        for (int frequency : map.values()) {
            if (frequency == maxFrequency) {
                answer += frequency;
            }
        }

        return answer;
    }
}