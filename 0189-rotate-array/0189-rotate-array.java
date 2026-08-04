class Solution {
    public void rotate(int[] nums, int k) {
            int n = nums.length;
            k=k%n;

            //reversing the whole array
            reverse(nums,0,n-1);
            //reverse only till k-1
            reverse(nums,0,k-1);
            //reverse from k till end only
            reverse(nums,k,n-1);        
    }
   
   
    static int [] reverse(int [] nums,int left,int right){
        //reversing function 
        while(left<right){
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;

            left++;
            right--;
        }
        return nums;

    }
}