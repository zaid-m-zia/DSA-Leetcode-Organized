class Solution {
    public void reverseString(char[] s) {
        char [] rev = new char [s.length];

        int left = 0;
        int right = s.length-1;

        for(int i = 0 ; i<s.length;i++){
            if(left>right){
                break;
            }
            char temp = s[left];
            s[left]=s[right];
            s[right]=temp;

            left++;
            right--;
        }
    }
}