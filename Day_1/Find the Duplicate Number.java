// Find the Duplicate Number

// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

// There is only one repeated number in nums, return this repeated number.

// You must solve the problem without modifying the array nums and uses only constant extra space.

class Solution {
    public int findDuplicate(int[] nums) {
        int count[] = new int[nums.length];

        for(int i = 0;i<nums.length; i++) {
            count[nums[i]] ++;
            if(count[nums[i]] > 1) {
                return nums[i];
            }
        }
        return nums.length;

        
    }
}