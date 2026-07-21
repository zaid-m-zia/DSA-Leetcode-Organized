class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum = nums[0];
        int maxsum = nums[0];

        for(int i = 1 ;i<nums.length ; i++){
            if(nums[i]>nums[i]+currentsum){
                currentsum=nums[i];
            }
            else{
                currentsum=nums[i]+currentsum;
            }
            if(currentsum>maxsum){
                maxsum=currentsum;
            }
            else{
                maxsum=maxsum;
            }
        }
        return maxsum;
    }
}