class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n - 1; i++){
            if(nums[i] == nums[i + 1]){
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }

        int k = 0;
        int r = k + 1;
        while(r < n){
           if(nums[k] == 0 && nums[r] != 0){
              int temp = nums[k];
              nums[k] = nums[r];
              nums[r] = temp;
           }
           if(nums[r] == 0 && nums[k] == 0){
              r++;
           }
           else{
               k++;
               r++;
           }
        }

        return nums;
    }
}