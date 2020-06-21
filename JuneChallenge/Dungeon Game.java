class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int[][] dp = new int[dungeon.length][dungeon[0].length];
        for(int i = 0; i < dungeon.length; i++)
            Arrays.fill(dp[i], -1);
        return mimHealthRequired(dungeon, 0, 0, dp);
    }
    
    static int mimHealthRequired(int[][] arr, int i, int j, int[][] dp){
        if(i == arr.length - 1 && j == arr[0].length - 1){
            return arr[i][j] > 0 ? 1 : Math.abs(arr[i][j]) + 1;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(i == arr.length - 1 || j == arr[0].length - 1) {
        	return dp[i][j] = i == arr.length - 1 ? 
        			Math.max(1, mimHealthRequired(arr, i, j + 1, dp) - arr[i][j]) : 
        				Math.max(1, mimHealthRequired(arr, i + 1, j, dp) - arr[i][j]);
        }
        return dp[i][j] = Math.max(1, Math.min(mimHealthRequired(arr, i + 1, j, dp) - arr[i][j],
                                   mimHealthRequired(arr, i, j + 1, dp) - arr[i][j]));
    }
}