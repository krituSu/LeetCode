class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int stRow = 0;
        int endRow = n - 1;
        int stCol = 0;
        int endCol = n - 1;
        int a = 1;
        while(stRow <= endRow && stCol <= endCol){
            //Step 1: 
            for(int i = stCol; i <= endCol; i++){
                ans[stRow][i] = a;
                a++;
            }
            stRow++;
            //Step 2:
            for(int j = stRow; j <= endRow; j++){
                ans[j][endCol] = a;
                a++;
            }
            endCol--;
            //Step 3:
            if(stRow <= endRow){
                for(int k = endCol; k >= stCol; k--){
                    ans[endRow][k] = a;
                    a++;
                }
                endRow--;
            }
            //Step 4:
            if(stCol <= endRow){
                for(int l = endRow; l >= stRow; l--){
                    ans[l][stCol] = a;
                    a++;
                }
                stCol++;
            }
            
        }
        return ans;
    }
}