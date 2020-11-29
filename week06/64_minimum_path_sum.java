// First approach: BFS, 超时!!

class Solution1 {
    int minPath = Integer.MAX_VALUE;
    public int minPathSum(int[][] grid) {
        minPathHelper(grid, 0, 0, 0);
        return minPath;
    }

    public void minPathHelper(int[][] grid, int m, int n, int len) {
        if(m >= grid.length || n >= grid[m].length) return;
        len += grid[m][n];
        if(m == grid.length -1 && n == grid[m].length - 1) {
            minPath = Math.min(minPath, len);
            return;
        }

        minPathHelper(grid, m+1, n, len);
        minPathHelper(grid, m, n+1, len);

    }
}

// DP 
// 递推公式：op[i][j] = Math.min(op[i-1][j], op[i][j-1]) + op[i][j];
class Solution2 {
    public int minPathSum(int[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(i == 0 && j == 0) continue;
                else if(i == 0) grid[i][j] = grid[i][j-1] + grid[i][j];
                else if(j == 0) grid[i][j] = grid[i-1][j] + grid[i][j];
                else grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }
}