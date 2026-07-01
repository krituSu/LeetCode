class Solution {
    public int maxProduct(int[] nums) {
       int n = nums.length;
       int i = 0;
       int j = n - 1;
       int k = 1, r=1;
       int max = Integer.MIN_VALUE;
       while(i < n){
        k = k * nums[i];
        r = r * nums[j];

        max = Math.max((Math.max(k,r)),max);
        if(k == 0){
            k = 1;
        }
        if(r == 0){
            r = 1;
        }

        i++;
        j--;
       }
       return max;
    }
}