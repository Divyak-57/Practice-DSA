// Memorization Approach
class Solution {
    public int climbHelper(int n,int[] ways) {
        if(n==0) return 1;
        if(n<0) return 0;
        if(ways[n] != -1) return ways[n];
        ways[n] = climbHelper(n-1,ways)+climbHelper(n-2,ways);
        return ways[n];
    }
    public int climbStairs(int n){
        int ways[] = new int[n+1];
        Arrays.fill(ways,-1);
        return climbHelper(n,ways);
    }
}


// Tabulation Approach
class Solution {
    public int climbStairs(int n){
        if(n<0) return 0;
    
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
        
    }
}
