class Solution {
    public int minimumCost(int[] nums, int k) {
        long MOD = 1_000_000_007L;
        long INV2 = 500000004L;

        long resources = k;
        long operations = 0;

        for (int x : nums) {
            if (resources < x) {
                long need = x - resources;

                long add = (need + k - 1L) / k;

                operations += add;
                resources += add * (long) k;
            }

            resources -= x;
        }

        long ans = (((operations % MOD) * ((operations + 1) % MOD)) % MOD * INV2) % MOD;

        return (int) ans;
    }
}