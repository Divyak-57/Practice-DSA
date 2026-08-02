class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int md = 0;
        int ma = 0;
        for(int[] d : dimensions){
            int l = d[0];
            int w = d[1];
            int ds = l*l + w*w;
            int area = l*w;
            if(ds>md){
                md = ds;
                ma = area;
            }else if(ds == md){
                ma = Math.max(ma,area);
            }
        }
        return ma;
    }
}
