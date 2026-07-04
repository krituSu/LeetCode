class Solution {
    public int heightChecker(int[] heights) {
        //Using Sorting as a Comparison tool 
        int n = heights.length;
        int expected[] = new int[n];
        for(int k = 0; k < n; k++){
            expected[k] = heights[k];
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            int minIndex = i;
            if( i < n - 1){
            for(int j = i + 1; j < n; j++){
                if(expected[minIndex] >= expected[j]){
                    minIndex = j;
                }
            }
            
            int temp = expected[i];
            expected[i] = expected[minIndex];
            expected[minIndex] = temp;
            }

            if(heights[i] != expected[i]){
                count++;
            }
        }
        
        return count;
    }
}