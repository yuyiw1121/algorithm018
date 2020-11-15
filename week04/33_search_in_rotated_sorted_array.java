class Solution {
    public int search(int[] nums, int target) {
        int lo = 0, high = nums.length - 1,  mid, x;

        while(lo <= high) {
            mid = (high + lo)/2;
            x = nums[mid];

            if(x == target) return mid;
            else if(x < nums[high]) { // 右半段是有序的
                if(x < target && target <= nums[high]) {
                    lo = mid + 1;
                }
                else high = mid - 1;
            }
            else{ // 左半段是有序的
                if(x > target && target >= nums[lo]) high = mid - 1;
                else lo = mid + 1;
            }
        }

        return -1;
    }
}