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
    //MAine Max subArray nikalte gya and Min SubArray nikalte gye 
    //Aur saath hi saath mein dono ki value ko add krke fir absolute banake
    //maxi se compare karake maxi mein store krte gya 
    //Fuckkkkkkkkkkkk!!!!!!!!!!!!!!!
    //Don't know how this even worked 
    //Even Dry Run is not able to make me explain 😭😭😭
}