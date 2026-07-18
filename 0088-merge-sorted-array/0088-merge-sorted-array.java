class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
              //nums1[m+n] and nums2[n]
        //both the arrays are sorted in ascending order
        // need to merge the arrays and the final answer should be in nums1
        //and final nums1 should also be in ascending order.

        for(int i = 0; i<nums2.length;i++){

            nums1[m+i]=nums2[i];
        }
        //now our arrays have been merged
        Arrays.sort(nums1);
        


    }
}