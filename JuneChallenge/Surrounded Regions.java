class Solution {
    public void solve(char[][] board) {
            int m = board.length;
            if(m == 0) return;
            int n = board[0].length;
            
            for(int i = 0; i < m; i++) {
                if(board[i][0] == 'O')
                    dfs(board, i, 0);
                if(board[i][n - 1] == 'O')
                    dfs(board, i, n - 1);
            }
            
            for(int j = 0; j < n; j++) {
                if(board[0][j] == 'O')
                    dfs(board, 0, j);
                if(board[m - 1][j] == 'O')
                    dfs(board, m - 1, j);
            }
            
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    if(board[i][j] == 'O')
                        board[i][j] = 'X';
                    if(board[i][j] == 'P')
                        board[i][j] = 'O';
                }
            }
        }
    
    private void dfs(char[][] A, int x, int y) {
        if(x >= 0 && x < A.length && y >= 0 && y < A[0].length && A[x][y] == 'O') {
            A[x][y] = 'P';
            dfs(A, x + 1, y);
            dfs(A, x, y + 1);
            dfs(A, x - 1, y);
            dfs(A, x, y - 1);
        } else return;
    }
}