class Solution {
    public boolean dfs(List<List<Integer>> graph, int source, int destination, boolean[] vis){
        if(source==destination) return true; 
        vis[source]=true;
        for(int i=0;i<graph.get(source).size();i++){
            int neigh = graph.get(source).get(i);
            if(!vis[neigh]){ // not visted call dfs
                if(dfs(graph,neigh,destination,vis)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>(); //Creates an outer list to hold all the nodes(0 to n-1).
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] e : edges){
            int u = e[0]; //source
            int v = e[1]; // dest
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean[] vis = new boolean[n];
        return dfs(graph,source,destination,vis);
    }
}
