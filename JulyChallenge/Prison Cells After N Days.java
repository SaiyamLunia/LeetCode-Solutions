class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        N = N % 14 == 0 ? 14 : N % 14; // AFter every 14 days cells will repeat.
        for(int i = 0; i < N; i++) {
            cells = next(cells);
        }
        return cells;
    }
    
    private int[] next(int[] cells) {
        int[] next = new int[cells.length];
        for (int i = 1; i < cells.length - 1; i++) {
            next[i] = (cells[i - 1] == cells[i + 1]) ? 1 : 0;
        }
        return next;
    }
}