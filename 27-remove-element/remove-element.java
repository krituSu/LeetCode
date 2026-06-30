class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        while(j < n){
            if((val ^ nums[i]) == 0  &&  (nums[j] ^ val) != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if((val ^ nums[i]) == 0  &&   (val ^ nums[j]) == 0){
                j++;
            }
            else{
                j++;
                i++;
            }
           
        }
        return i ;
    }
}