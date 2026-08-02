class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int b = prices[0];
        for(int i =1;i<prices.length;i++){
            if(prices[i]>b){
               int curr = prices[i]-b;
                profit=Math.max(profit,curr);
            }else{
                b = prices[i];
            }
        }
        return profit;
    }
}
