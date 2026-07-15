class Solution {
    public int scoreDifference(int[] nums) {
        int player1Score = 0;
        int player2Score = 0;
        boolean isPlayer1Active = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                isPlayer1Active = !isPlayer1Active;
            }
            if ((i + 1) % 6 == 0) {
                isPlayer1Active = !isPlayer1Active;
            }
            if (isPlayer1Active) {
                player1Score += nums[i];
            } else {
                player2Score += nums[i];
            }
        }

        return player1Score - player2Score;
    }
}