class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<0){
            return false;
        }
        double start=1;
        while(start<=n){
            if(start==n){
                return true;
            }
            start*=2;
        }
        return false;
    }
}