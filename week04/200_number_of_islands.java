class Solution {
    public int numIslands(char[][] grid) {
        int res = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1') {
                    res++; // Found an island
                    clearIsland(i, j, grid);
                }
            }
        }
        return res;
    }

    private void clearIsland(int i, int j, char[][] grid) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') return; // Terminator
        grid[i][j] = '0'; // Clear island

        clearIsland(i + 1, j, grid);
        clearIsland(i - 1, j, grid);
        clearIsland(i, j + 1, grid);
        clearIsland(i, j - 1, grid);
    }
}