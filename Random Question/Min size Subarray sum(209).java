class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l =0;
        int ml = Integer.MAX_VALUE;
        int cs =0;
        for(int i=0;i<n;i++){
           cs += nums[i];
           while(cs>=target){
            ml = Math.min(ml,i-l+1);
            cs -= nums[l++];
           }
        } 
        return ml==Integer.MAX_VALUE?0:ml;
    }
}
