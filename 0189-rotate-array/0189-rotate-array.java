class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;

        k=k%n;
        //reversing the whole array
        reverse(nums,0,n-1);
        //reversing till k
        reverse(nums,0,k-1);
        //reversing after k
        reverse(nums,k,n-1);

    }
    static int [] reverse(int [] nums,int left,int right){
        while(left<right)
        {
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;

            left++;
            right--;
        
    }
    return nums;
    }
}