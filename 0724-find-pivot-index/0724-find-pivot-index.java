class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int num:nums){
            total+=num;
        }
        int presum = 0;
        for(int i =0;i<nums.length;i++){
            int postsum = total - presum - nums[i];
            if(presum==postsum){
                return i;
            }
            presum+=nums[i];
        }
        return -1;
    }
}