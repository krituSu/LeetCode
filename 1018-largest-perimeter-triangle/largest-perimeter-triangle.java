class Solution {
    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        //Sorting
         for(int i = 1; i < n; i++){
            int prev = i - 1;
            int curr = i;
            int currValue = nums[i];
            while( currValue < nums[prev] && prev >= 0){
                nums[prev + 1] = nums[prev];
                prev--;
                if(prev < 0){
                    break;
                }
            }
            nums[prev + 1] = currValue;
        }
        //Getting the perimeter
        int maxPerimeter = Integer.MIN_VALUE;
        for(int i = 0; i < n - 2; i++){
            int val = nums[i] + nums[i + 1];
            int perimeter = 0;
            for(int j = i + 2; j < n; j++){
                if(val > nums[j]){
                    perimeter = val + nums[j];
                    if(perimeter > maxPerimeter){
                        maxPerimeter = perimeter;
                    }
                }
            }
        }
        if(maxPerimeter > 0){
            return maxPerimeter;
        }
        else{
            return 0;
        }
    }
}