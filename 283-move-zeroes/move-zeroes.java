class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = i + 1;
        while(j < n){
            if(nums[i] == 0 && nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if(nums[i] == 0 && nums[j] == 0){
                j++;
            }
            else{
                i++;
                j++;
            }
        }
        for(int k : nums){
            System.out.print(k);
        }
    }
}