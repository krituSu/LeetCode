class Solution {
    public int[] twoSum(int[] nums, int target) {
          int n = nums.length;
        Map<Integer, Integer> index = new HashMap<>();
        for(int i = 0; i < n; i++){
            int complement = target - nums[i];
            if(index.containsKey(complement)){
                    return new int[] {i,index.get(complement)};
            }
            else{
                index.put(nums[i],i);
            }
        }
        return new int[] {};
    }
}