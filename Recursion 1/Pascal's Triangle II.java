class Solution {
    public List<Integer> getRow(int rowIndex) {
        int[][] dp = new int[rowIndex + 1][rowIndex + 1];
        
        List<Integer> list = new ArrayList<>();
        for(int j = 0; j <= rowIndex; j++) {
            list.add(dfs(rowIndex, j, dp));
        }
        return list;
    }
    
    private int dfs(int i, int j, int[][] dp) {
        if(j == 0 || i == j) return 1;
        if(dp[i][j] != 0) return dp[i][j];
        return dp[i][j] = dfs(i - 1, j - 1, dp) + dfs(i - 1, j, dp);
    }
}