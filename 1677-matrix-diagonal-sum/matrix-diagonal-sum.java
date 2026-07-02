class Solution {
    public int diagonalSum(int[][] mat) {
        int a = 0;
        int b = mat.length - 1;
        int i = 0;
        int j = 0;
        int sum = 0;
        while(i < mat.length || j < mat.length){
            sum = sum + mat[i][j];
            if(a == b){
                a++;
                b--;
            }
            else{
                sum = sum + mat[a][b];
                a++;
                b--;
            }

            i++;
            j++;
        }
                
        return sum;
    }
}