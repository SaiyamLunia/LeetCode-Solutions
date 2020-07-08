class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1)
                    perimeter += 4 - (map(grid, i - 1, j) + map(grid, i, j - 1)+ map(grid, i + 1, j) + map(grid, i, j + 1));
            }
        }
        return perimeter;
    }
    
    public int map(int[][] grid, int i, int j) {
        return (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == 0) ? 0 : 1;
    }
}