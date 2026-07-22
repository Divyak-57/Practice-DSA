class Solution {
    public int[][] updateMatrix(int[][] mat) {
      int n = mat.length;
      int m = mat[0].length;
      Queue<int[]> q= new LinkedList<>(); //bfs
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(mat[i][j]==0){ // if 0 add to queue simply
                q.add(new int[]{i,j});
            }else{
                mat[i][j]=-1; // if not 0 give -1
            }
        }
        }
        int[][] dirs={{-1,0},{1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int[] cur=q.remove();
            int r = cur[0]; // first pop element is row value
            int c = cur[1]; // second pop is col
            for(int[] d:dirs){
                int nr = r+d[0]; //row is at 0th position
                int nc = c+d[1]; // col is at 1th position

                if(nr>=0 &&  nr<n && nc>=0 && nc<m && mat[nr][nc]==-1){ // cell have -1 value then update it
                    mat[nr][nc]=mat[r][c]+1; // to reach its neighbour
                    q.add(new int[]{nr,nc}); // add updated cell
                }
            }
        }
      
      return mat;
    }
}
