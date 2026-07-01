class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            //Step 1: Sum ki value nikalo element add krke 
            sum = sum + nums[i];
            //Step 2: Compare Maximum Sum and Sum
            maxi = Math.max(maxi , sum);
            //Step 3: sum -ve ha ya +ve vo dekhna
            if(sum < 0){
                sum = 0;
            }

        }
        return maxi;
    }
}