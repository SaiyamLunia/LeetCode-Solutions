class Solution {
    boolean[] status = new boolean[10];
    
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++) {
            boardStatus();
            for(int j = 0; j < 9; j++) {
                if(!checkStatus(board[i][j])) return false;
            }
        }
        
        for(int i = 0; i < 9; i++) {
            boardStatus();
            for(int j = 0; j < 9; j++) {
                if(!checkStatus(board[j][i])) return false;
            }
        }
        
        for(int i = 0; i < 9; i++){
            boardStatus();
            for(int j = 0; j < 9; j++) {
                if (!checkStatus(board[(i/3)*3+(j/3)][(i%3)*3+(j%3)])) return false;
            }
        }
        
        return true;
    }
    
    void boardStatus() {
        for(int i = 1; i <= 9; i++)
            status[i] = false;
    }
    boolean checkStatus(char c) {
        if (c == '.') return true;
        int v = c - '0';
		if (status[v]) return false;
        status[v] = true;
        return true;
    }
}