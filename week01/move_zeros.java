class Solution {
    public void moveZeroes(int[] nums) {
        int zero = 0;
        
        for(int seeker = 0; seeker < nums.length; seeker++){
            if(nums[seeker] != 0) {
                int temp = nums[seeker];
                nums[seeker] = nums[zero];
                nums[zero] = temp;
                zero++;
            }
        }
        
    }
}