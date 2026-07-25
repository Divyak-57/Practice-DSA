class Solution {
    public int maxProduct(int n) {
        int max =0;
        int max1 =0;
        while(n>0){
        int d = n%10;
        n = n/10;
        if(max<d){
            max1 = max;
            max = d;
        }else if(d>max1){
            max1=d;
        }
      
        }
      return max*max1;
    }
}
