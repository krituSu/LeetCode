class Solution {
    public int heightChecker(int[] heights) {
        //Using Sorting as a Comparison tool 
        int n = heights.length;
        int expected[] = new int[n];
        for(int k = 0; k < n; k++){
            expected[k] = heights[k];
        }
        for(int i = 1 ; i < n; i++){
            int prev = i - 1;
            int curr = i;
            int currValue = expected[i];
            while(currValue < expected[prev] && prev >= 0){
                expected[prev + 1] = expected[prev];
                prev--;
                if(prev < 0){
                    break;
                }
            }
            expected[prev + 1] = currValue;
        }

        int j = 0;
        for(int i = 0; i < n; i++){
            if(heights[i] != expected[i]){
                j++;
            }
        }

        return j;
    }
}