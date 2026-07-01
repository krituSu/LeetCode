class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int max = 0;
        int min = 0;
        int maxi = 0;
        for(int i = 0; i < n; i++){
            max = max + nums[i];
            min = min + nums[i];
            if(max < 0){
                max = 0;
            }
            if(min > 0){
                min = 0;
            }
            maxi = Math.max(maxi, Math.abs(max + min));
        }
    return maxi;



    }
}