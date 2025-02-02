// 283. Move Zeroes

// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

 


class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for(int num: nums) {
            if(num != 0) {
                nums[i] = num;
                i++;
            }
        }

        while(i<= nums.length-1) {
            nums[i] = 0;
            i++;
        }
    }
}