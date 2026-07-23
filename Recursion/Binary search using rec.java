class Solution {
    public int solve(int[] nums, int target, int l, int r){
        if(l>r) return -1;
        int mid = l +(r-l)/2;
        if(nums[mid]==target) return mid;
        if(nums[mid]>target){
            return solve(nums,target,l,mid-1);
        }else{
            return solve(nums,target,mid+1,r);
        }
    }
    public int search(int[] nums, int target) {
        return solve(nums,target,0,nums.length-1);
      
    }
}
