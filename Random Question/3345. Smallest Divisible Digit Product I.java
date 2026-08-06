class Solution {
    public int solve(int n){
         int cur = 1;
        while(n>0){
            cur *= n%10;
            n/=10;
        }
        return cur;
    }
    public int smallestNumber(int n, int t) {
        while(true){
            if(solve(n)%t==0) return n;
            n++;
        }
       
    }
}
