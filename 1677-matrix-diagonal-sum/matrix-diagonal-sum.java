class Solution {
    public int diagonalSum(int[][] mat) {
        int a = 0;
        int b = mat.length - 1;
        int sum = 0;
        for(int i = 0; i < mat.length;i++){
            for(int j = 0; j < mat.length; j++){
                if(i == j){
                    sum = sum + mat[i][j];
                }
                if(a == b){
                    a++;
                    b--;
                }
                if(i == a && j == b){
                    sum = sum + mat[i][j];
                    a++;
                    b--;
                }
            }
        }
        return sum;
    }
}