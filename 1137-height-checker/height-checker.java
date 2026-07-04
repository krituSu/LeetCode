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

        //Not my Approach but leraned something that we can solve
        //without sorting too
        // int[] heightToFreq = new int[101];
        
        // for (int height : heights) {
        //     heightToFreq[height]++;
        // }
        
        // int result = 0;
        // int curHeight = 0;
        
        // for (int i = 0; i < heights.length; i++) {
        //     while (heightToFreq[curHeight] == 0) {
        //         curHeight++;
        //     }
            
        //     if (curHeight != heights[i]) {
        //         result++;
        //     }
        //     heightToFreq[curHeight]--;
        // }
        
        // return result;
    }
}