class Solution {
    public boolean isBipartite(int[][] graph) {
        int col[]=new int[graph.length]; // create a array for color = graph length
        for(int i=0;i<graph.length;i++){
            col[i]=-1; // fisrt put -1 at each index
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(col[i]==-1){ // check is it -1 if yes then add in queue and give 0 to it
                
                q.add(i);
                col[i]=0;
                while(!q.isEmpty()){ // traverse till queue is not empty
                    int cur=q.remove(); // remove and check for its neighbour
                    for(int j=0;j<graph[cur].length;j++){
                        int neigh=graph[cur][j]; 
                        if(col[neigh]==-1){ // if neigh is -1
                          int next = col[cur]==0?1:0; // assign according to previous color
                          col[neigh]=next;
                          q.add(neigh); //add in queue
                        }else if(col[neigh]==col[cur]){ // if same then not bipartite
                            return false;
                        }

                    }
                }
            }
        }
        return true;

    }
}
