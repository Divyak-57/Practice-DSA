import java.util.*;
class Main {
    public static int solve(int n){
        if(n<0) return 0;
        int[] dp = new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1]*i;
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }
}
