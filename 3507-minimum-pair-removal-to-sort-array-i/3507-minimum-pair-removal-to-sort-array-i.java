import java.util.*;

class Solution {
    public int minimumPairRemoval(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums) {
            list.add(num);
        }

        int operations = 0;

        while (true) {

            // Check if the array is already sorted
            boolean sorted = true;

            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) < list.get(i - 1)) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                return operations;
            }

            int minSum = Integer.MAX_VALUE;
            int index = 0;

            // Find the adjacent pair with the minimum sum
            for (int i = 0; i < list.size() - 1; i++) {

                int sum = list.get(i) + list.get(i + 1);

                if (sum < minSum) {
                    minSum = sum;
                    index = i;
                }
            }

            // Merge the pair
            list.set(index, minSum);
            list.remove(index + 1);

            operations++;
        }
    }
}