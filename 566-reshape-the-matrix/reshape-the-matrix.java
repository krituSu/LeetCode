class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(r * c != m * n){
            return mat;
        }

        int[][] reshape = new int[r][c];

        int i = 0;
        int j = 0;
        int k = 0; // k rows
        int l = 0; // l colums
        while(k < r){
            if(l > c - 1){
                l = 0;
                k++;
            }
            if(j > n - 1){
                j = 0;
                i++;
            }
            if(i < m || k < r){
               reshape[k][l] = mat[i][j]; 
               j++;
               l++;
            }
        }

        return reshape;
    }
}