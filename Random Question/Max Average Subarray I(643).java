class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int n = nums.length;
       int cur=0;
       for(int i=0;i<k;i++){
        cur +=nums[i];
       } 
       int ms = cur;
       for(int i=k;i<n;i++){
        cur += nums[i]-nums[i-k];
        ms =Math.max(ms,cur);
       }
       return (double)ms/k;
    }
}
