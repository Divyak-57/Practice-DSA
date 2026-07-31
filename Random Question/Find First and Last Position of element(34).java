class Solution {
    public int lower(int[] nums, int target){
        int n = nums.length;
        int l=0;
        int r=n-1;
        int ans = n;
        while(l<=r){
            int m = l+(r-l)/2;
            if(nums[m]>=target){
                ans = m;
                r = m-1;
            }else{
                l =m+1;
            }
        }
        return ans;
    }
     public int upper(int[] nums, int target){
        int n = nums.length;
        int l=0;
        int r=n-1;
        int ans = n;
        while(l<=r){
            int m = l+(r-l)/2;
            if(nums[m]>target){
                ans = m;
                r = m-1;
            }else{
                l =m+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int lb = lower(nums,target);
        int ub = upper(nums,target);
        if(lb==ub){
            return new int[]{-1,-1};
        }
        return new int[]{lb,ub-1};
        

    }
}
