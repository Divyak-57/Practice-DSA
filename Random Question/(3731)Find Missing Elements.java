class Solution {
    public List<Integer> solve(int[] nums, List<Integer> ans){
         for(int i=0;i<nums.length-1;i++){
            int current = nums[i] + 1;
            while (current < nums[i + 1]) {
                ans.add(current);
                current++;
            }
         }
         return ans;
    }
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        return solve(nums,ans);
    }
}
