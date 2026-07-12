class Solution {
    public int removeDuplicates(int[] nums) {
        //here we will be using 2 pointer approach
        int j =0;
        for(int i =1 ; i<nums.length;i++){
            if(nums[j]!=nums[i]){
                j++;
                nums[j]=nums[i];
            }


        }
        return j+1;
    }
}