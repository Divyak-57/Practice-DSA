class Solution {
    public void solve(int r, int c, int[][] maze, int n, boolean[][] vis, ArrayList<String> res, String path) {
        // Base Case: Reached bottom-right corner
        if (r == n - 1 && c == n - 1) {
            res.add(path);
            return;
        }
        // Down, Left, Right, Up arrays for standard lexicographical traversal order
        int[] dRow = {1, 0, 0, -1};
        int[] dCol = {0, -1, 1, 0};
        char[] directions = {'D', 'L', 'R', 'U'};
        // Mark current cell as visited
        vis[r][c] = true;

        for (int i = 0; i < 4; i++) {
            int nextR = r + dRow[i];
            int nextC = c + dCol[i];

            // Check boundaries, if cell is walkable (1), and not yet visited
            if (nextR >= 0 && nextR < n && nextC >= 0 && nextC < n 
                    && maze[nextR][nextC] == 1 && !vis[nextR][nextC]) {
                
                solve(nextR, nextC, maze, n, vis, res, path + directions[i]);
            }
        }

        // Backtrack: Unmark cell so other paths can visit it
        vis[r][c] = false;
    }

    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> res = new ArrayList<>();
        int n = maze.length;

        // If source or destination is blocked, no path exists
        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
            return res;
        }

        boolean[][] vis = new boolean[n][n];

        solve(0, 0, maze, n, vis, res, "");

        // Sort paths lexicographically (if not already guaranteed by D-L-R-U order)
        Collections.sort(res);
        
        return res;
    }
}
