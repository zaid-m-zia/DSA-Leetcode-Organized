class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){//MAIN-> loop-2 is from i+1 index
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j}; // how to return 2 things using array
                }
                else{
                     continue; //to keep the loop running aagey if not found
                }
            }
        }
        return new int[]{};// or return null; (and )
    }
}