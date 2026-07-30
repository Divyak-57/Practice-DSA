class Solution {
    public long getHours(int[] piles,int mid){
        long ans =0;
        for(int i=0;i<piles.length;i++){
            ans += ((long) piles[i] + mid - 1) / mid;
        }
        return ans;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        for(int pile:piles){
            r = Math.max(r,pile);
        }
        int k =r;
        while(l<=r){
            int mid = l+(r-l)/2;
            if (getHours(piles,mid)>h){
                l = mid+1;
            }else{
                k=mid;
                r = mid-1;
            }
        }
        return k;
        
    }
}
