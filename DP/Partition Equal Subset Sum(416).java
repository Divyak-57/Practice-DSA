class Solution {
    public int solve(int[] nums, int t, int n, int[][]dp){
        if(t==0||n==0) return 0; //Target 0 ho ya elements khatam ho jayein, dono me max sum 0 hi banega
        if(dp[n][t] != -1) return dp[n][t]; // check karenge agar -1 nhi h toh already koi value h wahi return kar denge
        if(nums[n-1]<=t){ // Agar current element target se chota ya uske barabar hai, toh 2 choices hain
            int ans1 = nums[n-1] + solve(nums,t-nums[n-1],n-1,dp); // include ka condition
            int ans2 = solve(nums,t,n-1,dp); // exclude ka condition
            dp[n][t]=Math.max(ans1,ans2); // max lenge dono ka 
            return dp[n][t]; // updated value return kar denge
        }else{
            dp[n][t]= solve(nums,t,n-1,dp); // Element target se bada hai, toh isko include nahi kar sakte (only exclude)
            return dp[n][t];
        }
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){ // sum nikal lenge
            sum+=nums[i];
        }
       if(sum % 2 != 0) return false; // agar aisa koi equal value hee nhi hoga toh false
        int[][] dp = new int[nums.length+ 1][sum/2 + 1]; 
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(nums,sum/2,nums.length,dp)==sum/2; // Target ban sakta hai ya nahi, ye check karne ke liye helper function call
    }
}
