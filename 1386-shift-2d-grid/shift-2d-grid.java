class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result = new ArrayList<>();
        
        int m = grid.length;
        int n = grid[0].length;
        int size = m * n;
        int[] tri = new int[size];
        //Key Insight: Convert the matrix in an 1D array
        for(int row = 0; row < m; row++){
            for(int col = 0; col < n; col++){
                int index = (row * n) + col;
                tri[index] = grid[row][col];
            }
        }
        int[] shifted = new int[size];
        for(int i = 0; i < size; i++){
            int newIndex = (i + k) % size;
            shifted[newIndex] = tri[i];
        }
        for(int i = 0; i < size; i++){
            int row = i / n;
            int col = i % n;
            grid[row][col] = shifted[i];
        }

        for(int i = 0; i < m; i++){
            List<Integer> ans = new ArrayList<>();
            for(int j = 0; j < n; j++){
                ans.add(grid[i][j]);
            }
            result.add(ans);
        }

        return result;

    }
}