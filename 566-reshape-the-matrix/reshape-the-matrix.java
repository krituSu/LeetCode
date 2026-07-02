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
        for(int k = 0; k < r; k++){
            for(int l = 0; l < c; l++){
                if(j > (n - 1)){
                    j = 0;
                    i++;
                }
                reshape[k][l] = mat[i][j]; 
                j++;
            }
        }

        return reshape;
    }
}