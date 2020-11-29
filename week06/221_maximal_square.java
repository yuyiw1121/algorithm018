// dp[i][j] 表示可形成的最大正方形的右下角的边长
// 递推公式： dp[i][j] = Math.min(Math.min(dp[i-1][j-1], dp[i-1][j]), dp[i][j-1]) + 1
class Solution {
    public int maximalSquare(char[][] matrix) {
        int maxSideLen = 0;
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return maxSideLen;
        int row = matrix.length, col = matrix[0].length;
        int[][] dp = new int[row][col];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(matrix[i][j] == '1') {
                    if(i == 0 || j == 0){
                        dp[i][j] = 1;
                    }
                    else {
                        dp[i][j] = Math.min(Math.min(dp[i-1][j-1], dp[i-1][j]), dp[i][j-1]) + 1;
                    }
                    maxSideLen = Math.max(maxSideLen, dp[i][j]);
                }
            }
        }

        return maxSideLen*maxSideLen;
    }
}